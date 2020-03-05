package model.entities;
import model.exceptions.DominException;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;

	public Account(){

	}

	public Account(int number,String holder, double balance, double withdrawLimit){
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber(){
		return this.number;
	}

	public String getHolder(){
		return this.holder;
	}

	public Double getBalance(){
		return this.balance;
	}

	public Double getWithdrawLimit(){
		return this.withdrawLimit;
	}

	public void deposit(double amount){
	 this.balance += amount;
	}

	public void withdraw(double amount){

		if(amount > withdrawLimit){
			throw new DominException("Withdraw error: The amount exceeds withdraw limit");
		}

		if(amount > balance){

			throw new DominException("Withdraw error: Not enough balance");

		}
		this.balance -= amount;
	}

}