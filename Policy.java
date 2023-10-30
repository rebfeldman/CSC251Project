public class Policy
{
   private int policyNumber;
   private String providerName;
   private PolicyHolder policyHolder;
   
   public static int policyCounter = 0;
   
   
   
   
 
   
   /** Constructor
      @param pNum policy number
      @param nameOfProvider
      @param policyHolder PolicyHolder
      
   
   
   */
   
   public Policy (int pNum,String nameOfProvider, PolicyHolder pHolder)
   {
   
      policyNumber = pNum;
      providerName = nameOfProvider;
      policyHolder = new PolicyHolder(pHolder);
      
      
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
      
   public void setPolicyHolder(PolicyHolder pHolder) {
   
      policyHolder = new PolicyHolder(pHolder);
   }
   
   public static void setPolicyCounter() {
   
      policyCounter++;
   }
      
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
   
   public static int getPolicyCounter() {
      
      return policyCounter;
   }
   
   public PolicyHolder getPolicyHolder() {
   
      return new PolicyHolder(policyHolder);
   }


 public String toString() {
 
   return "Policy number: " + policyNumber + "\nProvider Name: " + providerName +
           + "\n" + policyHolder.toString();
 }     
   
       
  

}