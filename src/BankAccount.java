
public class BankAccount 
{
	//fields
 private String name;
 private int accNum;
 private double balance;
 
	 //constructors
 public BankAccount(String name2, int accNum2) 
 {
	 name = name2;
	 accNum = accNum2;
	 balance = 0;
 }
 public BankAccount(String name1, int accNum1, double balance1) {
	 
	 name = name1;
	 accNum = accNum1;
	 balance = balance1;
 }

 public void deposit(int deposit)
 {
	 balance = balance + deposit;
 }
 public void withdraw(int withdraw) 
 {
	 balance = balance - withdraw;
 }
 public double getBalance()
 {
	 return balance;
 }
public String toString() 
{
	return "Account name is " + name + ", Account number is " + accNum + ", Current balance  " + balance;
}
 } 

