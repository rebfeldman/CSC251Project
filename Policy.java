public class Policy
{
   private int policyNumber;
   private String providerName;
   private String policyHolderFirst;
   private String policyHolderLast;
   private int policyHolderAge;
   private String smokingStatus;
   private double policyHolderHeight;
   private double policyHolderWeight;
   private double BMI;
   private double policyPrice;
   
   // no-arg constructor
   public Policy() 
   {
   
   policyNumber = 0;
   providerName = "Some Insurance";
   policyHolderFirst = "First Name";
   policyHolderLast = "Last Name";
   policyHolderAge = -1;
   smokingStatus = "Non-Smoker";
   policyHolderHeight = 0;
   policyHolderWeight = 0;
   BMI = 0;
   policyPrice = 0;   
   
   }
   
   /** Constructor
      @param pNum policy number
      @param nameOfProvider
      @param firstName first name
      @param lastName last name
      @param age age
      @param smoking Smoking Status
      @param height height
      @param weight weight
   
   
   */
   
   public Policy (int pNum,String nameOfProvider, String firstName, String lastName, int age, String smoking, double height, double weight)
   {
   
      policyNumber = pNum;
      providerName = nameOfProvider;
      policyHolderFirst = firstName;
      policyHolderLast = lastName;
      policyHolderAge = age;
      smokingStatus = smoking;
      policyHolderHeight = height;
      policyHolderWeight = weight;
      
      
   }
   
   /* set policy number
      @param pNum */
   
   public void setPolicyNumber(int pNum)
   {
      policyNumber = pNum;
   }   
   
   /* set provider name
      @param nameOfProvider */
      
   public void setProviderName(String nameOfProvider) 
   {
      providerName = nameOfProvider;
   }
   /* set policy holder first name
      @param firstName */
      
   public void setHolderFirst(String firstName)
   {
      policyHolderFirst = firstName;
   }
   /* set policy holder last name
      @param lastName */
      
   public void setHolderLast(String lastName)
   {
      policyHolderLast = lastName;
   }
   /* set policy holder age
      @param age */
        
   public void setHolderAge(int age)
   {
      policyHolderAge = age;
   }
   /*set smokijg status
      @param smoking */
      
   public void setSmokingStatus(String smoking)
   {
      smokingStatus = smoking;
   }
   /* set policy holder height
      @param height */
      
   public void setHeight(double height)
   {
      policyHolderHeight = height;
   }
   /* set policy holder weight 
      @param weight */
      
   public void setWeight(double weight)
   {
      policyHolderWeight = weight;
   }
   /* methid for getting policy num
      @return policyNumber */
      
   public int getPolicyNumber() 
   {
      return policyNumber;
   }
   /* method for getting provider name
      @retun providerName */
      
   public String getProviderName()
   {
      return providerName;
   }
   /* get policy holder first name
      @return policyHolderFirst */
      
   public String getFirstName()
   {
      return policyHolderFirst;
   }
   /* get policy holder last name
      @return policyHolderLast */
      
   public String getLastName()
   {
      return policyHolderLast;
   }
   /* get policy holder age
      @return policyHolderAge */
      
   public int getAge()
   {
      return policyHolderAge;
   }
   /* get smoking status
      @return smokingStatus */
      
   public String getSmokingStatus()
   {
      return smokingStatus;
   }
   /* get policy holder ghieght
      @return policyHolderHeight */
      
   public double getHeight()
   {
      return policyHolderHeight;
   }
   /* get policy holder weight
      @return policyHolderWeight */
      
   public double getWeight()
   {
      return policyHolderWeight;
   }
   
   /*calculate BMI
      @return BMI */
      
   public double calculateBMI()
   {
     BMI = (policyHolderWeight * 703) / (policyHolderHeight * policyHolderHeight);
     return BMI;
   }
   
   /*calculate insuarance fees
      @return policyPrice */
   
   public double calculateInsuranceFees()
   {
      int fee1 = 0;
      int fee2 = 0;
      double fee3 = 0;
      final int BASE_FEE = 600;
      final int OVER_50_FEE = 75;
      final int SMOKING_FEE = 100;
      double highBMIFee;
      
      
      if (policyHolderAge > 50)
      {
         fee1 = OVER_50_FEE;
      }
      
      else if( policyHolderAge <= 50)
      {
         fee1= 0;
      }
      
      if (smokingStatus == "Smoker" || smokingStatus == "smoker")
      {
      
         fee2= SMOKING_FEE;
      }
      
      else if (smokingStatus == "Non-smoker" || smokingStatus == "non-smoker")
      {
         fee2 = 0;
      }
      
      if (BMI > 35)
      {
         fee3 = (BMI - 35) * 20;
      }
      
      else if (BMI <=35)
      {
         fee3 = 0;
      }
      
      policyPrice = BASE_FEE + fee1 + fee2 + fee3;
      
      return policyPrice;
      
      }
       
   
   
       
  

}