## Description

Create an abstract Student class for Acme University. The class contains fields for student ID number, first name, last name, student type, and annual tuition. Include a constructor that requires parameters for the 
ID number, first name, last name. Include get and set methods for each field; the setTuition() and setType() methods are abstract. 

Create three Student subclasses named `UndergraduateStudent`, `GraduateStudent`, and `HighSchoolStudent`, each with a unique setTuition() and setType() methods. 

Tuition for an `UndergraduateStudent` is $12,000 per semester, tuition for a `GraduateStudent` is $30,000 per semester, and tuition for a `HighSchoolStudent` is $4,000 per semester.  

Student types are "**Graduate**", "**Undergraduate**", and "**High School**".
 
Student data are stored in a text (CSV) file. The CSV file contains four fields:  *student id, first name, last name, type*
 
Write an application that reads the CSV file and creates an ArrayList of objects to demonstrate how the methods work for objects for each Student type. 

Finally, print each student information to the console as follows:
```  
=================================================================
SID       First          Last           Type             Tuition
-----------------------------------------------------------------
2422      Ruzic          Marylynne      Graduate         $15,000
8566      Larmuth        Alameda        Undergraduate    $8,500
2934      Horwell        Emelia         High School      $5,500
 
etc ...
-----------------------------------------------------------------
```
