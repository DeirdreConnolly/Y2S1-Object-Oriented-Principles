Scaler Types
	integer
	float
	doubles
		D1 == D2		// questionable, rather (D1-D2) * 10^-9
		
Naming a Variable
	No spaces
	No operators  (+, -) 
	Not already a word in Java (such as class, void)
	Starts with a letter, usually lowercase
	Use camelcase
	Declare only once
	
Real Numbers
	Use float, or double
	
Char
	8-bit representation of ASCII character
	char level = 'A';
	
String
	Terminateed by /0
	level = "A";
	
Constants
	Don't change
	final int HOURS = 24;
	
Print
	System.out.println("");
	System.out.println(cost);
	
Scanner class
	Scanner scan = new Scanner(System.in);
	reads input
	
public static void main
	public - 
	static - 
	void - returns nothing
	main - main method
	
Selection
	allows choice

if/else statement
	mutually exclusive
	
		if (____)
		{
			// instruction;	
		}
		else 
		{
			// instruction;
		}
		
Operators
	==
	!=
	>
	<
	>=
	<=
	i++
	i--
	
switch Statement
	Used when only one varialbe is being checked in each condition
	
		switch(group);
			break	
	
Iteration
	Allows selection of code to be repeated
		for
		while loop
		do 
		{
			
		} while
	
Input Validation
	Use while, not if
	
Constructor
	Same name as class
	No return
	
If you pass an object, you pass the reference (the address of the object in memory)
If you pass an int, you pass the value

Nouns often identify classes (but not always), generally given a singuler name (eg Coin, Player, Car)
Often the verbs are methods

Cannot access non-static content from static because it's ambigious

UML Diagram Notation
	+ 			public method
	-			private method
	: String	returns a string
	
Method Overload
	Two methods with same name and return type, but different parameters
	The method name is not sufficient to determine which method is being called
	Constructors can be overloaded
	Often confused	with override (never has a different signature)
	
Fixed
	Defines a constant
	
Functionally Cohesive
	Does only one thing
	Best practice
	
Coupling
	Want to reduce as much as possible
	A class depends on another if it uses ojects of that class
	
Arrays
	Fixed length
	
ArrayLists
	Infinite
	Dynamic, can grow and shrink as needed
	
Enum Types

Comparing Strings
	==
	.=			??
	
Comparing Integers
	==
	
Don't use == on objects, instead use the equals method

Inheritance
	the sharing of attributes and methods among classes
	the new classes inherit all the attributes and methods of the first (superclass/parent class), but also have their own
	extends
	Java only allows single inheritance
	can workaround using interfaces
	type cast, safe cast 
	
			object d = ol.get(i);
			if (d.isInstanceOf Dog) {
				Dog ol;
				g = (Dog g);
				g.bark();
			}
	
	


	
	
	
	
	