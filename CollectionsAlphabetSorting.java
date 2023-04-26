package week3NCPL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class CollectionsAlphabetSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//collections are interfaces and are three of them  - list,set and queue(fifo)
		//list is an interface and we cannot create a list. 
		//we have three types of list-arraylis,linkedlist,vector-all the three are classes
		//instead of creating a list we are creating a new array list.
		
		List<String> li = new ArrayList<String>(); //List li = new ArrayList(); works when we write li.add(" ").
		
		li.add("white");
		li.add("red");
		li.add("orange");
		li.add("green");
		li.add("yellow");
		li.add("blue");
		li.add("violet");
		Collections.sort(li);
		System.out.println(li.size());
		System.out.println(li);
		//after wriitng the code, code will go to quality testing. sonarquebe is one of them which will test the code
		//collections are heterogenous and when we test, code quality gets reduces.
		//
		
//@SupressWarnings("unchecked");//when we create a heterogenous list we get so many warnings, it is not a good practice and hence we use this annotation
	}

}
