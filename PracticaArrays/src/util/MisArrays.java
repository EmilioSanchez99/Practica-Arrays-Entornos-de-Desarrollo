package util;

import java.util.Arrays;

public abstract class MisArrays {

	/**
	 * 
	 * @param array de notas
	 * @return Devuelve la nota media obtenida de un array
	 */
	public static float mediaNotas(int[] array) throws IllegalArgumentException {
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0 || array[i] > 10) {
				throw new IllegalArgumentException("Las notas deben estar entre 0 y 10");
			}
		}
		float sum = 0;
		for (float nota : array) {
			sum += nota;
		}
		return (float) sum / array.length;
	}

	/**
	 * 
	 * @param array de notas
	 * @return devuelve la nota maxima del array si es valido
	 */
	public static int maximaNota(int[] array) {

		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0 || array[i] > 10) {
				throw new IllegalArgumentException("Las notas deben estar entre 0 y 10");
			} else {
				if (array[i] > max) {
					max = array[i];
				}
			}

		}

		return max;
	}

	/**
	 * 
	 * @param array de notas
	 * @return devuelve la nota minima del array si es valido
	 */
	public static int minimaNota(int[] array) {

		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0 || array[i] > 10) {
				throw new IllegalArgumentException("Las notas deben estar entre 0 y 10");
			} else {
				if (array[i] < min) {
					min = array[i];
				}
			}

		}

		return min;
	}

	/**
	 * 
	 * @param array
	 * @return devuelve la mediana si el array es valido
	 */
	public static float mediana(int[] array) {

		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0 || array[i] > 10) {
				throw new IllegalArgumentException("Las notas deben estar entre 0 y 10");
			}
		}
		int tamaño = array.length;

		float mediana;
		if (tamaño % 2 != 0) {
			mediana = array[tamaño / 2];
		} else {
			int midpos1 = tamaño / 2 - 1;
			int midpos2 = tamaño / 2;
			double valorCentral1 = array[midpos1];
			double valorCentral2 = array[midpos2];
			mediana = (float) ((valorCentral1 + valorCentral2) / 2);
		}

		return mediana;
	}

}
