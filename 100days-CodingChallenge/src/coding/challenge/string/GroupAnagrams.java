package coding.challenge.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
public List<List<String>> groupAnag(String[] arr){
	Map<String,List<String>> map = new HashMap<>();
	for(String s : arr) {
		char[] c = s.toCharArray();
		Arrays.sort(c);
		String key = String.valueOf(c);
		if(!map.containsKey(key)) {
			map.put(key, new ArrayList<>());
		}
		map.get(key).add(s);
	}
	return new ArrayList<>(map.values());
}
}
