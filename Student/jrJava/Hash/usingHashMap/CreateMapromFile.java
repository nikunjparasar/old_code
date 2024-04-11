package jrJava.usingHashMap;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CreateMapromFile {

	public static void main(String[] args) throws Exception {

		Scanner s = new Scanner(new File("jrJava/usingHashMap/data.txt"));
		String line = s.nextLine();
		Map<String, Integer> map = createMap(line);
		print(map);
	}

	
	private static void print(Map<String, Integer> map) {
		Iterator<String> iter = map.keySet().iterator();
		String key;
		Integer value;
		while(iter.hasNext()) {
			key = iter.next();
			value = map.get(key);
			System.out.print("[" + key + ":" + value + "] ");
		}
		System.out.println();
	}
	
	
	private static Map<String, Integer> createMap(String line) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		StringTokenizer st = new StringTokenizer(line, ",");
		String token;
		int pos;
		String key;
		Integer value;
		while(st.hasMoreTokens()) {
			token = st.nextToken();
			pos = token.indexOf('=');
			key = token.substring(0, pos).trim();
			value = Integer.parseInt(token.substring(pos+1).trim());
			map.put(key, value);
		}
		return map;
	}
}







