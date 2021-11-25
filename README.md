# hackerrank-Java-Priority-Queue
In this problem we will test your knowledge on Java Priority Queue.


There are a number of students in a school who wait to be served. Two types of events, ENTER and SERVED, can take place which are described below.

ENTER: A student with some priority enters the queue to be served.
SERVED: The student with the highest priority is served (removed) from the queue.
A unique id is assigned to each student entering the queue. The queue serves the students based on the following criteria (priority criteria):

The student having the highest Cumulative Grade Point Average (CGPA) is served first.
Any students having the same CGPA will be served by name in ascending case-sensitive alphabetical order.
Any students having the same CGPA and name will be served in ascending order of the id.

## Solution:
total 4 classers written\
Student class: student properties\
Checker class: implements comparator\
Priorities class: serves based on priorityy set in checket class\
Solution: print out un-serverd students
