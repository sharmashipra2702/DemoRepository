package uiFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionSortDemo {

	public static void main(String[] args) {
      ArrayList al = new ArrayList();
      al.add("z");
      al.add("A");
      al.add("G");
      al.add("S");
      System.out.println(al);
      Collections.sort(al, new MyComparator()); 
      System.out.println(al);
      String str = "I Love My Great Green India";
      String[] arr = str.split(" ");
      ArrayList a = new ArrayList();
      for(int i=0; i<arr.length; i++){
    	 a.add(arr[i]);
      }
      Collections.sort(a);
      System.out.println(a);
      
      Collections.sort(a, new MyComparator());
      System.out.println(a);
      System.out.println(a.get(a.size()-2));
	}

}

class MyComparator implements Comparator {
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		String s1 = arg0.toString();
		String s2 = arg1.toString();
		Integer i1 = s1.length();
		Integer i2 = s2.length();
		return i1.compareTo(i2);
	}
	
	public int add(){
		return 3+2;
		
	}
}
