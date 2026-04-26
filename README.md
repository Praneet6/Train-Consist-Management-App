# 🚆 Train Consist Management App

The **Train Consist Management App** is a console-based Java application that simulates how a railway system manages a train’s consist — a collection of bogies attached to an engine.

---

## 📌 Features
- Manage **Passenger Bogies** (Sleeper, AC Chair, First Class)
- Manage **Goods Bogies** (Rectangular, Cylindrical)
- Track **train composition and sequence**
- Maintain **capacity and cargo information**
- Enforce **safety and validation rules**
- Demonstrate **core Java concepts through real-world scenarios**

---

## 🧠 Learning Objective
Each Use Case (UC) introduces a specific Java concept mapped to a realistic railway scenario.

---

## 📂 Project Structure
```
Train-Consist-Management-App/
│
├── src/
│   └── main/
│       ├── UseCase1TrainConsistMgmnt.java
│       ├── UseCase2TrainConsistMgmnt.java
│       ├── ...
│       └── UseCase20TrainConsistMgmnt.java
│
├── docs/
│   ├── UC1.md
│   ├── UC2.md
│   ├── ...
│   └── UC20.md
│
├── README.md
└── .gitignore
```

---

## 📊 Use Case Summary

| Use Case | Description                                  | Concepts Used                            |
|----------|----------------------------------------------|------------------------------------------|
| UC1      | Initialize train and display consist summary | Class, Main Method, ArrayList            |
| UC2      | Add/remove passenger bogies                  | ArrayList CRUD, add(), remove(), contains() |
| UC3      | Ensure unique bogie IDs                      | Set, HashSet                             |
| UC4      | Maintain ordered train consist               | LinkedList                               |
| UC5      | Preserve insertion order + uniqueness        | LinkedHashSet                            |
| UC6      | Map bogie to capacity                        | HashMap, key-value mapping               |
| UC7      | Sort bogies by capacity                      | Comparator, List                         |
| UC8      | Filter bogies using Streams                  | Stream API, filter(), collect()          |
| UC9      | Group bogies by type                         | Collectors.groupingBy()                  |
| UC10     | Calculate total seating capacity             | Stream reduce(), map()                   |
| UC11     | Validate Train ID & Cargo Code               | Regex, Pattern, Matcher                  |
| UC12     | Safety compliance for goods bogies           | Streams, allMatch(), lambda              |
| UC13     | Compare performance (Loop vs Stream)         | System.nanoTime(), benchmarking          |
| UC14     | Handle invalid bogie capacity                | Custom Exception, throw/throws           |
| UC15     | Safe cargo assignment                        | try-catch-finally, Runtime Exception     |
| UC16     | Bubble Sort Algorithm                        | Manual sorting using nested loops        |
| UC17     | Arrays.sort()                                | Efficient alphabetical sorting using built-in library                   |
| UC18     | Linear Search                                | Sequential search for bogie ID in unsorted array |
| UC19     | Binary Search                                | Efficient search on sorted bogie IDs using divide-and-conquer |
| UC20     | IllegalStateException                        | Prevent search on empty train (fail-fast validation) |
## ▶️ How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/Praneet6/Train-Consist-Management-App.git
   ```

2. Navigate to the project folder:
   ```bash
   cd Train-Consist-Management-App
   ```

3. Compile any use case:
   ```bash
   javac UseCaseXTrainConsistMgmnt.java
   ```

4. Run:
   ```bash
   java UseCaseXTrainConsistMgmnt
   ```

---

## 🎯 Key Highlights
- Real-world **railway system simulation**
- Covers **Java Collections Framework**
- Introduces **Streams & Functional Programming**
- Implements **Exception Handling & Validation**
- Demonstrates **performance benchmarking**
- Builds **clean and scalable design thinking**

---

## 👨‍💻 Author
**Praneet**

---

