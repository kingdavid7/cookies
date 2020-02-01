package cookies;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MasterOrderTest {
	
	@Test
	public void shouldReturnTotalBoxesAsOne() {
		MasterOrder underTest = new MasterOrder();
		int check = underTest.getTotalBoxes();
		assertEquals(1, check);	
	}
	@Test
	public void shouldReturnTotalBoxesAsTwo(); 
	     MasterOrder underTest = new MasterOrder();
	     int check = underTest.getTotalBoxes();
	     void assertEquals(2, check);	
	

}
