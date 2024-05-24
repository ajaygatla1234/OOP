package com.gl.encapsulation;

class BankAccount{
	private static int savingsbalance;
	private int currentbalance;
}

public class EncapsulationDemo {
	
	public static void main(String[] args) {
		
		System.out.println(BankAccount.savingsbalance); //Error because we cannot access the private access modifier members
		
		BankAccount obj = new BankAccount();
		System.out.println(obj.currentbalance);  //Error because we cannot access the private access modifier members
		
	}

}
