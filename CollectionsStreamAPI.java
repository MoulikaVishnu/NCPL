package week3NCPL;

import java.util.ArrayList;

import java.util.List;

import java.util.stream.Collectors;


public class CollectionsStreamAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println(list);
		
		ArrayList<Integer> newList = new ArrayList<Integer>();
		for(Integer i: list) {
			if(i>=30) {
				newList.add(i);
			}
		}
		System.out.println(newList);
		System.out.println("----------");
		
		//streams with lambda expression
	//	collection interface is having a method stream.
		// lets take a new list having integer items
		List<Integer> l1 = list.stream().filter(i->i>=30).collect(Collectors.toList());
		System.out.println(l1);
		
		//map with lambda expression
		//suppose we want to double the values in the list - we cannot use filter for that. we use map.
		
		List<Integer> l2 = list.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println(l2);
		//length of the code is reduced significantly using streams. 
		
		//count 
		long  cnt = list.stream().filter(i->i>=30).count();
		System.out.println(cnt);
		
		//sorting
		//we can sort by default/natural sorting and custom sorting----2 methods
		//without argument in default ------sorted()
		//with argument in custom---------sorted(comparator c)
		List<Integer> l3 = list.stream().sorted().collect(Collectors.toList());
		System.out.println(l3);
		//it is sorted in ascending order 
		
		//now lets do custom sorting in descending order by taking lambda
		List<Integer> l4 = list.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println(l4);
		
		//more methods are forEach, min, max etc. 
		//parallel streams , parallelism is speed. program should be designed in such a way that more resources work at a given time
		//streams can do that
		//parallel and sequential 
		
		
		
		
		
		
		
	}

}
