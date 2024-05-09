package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.MisArrays;

class test5 {

	static int[] notasBuenas;
	static int[] notasMalas;

	/**
	 * instanciamos los arrays
	 */
	@BeforeAll
	static void arrays() {
		notasBuenas = new int[] { 2, 9, 6, 1, 6 };
		notasMalas = new int[] { 13, 1, 12, 1, 9 };
	}

	@Test
	void testMediana() {
		int esperada = 6;
		float obtenida = MisArrays.mediana(notasBuenas);
		assertEquals(esperada, obtenida);
	}

	@Test
	void testMedianaMal() {
		assertThrows(IllegalArgumentException.class, () -> MisArrays.mediana(notasMalas));
	}

}
