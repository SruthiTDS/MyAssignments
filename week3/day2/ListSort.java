package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSort {
public static void main(String[] args) {
	List<String> list=new ArrayList<String>();
	list.add("8");
	list.add("1");
	list.add("2");
	list.add("8");
	list.add("4");
	list.add("5");
	list.add("6");
	list.add("7");
	list.add("3");
	System.out.println(list);
	Collections.sort(list);
	System.out.println(list);
	
	
	
	
}
}
