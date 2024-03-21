package com.test;

import static org.junit.Assert.*;

import org.junit.*;

import com.TestService.Testing;

public class testCase {

	@Test
	public void test() {
		Testing temp = new Testing();
		int realval = 10;
		int calval = temp.add(5, 5);
		
			assertEquals(calval,realval);
		}

}
