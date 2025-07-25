package com.newstringmethods;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateNot {

		 public static void main(String[] args) {		
		      List<String> tutorialsList = Arrays.asList("Java", "\n", "HTML", " ");

		      List<String> tutorials = tutorialsList.stream()
		         .filter(Predicate.not(String::isBlank))
		         .collect(Collectors.toList());

		      tutorials.forEach(tutorial -> System.out.println(tutorial));
		   
	}
}
