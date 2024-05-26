import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int[] arr = new int[10];

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the data");

        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the key to be search");

        int key = sc.nextInt();

        boolean flag = false;

        for(int i=0 ; i<arr.length; i++)
        {
            if (arr[i] == key) {
                flag = true;
                System.out.println("Key is present in data");
                break;
            }
        }

        if(flag == false)
        {
            System.out.println("Key is not present in data");
        }
        sc.close();
    }
}
