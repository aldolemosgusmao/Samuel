package desafios;

import java.util.Scanner;

public class fibonacci3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite um número FIBONACCI a ser encontrado: ");
		short num = scan.nextShort();
		if (num >= 93){
		System.out.println("O valor procurado excede o limite para cálculo.");
		
		}else{
			long ant = 0;
			long suc = 1;
			if (num == 0){
				suc = 0;
				System.out.println(num+" -- "+suc);
			}else if(num == 1){
				suc = 1;	
				System.out.println(num+" -- "+suc);
			}
			else{
				for(int i = 1; i <= (num-1); i++){
					suc =ant + suc;
					ant =suc - ant;
					System.out.println((i+1)+" -- "+suc);
				}
			
		}

		
			}

	}

}
