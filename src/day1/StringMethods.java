package day1;

public class StringMethods {

	public static void main(String[] args) {
		//           01234567890123456789
		String S1 = "      Dinesh is a Good Good Boy";
		
		//to find length
		int l = S1.length();
		System.out.println(l);
		
		String UP = S1.toUpperCase();
		System.out.println(UP);
		
		String LP = S1.toLowerCase();
		System.out.println(LP);
		
		boolean ST = S1.startsWith("Dinesh");
		System.out.println(ST);
		
		boolean EW = S1.endsWith("boy");
		System.out.println(EW);
		
		boolean CT = S1.contains("is");
		System.out.println(CT);
		
		//Substring to identify the sequence
        //To get the value from middle using index number   	      	 
  		String Sub = S1.substring(8);
		System.out.println(Sub);
		//To get the value from start to end need to put (start,end)
		String Sub2 = S1.substring(0,8);
		System.out.println(Sub2);
		
		//To find the characer by using the index number
		char C = S1.charAt(4);
		System.out.println(C);
		
		char cha = S1.charAt(15);
		System.out.println(cha);
		
		//To find the Index number by using the character
		int IndexOf = S1.indexOf('i');
		// \n --- is used for string before the data
		System.out.println("\nIndex Of:"+IndexOf);
		
		int LastInd = S1.lastIndexOf('i');
		System.out.println("\nLast Index Of:"+LastInd);
		
		// If try to get the index for not there value e will get output in (-)
		int Indx = S1.indexOf('K');
		System.out.println("\nLast Index Of:"+Indx);
		
		String Replace = S1.replace('o', 'W');
		System.out.println("\nReplaced with 'W' "+Replace);
		
		String Replace2 = S1.replace("Dinesh", "SDR");
		System.out.println("\nReplaced with 'W' "+Replace2);
	
		String Replaceall = S1.replaceAll("Good", "Bad");
		System.out.println("\nReplaced all with "+Replaceall);
		
		boolean empty = S1.isEmpty();
		System.out.println("\nEmpty: "+empty);
		
		if (S1.isEmpty()) {
			System.out.println("\nEmpty");
		} else {
			System.out.println("Not Empty");
		}
		
		String Trim = S1.trim();
		System.out.println(Trim);
		
		
		
		
		
	}
	
	
	
	
	
}
