interface A {
    void funcA();
}

interface B extends A {
    void funcB();
}


public class myclass implements B {
    public void funcA()
    {
        System.out.println("It is a function A");
    }

    public void funcB()
    {
        System.out.println("It is function B");
    }

    public static void main(String args[])
    {
        myclass obj1 = new myclass();
        obj1.funcA();
        obj1.funcB();
    }
}
