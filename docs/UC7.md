# UC7 - Sort Bogies by Capacity (Comparator)

## Objective
Sort passenger bogies based on seating capacity using custom comparison logic.

---

## Problem in UC6
HashMap stores bogie-capacity data but:
- Does not maintain order
- Cannot rank bogies
- Makes planning and comparison difficult

---

## Solution
Use a **Comparator** to sort bogie objects based on capacity.

---

## Concepts Used

### Comparator Interface
- Defines custom sorting logic
- Allows ordering based on business rules

### Custom Class (Bogie)
- Represents bogie with attributes:
    - name
    - capacity
- Enables object-based modeling

### List Collection
- Stores multiple bogie objects dynamically
- Supports sorting and iteration

### sort() Method
- Applies comparator logic to reorder list

### Lambda Expression
- Simplifies comparator definition
```java
Comparator.comparingInt(b -> b.capacity)
