
/*

 this is my class note, when i was learning java, i tried keep all magnetic part of java language keep as a note & stick in brain.
 Notes & reference collected from various programmers(youtube) & books.
 Special thanks to all mentors in youtube who helped me to learn java & love programming. */

 /*
All about JDK JRE JDM started here-----------------------


 ** What is Java?
 -- Java is an object based programming language.
 -- In java - everything is an object. Everything in the world can be modeled as an object- a pen is an object, a person is an object
 -- A java is object-oriented because programming in java is centered on creating objects , manipulating objects and making objects work together.

 ** How Java Works?
 -- lets create a source document, use an establish protocol by using java language
 -- Run your document through a source code compiler, the compilers checks for errors and wont let you compile until its satisfied (required code) - then everything will run correctly.
 -- the compilers creates a new document & coded into java ByteCode. the compiled bytecode is platform independent & will be interpret source code to new document.
 -- Then Virtual Java Machine reads and runs the ByteCode

 Note: Together, the Java Development Kit (JDK), the Java Virtual Machine (JVM), and the Java Runtime Environment (JRE) form a powerful trifecta of Java platform components for developing and running Java applications.

 ** What is Java Virtual Machine?
 -- The Java Virtual Machine is a program whose purpose is to execute other programs.
 -- The JVM has two primary functions: to allow Java programs to run on any device or operating system (known as the "Write once, run anywhere" principle), and to manage and optimize program memory.
 -- Technical definition: The JVM is the specification for a software program that executes code and provides the runtime environment for that code.
 -- Everyday definition: The JVM is how we run our Java programs. We configure the JVM settings and then rely on it to manage program resources during execution.

 ** How JVM Works?
 -- To implement the Java virtual machine correctly, you need only be able to read the class file format and correctly perform the operations specified therein.
 -- The JVM is a virtual machine that runs Java class files in a portable way.
    Being a virtual machine means the JVM is an abstraction of an underlying, actual machine--such as the server that your program is running on.
    Regardless of what operating system or hardware is actually present, the JVM creates a predictable environment for programs to run within.
    Unlike a true virtual machine, however, the JVM doesn't create a virtual operating system.
    It would be more accurate to describe the JVM as a managed runtime environment, or a process virtual machine.

 ** How JVM does its functions?
 -- In order to run Java applications, the JVM depends on the Java class loader and a Java execution engine.
 -- Everything in Java is a class, and all Java applications are built from classes. An application could consist of one class or thousands.
    In order to run a Java application, a JVM must load compiled .class files into a context, such as a server, where they can be accessed.
    A JVM depends on its class loader to perform this function.
 -- The Java class loader is the part of the JVM that loads classes into memory and makes them available for execution.
    Class loaders use techniques like lazy-loading and caching to make class loading as efficient as it can be.
    That said, class loading isn't the epic brain-teaser that (say) portable runtime memory management is, so the techniques are comparatively simple.
 -- From the developer's perspective, the underlying class loader mechanisms are typically a black box.
 -- Once the class loader has done its work of loading classes, the JVM begins executing the code in each class. The execution engine is the JVM component that handles this function.
 -- Whereas the Java Virtual Machine was originally just for Java, today it has evolved to support many scripting and programming languages, including Scala, Groovy, and Kotlin

 ** Who Develops and maintains JVM?
  The JVM is widely deployed, heavily used, and maintained by some very bright programmers, both corporate and open source.
  The OpenJDK project is the offspring of the Sun Micro systems decision to open-source Java.
  OpenJDK has continued through Oracle's stewardship of Java, with much of the heavy lifting these days done by Oracle engineers.

 ** How Garbage collection works in JVM?
  Before Java, all program memory was managed by the programmer.
  In Java, program memory is managed by the JVM.
  The JVM manages memory through a process called garbage collection, which continuously identifies and eliminates unused memory in Java programs.
  Garbage collection happens inside a running JVM.

  ** What is JDK?
-- The Java Development Kit (JDK) is one of three core technology packages used in Java programming, along with the JVM (Java Virtual Machine) and the JRE (Java Runtime Environment).
    It's important to differentiate between these three technologies, as well as understanding how they're connected:
                      a. The JVM is the Java platform component that executes programs.
                      b. The JRE is the on-disk part of Java that creates the JVM.
                      c. The JDK allows developers to create Java programs that can be executed and run by the JVM and JRE.
-- JDK is a package of tools for developing Java-based software, whereas the JRE is a package of tools for running Java code.
   The JDK requires a JRE because running Java programs is part of developing them.
-- Technical definition: The JDK is an implementation of the Java platform specification, including compiler and class libraries.
   Everyday definition: The JDK is a software package you download in order to create Java-based applications.


 **  What is the JRE? Introduction to the Java Runtime Environment?
 -- The JRE creates the JVM and ensures dependencies are available to your Java programs
 -- Practically speaking, a runtime environment is a piece of software that is designed to run other software.
   As the runtime environment for Java, the JRE contains the Java class libraries, the Java class loader, and the Java Virtual Machine. In this system:

        # The class loader is responsible for correctly loading classes and connecting them with the core Java class libraries.
        # The JVM is responsible for ensuring Java applications have the resources they need to run and perform well in your device or cloud environment.
        # The JRE is mainly a container for those other components, and is responsible for orchestrating their activities.

 ** What is Run time environment?
 A software program needs to execute, and to do that it needs an environment to run in.
 The runtime environment loads class files and ensures there is access to memory and other system resources to run them.
 In the past, most software used the operating system (OS) as its runtime environment.
 The program ran inside whatever computer it was on, but relied on operating system settings for resource access.
 Resources in this case would be things like memory and program files and dependencies.
 The Java Runtime Environment changed all that, at least for Java programs.

 ** How the JRE works with JVM?
 A Java Virtual Machine is a running software system responsible for executing live Java programs.
 The JRE is the on-disk system that takes your Java code, combines it with the necessary libraries, and starts the JVM to execute it.
 The JRE contains libraries and software that your Java programs need to run. As an example, the Java class loader is part of the Java Runtime Environment.
 This important piece of software loads compiled Java code into memory and connects the code to the appropriate Java class libraries.

 ** How Java memory consists?
 Java memory consists of three components: the heap, stack and metaspace;

     Metaspace is where Java keeps your program's unchanging info like class definitions.
     Heap space is where Java keeps variable content.
     Stack space is where Java stores function execution and variable references.

** How Java application monitored?
Although application monitoring is a function of the JVM, the JRE provides configuration options, which are the necessary baseline for monitoring.
A variety of tools are available for monitoring Java applications, from the classics (like the Unix command top) to sophisticated remote monitoring solutions like Oracle's infrastructure monitoring.
In between these options are visual profiler like VisualVM that allow for inspecting a running JVM.
These tools enable tracking down hot spots and memory leaks, as well as watching overall memory consumption in your system.

lets conclude the whole process about JDK< JRE < JVM:
The Java Runtime Environment is the on-disk program that loads Java applications for the JVM to execute.
A JRE is included by default when you download the Java Development Kit, and each JRE includes the core Java class libraries, a Java class loader, and a Java Virtual Machine.
It's helpful to understand how the JVM, JDK and JRE interact, especially for working in cloud and devops environments.
In these environments, the JRE takes a stronger role in monitoring and configuration than it would in traditional Java application development.

For Understanding JDK, JRE & JVM collectively , how they works in java, lets run a simple java program:

 Step 1. Write a simple Java program
         Create a new text file, called Intro.java and place it somewhere on your computer, like your Documents folder.

Listing 1. Intro.java
public class Intro {
     public static void main(String[] args) {
        System.out.println("Welcome to the JDK!");
    }

}

Step 2. Compile with the JDK

Next, use the JDK compiler to turn your text file into an executable program. Compiled code in Java is known as bytecode, and carries the .class extension.
You'll use the javac command, which stands for Java compiler. Type the full path to the command into your command shell, and pass the Intro.java file as a command. On my system, that looks like Listing 2.

Listing 2. Compile with the JDK
          "C:\Program Files\Java\jdk-10.0.1\bin\javac.exe" Intro.java

That should result in a successful compile. The javac will not respond with a success message; it will just output the new file. Any errors will result in console output.

Step 3. Run the .class file
You should now see the Intro.class file in the same directory as Intro.java.

You can run it by typing: java Intro, which will result in Listing 3. Note that you don't include the .class when typing this command.

Listing 3. Running Intro.class
C:\Users\Documents>java Intro
Welcome to the JDK!

The jar command:
The javac is the star of the JDK, but the /bin directory contains other tools you will need. Probably the most prominent after javac is the jar tool.

A .jar file is a packaged set of Java classes. Once the compiler has created the .class files, the developer can put them together in a .jar, which compresses and structures them in a predictable fashion.

Let's convert Intro.class to a jar file.
Navigate back to the directory where you placed your Intro.java, and type the command you see in Listing 4.

Listing 4. Create a JAR file

C:\Users\Documents>"c:\Program Files\Java\jdk-10.0.1\bin\jar.exe" --create --file intro.jar Intro.class

Executing the jar:
Now you'll see an intro.jar file in the directory. You can make use of the .jar by adding it to your classpath and executing the program inside, as shown here:

java -cp intro.jar Intro

The -cp switch tells Java to add the jar to the classpath. A .jar file is overkill for this tiny program, but they're indispensable as programs grow in size and rely on third-party packages.
Java JDK, JRE, JVM completed here----------------------------

  */

/*
Java project tree started here-------------------
1.Create a Package
2.inside package create a class with main method------more class as we need. without main method java application would not run
3.declare a variables for class --
4.Assign a data type for variables---


Java basic project tree completed here------------------------

 */

/*
java basics & fundamentals started here-----------------------
1. What is code Structure in Java?
Answer: Put a Class in a Source file,
        Put a Method in a Class,
        Put a Statement in a Method.
2. What goes in a source file?
3. what goes in a class?
4. what goes in a method?
* what is the steps of object?
Dog myDog = new Dog();
Step 1.  declare a reference variable >>> Dog myDod ?? - tells the JVM to allocate space for a reference variable, and names that variable myDog.
Step 2.  Create an object >> new Dog(); ?? - tells the JVM to allocate space for a new Dog object on the heap.
Step 3.  Link the object and the reference >> (=) ?? - Assigns the newDog to the reference variable myDog. in other words, programs the remote control.

5. Is java is a Pure programming language?
6. What comes first -object or class?
Answer: In development phase you can not instantiate class without an object but in design phase we need an object to design class. So in development
process class comes first but in design process objects comes first.
7. when we need a constructor? - whenever we need to initialize variables.

*  what is variable in Java?
- variable is something that's hold value- like a variable is just a cup, it holds something. it has a size and type.
- Variables comes in two flavours- primitive & object reference.primitive hold fundamental values including integers, booleans,and floating point numbers.
and object reference hold references to object.
- Variables must have a type , I meant variables needs a name, so that we can use that name in code.
- when you declare a variable in java, you must declare it with a specific type.
- when we assign a data type for variables, we need to make sure using right data type for variables, you cannot assign int data type for byte.
it wont work. need to know data type value.
int x = 24;
byte b = x; // won't work
- the compiler wont you put a value a large into a small one but what about putting a value small to large? yes it works. I can put byte value into
integer but not long value in integer.
- operators are supported by data types. like int data type store (addition , subtraction etc) same String can add more words using operator. but String has limitation
for using operators , like addition is common use in string but subtraction we can not use in String data type.
- AS I MENTIONED EARLIER THERE IS ACTUALLY NO SUCH THING AS AN OBJECT VARIABLE, THERE IS ONLY AN OBJECT REFERENCE VARIABLE, AN OBJECT REFERENCE VARIABLE HOLDS BITS THAT'S
REPRESENT A WAY TO ACCESS AN OBJECT. IT DOES NOT HOLD THE OBJECT ITSELF BUT IT HOLDS SOMETHING LIKE A POINTER. IN JAVA, WE DON'T REALLY KNOW WHAT IS INSIDE A REFERENCE VARIABLE.
WE DO KNOW THAT WHATEVER IT IS. IT REPRESENTS ONE AND ONLY ONE OBJECT, AND THE JVM KNOWS HOW TO USE THE REFERENCE TO GET TO THE OBJECT.

we can use the dot operator(.) on a reference variable to say--
" use the the thing before the dot to get me the thing after the dot"
example: myDog.bark(); >> "means use the object reference by the variable myDog to invoke the bark() method" - when you use the dot operator on an object reference variable,
think of its like pressing a button on the remote control for that object. because an object reference is just another variable value.

WHAT CAN WE USE AS NAMES? - THE RULES ARE SIMPLE. YOU CAN NAME A CLASS, METHOD OR VARIABLE ACCORDING TO THE FOLLOWING RULES:
1. CLASS NEED TO START WITH CAPITAL LETTER.
2. IT MUST START WITH A LETTER, UNDERSCORE, DOLLAR SIGN. YOU CANNOT START A NAME WITH A NUMBER
3. AFTER THE FIRST CHARACTER, YOU CAN USE NUMBERS AS WELL, JUST DON'T START WITH A NUMBER.
4. IT CAN BE ANYTHING YOU LIKE, SUBJECT TO THOSE TWO RULES, JUST SO LONG AS IT IS NOT ONE OF THE JAVA'S RESERVED WORDS.

Java interview questions & analysis concept---------------------
Java language fundamentals:
1.	Identifiers
2.	Reserve words
3.	Data types
4.	Literals
5.	Arrays
6.	Types & variables
7.	Var-argument methods
8.	Main method
9.	Command line arguments
10.	Java coding standards

 */

/* Java identifiers started here-----------
Identifiers:
####Identifiers using for identification purpose. A name in java program is by default called Identifier.
Which can be used for identification purpose.
It’s can be method name, variable name, class name.
For example:
class test {
     public static void main (String[]arg){
     int x = 10;
     System-----------
     how many Identifiers are there?
      Answer is: 1. test, 2. main 3. String 4. Arg 5. x
     while defining java identifiers we need to follow some rules--- (a to z) (A to Z) (0 to 9) ($) (-) the only allowed characters in java identifiers
     are as above, other than any sign will get compile time error.
     -Identifiers should not start with digit or number.
     -java identifiers are case sensitive
     -maximum character allow ? - there is no length limit for java identifiers but for good practice keep in one-word.
     Questions:
         How many rules for Java Identifiers in total---??

 java identifiers completed here-----------------------------------------

 */

 /*
 java keywords started here ---------------------
 ####Reserve words: In every language has reserve words
we cant use reserve word as identifiers like if abstract, if , void , final ----------(more)-----!!
but all pre-defined java class names or interface names we can use as java identifiers.
like String & Runnable.
example: int String = 888;
int Runnable = 999;
we can use this way but its not good coding practice, its reduces readability & creates confusion.
**what happens if we use a reserve word? - Instead of compiling, the Java program will instead give the following  error: Expected
**How many reserve words in Java? - total 53
**how many types of reserve words in java? - keywords & reserve literals
**how many keywords & what types?- total 50, two types -used keywords 48 (if else------ & unused keywords 2 (goto & Const)
**what is reserve literals?- true, false & null>>> true & false boolean data types & null default value for object reference.
**what is the difference between keyword & reserve words?
-- if the reserve word associated with functionality that is called keyword,
if the reserve word only show value but not functionality then its called reserved word.
**why delete keyword is not in java? - There is no delete in java, and all objects are created on the heap.
The JVM has a garbage collector that relies on reference counts. Once there are no more references to an object,
it becomes available for collection by the garbage collector.
Keywords for data types: byte, short,int, long, float, double, boolean , char ( total 8)
keywords for flow control: if, else, switch,const, default, while, do, for, continue, break, return(11 totals)
keywords for Modifiers: public, private, protected, static, final, abstract, synchronized, native,  strictFp(1.2 version), transient , volatile(11)
keywords for exception handling: try, catch, finally,throw, throws, assert(6)
class related keywords: class, interface, extends, implements, package, import(6)
object related keywords: new, instanceof, super, this (4)
****return type keyword: void (1)- if method don't return anything that's called void. In java return type is mandatory,
 if a method wont return anything then we have declare that method with void return type.
 in C language return type is optional & default return type is int
 Un-used keywords: goto & Const ( some people banned this keywords in java) - by using this keywords we will get compile error.
 (1)- enum>>
 *Enumerations serve the purpose of representing a group of named constants in a programming language.
 *Enums are used when we know all possible values at compile time
 *Enum declaration can be done outside a Class or inside a Class but not inside a Method
 *The main objective of enum is to define our own data types(Enumerated Data Types).
 *According to Java naming conventions, it is recommended that we name constant with all capital letters
 Lets come to conclusion about keywords:
 - all keywords start with small case alphabet symbols
 - no delete key word
 - some keywords not using that much
 - new keywords coming in the need of java
 \just for better reminder -strictfp not strictFp, instanceof but not instanceOf, synchronized but not synchronize
 extends but not extend, implements but not implement, import but not imports, const but not constant/
 question for exams can be --
 1. which of the following list contains only java reserved words? - answers should be tricky, check spell & capital letters

Java keywords completed here-----------------------------
*/

/*
Data types started here--------------------------------

Data type in Java:
java is strongly typed programming language.
In java, every variable, every expression has a some type. each & every data type is a clearly defined. every assignment should be
checked by compiler for type compatibility. because of, we can conclude that java language is strongly typed programming language.
type checking is very strong.
Is java is pure OOP language or not? - based on context,yes & no both answer would be correct.
why?- yes, java has more object oriented nature,
 No, consider java alone-java is not pure object oriented language because java has some
limitations, several concept & several feature are not supported by Java- like multiple inheritance, operator overloading.
based on the relative perception java is OOP but not perfect. what would be right answer then-->> No, Java is not yet pure object oriented
programming language because several features are not satisfied by Java( like operator overloading, multiple inheritance etc), moreover, we are
depending on primitive data types which are none objects. But Java is purely strong typed language but not pure OOP language.
Primitive data type(8): two types - Numerical & non-numerical data types
Numerical Data types: Integral & Floating data type
Non-numerical data types: char , Boolean
Integral data type:byte, short , int, long
Floating data type: float, double
except boolean & char, remaining data types considered signed data type. because we can represent both positive & negative numbers.
lets explain all data types:
byte>>>> 8 bits, max value: 127 min Value:-128
Do i understood how to calculate bit? 1-1-1-1-1-1-1-1, first 1 has 0 value, next 7 bit has value- 2 power o to 2 power 6
how much total = 64+32+16+8+4+2+1 = 127 max value, minimum value = -128( first 1 value will add for negative value)
         byte b = 127 ( maximum range & valid)
         byte b = 128 (PLP found! int required, invalid)
         byte b = 10.5 (plp found! double required, invalid)
         byte b = true; (compatible type found, boolean required, invalid)
Conclusion:
the most significant bit excess sign bit, 0 means positive number & 1 means negative number, positive numbers will be represented in
directly in the memory whereas to negative numbers will be represented in to is compatible of form.
Question: what is the range of byte?
Question: How many data types we have? explain all?
possible loss of precision: “Possible loss of precision” occurs when more information is assigned to a variable than it can hold.
If this happens, pieces will be thrown out. If this is fine, then the code needs to explicitly declare the variable as a new type.
A “possible loss of precision” error commonly occurs when:
Trying to assign a real number to a variable with an integer data type.
Trying to assign a double to a variable with an integer data type.
Short data type: Short is most rarely uses data type in java. size: 2 bytes- 8 bits, Range: -2 power 15 to 2 power 15 -1 {-32768 to 32767}
example: short s = 32767 ( maximum range & valid)
         short s = 32768 (PLP found! int required,invalid)
         short s = 10.5 (plp found! double required, invalid)
         short s = true; (compatible type found, boolean required, invalid)
>>>> when expected form & provided form, read & write operation is very efficient, short datatype was popular in old time but its outdated data type.
int Data type: int is most common used data type in java. size: 4 bytes(32 bits), range: -2 power 31 to 2 power 31[-2147483648 to 2147483647]
  int x = 2147483647; ( valid, max)
  int x = 2147483647; ( invalid, PLP- error integer number too large)
  int x = 2147483648L; (L is lang value- error- PLP found , lang required:int)
  int x = true; (compatible types found: boolean required:int)
long data type: 8 bytes, 64 bits = 2 power 63 == ???
  easy to remember>> byte 8 bits, as first bit is negative then rest of 7 bit will multiple by 2 ( 2 power 7 = 128) like 2*2*2*2*2*2*2
                     short 16 bits ( so 2 power 15= 32768)2*2*2*2*2*2*2*2*2*2*2*2*2*2*2 = 32768
                     int 32 bits ( 2 power 31)= 2147483647
                     long 64 bits (2 power 63)=
      when int, may not enough hold a value, we should go for long data type.
      the number of character present in big file, may exit length of size but not int.
all the above data type ( byte, short, int , long) has integral values, represent exact number.
if we want to represent floating point or decimal values then we should go for floating point data types.
floating point data type: float & double
how can we define float & double? --
>>>if we want 5 to 6 decimal place go for float & if we want 15 to 16 gor for double
>>>float is single precision or less accuracy but float is double precision or right accuracy
>>> float is 4 bytes but double 8 bytes
>>>float range (-3.4e38 to 3.4e38 but double range -1.7e308 to 1.7e308
Char & Boolean:
in Java, size of boolean is not applicable. range not applicable but allowed values are true or false.
boolean b = true; ( right)
boolean b = 0; ( invalid- error: incompatible types found: required boolean
boolean b = True(invalid-error:cannot find a symbol)
boolean b = "true" ( invalid- incompatible type, can't be string)
Boolean default value in java is false.
Char: size 2 bytes. as java is unicode base language, ASCII range = 0 to 65536
old language  like c/c++ ASCII code base, under the number of allowed ASCII are lesser than 256 characters to represent.
the size of char is old language is one byte but Java is unicode base, under the number of different of unicode are
greater then 256 bits & lesser then 65536, to present this many characters 8 bits may not enough compiler should go 16 bit.
hence java bit 2 bits. range 0 to 65535.
summary- java primitive data types
all data types default value is 0 except Boolean is false in Java.
null is default value object type.
lets accumulate & rewind all questions regarding Identifiers, reserve words & data types.
Data types(8) ended here-----

Data types in java completed here

 */


/* Literal in Java start here-----------------

 Literals: any constant value which can be assigned to the variable , is called literal.
 int x =10; here int is data type or keywords, x is identifiers or name of variable & 10 constant value or literals.
 integral literals: for integral data types- byte, short, int , long we can specify literal value in the following base;
  which one is integral data types: byte, short, int, long
 1. decimal literals: x = 10 ( here 10 is decimal value)- allowed digit are 0 to 9
 2. int x =010; ( octal form)- base 8 ( o to 7), literal value should be prefix 0
 3. Hexa decimal form( base 16, allowed digit are 0 to 9 - for extra digit (a to f, we can use both lower case & upper case
 characters, this is one of very few areas where java is not case sensitive)- this are possible way to represent literals
 for integral value.
 Question:    which of the following declarations are valid?
           int x= 10; ( valid)
           int x = 0786; ( error)- integer number too large.
           int x = 0777;(valid)-
           int x = 0XFace; ( valid)
           int x = oBeef;(valid)
           int x = oXBeer; ( valid)
programmer can get value like regular math but JVM calculate different way.
every integral value by default int.
by default, every integral literal is of int type but we can specify explicitly is long type by suffix ( small letter or
capital letter)


java Literals completed here----------------------

*/

/*
Java Array Start here - detail explanation---------------------------
Java Array :
1. Introduction
2. Array Declaration
3. Array Creation
4. Array Initialization
5. Array declaration, creation & initialization in a single line
6. length VS length()
7. Anonymous Arrays
8. Array element assignments
9. Array variable assignments
this is the 9 topics i will cover step by step.
1. Introduction:
what is an array?
an Array is a indexed collection of, fixed number of , homo-genius data elements , the main advantage of arrays is we can
represent huge number of values by using single variable so that readability of the code will be improved, but main disadvantage
of arrays is fixed in size that once we creates an array there is no chance of increasing are decreasing the size based on our requirement.
hence to use arrays concept, compulsory we should know the size in advance, which may not possible always.
2.How to declare an array?
one dimensional array declaration:
here is example int[] x; / int []x; / int x[]; -- all are valid but which one is recommended? - int []  x; because name is clearly
separated from type.
at the time declaration, we cant specify the size otherwise we will get compile time error(int[6] x;)-not valid.
two dimensional array declaration: int [][] x;
if i want to declare dimension before the variable that facility is applicable only for first variable in a declaration.
if we trying to apply for remaining variables we will get compile time error ( int[]  []a []b []c - here a is right but b & c is not valid)
three dimensional array declaration: int [][][]  x;
we can write array multiple way but for coding readability , need to follow above style.
question : how many types of array in java?
3. Array Creation: every array in java is an object only hence we can create arrays by using new operator.
like int[] a = new int [3]; - so its an object. usually we are creating object for class, if not class there how can we can create object?
every array type has a corresponding classes are available, under this classes are part of java language but not available to the programmer level.
for example: int []  a = new int [3];
system.out.println( a. getClass().getName()); >>> result is [I -so this is the corresponding class.
lets come to more details about array type & corresponding class name--
int[] >>>>> [I
int [][]>>>>[[I
double[]>>>[D
short[] >>> [s
byte[] >>> [B
boolean[] >>>> [z
this all class available in java language but not for programmer.
here are some java creation loopholes:
int []  x = new int [] - not valid/ce
in [] x = new int [3] - valid, why?
at the time declaration we can not specify the size but at the time of creation we should specify size otherwise we will get compile error.
important note - it is legal to have an array with the size 0 in java int []  x = new int [0] -- valid but int [] x = new int [-3] at this point we will not get compiler error.
because compiler job is finding value for int its either negative or zero. compiler will do job right but run time JVM saying "negative array size exception"
note 2: to specify array size the allowed data types are byte , short, char & int . if we are trying to specify any other type then we will get compile time error.
when we should go for arrays?
any such time limitations? yes.
what is the maximum array size in java? - 2147483647 , more than this number CE - integer number too large!
>>> the maximum allowed array size in java is 2147483647 which is the maximum value of int data type.
>>>>even in the first case we may get run time exception if the sufficient memory not available.
what is array of arrays approach? / two dimensional array creation
-- In java two dimensional array not implemented by using matrix style, some people followed arrays of array approach for multi-dimensional creation.
 the main advantage of the approach is memory utilization would be improved. for 3-4-5 in any dimension we can use array of arrays approach.
 example 1:
 int [][] x = new int[2][];
     x[0] = new int [2];
     x[1] = new int [3];
  example 2 : 3 level arrays.
  int [][][]  x = new int [2][][];
   x[0] = new int  [3][];
   x [0][0] = new int [1];
   x[0][1] = new int [2];
   x[0][2] = new int [3];
   x[1] = new int [2] [2];
   Question: which of the following array declarations are valid?
Array Initialization: once we creates in array, every array  element by default initializer with default values.
whenever we are trying to print , any reference variable internally two string method will be called which is implemented by default to return the string in the following form.
  (classname@hashcode_in_hexadecimal form)
  1.if we are trying any operation on null, we will get run time exception saying null point are exception.
  2. once we creates an array, every array element by default initializer with default values, if we not satisfied with the default value ,
   we can override with this values with our customizer values.
   3. logical mistake runtime error & syntax mistake compiler error.
   4. if we are trying to access in array element with out of range index (either positive or negative int value) then we will get run-time exception saying array index out of exception.
Array declaration, creation & initialization in a single line:
we can declare, create & initialise in array in a single line (short cut representation)
int[] x ; >>> this is declaration
x= new int [3] >>> this is creation
x[0] =10;
x[1] =20; // this is initializer
x[2] =30;
int [] x = { 10,20,30}                    // for int
char[] ch = { 'a', 'e', 'i', 'o', 'u'};  // for char
String [] s = {"A", "AA", "AAA'};        // for String
this, same approach we can use for all dimensional array.
we can extend this shortcut even for multi-dimensional array also\
int [][] x = { {10,20} {30,40,50} }; // two-dimension
int [][][] x = {  {{10,20,30}, {40,50,60}} {{70,80} {90,100,110}}  } // three dimension
if we don't decorate arrays in single line or divide in multiple line, will get compile error: illegal start of expression.
length VS lengths:
length is a final variable , applicable for arrays - length variable represents the size of the array
example 1:
int [] x = new int [6]
system.out.println( x.length()); //CE: cannot find symbol: method length() location class int []
system.out.println (x.length); // valid, output is 6.
example 2:
String s = "Dog";
system.out.println (s.length); // not valid, CE: can not find symbol
system.out.println (s.length()); // valid, output 5
length method is a final method, applicable for String object, length method returns number of characters present in the string.
length variable applicable for arrays but not for String objects whereas length method applicable for string object but not for arrays.
in multi-dimensional arrays length variables represents only base size but not total size like--
int [][] x = new int [6][3];
system.out.println (x.length); // answer is 6 only base not total.
there is not direct way to specify total length of multi-dimensional array, indirectly we can find as follows---
x[0].length + x[1].length + x[2].length + ---------------------
length variable applicable for Arrays but lengths variable applicable for String method of array.
Anonymous array:
Sometimes, we cam declare an array without name , such type of nameless arrays are called anonymous arrays.
the main purpose of Anonymous array is just for instant use(one time usage), we can create anonymous array as follows
new int[] {10,20,30,40}; // we cant specify the size for anonymous array.
we can create A.array as follows-----
class test{
p s v main(String[] args) {
sum(new int[] {10,20,30,40})  // this one time use or A.array, just calling for SUM method we use this line as an A.array
}
p s v sum(int[] x )  {          // sum method represent Int
int total = 0;
for (int x1 : x ){
 total = total + x1 ;          // loop here
}
System.out.println ("the sum : " + total);
}
In the above example, just a call SUM method , we required an array but after completing SUM method, we not using SUM anymore hence for this
ont time requirement A.array is the best choice.
while creating anonymous , we cant specify the size otherwise we will get compile time error.
we can create anonymous multi-dimensional also. for this one time requirement, anonymous array is best choice.
new [][] { {10,20},{30,40,50} } // two dimensional array
based on our requirement , we can give the name for A. array then it is no longer Anonymous. like--
new int [] {10,20,30} // this is Anonymous now
int [] x = paste first line; // we gave A array an identity based on requirement.
What is Anonymous array? how we an use Anonymous Array?
ARRAY ELEMENT ASSIGNMENT: In the case of primitive type arrays as array elements we can provide any type which can be implicitly promoted to declared type
int[] x = new int [5];
x[0] = 10;
x[1] = 'a';
byte b = 20;                             // byte, short, char & int allowed , other data type will give error:PLP
x[2] = 'b';                               // in the case of float types array byte, short, char , int , float allowed
short s = 30;
x[3] = s;
but if the object type array, whats behavior will show up?----
 object[] a = new object[];
 a[0] = new object()
 a[1] = new String("Dog");
 a[2] = new Integer(10);       /// all are valid
In the case of object types arrays as array elements we can provide either declared type object or its a child class objects.
lets make a quiz:
Runnable [] r = new runnable [10]; // Is it a valid or invalid?
YES. valid-as we know , we cant object in runnable interface but here we are not creating object but array. interface type of array are using thread only, any other data
type will give CE error-incompatible types found.
So, for interface types array, as array elements , its implementation class-object are allowed.
array type VS allowed element types:
 1. PRIMITIVE array >>>>>>> any type which can be implicitly promoted to declared type
 2. OBJECT array >>>>>>>either declared type or its child class objects
 3. ABSTRACT array >>>>> its a child class object are allowed
 4. INTERFACE array>>>>> its a implementation class objects are allowed.
 Which Array Type allowed element types?
 ARRAY VARIABLE ASSIGNMENT:
 Case 1 for Variable assignment:
 int[] x = {10,20,30,40}; we can promote to int [] b = x;
 but,
 char [] ch = {'a', 'b', 'c', 'd'}; we can not promote to int [] c = ch; invalid: CE-compatible types found
 because element level promotions are not applicable at array level, for example - char element can be promoted to int type whereas char array can not be promoted to int array.
ELEMENT PROMOTION:
char >> int                   ---valid, char can be promoted in object level
char[] >> int []              --- not valid , char cant be promoted in array
int >> double                 ---valid
int [] >> double []           ---not valid
float >> int                  --- not valid
float[] >> int []             --- not valid
String >> object              ---valid
String[] >> object[]          ---valid
but in the case of object type arrays, child class type array can be promoted to parent class type array.
 example : String s = {"A", "B", "C", "D" };
           Object a = s ;
Case 2 :
int [] a = {10,20,30,40,50,60 };
int [] b = 70, 80};
 So,
  a = b               // Is it valid?
  b = a               // is it valid?
YES. both are valid. because whenever we are assigning one array to another array , internal elements wont be copied, just a reference variables will be re-assigned.
Case 3 :
int [][] a = new int [3][];
a [0] = new int [4][3]; // CE: incompatible types found: int [][] required: int[]
a [0] = 10;             // CE: incompatible types found: int [][] required: int[]
a [0] = new int [2];    // valid
whenever we are assigning one array to another array, the dimension must be matched. for example- in the place of one-dimensional int array we should provide one dimensional array only.
if we are trying to provide any other dimension, then we will get compile time error.
whenever we are assigning one array to another array , both dimensions and types must be match but sizes are not required to match.
this is officially all arrays concept************************* covered.
Questions: (source Durga sir class- array part:4)
 int [][] a = new int [4][3];  // this line has 5 objects, how?
 a [0] = new int [4];          // this line created 1 object , how?
 a [1] = new int [2];          // this line created 1 objects , how?
 a = new int [3][2];           // this line created 4 objects, how?
  Is it valid code?
  total how many objects are created? 11 objects
  total how many objects eligible for Garbage collection? 7 objects

  Just a good reminder-
  1. array are always object,whether they are declared to hold primitives or object references. we can have an array objects, whether they are declared to hold
  primitives or object references. but you can have an array object that's declared to hold primitive values, in other words the array object can have elements which are primitives
  but the array itself is never a primitive. Regardless of what the array holds, the array itself is always an object.

 lets make an array of dogs:
 1. Dog [] pets;                           // declare a Dog array variable
 2. pets = new Dog[7];                     // Create a new Dog array with a length of 7, assign it to the Dog[] variable pets.
 whats missing here? - We have an array of Dog references, but no actual dog objects.
 3. create a new Dog objects, and assign them to the array elements. Remember, elements in a dog array are just Dog references variables. We still need Dogs!

 pets[0] = new Dog();
 pets[1] = new Dog();
 pets[2] = new Dog();
 






















 */




























