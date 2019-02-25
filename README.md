# CISC275-Fall2018-first-git
1. Create java files to make this code compile and run.

2. What five objects are created in the main?
3 Dog objects, 1 dogs ArrayList object, and 1 Animal Comparator Object

3. Can you spot the comparator constructor call? Where is the class definition for the comparator?
The comparator constructor is called on line 16 (Collections.sort(dogs, new Comparator<Animal>(){).
The code "new Comparator<Animal>" creates a new object and calls the constructor.  The class
for the comparator is defined on lines 17 through 21 which follow the initial instantiation.  In
these lines, the compare method is overrided.