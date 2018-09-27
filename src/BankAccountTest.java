
public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account1 = new BankAccount("myAccount", 1);
		System.out.println(account1.getBalance());
		BankAccount account2 = new BankAccount("myotherAccount", 2, 1000);
		System.out.println(account2.getBalance());
		account1.deposit(60);
		account2.withdraw(60);
		System.out.println(account1.toString());
		System.out.println(account2.toString());
		

	}

}
