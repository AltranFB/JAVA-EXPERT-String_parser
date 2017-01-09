import static org.junit.Assert.*;
import org.junit.Test;

public class TestCases {
	@Test
	public void Test01() {
		assertEquals("Well formatted string", true, Solution.check("[()]"));
	}

	@Test
    public void Test02() {
		assertEquals("Well formatted string (2)", true, Solution.check("(()[])"));
    }

	@Test
	public void Test03() {
		assertEquals("Bracket error", false, Solution.check("([)]"));
    }

	@Test
	public void Test04() {
		assertEquals("Parenthesis error", false, Solution.check("g((ggt"));
    }

	@Test
	public void Test05() {
		assertEquals("Parenthesis error (2)", false, Solution.check("[((coucou)])"));
	}

	@Test
	public void Test06() {
		assertEquals("Well formatted string (3)", true, Solution.check("([(([[((ddd[thg]qsqs))]]))])"));
    }

	@Test
	public void Test07() {
		assertEquals("Well formatted string (4)", true, Solution.check("[](()dq()[[]]qsqsq)()[]([])")); // true
    }

	@Test
	public void Test08() {
		assertEquals("Missing parenthesis", false, Solution.check("([((([(([]))])))))])"));
    }

	@Test
	public void Test09() {
		assertEquals("Nested", false, Solution.check("[](()()[[]])[][[([])"));
    }

	@Test
	public void Test10() {
		assertEquals("Reliability ?", true, Solution.check(null));
	}

	@Test
	public void Test11() {
		assertEquals("Too much closings", false, Solution.check("([fdg]))))"));
	}
}


