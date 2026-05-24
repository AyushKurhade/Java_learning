package Garbage_Collection;

class _01_Gcollection {

    public static void main(String[] args) {

        _01_Gcollection obj = new _01_Gcollection();

        obj = null;

        System.out.println("Object is eligible for Garbage Collection");

        System.gc();
    }
}