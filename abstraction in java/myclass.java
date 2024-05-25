abstract class xyz {
    public abstract void m1();

    abstract void m2();

    void m3()
    {
        System.out.println("m3 of abstract class");
    }
}

class jkl extends xyz {
    public void m1()
    {
        System.out.println("m1 of abstract class overriden in other class");
    }

    void m2()
    {
        System.out.println("m2 of abstract class");
    }
}
public class myclass {
    public static void main(String[] args) {
        jkl obj1 = new jkl();

        obj1.m1();
        obj1.m2();
        obj1.m3();
    }
}
