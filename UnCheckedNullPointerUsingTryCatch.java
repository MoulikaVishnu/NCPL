package week3NCPL;

public class UnCheckedNullPointerUsingTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "HELLO"; //it points out to converting upper case to lower case
		//String str = null;  it points to nullpointer exception
		try {
			System.out.println(str.toLowerCase());
			System.out.println(10/0);//10/0 is arithmetic exception.
			
		}
		/*catch(Exception e) {
			System.out.println("end end end"); Exception is super to all the unchecked exceptions and checked exceptions. dont use this in the first catch block.
			}*/
		
		catch(NullPointerException e){
			System.out.println("Error.."); //here we are using nullpointer instead of arithmetic and hence we see abnormal termination
			
			
		}
		catch(ArithmeticException e) { //we can use multiple catch blocks
			System.out.println("Error in operating 10/0");//here we are using arithmetic exception 
		}
		
		catch(Exception e) {
			System.out.println("end end end");
		}
		finally{
		System.out.println("Program Executed"); // the code we write in finally bloack is a clean up code. it gives a guarantee to close /releasing the resources. 
		}
		//we need to close all the resources which were opened in order to manage the memory of open resources.
		
		}

}
