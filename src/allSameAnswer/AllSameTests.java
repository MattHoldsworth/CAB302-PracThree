package allSameAnswer;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import allSameQuestion.AllSameA;
import allSameQuestion.AllSameB;
import allSameQuestion.AllSameC;

public class AllSameTests {

	private int[] naturals;
	
	private int[] allsame = new int[] {2, 2, 2, 2, 2};
	
	@Before @Test
	public void SetUp() throws Exception {
		AllSameA A = new AllSameA();
		AllSameB B = new AllSameB();
		AllSameC C = new AllSameC();
		naturals = new int[1000];
	}

	@Test
	public void TestMethodA() throws Exception {
		assertEquals(true, AllSameA.same(allsame));
	}
	
	@Test
	public void TestMethodB() throws Exception {
		AllSameB.same(allsame);
		assertEquals(true, AllSameB.same(allsame));
	}
	
	@Test
	public void TestMethodC() throws Exception {
		AllSameC.same(allsame);
		assertEquals(true, AllSameC.same(allsame));
	}
}
