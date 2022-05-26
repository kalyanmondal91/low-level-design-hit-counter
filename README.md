# Hit Counter - Low level system design
Repository for low level system design of a hit counter

## Problem Statement
We have to do low level design for a Log Hit counter in last 300s or 5min.

Each function accepts a timestamp parameter (in seconds granularity) and you may assume that calls are being made to the system in chronological order (i.e. the timestamp is monotonically increasing). You may assume that the earliest timestamp starts at 1.

Example:
* counter.hit(1); // hit at timestamp 1
* counter.hit(2); // hit at timestamp 2
* counter.hit(3); // hit at timestamp 3
* counter.getHits(4); // get hits at timestamp 4, should return 3.
* counter.hit(300); // hit at timestamp 300.
* counter.getHits(300); // get hits at timestamp 300, should return 4.
* counter.getHits(301); // get hits at timestamp 301, should return 3.


### Expectations
* Code should be functionally correct.
* Code should be modular and readable. Clean and professional level code.
* Code should be extensible and scalable. Means it should be able to accommodate new requirements with minimal changes.
* Code should have good OOPs design.