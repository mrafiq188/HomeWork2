package homeWork2;

public class UseString {
	public static void main(String[] args) {

		String a = "Hi my name is Alif";
		    System.out.println(a.toUpperCase());
		    System.out.println(a.toLowerCase());
		 
		String b = "alif";
		    System.out.println(b.charAt(2));
		
		String c = "pizza";
		    System.out.println(c.concat("tasty"));
		
		String d = "driver";
		    System.out.println(d + "license");
		
		String place = "United";
		   place += ("States");
		    System.out.println(place);
		
		String e = "delete";
		     System.out.println(e.equalsIgnoreCase("delete"));
		     System.out.println(e.equalsIgnoreCase("undelete"));
		
		String number = "012345";
		     System.out.println(number.length());
		
		String num = "tpopxboomxsmackx";
		     System.out.println(num.replace('t', 'x'));
		
		String f = "Pizza is a type of food.";
		     System.out.println(f.contains("car"));
		     System.out.println(f.contains("Pizza"));
		
		     String g = "Hello";
		System.out.println(g + " world");
		System.out.println(g.trim() + "world");
		
		     String str = "oigami are cool to make ";
		     String s2 = "ORIGAMI";
		     String s3 = "oigami";
		     String s4 = "oigami bird";
		System.out.println("char at index 2 (third position ):" + str.charAt(2));
		System.out.println("After concat:" + str.concat("Enjoy"));
		System.out.println("Checking  length: " + str.length());
		System.out.println("Replace function:" + str.replace("fun", "easy"));
		System.out.println("Converting to lower case: " + str.toLowerCase());
		System.out.println("Converting to upper case: " + str.toUpperCase());
		System.out.println("Triming string:" + s4.trim());
		System.out.println("Searching s2 in str:" + str.contains(s2));
		System.out.println("Searching s3 in str:" + str.contains(s3));
		
	}

}
