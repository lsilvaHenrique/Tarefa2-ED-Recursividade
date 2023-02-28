package controller;

public class VetorController{

	public VetorController() {
		super();
	}
	public int contarNegativos(int[] vetor) {
		//Condição de parada ==> Quando o vetor não tiver mais posições
		int i = 0;
		for (int x: vetor) {
			if (x < 0) {
				i++;
			}
		}
	return contarNegativos(vetor);	
	}
	
}
