package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.MisArrays;

class test4 {


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
	void testMinimaNota() {
		int esperada=1;
		int obtenida=MisArrays.minimaNota(notasBuenas);
		assertEquals(esperada,obtenida);
	}
	@Test
	void testNotaMinima(){
		assertThrows(IllegalArgumentException.class,()->MisArrays.minimaNota(notasMalas));
	}
}
