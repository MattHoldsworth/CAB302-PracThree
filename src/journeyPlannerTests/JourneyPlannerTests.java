package journeyPlannerTests;

import static org.junit.Assert.*;
import journeyPlannerQuestion.JourneyPlannerA;
import journeyPlannerQuestion.JourneyPlannerB;

import org.junit.Before;
import org.junit.Test;

public class JourneyPlannerTests {

	private JourneyPlannerA A;
	private JourneyPlannerB B;
	private int walkingSpeed = 1;
	private int negWalkingSpeed = -1;
	private int zeroWalkingSpeed = 0;
	private int x = 0;
	private int y = 0;
	private int negX = -1;
	private int negY = -1;
	private int largeX = 11;
	private int largeY = 11;
	
	//Constructor/Parameter Tests
	@SuppressWarnings("unused")
	@Before @Test
	public void setUp() throws Exception {
		JourneyPlannerA A = new JourneyPlannerA(walkingSpeed);
		JourneyPlannerB B = new JourneyPlannerB(walkingSpeed);	
	}
	
	@SuppressWarnings("unused")
	@Test (expected = Exception.class)
	public void TestZeroWalkingSpeed() throws Exception{
		JourneyPlannerA A = new JourneyPlannerA(zeroWalkingSpeed);
		JourneyPlannerB B = new JourneyPlannerB(zeroWalkingSpeed);
	}
	
	@SuppressWarnings("unused")
	@Test (expected = Exception.class)
	public void TestNegativeWalkingSpeed() throws Exception{
		JourneyPlannerA A = new JourneyPlannerA(negWalkingSpeed);
		JourneyPlannerB B = new JourneyPlannerB(negWalkingSpeed);
	}
	
	//Return True Tests
	@Test
	public void TestZeroAsValidOrigin() throws Exception {
		JourneyPlannerA A = new JourneyPlannerA(walkingSpeed);
		JourneyPlannerB B = new JourneyPlannerB(walkingSpeed);
		assertTrue(A.setOrigin(x, y));
		assertTrue(B.setOrigin(x, y));
	}
	
	//Return False Tests
	@Test
	public void TestReturnNegativeOriginX() throws Exception {
		JourneyPlannerA A = new JourneyPlannerA(walkingSpeed);
		JourneyPlannerB B = new JourneyPlannerB(walkingSpeed);	
		assertFalse(A.setOrigin(negX, y));
		assertFalse(B.setOrigin(negX, y));
	}
	
	@Test
	public void TestReturnNegativeOriginY() throws Exception {
		JourneyPlannerA A = new JourneyPlannerA(walkingSpeed);
		JourneyPlannerB B = new JourneyPlannerB(walkingSpeed);	
		assertFalse(A.setOrigin(x, negY));
		assertFalse(B.setOrigin(x, negY));
	}
	
	@Test
	public void TestReturnNegativeOriginXAndY() throws Exception {
		JourneyPlannerA A = new JourneyPlannerA(walkingSpeed);
		JourneyPlannerB B = new JourneyPlannerB(walkingSpeed);	
		assertFalse(A.setOrigin(negX, negY));
		assertFalse(B.setOrigin(negX, negY));
	}
	
	@Test
	public void TestReturnTooLargeOriginX() throws Exception {
		JourneyPlannerA A = new JourneyPlannerA(walkingSpeed);
		JourneyPlannerB B = new JourneyPlannerB(walkingSpeed);	
		assertFalse(A.setOrigin(largeX, y));
		assertFalse(B.setOrigin(largeX, y));
	}
	
	@Test
	public void TestReturnTooLargeOriginY() throws Exception {
		JourneyPlannerA A = new JourneyPlannerA(walkingSpeed);
		JourneyPlannerB B = new JourneyPlannerB(walkingSpeed);	
		assertFalse(A.setOrigin(x, largeY));
		assertFalse(B.setOrigin(x, largeY));
	}
	
	@Test
	public void TestReturnTooLargeOriginXAndY() throws Exception {
		JourneyPlannerA A = new JourneyPlannerA(walkingSpeed);
		JourneyPlannerB B = new JourneyPlannerB(walkingSpeed);	
		assertFalse(A.setOrigin(largeX, largeY));
		assertFalse(B.setOrigin(largeX, largeY));
	}
	
	@Test
	public void TestReturnNegativeDestinationX() throws Exception {
		JourneyPlannerA A = new JourneyPlannerA(walkingSpeed);
		JourneyPlannerB B = new JourneyPlannerB(walkingSpeed);	
		assertFalse(A.setDestination(negX, y));
		assertFalse(B.setDestination(negX, y));
	}
	
	@Test
	public void TestReturnNegativeDestinationY() throws Exception {
		JourneyPlannerA A = new JourneyPlannerA(walkingSpeed);
		JourneyPlannerB B = new JourneyPlannerB(walkingSpeed);	
		assertFalse(A.setDestination(x, negY));
		assertFalse(B.setDestination(x, negY));
	}
	
	@Test
	public void TestReturnNegativeDestinationXAndY() throws Exception {
		JourneyPlannerA A = new JourneyPlannerA(walkingSpeed);
		JourneyPlannerB B = new JourneyPlannerB(walkingSpeed);	
		assertFalse(A.setDestination(negX, negY));
		assertFalse(B.setDestination(negX, negY));
	}
	
	@Test
	public void TestReturnTooLargeDestinationX() throws Exception{
		JourneyPlannerA A = new JourneyPlannerA(walkingSpeed);
		JourneyPlannerB B = new JourneyPlannerB(walkingSpeed);	
		assertFalse(A.setDestination(largeX, y));
		assertFalse(B.setDestination(largeX, y));
	}
	
	@Test
	public void TestReturnTooLargeDestinationY() throws Exception{
		JourneyPlannerA A = new JourneyPlannerA(walkingSpeed);
		JourneyPlannerB B = new JourneyPlannerB(walkingSpeed);	
		assertFalse(A.setDestination(x, largeY));
		assertFalse(B.setDestination(x, largeY));
	}
	
	@Test
	public void TestReturnTooLargeDestinationXAndY() throws Exception{
		JourneyPlannerA A = new JourneyPlannerA(walkingSpeed);
		JourneyPlannerB B = new JourneyPlannerB(walkingSpeed);	
		assertFalse(A.setDestination(largeX, largeY));
		assertFalse(B.setDestination(largeX, largeY));
	}
	
	//Exception Tests
	@Test (expected = Exception.class)
	public void TestNegativeOriginX() throws Exception{
		A.setOrigin(negX, y);
		B.setOrigin(negX, y);
	}
	
	@Test (expected = Exception.class)
	public void TestNegativeOriginY() throws Exception{
		A.setOrigin(x, negY);
		B.setOrigin(x, negY);
	}
	
	@Test (expected = Exception.class)
	public void TestNegativeOriginXAndY() throws Exception{
		A.setOrigin(negX, negY);
		B.setOrigin(negX, negY);
	}
	
	@Test (expected = Exception.class)
	public void TestTooLargeOriginX() throws Exception{
		A.setOrigin(largeX, y);
		B.setOrigin(largeX, y);
	}
	
	@Test (expected = Exception.class)
	public void TestTooLargeOriginY() throws Exception{
		A.setOrigin(x, largeY);
		B.setOrigin(x, largeY);
	}
	
	@Test (expected = Exception.class)
	public void TestTooLargeOriginXAndY() throws Exception{
		A.setOrigin(largeX, largeY);
		B.setOrigin(largeX, largeY);
	}
	
	@Test (expected = Exception.class)
	public void TestNegativeDestinationX() throws Exception{
		A.setDestination(negX, y);
		B.setDestination(negX, y);
	}
	
	@Test (expected = Exception.class)
	public void TestNegativeDestinationY() throws Exception{
		A.setDestination(x, negY);
		B.setDestination(x, negY);
	}
	
	@Test (expected = Exception.class)
	public void TestNegativeDestinationXAndY() throws Exception{
		A.setDestination(negX, negY);
		B.setDestination(negX, negY);
	}
	
	@Test (expected = Exception.class)
	public void TestTooLargeDestinationX() throws Exception{
		A.setDestination(largeX, y);
		B.setDestination(largeX, y);
	}
	
	@Test (expected = Exception.class)
	public void TestTooLargeDestinationY() throws Exception{
		A.setDestination(x, largeY);
		B.setDestination(x, largeY);
	}
	
	@Test (expected = Exception.class)
	public void TestTooLargeDestinationXAndY() throws Exception{
		A.setDestination(largeX, largeY);
		B.setDestination(largeX, largeY);
	}
	
	//JourneyTime Tests
	@Test
	public void TestTravelingNowhere() throws Exception {
		JourneyPlannerA A = new JourneyPlannerA(walkingSpeed);
		JourneyPlannerB B = new JourneyPlannerB(walkingSpeed);	
		A.setOrigin(x, y);
		B.setOrigin(x, y);
		A.setDestination(x, y);
		B.setDestination(x, y);
		assertEquals(0, A.journeyTime());
		assertEquals(0, B.journeyTime());
	}
	
	@Test
	public void TestReverseDirectionPlannerA() throws Exception {
		JourneyPlannerA A = new JourneyPlannerA(walkingSpeed);
		A.setOrigin(10, 10);
		A.setDestination(x, y);
		assertEquals(20, A.journeyTime());
	}
	
	@Test
	public void TestReverseDirectionPlannerB() throws Exception {
		JourneyPlannerB B = new JourneyPlannerB(walkingSpeed);
		B.setOrigin(10, 10);
		B.setDestination(x, y);
		assertEquals(20, B.journeyTime());
	}

}
