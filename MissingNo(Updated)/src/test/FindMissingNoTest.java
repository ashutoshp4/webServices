package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class FindMissingNoTest {
	ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(2, 3, 4, 6,
			8, 9, 10, 11, 12, 13, 14, 15, 18, 20, 21, 23, 24, 25));
	int a[] ={0,1,5,7,16,17};
	int b[] ={1,1,2,3,4,5,6,6};
    int c[] ={1,6};
    
    /* testcase for find missing number using assertion */
	@Test
	public void testFindMissingNumber() {
		assertArrayEquals(a, new FindMissingNo().findMissingNumber(list));
	}
	/* testcase for duplicate number using assertion */
	@Test
	public void testDuplicateNumber() {
		assertArrayEquals(c, new FindMissingNo().duplicateNumber(b));
	}

	@Test
	public void testReverse() {
	
	}

}
