# UC9 - Group Bogies by Type

## Objective
Group bogies into categories using Stream API.

## Problem in UC8
Filtering gives a flat list, not structured data.

## Solution
Use Collectors.groupingBy().

## Concepts Used
- Stream API
- groupingBy()
- Map<String, List<Bogie>>
- Lambda expressions

## Example

Grouped Output:

Sleeper → [72, 70]  
AC Chair → [56, 60]  
First Class → [24]

## Benefits
- Structured data representation
- Easier reporting
- Better analysis