package javaCoreTraining;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "madam"; 
		String t = ""; 
		for(int i=a.length()-1; i >=0; i--) {
			t= t+ a.charAt(i);
		}
		System.out.println(t);
	}

}
