# super() in Java Constructor

## Code

```java
Student() {
    super();
}
```

---

## What happens here?

`super();` calls the **constructor of the parent class**.

But in this case:

```java
class Student {
}
```

`Student` does not explicitly extend another class.

Java automatically treats it as:

```java
class Student extends Object {
}
```

So:

```java
super();
```

actually calls:

```java
Object();
```

which executes the **no-argument constructor of Object class**.

The `Object` constructor does not show visible output but performs internal object initialization.

---

## Why is super() allowed?

Java rule:

The **first statement of every constructor** must be either:

```java
super();
```

OR

```java
this();
```

If you do not write it:

```java
Student() {

}
```

Compiler automatically changes it into:

```java
Student() {
    super();
}
```

This insertion happens automatically.

---

## Constructor Execution Flow

```java
Student s = new Student();
```

Execution:

```text
new Student()
      ↓
Student constructor starts
      ↓
super() automatically called
      ↓
Object constructor executes
      ↓
Control returns to Student constructor
      ↓
Object created
```

---

## Example

```java
class Student {

    int rollNo;
    String name;
    String course;

    Student() {
        super();
    }

    void displayDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {

        Student s2 = new Student();

        s2.displayDetails();
    }
}
```

---

## Output

```text
Roll No: 0
Name: null
Course: null
```

---

## Why do default values appear?

Constructor did not initialize variables.

Default values:

```text
rollNo → 0
name → null
course → null
```

Java automatically initializes **instance variables**.

---

## Important Rule

Invalid:

```java
Student() {
    System.out.println("Hello");
    super(); // Error
}
```

Reason:

`super()` must always be the **first statement**.

Correct:

```java
Student() {
    super();
    System.out.println("Hello");
}
```

---

## Hinglish Recap

* Every Java class indirectly extends `Object`.
* Constructor starts → Java calls parent constructor using `super()`.
* If you do not write `super()`, compiler inserts it automatically.
* `Object()` constructor does not show visible work but initializes object basics.
* Constructor not assigning values → Java provides defaults (`0`, `null`, `false`).

---

## Interview Definition

> `super()` is used to invoke the parent class constructor. If not written explicitly, Java compiler automatically inserts it as the first statement of every constructor to initialize the inherited part of the object.
