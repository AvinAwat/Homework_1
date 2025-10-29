
package main_;


public class Account {
    
    private final int ID;
    private double Balance;

    public Account(int ID, double Balance) {
        this.ID = ID;
       if(Balance>0.0){
        this.Balance = Balance;
       
       } else{
       this.Balance=0.0;
       
       }
        
    }

    public double getBalance() {
        return Balance;
    }

    public int getID() {
        return ID;
    }

   public void setDeposite(double amount){
       if(amount>0){
   Balance =Balance +amount;
   
       }else{
       
           System.out.println("Deposit amount must be positive!");
       }
   }
     public void setDebit(double amount){
     
     if(amount<=Balance){
     
     Balance=Balance - amount;
         System.out.println("Debit successful.New balance:"+Balance);
     }else{
         System.out.println("Debit amount exceeded account balance.");
     
     }
        
     }
    
} 
    
