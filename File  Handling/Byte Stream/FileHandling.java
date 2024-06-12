import java.io.*;


public class FileHandling {
    public static void FileWrite()
    {
        try {
            FileOutputStream f1 = new FileOutputStream("Abhi.txt",false);
            String s = "Hello Abhishek Sharma";

            f1.write('A');
            f1.write('b');
            f1.write('c');
            f1.write('d');
            f1.write(s.getBytes());
            f1.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
    
        public static void main(String ...s){
            {
                FileWrite();
            }
        }
    
}
