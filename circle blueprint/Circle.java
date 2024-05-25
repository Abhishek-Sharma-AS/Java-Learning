
public class Circle {
    float radius;
    final float pi = 3.14f;

    Circle(float x)
    {
        this.radius=x;
    }
    void Circumference_of_circle()
    {
        System.out.println("Circumfrence =" + (2 * pi * radius));
    }
    
    void Area_of_circle()
    {
        System.out.println("Area =" + (pi * radius * radius));
    }

    public static void main(String args[])
    {
        Circle c1 = new Circle(5.0f);

        c1.Circumference_of_circle();
        c1.Area_of_circle();
    }
}
