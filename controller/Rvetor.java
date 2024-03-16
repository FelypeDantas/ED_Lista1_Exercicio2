package controller;

public class Rvetor {

	public int valor(int i, int[] vetor) {
		if(i < vetor.length) {
			return valor(i + 1, vetor);
		}
		return 0;
	}
}
