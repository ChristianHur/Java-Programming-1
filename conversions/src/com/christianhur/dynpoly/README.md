# Dynamic Polymorphism

This is an example of dynamic polymorphism and (widening), inheritance, class type conversion.

## File Information
|        File        |Relationship|Description
|----------------|-------------------------------|-----------------------------|
|Person.java||Superclass
|Employee.java|Child class of Person|Inherits the Person class
|Manager.java|Child class of Employee|Inherits the Employee class
|Client.java|Child class of Person|Inherits the Person class
|DynamicPolymorphism.java|| Driver program

## Class Information

         Person                  Helper (Set of helper functions)
         /   \
        /     \
    Client   Employee
                |
             Manager 
