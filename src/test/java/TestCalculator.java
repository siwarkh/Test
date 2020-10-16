import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCalculator {
	@Test
	public void testadd () {
		assertEquals(5, Calculator.add(2, 3));
	}

}
