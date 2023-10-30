public class Policy
{
   private int policyNumber;
   private String providerName;
   
   private double policyPrice;
   
   // no-arg constructor
   public Policy() 
   {
   
   policyNumber = 0;
   providerName = "Some Insurance";
   
   policyPrice = 0;   
   
   }
   
   /** Constructor
      @param pNum policy number
      @param nameOfProvider
      
   
   
   */
   
   public Policy (int pNum,String nameOfProvider)
   {
   
      policyNumber = pNum;
      providerName = nameOfProvider;
      
      
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
      
      
   
       
  

}