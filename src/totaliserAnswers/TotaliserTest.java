package totaliserAnswers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import totaliserQuestion.Totaliser;

public class TotaliserTest {
	
	private int sum;
	private int value;
	private Totaliser totaliser;
	private Totaliser totaliser_2;
	
	//Test initialization of totaliser object
	@Before @Test
	public void SetUp() {
		totaliser = new Totaliser();
		sum = 0;
	}

	//Test negative value entered
	@Test
	public void NegativeValue() throws Exception {
		value = -1;
		Totaliser.enterValue(value);
		assertEquals(value, Totaliser.getSum());
	}
	
	//Test multiple values entered
	@Test
	public void TestMultipleValues() throws Exception {
		Totaliser.reset();
		value = 1;
		Totaliser.enterValue(value);
		value = 2;
		Totaliser.enterValue(value);
		value = 3;
		Totaliser.enterValue(value);
		assertEquals(6, Totaliser.getSum());
	}
	
	//Test reset method
	@Test
	public void TestReset() throws Exception {
		value = 1;
		Totaliser.enterValue(value);
		value = 2;
		Totaliser.enterValue(value);
		value = 3;
		Totaliser.enterValue(value);
		Totaliser.reset();
		assertEquals(0, Totaliser.getSum());
	}
	
	//Test for class equality
	@Test
	public void TestClassEquality() throws Exception {
		totaliser_2 = new Totaliser();
		assertNotEquals(totaliser_2, totaliser);
	}
	
	//Test for negative value
	@Test
	public void NegativeValues() throws Exception {
		value = -1;
		Totaliser.enterValue(value);
		assertEquals(value, Totaliser.getSum());
	}
	


}
