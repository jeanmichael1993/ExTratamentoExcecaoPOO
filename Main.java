import java.util.Locale;
import java.util.Scanner;
import model.entities.Account;
import model.exceptions.DominException;
import java.text.ParseException;

class Main {
  public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter account data: ");
		System.out.print("Number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Holder: ");
		String nome = sc.nextLine();
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		System.out.print("withdraw limit: ");
		double limite = sc.nextDouble();
		Account conta = new Account(number, nome, balance, limite);


		System.out.println();
		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		double withdraw = sc.nextDouble();
		try{
	
	
	
		conta.withdraw(withdraw);
		System.out.println("New Balance: " + String.format("%.2f",conta.getBalance()));

		}

		catch (DominException e){
			System.out.print(e.getMessage());
		}




		sc.close();
	

		
  }
}