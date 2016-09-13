package desafios;

import java.util.Scanner;

public class DesafioFibonacci4 {
	
	
	public long calculoFibo (long num){
		
		long ant = 0;
		long suc = 1;
		for (int i = 1; i< num; i++){
			suc = ant + suc;
			ant = suc - ant;
		}
		System.out.println("O número FIBNONACCI de "+num+" é: "+suc);
		return suc;
	}
	
	
	
}
