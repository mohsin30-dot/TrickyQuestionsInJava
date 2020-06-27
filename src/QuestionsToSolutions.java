
/*
 Notes & reference collected from various programmers(youtube) & books.

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
 -- Everyday definition: The JVM is how we run our Java programs. We configure the JVM's settings and then rely on it to manage program resources during execution.

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
C:\Users\mtyson\Documents>java Intro
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


1. What is code Structure in Java?
Answer: Put a Class in a Source file,
        Put a Method in a Class,
        Put a Statement in a Method.
2. What goes in a source file?
3. what goes in a class?
4. what goes in a method?
5. Is java is a Pure programming language?
6. What comes first -object or class?
Answer: In development phase you can not instantiate class without an object but in design phase we need an object to design class. So in development
process class comes first but in design process objects comes first.
 */