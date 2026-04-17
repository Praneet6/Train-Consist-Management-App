# 🚆 Train Consist Management App

A console-based Java application that simulates how a railway system manages a train’s consist (collection of bogies attached to an engine).

---

## 📌 Features

- Passenger bogies (Sleeper, AC Chair, First Class)
- Dynamic addition and removal of bogies
- Consist tracking and validation
- Simulation of real-world railway operations using Java Collections

---

## 🧩 Use Cases

| Use Case | Description                                      | Concepts Used                                 |
|----------|--------------------------------------------------|-----------------------------------------------|
| UC1      | Initialize train and display consist summary     | Class, Main Method, ArrayList                 |
| UC2      | Add/remove passenger bogies and check existence  | ArrayList CRUD, add(), remove(), contains()   |
| UC3      | Ensure unique bogie IDs using HashSet            | Set, HashSet                                  |
| UC4      | Maintain ordered bogie consist                   | LinkedList, insertion/removal operations      |
| UC5      | Preserve insertion order of bogies               | LinkedHashSet, ordered uniqueness             |
| UC6      | Map bogie to capacity                            | HashMap, key-value mapping                    |
| UC7      | Sort bogies by capacity                          | Comparator, List, custom sorting              |
| UC8      | Filter passenger bogies using streams            | Stream API, filter(), Lambda Expressions      |
| UC9      | Group bogies by type                             | Collectors.groupingBy(), Map, Streams         |
| UC10     | Count total seats in train                       | Stream reduce(), map(), aggregation           |
| UC11     | Validate Train ID and Cargo Codes                | Regex, Pattern, Matcher                       |

## 🛠️ Tech Stack

- Core Java
- Java Collections Framework (ArrayList)

---

## 📂 Project Structure
```
Train-Consist-Management-App/
│
├── src/
│ └── main/
│ ├── UseCase1TrainConsistMgmnt.java
│ └── UseCase2TrainConsistMgmnt.java
│
├── docs/
│ ├── UC1.md
│ └── UC2.md
│
├── README.md
└── .gitignore
```
---

## 🚀 How to Run

1 . Compile:

 javac src/main/*.java


2 . Run:

java src.main.UseCase1TrainConsistMgmnt
java src.main.UseCase2TrainConsistMgmnt


---

## 👨‍💻 Author
Praneet

---

## 📈 Future Enhancements

- Introduce `Bogie` class (OOP design)
- Separate Passenger and Goods bogies
- Implement advanced data structures (LinkedList)
- Add validation and safety rules
