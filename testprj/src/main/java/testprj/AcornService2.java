package testprj;

import java.util.ArrayList;

public class AcornService2 {
	
	AcornDAO3  dao = new AcornDAO3 ();
	
	public ArrayList<Member> getMemberList(){
		ArrayList<Member> list = dao.selectAll2();
		return list;
	}
	
	
	
	public static void main(String[] args) {
		AcornService2  s= new AcornService2();
		
		ArrayList<Member> list  =s.getMemberList();
		
		System.out.println( list);
	}
	
}
