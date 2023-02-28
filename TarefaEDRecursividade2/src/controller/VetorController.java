package controller;

public class VetorController{

	public VetorController() {
		super();
	}
	public int contarNegativos(int[] vetor, int i) {
		//Condição de parada ==> Quando o index for igual ao tamanho do vetor
		if (i == vetor.length) {
			return 0;
		} return (vetor[i] < 0 ? 1 :0) + contarNegativos(vetor, i+1);
		/*
		 4,8,-9,5,3,-7,10,-7,9,1,-2 = 1 (0)
		 8,-9,5,3,-7,10,-7,9,1,-2 = 2 (0)
		 5,3,-7,10,-7,9,1,-2 = 3 (1)
		 3,-7,10,-7,9,1,-2 = 4 (1)
		 -7,10,-7,9,1,-2 = 5 (1)
		 10,-7,9,1,-2 = 6 (2)
		 -7,9,1,-2 = 7 (2)
		 9,1,-2 = 8 (3)
		 1,-2 = 9 (3)
		 -2 = 10 (3)
		 0 = 11 (4)
		 */
	} 
}