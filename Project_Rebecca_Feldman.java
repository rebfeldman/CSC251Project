import java.util.Scanner;

public class Project_Rebecca_Feldman
{
   public static void main(String [] args)
   {
   
   int policyNumber = 0;
   String provider = "";
   String firstName = "";
   String lastName = "";
   int age = 0;
   String smoker = "";
   double height = 0;
   double weight = 0;
   double BMI =0.0;
   double policyPrice = 0.0;
   
   Scanner keyboard = new Scanner(System.in);
   
   System.out.println("Please enter the Policy Number: ");
   policyNumber = keyboard.nextInt();
   
   System.out.println("Please enter the Provider Name: ");
   provider = keyboard.nextLine();
   
   System.out.println("Please enter the Policyholder's First Name: ");
   firstName = keyboard.nextLine();
   
   System.out.println("Please enter the Policyholder's Last Name: ");
   lastName = keyboard.nextLine();
   
   System.out.println("Please enter the Policyholder's Age: ");
   age = keyboard.nextInt();
   
   System.out.println("Please enter the Policyholder's Smoking Status (smoker/non-smoker: )");
   smoker = keyboard.nextLine();
   
   System.out.println("Please enter the Policyholder's height(in inches): ");
   height = keyboard.nextDouble();
   
   System.out.println("Please enter the Policyholder's Weight(in pounds): ");
   weight = keyboard.nextDouble();
   
   Policy demoPolicy = new Policy(policyNumber, provider, firstName, lastName, age, smoker, height, weight);
   
   
   BMI = demoPolicy.calculateBMI();
   policyPrice = demoPolicy.calculateInsuranceFees();
   
   System.out.println("Policy Number: " + demoPolicy.getPolicyNumber());
   System.out.println("Provider Name: " + demoPolicy.getProviderName());
   System.out.println("Policyholder's First Name: " + demoPolicy.getFirstName());
   System.out.println("Policyholder's Last Name: " + demoPolicy.getLastName());
   System.out.println("Policyholder's Age: " + demoPolicy.getAge());
   System.out.println("Policyholder's Smoking Status: " +demoPolicy.getSmokingStatus());
   System.out.println("Policyholder's Height: " + demoPolicy.getHeight() + " inches");
   System.out.println("Policyholder's Weight: " + demoPolicy.getWeight() + " pounds");
   System.out.printf("Policyholder's BMI: %.2f", BMI);
   System.out.println();
   System.out.printf("Policy Price: $%,.2f", policyPrice);
   
   }
}
   
   
   
   



