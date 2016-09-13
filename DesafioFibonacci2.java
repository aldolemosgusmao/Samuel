package desafios;

import java.util.Scanner;

public class DesafioFibonacci2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite um número FIBONACCI a ser encontrado: ");
		short num = scan.nextShort();
		if (num >= 200){
		System.out.println("O valor procurado excede o limite para cálculo.");
		
		}else{
		long resultado2 = fibonacci2(num);
		System.out.println("O resultado para o número FIBONACCI" +num+" é de :"+resultado2);
			}
		
	}
	public static long fibonacci2 (short num){
		long ant = 0;
		long suc = 1;
		if (num == 0){
			suc = 0;
		}else{
			for(int i = 0; i < (num-1); ++i){
				suc =ant + suc;
				ant =suc - ant;
			}
		
	}
		return suc;
	
}
}

