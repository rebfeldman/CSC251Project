import java.util.Scanner;

public class Project_Rebecca_Feldman
{
   public static void main(String [] args)
   {
   
   int policyNumber;
   String providerName;
   String firstName;
   String lastName;
   int age;
   String smokingStatus;
   double height;
   double weight;
   double BMI =0.0;
   double policyPrice = 0.0;
   
   Scanner keyboard = new Scanner(System.in);
   
   System.out.print("Please enter the Policy Number: ");
   policyNumber = keyboard.nextInt();
   
   System.out.print("Please enter the Provider Name: ");
   providerName = keyboard.nextLine();
   
   
   System.out.print("Please enter the Policyholder's First Name: ");
   firstName = keyboard.nextLine();
   
   System.out.print("Please enter the Policyholder's Last Name: ");
   lastName = keyboard.nextLine();
   
   System.out.print("Please enter the Policyholder's Age: ");
   age = keyboard.nextInt();
   keyboard.nextLine();
   
   System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker: )");
   smokingStatus = keyboard.nextLine();
   
   
   System.out.print("Please enter the Policyholder's height(in inches): ");
   height = keyboard.nextDouble();
   
   System.out.print("Please enter the Policyholder's Weight(in pounds): ");
   weight = keyboard.nextDouble();
   
   Policy demoPolicy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
   
   
   BMI = demoPolicy.calculateBMI();
   policyPrice = demoPolicy.calculateInsuranceFees();
   
   System.out.println();
   
   System.out.println("Policy Number: " + demoPolicy.getPolicyNumber());
   System.out.println("Provider Name: " + demoPolicy.getProviderName());
   System.out.println("Policyholder's First Name: " + demoPolicy.getFirstName());
   System.out.println("Policyholder's Last Name: " + demoPolicy.getLastName());
   System.out.println("Policyholder's Age: " + demoPolicy.getAge());
   System.out.println("Policyholder's Smoking Status: " +demoPolicy.getSmokingStatus());
   System.out.println("Policyholder's Height: " + demoPolicy.getHeight() + " inches");
   System.out.println("Policyholder's Weight: " + demoPolicy.getWeight() + " pounds");
   System.out.printf("Policyholder's BMI: %.2f\n", BMI);
   System.out.println();
   System.out.printf("Policy Price: $%,.2f\n", policyPrice);
   
   }
}
   
   
   
   



