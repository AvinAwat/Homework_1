/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main_;

public class Main_ {

   
    public static void main(String[] args) {
        
        Account a1=new Account(122442,500.0);
        Account a2=new Account(122443,-10.0);
        
        System.out.println("Account 1 ID "+a1.getID()+ "|Balance:$"+a2.getBalance());
        System.out.println("Account 2 ID "+a2.getID()+ "|Balance:$"+a2.getBalance());
        
        
        System.out.println("Depositing $200 to Account 1....");
        a1.setDeposite(200.0);
        System.out.println("New Balance for Account 1: $ "+a1.getBalance() );
        
        System.out.println("****************************");
        
        System.out.println("Withdrawing $150 from Account 2....");
        a2.setDebit(150.0);
        System.out.println("New Balance for Account 2: $ "+a2.getBalance());
        
        System.out.println("*****************************");
        
        System.out.println("Trying to withdraw $1000 from Account 1 (exceeds balance)...");
        a2.setDebit(1000.0);
        System.out.println("Account 1 Balance after failed debit: $ "+a2.getBalance());
    }
    
}
