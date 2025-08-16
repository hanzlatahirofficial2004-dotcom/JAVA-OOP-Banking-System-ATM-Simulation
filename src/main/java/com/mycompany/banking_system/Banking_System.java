/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.banking_system;

/**
 *
 * @author Boss
 */
import java.util.Scanner; 
abstract class Bank
        
{
    String Account_Holder;
    String Account_Number;
    double Balance;
    int Years;
    double Intrest_Rate;
    double Intrest;
    int Digit;
    double amount ;
    char Character;
    
    
    
    void setCharacter(char c)
    {
         Character= c;
    }
    
    void setAccount_Holder(String ah)
    {
        Account_Holder = ah;
    }
    
    void setAccount_Number(String an)
    {
       Account_Number = an;
    }
    
    void setBalance(double b)
    {
       Balance = b;
    }
    
    
    
    void setAmount( double m)
    {
        amount = m;
    }
            
    void setDigit(int d)
    {
        Digit = d;
    }
    
    void setYears(int y)
    {
        Years = y;
    }
    
    void setIntresr_Rate(double ir)
    {
       Intrest_Rate = ir; 
    }
    
    void Screen_2()
    {
     System.out.println("Kindly Enter The Digits From The Kaypad Of The ATM Machine"
             + " From The Following List As Your Wish Whats You Wants To Do");
     System.out.println("Kindly Press 1 For The Deposite Process ");
     System.out.println("Kindly Press 2 For The Withdraw Process ");
     System.out.println("Kindly Press 3 If You Wants To Find The Intrest On Your Current Balance ");
     System.out.println("Kindly Press 4 For Both Deposite & Withdraw Process ");
     System.out.println("Kindly Press 5 For  Deposite Process & "
             + "If You Wants To Find The Intrest On Your Current Balance ");
     System.out.println("Kindly Press 6 For  Withdraw Process & "
             + "If You Wants To Find The Intrest On Your Current Balance ");
     System.out.println("Kindly Press 7 For  Withdraw / Deposite Process & "
             + "If You Wants To Find The Intrest On Your Current Balance ");
     

    }
    
    void Screen_1() 
    {
     System.out.println("Kindly Press The A For Mainmenu For The ATM Machine's Functionality" );
     System.out.println("Kindly Press The B Check The Current Balance In Your Account" );
     System.out.println("Kindly Press The C For Exit From The Screen" );
     }
    
    abstract void Deposite_Balance();
    abstract void Withdraw_Balance();
    abstract void Intrest();
    
    
}

class Saving_Account extends Bank
{
    
    
    void Deposite_Balance()
    {
        
     if(amount>0)
     {
         System.out.println("The Amount You Have  Been Deposite It  Is : " + amount);
         Balance = Balance + amount;
         System.out.println("The Amount After Your Deposite Cash Is : " + Balance);
     }
     
     else
     {
         System.out.print("Your Deposite Process Has Been Cancelled"
         + " Because Your Deposite Value Is Equal Or Less Than The Zero");
     }
    }
    
    void Withdraw_Balance()
    {
     if(Balance>0)
     {
         System.out.println("The Amount You Have  Been Withdraw It  Is : " + amount);
         Balance = Balance - amount;
         System.out.println("The Amount After Your Withdraw Cash Is : " + Balance);
     }
     
     else
     {
         System.out.print("Your Withdraw Process Has Been Cancelled"
         + " Because Your Current Balance In The Account  Is Equal Or Less Than The Zero");
     }
    }
    
    void Intrest()
    {
        System.out.println("Now We Apply To Find  Intrest "
                + "On The Current Ammount In Your Account ");
        if(Intrest_Rate > Years)
        {
            System.out.println("Kindly Enter The Intrest Rate Equal Or Less Than The Years"
                    + "Example : Intrest 5% For The 5 Years");
        }
        else
        {
     Intrest = Balance * Years * Intrest_Rate / 100;
     System.out.println("The Intrest Of The Balance On Your Curent Balance In Your Account Is : "
     + Intrest);
        }
    }
}
public class Banking_System {

    public static void main(String[] args) {
        Scanner Hanzla = new Scanner(System.in);

        
Saving_Account SV = new Saving_Account();

System.out.println("Enter The Name Of The Of the Account Holder Here: ");
String ah = Hanzla.nextLine();
SV.setAccount_Holder(ah);

System.out.println("Enter The Number Of the Account Here: ");
String an = Hanzla.nextLine();
SV.setAccount_Number(an);

System.out.println("Enter The Balance  Of the Account Here: ");
int b = Hanzla.nextInt();
SV.setBalance(b);

SV.Screen_1();

System.out.println("Enter Your Choise Here : ");
char C = Hanzla.next().charAt(0);
SV.setCharacter(C);

if(C=='A')
{
 SV.Screen_2();
System.out.println("Enter The Digit Here : ");
int d = Hanzla.nextInt();
SV.setDigit(d);

if(d ==1)
{
  System.out.println("Enter The Value You Have Been Deposite In Your Account");  
  Double m = Hanzla.nextDouble();
  SV.setAmount(m);
  SV.Deposite_Balance();  
}



else if(d ==2)
 {
  System.out.println("Enter The Value You Have Been Withdraw From Your Account");  
  Double m = Hanzla.nextDouble();
  SV.setAmount(m);
  SV.Withdraw_Balance();  
}



else if(d==3)
{
System.out.println("Enter The Years You Have To Wants To Find The Intrest : ");
int y = Hanzla.nextInt();
SV.setYears(y);

System.out.println("Enter The Intrest Rate You Have TO Want The Intrest On Your Current Ammount : ");
double ir = Hanzla.nextDouble();
SV.setIntresr_Rate(ir);

SV.Intrest();  
}


else if( d==4)
{
System.out.println("Enter The Value You Have Been Deposite In Your Account");  
Double m = Hanzla.nextDouble();
SV.setAmount(m);
SV.Deposite_Balance();
System.out.println("Enter The Value You Have Been Withdraw From Your Account");  
m = Hanzla.nextDouble();
SV.setAmount(m);
SV.Withdraw_Balance();  
}


else if(d==5)
{
 
System.out.println("Enter The Value You Have Been Deposite In Your Account");  
Double m = Hanzla.nextDouble();
SV.setAmount(m);
SV.Deposite_Balance(); 

System.out.println("Enter The Years You Have To Wants To Find The Intrest : ");
int y = Hanzla.nextInt();
SV.setYears(y);
System.out.println("Enter The Intrest Rate You Have TO Want The Intrest On Your Current Ammount : ");
double ir = Hanzla.nextDouble();
SV.setIntresr_Rate(ir);

SV.Intrest();  
   
}

else if(d==6)
{
 
System.out.println("Enter The Value You Have Been Withdraw From Your Account");  
Double m = Hanzla.nextDouble();
SV.setAmount(m);
SV.Withdraw_Balance();

System.out.println("Enter The Years You Have To Wants To Find The Intrest : ");
int y = Hanzla.nextInt();
SV.setYears(y);
System.out.println("Enter The Intrest Rate You Have TO Want The Intrest On Your Current Ammount : ");
double ir = Hanzla.nextDouble();
SV.setIntresr_Rate(ir);

SV.Intrest();  
   
} 

else if(d==7)
{
    

System.out.println("Enter The Value You Have Been Deposite In Your Account");  
Double m = Hanzla.nextDouble();
SV.setAmount(m);
SV.Deposite_Balance();
System.out.println("Enter The Value You Have Been Withdraw From Your Account");  
m = Hanzla.nextDouble();
SV.setAmount(m);
SV.Withdraw_Balance(); 

System.out.println("Enter The Years You Have To Wants To Find The Intrest : ");
int y = Hanzla.nextInt();
SV.setYears(y);

System.out.println("Enter The Intrest Rate You Have TO Want The Intrest On Your Current Ammount : ");
double ir = Hanzla.nextDouble();
SV.setIntresr_Rate(ir);

SV.Intrest();  
   
} 

else
{
    System.out.println("Kindly Enter The Digits From 1 - 6 ");
}

}
else if(C=='B')
{
    System.out.println("The Current Balance In Your Account Is : " +SV.Balance);
}

else if(C=='C')
{
   
    System.out.println("Thank You For Using HBL Account Have a Good Day ");
}
else 
{
    System.out.println("Your Choise Is Wrong Kindly Choose The Valid Character");
}
        






}
}
    

