package testprj;

public class ReplaceAllTest {

	public static void main(String[] args) {
		 
		
		String result="0123";
		
		
		String r= result.replaceAll("[0-3]", "");
		
		System.out.println( "charAt"+ r.charAt(0));
		
		System.out.println( r);

	}

}
