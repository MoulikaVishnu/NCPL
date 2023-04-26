package week3NCPL;

public class UnCheckedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A[]= {1,2,3,4,5};
		try {
			System.out.println(A[2]);
			System.out.println(A[5]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index of 5th element not fount in A[5]");
			
		}
		finally {
			System.out.println("This is all about ArrayIndexOutOfoundException");
		}
		
				
	
	
	}

}
