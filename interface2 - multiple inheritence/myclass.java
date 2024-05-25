interface A {
   public void funcA();
}

interface B {
    void funcB();
}

interface C {
     void funcC();
}
public class myclass  implements A,B,C {
   public void funcA()
   {
       System.out.println("It is function A");
   }

  public void funcB() {
       System.out.println("It is function B");
   }

 public void funcC()
  {
      System.out.println("It is function C");
  }

  public static void main(String args[])
  {
      myclass obj1 = new myclass();

      obj1.funcA();
      obj1.funcB();
      obj1.funcC();
   }
}
