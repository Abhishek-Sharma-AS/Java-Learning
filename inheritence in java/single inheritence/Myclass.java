
public class Myclass {
    int x = 0;
    int y = 0;

    Myclass ()
    {

    }
    Myclass(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void display()
    {
        System.out.println(" instances value:");
        System.out.println("x ="+x);
        System.out.println("Y ="+y);
    }

}

class Child extends Myclass {
    Child(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    void childdisplay()
    {
        System.out.println("Child inherited instances value:");
        System.out.println("x ="+x);
        System.out.println("Y ="+y);
    }
}

class test {
    public static void main(String args[])
    {
        //Myclass P1 = new Myclass(5,10);

        Child c1 = new Child(20, 40);

       // P1.parentdisplay();

        c1.childdisplay();
        c1.display();
    }
}