package co.grandcircus;

import java.util.ArrayList;
import java.util.LinkedList;

public class Assessment {

	public static void main(String[] args) {


	}
	static String[] addValues(String a, String b, String c) {
		String[] strArr = new String[] {a, b, c,};
		return strArr;	
	}
	static int sumArray(int[] intarr) {
		 int sum = 0;
		    for (int value : intarr) {
		        sum += value;
		    }
		    return sum;
	}
	static ArrayList<String> removeWord(ArrayList<String> arrlist, String a){
		if(arrlist.contains(a)) {
			arrlist.remove(a);
			return arrlist;
		}
		return arrlist;
	}
	static LinkedList<String> addToList(String a){
		LinkedList<String> ll = new LinkedList<String>();  
		ll.addFirst("grapes");
		ll.add("oranges");
		ll.addLast(a);
		return ll;
	}

}