package race;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TryCountTest {
	
	private static TryCount tryCount;
	
	@Test
	public void testContructor() {
		tryCount = new TryCount(1);
		assertEquals(1, tryCount.getTryCount());
	}

	@Test
	public void testSetCarName() {
		tryCount = new TryCount(1);
		tryCount.setTryCount(5);
		assertEquals(5, tryCount.getTryCount());
	}

}
