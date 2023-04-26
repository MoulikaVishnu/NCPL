package week3NCPL;
import java.util.ArrayList;
import java.util.Collections;

public class CollectionsMergingTwoArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> A= new ArrayList<Integer>();
		ArrayList<Integer> B= new ArrayList<Integer>();
		
	A.add(1);
	A.add(4);
	A.add(5);
	B.add(3);
	B.add(6);
	B.add(2);
	
	ArrayList<Integer> mergedlist = new ArrayList<Integer>();
	mergedlist.addAll(A);
	mergedlist.addAll(B);
	Collections.sort(mergedlist);
	System.out.println(mergedlist);
	
		
	
	}

}
