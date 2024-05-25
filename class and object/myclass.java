class myclass {
    int a = 0;

    // Default constructor
    myclass() {
        System.out.println("Constructor 1 is called for object 1");
    }

    // Parameterized constructor
    myclass(int x) {
        a = x;
        System.out.println("Constructor 2 called for object 2");
    }

    public static void main(String[] args) {  // Corrected 'string' to 'String' and removed unnecessary 'return' statement
        myclass obj1 = new myclass();
        myclass obj2 = new myclass(10);
        System.out.println(obj1.a);
        System.out.println(obj2.a);
    }
}
