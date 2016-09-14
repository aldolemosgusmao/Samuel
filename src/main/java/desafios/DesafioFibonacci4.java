package desafios;

public class DesafioFibonacci4 {

	public long calculoFibo(long num) {

		long ant = 0;
		long suc = 1;
		for (int i = 1; i < num; i++) {
			suc = ant + suc;
			ant = suc - ant;
		}
		System.out.println("O n�mero FIBNONACCI de " + num + " �: " + suc);
		return suc;
	}

}
