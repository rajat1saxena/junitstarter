import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.containsString;
import java.util.*;

public class mapytester {
	String mapOutput = "[lol:1]";
	
	@Test
	public void testColonSepKeyVal() {
		Map<String, Integer> testMap = new HashMap<String, Integer>();
		testMap.put("lol", 1);
		String firstElement = mapy.<String, Integer>colonSepKeyVal(testMap).get(0);
		System.out.println(firstElement);
		assertThat(firstElement, containsString(":"));
	}
}
