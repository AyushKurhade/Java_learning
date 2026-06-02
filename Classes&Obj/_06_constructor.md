What is a Constructor?

A constructor is a special member of a class that is automatically called when an object is created. Its primary purpose is to initialize the object’s data members.

Rules of Constructors

Constructor name must be the same as the class name.
Constructors do not have a return type.
Constructors are called automatically when an object is created.
Constructors can be overloaded.
Constructors cannot be inherited.
Constructors cannot be overridden.
Constructors cannot be static, final, or abstract.

# Types of Constructors


1. Default Constructor
class Student {
    Student() {
        System.out.println("Default Constructor Called");
    }

    public static void main(String[] args) {
        Student s1 = new Student();
    }
}
Output
Default Constructor Called



2. Parameterized Constructor
class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Ayush");
        s1.display();
    }
}
Output
Ayush

3. Copy Constructor (User Defined)
class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    Student(Student s) {
        this.name = s.name;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Ayush");
        Student s2 = new Student(s1);

        System.out.println(s2.name);
    }
}
Output
Ayush



# Constructor Chaining
Constructor chaining means calling one constructor from another constructor.
Using this()
class Test {

    Test() {
        this(10);
        System.out.println("Default Constructor");
    }

    Test(int x) {
        System.out.println("Parameterized Constructor: " + x);
    }

    public static void main(String[] args) {
        new Test();
    }
}
Output
Parameterized Constructor: 10
Default Constructor



# Using super()
class Parent {

    Parent() {
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent {

    Child() {
        super();
        System.out.println("Child Constructor");
    }

    public static void main(String[] args) {
        new Child();
    }
}
Output
Parent Constructor
Child Constructor



# Advanced Interview Questions


1. Can a constructor be private?
Asked In
Amazon
Microsoft
Answer
Yes. Private constructors are commonly used in Singleton Design Pattern.

2. Difference Between Constructor and Method
Asked In
Infosys
TCS
Constructor	Method
Initializes object	Performs actions
No return type	Has return type or void
Called automatically	Called manually
Same name as class	Any valid name

3. Explain Constructor Chaining
Asked In
Accenture
Cognizant
Answer
Constructor chaining allows one constructor to call another using:
this()
super()
Both must be the first statement inside a constructor.

4. What Happens if a Constructor Has a Return Type?
Asked In
Wipro
Example
class Test {

    void Test() {
        System.out.println("Not a Constructor");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.Test();
    }
}
Answer
It becomes a normal method, not a constructor.

5. Can Abstract Classes Have Constructors?
Asked In
Capgemini
Answer
Yes.
Constructors in abstract classes are used to initialize common properties of child classes.

6. Can Constructors Throw Exceptions?
Asked In
Oracle
Answer
Yes.
class Test {

    Test() throws Exception {
        throw new Exception("Constructor Exception");
    }
}

7. Is Constructor Overloading Possible?
Asked In
IBM
Answer
Yes.
class Student {

    Student() {
        System.out.println("Default");
    }

    Student(int id) {
        System.out.println("Parameterized");
    }
}

8. Why Can’t Constructors Be Overridden?
Asked In
HCL
Answer
Constructors are not inherited by child classes.
Since overriding requires inheritance, constructors cannot be overridden.

9. Explain Copy Constructor in Java
Asked In
Tech Mahindra
Answer
Java does not provide a built-in copy constructor like C++.
Developers create their own constructor that accepts an object of the same class.

10. Can a Constructor Be Synchronized?
Asked In
Flipkart
Answer
No.
Constructors cannot be synchronized because synchronization is used to control access to an already created object.

Tricky Coding Question
class Parent {

    Parent() {
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent {

    Child() {
        this(10);
        System.out.println("Child Default Constructor");
    }

    Child(int x) {
        super();
        System.out.println("Child Parameterized Constructor: " + x);
    }

    public static void main(String[] args) {
        new Child();
    }
}
Output
Parent Constructor
Child Parameterized Constructor: 10
Child Default Constructor
Explanation
1.new Child() calls the default constructor.
2.Default constructor calls this(10).
3.Parameterized constructor calls super().
4.Parent constructor executes first.
5.Parameterized constructor executes.
6.Control returns to default constructor.

 