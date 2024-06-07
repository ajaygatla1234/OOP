package com.gl.java8;

interface MyInterface1{
	
	void display();
}

interface MyInterface2{
	
	void calculate(int i, int j);
}

interface Customer{
	
	void purchase(int a, int b);
}

interface NewCustomer{
	
	double purchase(int a, int b);
}

interface Sale{
	
	void saleReport(int a, int b, NewCustomer n);
}

public class FunctionalInterface_LambdaExpression_1 {

	public static void main(String[] args) {
		
		//Implementation is being held as a reference in the interface.
		//defining the display() using the lambda arrow operator
		MyInterface1 inter1=() -> {                                // () indicates empty parameter list that the lambda expression accepts as per the abstract method signature in Functional Interface
			System.out.println("Welcome to Lambda Expression...");
		};
		inter1.display();
		
		
		MyInterface2 inter2=(int a, int b)->{    // (int a, int b)= parameters that the lambda expression accepts as per the abstract method signature in Functional Interface
			int sum=a+b;
			System.out.println("Output : "+sum);
		};
		inter2.calculate(5, 4);
		
		Customer c1=(int i,int j) -> {
			int purchase=i*j;
			System.out.println("Customer : "+purchase);
			if(purchase>1000) {
				System.out.println("Good Purchase");
			}
			else {
				System.out.println("Average Purchase");
			}
		};
		c1.purchase(2423, 6357);
		c1.purchase(45, 54);
		
		NewCustomer n1=(int i,int j) -> {
			int purchase=i*j;
			return purchase;
			
		};
		
		Sale sale=(int a, int b, NewCustomer n)->{
			int d=a*b;
			double report=n.purchase(a, b);
			System.out.println("Sale : "+report);
		};
		sale.saleReport(3, 324, n1);
		sale.saleReport(32, 76, n1);
	}

}
