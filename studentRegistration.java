import java.util.Scanner;

public class studentRegistration {
  
   public static void main(String[] args) {
	   System.out.println("Student Registration Form");
	   System.out.println(); //Blank line
	   
	   Scanner sc = new Scanner(System.in);
	   //Student First Name
	   System.out.print("Enter first name: ");
	   String studentFirstName = sc.next();
	   
	   //Student Last Name 
	   System.out.print("Enter last name: ");
	   String studentLastName = sc.next();
	   
	   //Student DOB
	   System.out.print("Enter year of birth: ");
	   int studentDOB = sc.nextInt();
	   
	   System.out.println(); //Blank line
	   System.out.println(); //Blank line
	   
	   System.out.println("Welcome " + studentFirstName + " " + studentLastName +  "!");
	   System.out.println("Your registration is complete.");
	   System.out.println("Your temporary password is: " + studentFirstName + "*" + studentDOB);
	   
   }
}
