package util;

public abstract class MisArrays {

	/**
	 * 
	 * @param array de notas
	 * @return Devuelve la nota media obtenida de un array
	 */
	public static float mediaNotas(int[] array) throws IllegalArgumentException{
		for (int i=0;i<array.length;i++) {
			if (array[i]<0||array[i]>10) {
				 throw new IllegalArgumentException("Las notas deben estar entre 0 y 10");
			}
		}
		float sum = 0;
		for (float nota : array) {
			sum += nota;
			}
		return (float) sum / array.length;
		}
	
	
	public static int maximaNota(int[]array) {
		
		int max=array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i]<0||array[i]>10) {
				 throw new IllegalArgumentException("Las notas deben estar entre 0 y 10");
			}
			else {
				if(array[i]>max) {
				max=array[i];
			}
			}
			
		}
		
		return max;
	}
	
public static int minimaNota(int[]array) {
		
		int min=array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i]<0||array[i]>10) {
				 throw new IllegalArgumentException("Las notas deben estar entre 0 y 10");
			}
			else {
				if(array[i]<min) {
				min=array[i];
			}
			}
			
		}
		
		return min;
	}
	
}
