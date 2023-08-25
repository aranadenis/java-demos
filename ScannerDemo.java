import java.util.Scanner;

public class ScannerDemo {

    public static void main(String args []){
        Scanner scan = new Scanner(System.in);

        System.out.print("-----Welcome------");
        System.out.print("\n");

        System.out.print("Enter your name: ");
        String name = scan.nextLine();

        System.out.print("Your name: " + name);
        System.out.print("\n");
        
        System.out.print("------ Thanks (*__*)  ------");
        System.out.print("\n");

    }
}