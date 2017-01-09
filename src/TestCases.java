import static org.junit.Assert.*;
import org.junit.Test;

public class TestCases {
	@Test
	public void Test1() {
		assertEquals("Well formatted string", true, Solution.check("[()]"));
	}

	@Test
    public void Test2() {
		assertEquals("Well formatted string (2)", true, Solution.check("(()[])"));
    }

	@Test
	public void Test3() {
		assertEquals("Bracket error", false, Solution.check("([)]"));
    }

	@Test
	public void Test4() {
		assertEquals("Parenthesis error", false, Solution.check("(("));
    }

	@Test
	public void Test5() {
		assertEquals("Parenthesis error (2)", false, Solution.check("[(()])"));
	}

	@Test
	public void Test6() {
		assertEquals("Well formatted string (3)", true, Solution.check("([(([[(([]))]]))])"));
    }

	@Test
	public void Test7() {
		assertEquals("Well formatted string (4)", true, Solution.check("[](()()[[]])()[]([])")); // true
    }

	@Test
	public void Test8() {
		assertEquals("Missing parenthesis", false, Solution.check("([((([(([]))])))))])"));
    }

	@Test
	public void Test9() {
		assertEquals("Nested", false, Solution.check("[](()()[[]])[][[([])"));
    }


}
