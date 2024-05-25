
public class myclass {
    void m1() {
        System.out.println("M1 executed of parent class");
    }

}

class child extends myclass {
    void m2() {
        System.out.println("m2 executed of child class");
        super.m1();
    }
}

class test {
    public static void main (String args[])
    {
        child obj1 = new child();
        obj1.m2();
    }
}
