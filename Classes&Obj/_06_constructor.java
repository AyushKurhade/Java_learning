
class Student {
    int rollNo;
    String name; 
    String deparatment;
    int semester;
    
    // note : if the constructor is not created manually then 
    // java will create a default constructor for us but 
    // if we create a constructor then java will not create a default constructor for us
    // which is automatically called when we create an object of the class
    Student(int rollNo, String name, String department, int semester) {
        this.rollNo = rollNo;
        this.name = name;
        this.deparatment = department;
        this.semester = semester;
    }
    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Department: " + deparatment);
        System.out.println("Semester: " + semester);
    }
}

public class _06_constructor {
public static void main (String[] args)
{
    Student s1 = new Student(35,"Ayush","CSE",6);
    s1.display();
}    
    
}
