package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.MisArrays;

class test2 {

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
	/**
	 * comprobamos que haga bien la media
	 */
	@Test
	void testMediaNotasValidas(){
		float mediaEsperada=(float) 4.8;
		float mediaObtenida=MisArrays.mediaNotas(notasBuenas);
		assertEquals(mediaEsperada, mediaObtenida);
	}
	/**
	 * comprobamos que salte exception
	 */
	@Test
	void testMediaNotasInvalidas(){
		assertThrows(IllegalArgumentException.class,()->MisArrays.mediaNotas(notasMalas));
	}
	
	
	
	
	
	
	

}
