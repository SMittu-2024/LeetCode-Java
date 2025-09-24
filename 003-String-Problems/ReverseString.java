package Strings;

public class ReverseString {

	public static void main(String[] args) {
		
		String org = "New String";
		//Using STringBuffer
		/*StringBuffer str = new StringBuffer();
		str.append(org);
		System.out.println(str);
		str.reverse();
		*/
    //Without using StringBuffer
		String str="";
		for(int i=org.length()-1; i>=0; i--) {
			str=str+org.charAt(i);
		}
		System.out.println(str);	
	}
}
