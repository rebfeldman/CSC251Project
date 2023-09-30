import java.util.*;
import java.io.*;

public class Project_Rebecca_Feldman
{
   public static void main(String [] args)
   {
   
   
   
   
   try 
   {
   File file = new File("PolicyInformation.txt");
   
   Scanner inputFile = new Scanner(file);
   
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
   
   ArrayList<Policy> policies = new ArrayList<Policy>();
   
   while(inputFile.hasNext() ) 
   {
   
   policyNumber = inputFile.nextInt();
   providerName = inputFile.nextLine();
   firstName = inputFile.nextLine();
   lastName = inputFile.nextLine();
   age = inputFile.nextInt();
   smokingStatus = inputFile.nextLine();
   height = inputFile.nextDouble();
   weight = inputFile.nextDouble();
   
   if(inputFile.hasNext() )
   {
   
   inputFile.nextLine();
   inputFile.nextLine();
   
   }
   
   Policy p = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
   
   policies.add(p);
   
}

inputFile.close();

for(int i = 0; i < policies.size(); i++)
{
  
   BMI = policies.calculateBMI();
   policyPrice = policies.calculateInsuranceFees();
   
   System.out.println();
   
   System.out.println("Policy Number: " + policies.getPolicyNumber());
   System.out.println("Provider Name: " + policies.getProviderName());
   System.out.println("Policyholder's First Name: " + policies.getFirstName());
   System.out.println("Policyholder's Last Name: " + policies..getLastName());
   System.out.println("Policyholder's Age: " + policies.getAge());
   System.out.println("Policyholder's Smoking Status: " +policies.getSmokingStatus());
   System.out.println("Policyholder's Height: " + policies.getHeight() + " inches");
   System.out.println("Policyholder's Weight: " + policies.getWeight() + " pounds");
   System.out.printf("Policyholder's BMI: %.2f\n", BMI);
   System.out.println();
   System.out.printf("Policy Price: $%,.2f\n", policyPrice);
   
   }
}
   
   
   
   



