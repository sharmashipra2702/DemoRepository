package uiFramework;

import java.lang.reflect.Array;
import java.util.Arrays;
public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s = "I love my india";
      String a[] = s.split(" ");
      int b[] = new int[a.length];
      for(int i =0; i<a.length; i++){
        b[i] = a[i].length();
      }
      Arrays.sort(b);
      System.out.println(b[b.length-2]);
      for(int j =0; j<b.length; j++){
        System.out.println(b[j]);
      }

	}

}
