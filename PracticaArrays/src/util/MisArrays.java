package util;

public abstract class MisArrays {

	/**
	 * 
	 * @param array de notas
	 * @return Devuelve la nota media obtenida de un array
	 */
	public static float mediaNotas(int[] notas) throws IllegalArgumentException{
		for (int i=0;i<notas.length;i++) {
			if (notas[i]<0||notas[i]>10) {
				 throw new IllegalArgumentException("Las notas deben estar entre 0 y 10");
			}
		}
		float sum = 0;
		for (float nota : notas) {
			sum += nota;
			}
		return (float) sum / notas.length;
		}

}
