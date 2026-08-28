package Clase3;
import java.util.Arrays;

public class Arregloburbuja {

	public static void main(String[] args) {
		int[] numeros = {3, 5, 9, 2, 1, 6, 0, 7};
		for (int i = 0; i < numeros.length - 1; i++) {
			for (int j = 0; j < numeros.length - 1  - i; j++) {
				// Debug
				System.out.println(i);
				if (numeros[j] > numeros[j + 1]) {
					int aux = numeros[j];
					numeros[j] = numeros[j + 1];
					numeros[j + 1] = aux;
				}
			}
		}
		System.out.println(Arrays.toString(numeros));
	}
}