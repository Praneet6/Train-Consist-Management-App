# UC3 - Track Unique Bogie IDs

## Objective
Ensure no duplicate bogie IDs are added.

## Problem in UC2
List allows duplicate values → can cause data inconsistency.

## Solution
Use HashSet to enforce uniqueness.

## Concepts Used
- Set Interface
- HashSet
- add()
- Automatic deduplication

## Outcome
Duplicate bogie IDs are ignored automatically.