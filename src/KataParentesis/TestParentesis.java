package KataParentesis;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestParentesis {

	StringForBalanced cadena;
	ParentesisContador balanceo;
	
	@Before
	public void setUp(){
		cadena = new StringForBalanced("(hola)");
		balanceo = new ParentesisContador();
	}
	
	
	@Test
	public void comprobateOpen(){
		assertTrue(cadena.isOpen(cadena.getCharAt(0)));
	}
	
	@Test
	public void comprobateClosed(){
		assertTrue(cadena.isClosed(cadena.getCharAt(cadena.getSizeOfData()-1)));
	}
	
	@Test
	public void comprobateBalanced(){
		assertTrue(balanceo.contador(cadena));
	}
	
	@Test
	public void comprobateNoBalanced(){
		assertFalse(balanceo.contador(new StringForBalanced("(()hola(")));
	}
	
	@Test
	public void comprobateBalancedError(){
		assertFalse(balanceo.contador(new StringForBalanced(")hola(")));
	}

}
