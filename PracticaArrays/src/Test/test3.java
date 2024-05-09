package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.MisArrays;

class test3 {
	
	static int[]notasBuenas;
	static int[]notasMalas;	
	
	/**
	 * instanciamos los arrays
	 */
	@BeforeAll
	static void arrays() {
		notasBuenas= new int[]{2,9,6,1,6};
		notasMalas =new int[]{2,1,12,5,9};			
	}
	
	@Test
	void testNotaMaxima() {
		int esperada=9;
		int obtenida=MisArrays.maximaNota(notasBuenas);
		assertEquals(esperada,obtenida);
	}
	@Test
	void testNotaMinima(){
		assertThrows(IllegalArgumentException.class,()->MisArrays.maximaNota(notasMalas));
	}

}
