
public class myclass {
    int sum(int a,int b)
    {return a + b;}

    int sum(int a, int b, int c)
    {
        return a + b + c;}

    int sum(int a, int b, int c, int d)
    {
        return a + b + c + d;
    }
    

public static void main(String args[])
{
    myclass obj1 = new myclass();
    
    System.out.println(obj1.sum(1, 2));
    System.out.println(obj1.sum(1, 2, 3));
    System.out.println(obj1.sum(1, 2, 3, 4));
}
}
