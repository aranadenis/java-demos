import java.util.Scanner;

public class ScannerDemo2 {
    public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("-----------Please enter your information---------");
		//entrada de cadena
		System.out.println("Name:");
		String name = scan.nextLine();
		
		//entrada de un caracter
		System.out.println("Gender:");
		char gender = scan.next().charAt(0);
		
		//entrada de datos numericos
		System.out.println("Age:");
		int age = scan.nextInt();
		System.out.println("Mobile:");
		long mobileNumber = scan.nextLong();
		System.out.println("Salary: ");
		double cgpa = scan.nextDouble();
		
		//imprimir valores ingresado
		System.out.println("***************Your information************* ");
		System.out.println("Name: " + name);
		System.out.println("Gender: " + gender);
		System.out.println("Age: "+ age);
		System.out.println("Mobile: "+ mobileNumber);
		System.out.println("Salary: "+ cgpa);
		System.out.println("(*_*)");

	}
}
