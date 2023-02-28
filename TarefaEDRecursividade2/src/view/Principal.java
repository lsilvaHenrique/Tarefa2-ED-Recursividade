package view;

import controller.VetorController;
public class Principal {
	public static void main(String[] args) {
		int[] vetor= {4,8,-9,5,3,-7,10,-7,9,1,-2};
		
		VetorController vc = new VetorController();
		int contador = vc.contarNegativos(vetor);
		System.out.println("A quantidade de números negativos no vetor "
				+ "é de " + contador + " números");
	}
}
