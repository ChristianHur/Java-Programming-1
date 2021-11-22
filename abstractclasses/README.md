# Using Abstract Class and Abstract Methods
Create an abstract **Student** class for Acme University. The class contains fields for student ID number, first name, last name, student type, and annual tuition. Include a constructor that requires parameters for the ID number, first name, last name. Include get and set methods for each field; the setTuition() and setType() methods are abstract. Create three Student subclasses named **UndergraduateStudent**, **GraduateStudent**, and **HighSchoolStudent**, each with a unique setTuition() and setType() methods. Tuition for an *UndergraduateStudent* is $8,500 per semester, tuition for a *GraduateStudent* is $15,000 per semester, and tuition for a *HighSchoolStudent* is $5,500 per semester. Student types are "Graduate", "Undergraduate", and "High School".

Write an application that reads a CSV file and creates an **ArrayList** of objects to demonstrate how the methods work for objects for each Student type. Finally, print each student information to the console.

## Text File: student.csv
Student data are stored in the *student.csv* file (attached). The CSV file contains four fields: student id, first name, last name, type. Make sure that your text file is saved into the root directory of your Java project -- the same level as the "src" folder.

## Reading Textfile:
Here's one way to open and read a text file using the Scanner class. With each line of text (record), you can use String methods to manipulate it (e.g. split()).

    File file = new File("data.txt");
    Scanner input = new Scanner(file);
    while (input.hasNextLine()) {
      String line = input.nextLine();
    }

## Sample Output:
    =================================================================
    SID       First          Last           Type             Tuition
    -----------------------------------------------------------------
    2422      Ruzic          Marylynne      Graduate         $15,000
    4329      Abramamov      Freeman        Graduate         $15,000
    1445      Rey            Ashely         Graduate         $15,000
    2006      Staunton       Zollie         Undergraduate    $8,500
    9165      Shoreson       Curtis         Graduate         $15,000
    3004      Kettow         Sallee         Undergraduate    $8,500
    8566      Larmuth        Alameda        Undergraduate    $8,500
    2934      Horwell        Emelia         High School      $5,500
    3453      Garza          Perren         Undergraduate    $8,500
    6892      Lenihan        Heddi          High School      $5,500
    3734      Pauls          Upton          Undergraduate    $8,500
    1426      Epdell         Jehanna        High School      $5,500
    3042      Pegden         Clayson        Undergraduate    $8,500
    9767      Lorentz        Gaby           Undergraduate    $8,500
    4640      Kluge          Kristo         Graduate         $15,000
    6962      Connor         Farleigh       High School      $5,500
    9043      Mulles         Ardis          High School      $5,500
    3238      Whitehouse     Doralynne      High School      $5,500
    8327      Skarr          Bibby          Undergraduate    $8,500
    6562      Erangey        Norean         Graduate         $15,000
    -----------------------------------------------------------------
