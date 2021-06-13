
# What are Varags
Following are characteristics of varags.
 - Varags is the short name for “variable arguments”.
 - Varags operator is an ellipsis or a set of three consecutive dots or periods:  … (no
   spaces in between) 
 - Varags operator in Java is similar to the *args
   (non-keyword arguments) in Python, spread operator (...) in
   JavaScript and C++ 
 - The varags parameter is a one-dimensional array
 - A method that uses varags is called **varags method**
 
# Rules For Using Varags
A varags parameter is bounded by the following rules.
-   Can only be used in a method
-   The method can only have one varags parameter
-   The parameter must be declared in the last position
-   The parameter can accept an array OR a sequence of values, but NOT both

# What Problems Can Varags Solve?
-   Eliminate unnecessary overloaded methods    
-   A generic type varags can eliminate multiple parameterized types

**Syntax**

    type ... parameter
**Examples**
Simple print method

    static void print(int ... n){
    // implemenation
    }
    
    print(123);						//sequence of values
    print(new int[]{1,2,3,4,5};		//array of values
    
Generic print methods

    // Accepts any unbounded types of data
    static <T> print(T ... n){
    // implementation
    }
    
    // Accepts only numeric data (bounded)
    static <T extends Number> print(T ... n){
    // implementation
    }

# DOs and DON'Ts
Note:  Dos and Don'ts are not Can'ts.  While you can do them, it is not recommended.
 - DO use varags if it's available in the API (e.g. printf() is a varags
   method) 
 - DO use varags when an unknown number of arguments might occur
**Example**

	    int n1 = 2, n2 = 3;
        int total = n1 + n2;
        System.out.printf("Total of %d + %d is %d.", n1, n2, total);
        
        Output:  Total of 2 and 3 is 5.

- DON’T overload varags methods
**Example**

	    static void print(int a) { ... }
	    static void print(int a, int b) { ... }
	    static void print(int ... n) { ... }
	    
		print(1);
		print(1,2,3);
		
	    Problem:  reference to print is ambiguous
- DON'T return the varags parameter (heap pollution)

	   static <T> T doSomething(T ... t){
          return t;  //creates heap pollution
       }
