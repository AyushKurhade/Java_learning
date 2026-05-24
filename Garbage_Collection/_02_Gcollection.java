// package Garbage_Collection;

public class _02_Gcollection {

    @Override
     public void finalize() throws Throwable {
        System.out.println("Old object removed by Garbage Collector");
    }

    public static void main(String[] args) {

        _02_Gcollection obj = new _02_Gcollection();

        obj = new _02_Gcollection();

        System.gc();
    }
}


// INITIAL STATE

// STACK MEMORY                     HEAP MEMORY
// -------------                    -------------------------
// obj  ------------------------->  Object A


// Code:
// _02_Gcollection obj = new _02_Gcollection();



// -----------------------------------------------------------


// AFTER THIS LINE

// obj = new _02_Gcollection();


// STACK MEMORY                     HEAP MEMORY
// -------------                    -------------------------
// obj  ------------------------->  Object B

//                                  Object A   ❌ no reference



// What happened?

// 1. First object created → Object A
// 2. Then new object created → Object B
// 3. obj now points to Object B
// 4. Object A lost its reference


// So:

// Object A becomes eligible for Garbage Collection ✅



// -----------------------------------------------------------


// AFTER System.gc();

// STACK MEMORY                     HEAP MEMORY
// -------------                    -------------------------
// obj  ------------------------->  Object B

//                                  Object A 🗑️ removed
//                                  by Garbage Collector



// Possible Output:

// Old object removed by Garbage Collector
