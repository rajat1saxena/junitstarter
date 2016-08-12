import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

final public class mapy {
	/**
	* Outputs colon separated values in list.
	*/
	public static <K, V> List<String> colonSepKeyVal(Map<K, V> input) {
		List<String> outList = new ArrayList<String>();

		for(K key : input.keySet()) {
			outList.add(key.toString() + ":" + input.get(key));
		}

		return outList;
	}

	public static void main(String args[]) {
		Map<String, Integer> wordFreq = new HashMap<String, Integer>();

		// put values from command line
		for (String a : args) {
			Integer freq = wordFreq.get(a); 
			wordFreq.put(a, freq ==  null ? 1 : freq + 1);
		}

		System.out.println(wordFreq);

		// Collection view
		for (String k : wordFreq.keySet()) { 
			System.out.println(k + ":" + wordFreq.get(k));
		}

		// Iterator view
		for (Iterator<String> it = wordFreq.keySet().iterator(); 
			it.hasNext();) {
			System.out.println(it.next());
		}

		// Iterating over values
		for(Map.Entry<String, Integer> entry : wordFreq.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

		// call colonSepKeyVal
		System.out.println(colonSepKeyVal(wordFreq));
	}
}
