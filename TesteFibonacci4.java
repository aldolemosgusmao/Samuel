package desafios;

import java.util.Scanner;

public class TesteFibonacci4 {

	public static void main(String[] args) {
	  
		DesafioFibonacci4 fibo1 = new DesafioFibonacci4();
		
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite o número Fibonacci a ser encontrado: ");
		long num = scan.nextInt();
	
	
		fibo1.calculoFibo(num);
		


	}

}
