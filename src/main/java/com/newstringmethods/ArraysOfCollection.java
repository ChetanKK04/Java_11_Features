package com.newstringmethods;

import java.util.Arrays;
import java.util.List;

public class ArraysOfCollection {

		   public static void main(String[] args) {		
		      List<String> namesList = Arrays.asList("Joe", "Julie");
		      List<Integer> li = Arrays.asList(1,5,8,9);
		      
		      // Old way
		      String[] names = namesList.toArray(new String[namesList.size()]);
		      Integer[] ll	= li.toArray(new Integer [li.size()]);
		      System.out.println(names.length);
		      System.out.println(ll.length);
		     
		      
		      // New way
		      names = namesList.toArray(String[]::new);
		      Integer[]    kk = li.toArray(Integer[] :: new);
		      System.out.println(names.length);
		      System.out.println(kk.length);
		      
		   }
		}
