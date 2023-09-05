package com.java.advance;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class CheckMazine {

	public static Map<String, Integer> listToMap(List<String> list) {

		HashMap<String, Integer> listMap = new HashMap<String, Integer>(list.size());

		for (String string : list) {
			if (listMap.containsKey(string)) {
				listMap.put(string, listMap.get(string) + 1);
			} else {
				listMap.put(string, 1);
			}
		}
		return listMap;
	}

	public static void checkMagazine(List<String> magazine, List<String> note) {
		boolean flag = false;
		Map<String, Integer> magzineMap = listToMap(magazine);
		Map<String, Integer> noteMap = listToMap(note);

		System.out.println(magzineMap);
		System.out.println(noteMap);

		for (String key : noteMap.keySet()) {
			if (magzineMap.containsKey(key)) {
				if (!(magzineMap.get(key) >= noteMap.get(key))) {
					System.out.println("No");
					flag = true;
					break;
				}

			} else {
				System.out.println("No");
				flag = true;
				break;
				
				
			}
			
		}
		if (!flag) {
			System.out.println("Yes");
			
		}

//		System.out.println(magazine);
//		System.out.println(note);
//		boolean containsAll = magazine.containsAll(note);
//		boolean containsAll = magazine.containsAll(note);
//		System.out.println(containsAll);
//        boolean retainAll = magazine.retainAll(note);
////		boolean retainAll = note.retainAll(magazine);
//        
//        System.out.println(retainAll);
//		System.out.println(magazine);
//		System.out.println(note);

	}

	public static void main(String[] args) {
		List<String> magazine = new ArrayList<String>();
//		magazine.add("give"); //give me one grand today night
//
//		magazine.add("me");
//		magazine.add("one");
//
//		magazine.add("grand");
//		magazine.add("today");
//		magazine.add("night");
		magazine.add("h");  //h ghq g xxy wdnr anjst xxy wdnr h h anjst wdnr
		magazine.add("ghq");
		magazine.add("g");
		magazine.add("xxy");
		magazine.add("wdnr");
		magazine.add("anjst");
		magazine.add("xxy");
		magazine.add("wdnr");
		magazine.add("h");
		magazine.add("h");
		magazine.add("anjst");
		magazine.add("wdnr");
		List<String> note = new ArrayList<String>();
//		note.add("give"); // give one grand today
//		note.add("one");
//		note.add("grand");
//		note.add("today");
		note.add("h");
		note.add("ghq");
		checkMagazine(magazine, note);
	}
}
