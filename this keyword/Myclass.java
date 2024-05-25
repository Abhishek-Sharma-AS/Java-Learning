/**
 * Myclass
 */
public class Myclass {

    int x = 0;
    int y1 = 0;
    int y2 = 0;
    Myclass(int x, int y)
    { // this keyword refer the current object in constructor.
        //Here this.x means obj1->x =0
       this. x = x; //assigning value received from contructor call
      //y1 =this. y1; //assinging value of self using this keyword
       this.y2 = y; // assing value received from constructor call
    }
    
    void display()
    {
        System.out.println(x);
        System.out.println(y1);
        System.out.println(y2);
    }

    public static void main (String ...s)
    {
        Myclass obj1 = new Myclass(10, 12);
        obj1.display();
    }
}