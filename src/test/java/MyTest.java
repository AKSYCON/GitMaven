import static org.junit.Assert.*;

import org.junit.Test;

import com.TestService.Testing;

public class MyTest {

	@Test
	public void test() {
		Testing temp = new Testing();
		int realval = 10;
		int calval = temp.add(5, 5);
		
			assertEquals(calval,realval);
		}

}
