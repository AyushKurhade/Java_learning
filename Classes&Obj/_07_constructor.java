class Student {
    int rollNo;
    String name;
    String course;

    Student(int rollNo, String name, String course) {
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
    }

    void displayDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }
}

class Test {
    public static void main(String[] args) {
        Student s1 = new Student(5, "Akshay", "IT");
        Student s2 = new Student();   // ❌ Error: no default constructor
        s1.displayDetails();
        s2.displayDetails();
    }
}


// partially fixed******************************


// class Student {
//     int rollNo;
//     String name;
//     String course;

//     Student(int rollNo, String name, String course) {
//         this.rollNo = rollNo;
//         this.name = name;
//         this.course = course;
//     }
//      Student(){
//         super();
//     }

//     void displayDetails() {
//         System.out.println("Roll No: " + rollNo);
//         System.out.println("Name: " + name);
//         System.out.println("Course: " + course);
//     }
// }

// class Test {
//     public static void main(String[] args) {
//         Student s1 = new Student(5, "Akshay", "IT");
//         Student s2 = new Student();  
//         s1.displayDetails();
//         s2.displayDetails();
//     }
// }


// explanation 
// ### `super()` in Java — Notes

// `super()` is used to call the constructor of the parent class. In Java,
//  every class automatically extends the `Object` class if no parent class is specified explicitly, 
//  so when a constructor like `Student(){ super(); }` is written, it actually calls the no-argument constructor of `Object`
//  . Even if you do not write `super();`, the Java compiler automatically inserts it as the first statement of every constructor
//   unless another constructor is called using `this()`. This automatic call helps initialize the inherited part of 
//   the object before the current class constructor executes. 
//   Example: `Student s = new Student();` → constructor starts → `super()` executes → parent (`Object`) constructor runs → control returns → object gets created. 
//   If instance variables are not initialized inside the constructor, Java assigns default values automatically 
//   such as `0` for `int`, `null` for `String`, `false` for `boolean`, etc. Important rule: `super()` must always be the first statement 
//   inside a constructor and cannot appear after any executable statement. Example: `Student(){ System.out.println("Hello"); super(); }` gives
//    an error because constructor calls must be first. In short, `super()` initializes the parent portion of an object and is automatically handled
//     by Java when omitted.



// fixed

// class Student {
//     int rollNo;
//     String name;
//     String course;

//     // Parameterized constructor
//     Student(int rollNo, String name, String course) {
//         this.rollNo = rollNo;
//         this.name = name;
//         this.course = course;
//     }

//     // Default constructor with meaningful values
//     Student() {
//         super(); // calls Object class constructor (implicit anyway)
//         rollNo = 0;
//         name = "Unknown";
//         course = "Not Assigned";
//     }

//     void displayDetails() {
//         System.out.println("Roll No: " + rollNo);
//         System.out.println("Name: " + name);
//         System.out.println("Course: " + course);
//     }
// }

// class Test {
//     public static void main(String[] args) {
//         Student s1 = new Student(5, "Akshay", "IT"); // uses parameterized constructor
//         Student s2 = new Student();                  // uses default constructor
//         s1.displayDetails();
//         s2.displayDetails();
//     }
// }


// explanation 
// Mistakes:
// Student s2 = new Student(); → No default constructor defined, so compile-time error.

// Running Student class instead of Test → Error: can't find main(String[]) method in class: Student.

// Even if default constructor is added with super();, fields remain uninitialized → output shows 0 and null.

// Pehle tumne default constructor nahi banaya tha, isliye new Student() error de raha tha.

// Jab tumne super(); dala, wo bas Object class ka constructor call kar raha tha (jo har class ka parent hota hai).

// Lekin fields initialize nahi ho rahe the, isliye output 0 aur null aa raha tha.

// Correct fix: default constructor mein manually values assign karo.
