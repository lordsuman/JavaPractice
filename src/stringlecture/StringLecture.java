package stringlecture;

public class StringLecture 
{
	 public static void main (String[] args)
	{
		
		//using literals
		String str1 = "test1";
		System.out.println("example of using literals " +str1);
		
		// using char array
		
		char[] c = {'A','B','C','D'};
		
		String str2 = new String(c);
		System.out.println("example of using char array " +str2);
		
		// using byte array
		byte[] b1 = {65,66,67,68};
		
		String str3 = new String(b1);
		System.out.println("example of using byte array " +str3);
		
		// using String constructor
		
		String str4 = "java";  //stored string constant pool
		String str5 = new String ("java"); //stored in heap memory
		System.out.println("content comparison " + str4.equals(str5));
		System.out.println("obj comparison " + (str4 == str5));
		
		
		String str6 = "java";
		System.out.println("obj comparison 6 and 4 " + (str6 == str4));
		System.out.println("obj comparison 6 and 5 " + (str6 == str5));
		
		String str7 = new String ("java");
		System.out.println("obj comparison 7 and 5 " + (str7 == str5));
		System.out.println("obj comparison 7 and 6 " + (str7 == str6));
		 
		 
		//string inbuilt method
		
		String str8 = "Java";
		System.out.println("string length() method : " + str8.length());
		
		//String is immutable that is why str8 will be same as it is
		// new string will create on str8.toLowerCase()
		System.out.println("string toLowerCase() method : " + str8.toLowerCase());
		System.out.println(str8);
		//now new lower case string is pointed by str8 and no one is referring to "Java"
		// new obj will create in heap
		str8 = str8.toLowerCase();
		System.out.println(str8);
		
		String str9 = "Python";
		System.out.println("string toUpperCase() method : " + str9.toUpperCase());
		
		String str10= "    Suman    ";
		System.out.println(str10);
		System.out.println(str10.length());
		System.out.println(str10.trim());
		System.out.println(str10.trim().length());
		
		String str11= "Switzerland";
		System.out.println(str11.substring(4));
		System.out.println(str11.substring(4,8));
		
		
		String str12= str11.replace('z', 'q');
		System.out.println(str11.replace('z','p'));
		System.out.println(str12);
		
		
		// string starts with and ends with and will give a boolean value
		String str13= "abcdefghijklmnopqrstuvwxyz.com";
		System.out.println(str13.startsWith("abc"));
		System.out.println(str13.startsWith("def",3));
		System.out.println(str13.endsWith("abc"));
		System.out.println(str13.endsWith("m"));
		System.out.println("***************");
		System.out.println(str13.startsWith("def",3));
		System.out.println(str13.endsWith("Abc"));
		
		System.out.println(str13.charAt(10)); // arrayOutOfBound exception if we use 100 here
		System.out.println(str13.indexOf("c"));
		System.out.println(str13.indexOf("c" , 4)); //will search char c after index 4
		System.out.println(str13.indexOf("9"));
		
		System.out.println(str13.lastIndexOf("c"));
		System.out.println(str13.lastIndexOf("c" , 20)); //searching backward starting at the specified index.
		
		String str14= "ghijklmnopqrstuvwxyz";
		System.out.println(str14.equals(str13));
		System.out.println(str14.equals(str14));
		//equal ignore case compares two strings by ignoring their cases
		System.out.println(str14.equalsIgnoreCase(str13));
		System.out.println(str14.compareTo(str13)>0);
		//contains
		System.out.println(str14.contains(str14));
		System.out.println(str14.contains(str13));
		System.out.println(str13.contains(str14));
		//concatination using method
		System.out.println(str14.concat(str13));
		//value of ----- convert different data types into a String
		System.out.println(str14.valueOf(str13));
		int a = 123456;
		System.out.println(str14.valueOf(a));
		//concat using + operator with diffrent data type also like string +12
		System.out.println(str14+a);
		System.out.println(str14 + str12);
		
		// Regular expressions
		
		String str15= "u";
		System.out.println(str15.matches("."));
		System.out.println(str14.matches(str15));
		String str16= "jklm";
		System.out.println(str16.matches("."));
		System.out.println(str15.matches("k"));
		System.out.println(str15.matches("[abc][k]"));
		String str17= "ak";
		System.out.println(str17.matches("[abc][k]"));
		System.out.println(str15.matches("[^abc]"));
		System.out.println(str15.matches("[a-z0-9]"));
		System.out.println(str16.matches("j|k"));
		System.out.println(str15.matches("k|u"));
		
		System.out.println(str15.matches("\\w"));   // takes only one letter to process and 
		System.out.println(str17.matches("\\w"));   // single slash is illegal so we use double slash
		System.out.println(str15.matches("\\d"));
		System.out.println(str15.matches("\\D"));
		System.out.println(str15.matches("\\s"));
		System.out.println(str15.matches("\\S"));
		System.out.println(str15.matches("\\W"));
		
		
		System.out.println(str16.matches(".*"));
		System.out.println(str16.matches(".+"));
		System.out.println(str16.matches(".?"));
		System.out.println(str16.matches(".X"));
		
		String str18= "aabbccddeeffgghh";
		System.out.println(str18.matches("[abc]{3}"));
		System.out.println(str18.matches("[abc]{1}"));
		
		String str19= "suman@gmail.com";
		System.out.println(str19.matches(".*gmail.*"));
		
		//student challenge
		String str20= "programmer@gmail.com";
		System.out.println(str20.matches("\\w.*[gmail.com]"));
		System.out.println("User name = " +str20.substring(0,10));
		System.out.println("Domain name = " +str20.substring(11));
		
		int q= 01010101011;
		String str21= String.valueOf(q);
		System.out.println(str21.matches("[01].*"));
		//hexadecimal means 0 to 9 digits and A to F letters
		String str22= "256ADF";
		System.out.println(str22.matches("[0-9A-F].*"));
		
		//date format
		String str23= "10/09/2026";
		System.out.println(str23.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"));
		
		String str24= "a!b@c#d$e%f^QGJIg&h*i?";
		System.out.println(str24.replaceAll("[^a-zA-Z0-9]" , ""));
		
		String str25= "abc     CDEG      HGJ    I   hu     ahs     ja";
		System.out.println(str25.replaceAll("\\s*  ", " ".trim()));
		String words[]= str25.split("\\s");
		
		System.out.println("helo %d world");
		int t=10;
		System.out.printf("helo %d world" , t);
		
	}
	 

}
