

class parent {
    void m1() {
        System.out.println("m1 of parent");
    }

    void m3() {
        System.out.println("m3 of parent");
    }
}

class child extends parent {
    void m1()
    {
        System.out.println("m1 of child");
    }

    void m2()
    {
        System.out.println("m2 of child");
    }
}

public class test {
    public static void main(String args[]) {
        parent obj = new child(); // Here i am upcasting the object.
        obj.m1();
        //obj.m2();
        obj.m3();

         /*  In upcasting we can't access the childs method also 
        which are overriden method of parent */
    }
}
