import org.junit.Assert;
import org.junit.Test;

public class ElementFinderTest {

	ElementFinder ef = new ElementFinder();

	@Test
	public void testNullArray() {
		Assert.assertEquals(-1, ef.findElement(8));
	}

	@Test
	public void testEmpty() {
		ef.setArray(new int[] {});
		Assert.assertEquals(-1, ef.findElement(8));
	}

	@Test
	public void testSinglePos() {
		ef.setArray(new int[] { 1 });
		Assert.assertEquals(0, ef.findElement(1));
	}

	@Test
	public void testSingleNeg() {
		ef.setArray(new int[] { 1 });
		Assert.assertEquals(-1, ef.findElement(8));
	}

	@Test
	public void testTwoPosSortedPos() {
		ef.setArray(new int[] { 1, 24 });
		Assert.assertEquals(0, ef.findElement(1));
	}

	@Test
	public void testTwoPosSortedNeg() {
		ef.setArray(new int[] { 1, 24 });
		Assert.assertEquals(-1, ef.findElement(34));
	}

	@Test
	public void testTwoPos() {
		ef.setArray(new int[] { 24, 45 });
		Assert.assertEquals(1, ef.findElement(45));
	}

	@Test
	public void testTwoNeg() {
		ef.setArray(new int[] { 24, 1 });
		Assert.assertEquals(-1, ef.findElement(134));
	}

	@Test
	public void testEvenElemsPos() {
		ef.setArray(new int[] { 7, 8, 9, 10, 4, 1, 2 });
		Assert.assertEquals(1, ef.findElement(8));
	}

	@Test
	public void testEvenElemsNeg() {
		ef.setArray(new int[] { 7, 8, 9, 10, 4, 1, 2 });
		Assert.assertEquals(-1, ef.findElement(778));
	}

	@Test
	public void tesOddElemsPos() {
		ef.setArray(new int[] { 7, 8, 9, 10, 5, 1 });
		Assert.assertEquals(4, ef.findElement(5));
	}

	@Test
	public void tesOddElemsNeg() {
		ef.setArray(new int[] { 7, 8, 9, 10, 5, 1 });
		Assert.assertEquals(-1, ef.findElement(3434));
	}

	@Test
	public void testSortedPos() {
		ef.setArray(new int[] { 1, 24, 67, 78, 90 });
		Assert.assertEquals(3, ef.findElement(78));
	}

	@Test
	public void testSortedNeg() {
		ef.setArray(new int[] { 1, 24, 67, 78, 90 });
		Assert.assertEquals(-1, ef.findElement(34));
	}

}
