  class _01_classsDeclaration {
    // Class declaration syntax:
    // [access_modifier] class ClassName {
    //     // class body
    int roll;
    String name;
    String branch ;
     
    // properties/attributes/fields/data members

 void setdata(){
    roll = 35;
    name = "Ayush Kurhade";
    branch = "AI & Data Science";
    
    // member functions/methods/behaviour
 }
 void displayData(){
    System.out.println("Roll No: " + roll);
    System.out.println("Name: " + name);
    System.out.println("Branch: " + branch);
 }


}
public class _01_classDeclaration_test{ // main class
    public static void main(String[] args){
        _01_classsDeclaration obj1 = new _01_classsDeclaration();
        obj1.setdata();
        obj1.displayData();

// *********************************************************


//  *************** creating another object of the same class ****************
// checking the default values of the data members for the new object created



        _01_classsDeclaration obj2 = new _01_classsDeclaration();
      
             obj2.displayData();
             obj2.setdata();
       


    }
}