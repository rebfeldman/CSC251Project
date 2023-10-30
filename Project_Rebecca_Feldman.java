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
   int age = 0;
   String smokingStatus = "";
   double height;
   double weight;
   double BMI =0.0;
   double policyPrice = 0.0;
   int smokerCount = 0;
   int nonSmokerCount = 0;
   
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
  
   BMI = policies.get(i).calculateBMI();
   policyPrice = policies.get(i).calculateInsuranceFees();
   
   System.out.println();
   
   //System.out.println("Policy Number: " + policies.get(i).getPolicyNumber());
   //System.out.println("Provider Name: " + policies.get(i).getProviderName());
   //System.out.println("Policyholder's First Name: " + policies.get(i).getFirstName());
   //System.out.println("Policyholder's Last Name: " + policies.get(i).getLastName());
   //System.out.println("Policyholder's Age: " + policies.get(i).getAge());
   //System.out.println("Policyholder's Smoking Status: " + policies.get(i).getSmokingStatus());
   //System.out.println("Policyholder's Height: " + policies.get(i).getHeight() + " inches");
   //System.out.println("Policyholder's Weight: " + policies.get(i).getWeight() + " pounds");
   //System.out.printf("Policyholder's BMI: %.2f\n", BMI);
   Sytem.out.println(Policy);
   System.out.println(PolicyHolder);
   System.out.println();
   System.out.printf("Policy Price: $%,.2f\n", policyPrice);
   
   }
   
   
 
   
   for(int i = 0; i < policies.size(); i++)
   {
      if(smokingStatus == "Smoker" || smokingStatus == "smoker")
      {
      
         smokerCount ++;
      }
      
      else if (smokingStatus == "Non-Smoker" || smokingStatus == "non-smoker")
      {
      
         nonSmokerCount ++;
      }
   }
   
   System.out.println("The number of policies with a smoker is: " + smokerCount);
   System.out.println("The number of policies with a non-smoker is " + nonSmokerCount);
   
   
}
   
   catch(IOException ex)
   {
      System.out.println("Something went wrong reading the file: " + ex.getMessage() );
   }
   
   }
   
   }



