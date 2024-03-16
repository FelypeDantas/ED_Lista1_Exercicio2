package view;

import controller.Rvetor;

public class Principal {

	public static void main(String[] args) {
		Rvetor vet = new Rvetor();
		int[] vetor = new int[5];
		int i;
		
		for(i=0; i<5; i++) {
			vetor[i] = (int) ((Math.random()*100) + 1);
			if(i == 4) {
				vetor[i] = 0;
			}
		}
		
		for(i=0; i<5; i++) {
			System.out.println(vetor[i]);
		}
		
		System.out.println("O menor valor é: " + vet.valor(0, vetor));
		
	}
}
