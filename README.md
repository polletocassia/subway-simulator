# Subway Simulator 🥪    

A Java project that simulates the process of assembling a Subway sandwich. The user chooses the bread, size, cheeses, meats, salads, and sauces, and the system calculates the subtotal and total with a size multiplier.   


## 🛠 Technologies 
* Java 17+
* Console (input via Scanner)
* Map, List, and Collections from the standard library


## 📂 Project Structure
```bash
src/com/subway/
│
├── app/
│   └── Main.java              # Application entry point
│
├── catalog/
│   ├── Catalog.java           # Fixed (unpriced) lists of options
│   └── PriceTable.java        # Price tables (Map<String, Double>)
│
├── io/
│   └── Prompter.java          # Utility methods for user input
│
└── service/
    ├── ChoiceService.java     # User choice logic
    └── PriceCalculator.java   # Subtotal calculation and rounding
```


## ▶ How to Run
1. Clone or download this repository:
```bash
git clone https://github.com/polletocassia/subway-simulator.git  
cd subway-simulator
```       
2. Compile the Java files:
```bash
javac -d bin src/com/subway/app/Main.java
```     
3. Run:
```bash
java -cp bin src.com.subway.app.Main  
```

<br>

<sub>Made with 🤍 by Cássia Polleto</sub>
