import java.util.*;
import java.lang.String;
import java.nio.CharBuffer;
public class Str {
  public static void main(String[] args)
  {
	  String s="Sumi Celine";
	  System.out.println("String s" + s);
	  String s1=new String("SumithaJohn");
	  System.out.println("String" + s1);
	 // int[] s3=new int[] {1,2,3}
	  //charBuffer
	  CharBuffer cbr= CharBuffer.allocate(100);
	  cbr.put('a');
	  cbr.put(2,'b');
	  System.out.println(Arrays.toString(cbr.array()));
	  
	  //string Methods
	  System.out.println("Length="+s.length());
	  System.out.println("Upper="+s.toUpperCase());
	  System.out.println("Lower="+s.toLowerCase());
	  System.out.println("concat=" +s.concat(s1));
	  System.out.println("Substring="+s.substring(2));
	  System.out.println("Sub="+s.substring(2,4));
	  System.out.println("CharAt="+s.charAt(3));
	  System.out.println("Indexof="+s.indexOf('i',2));
	  System.out.println("Equal="+"sumi".equals("sumi"));
	  System.out.println("Equal="+"sumi".equalsIgnoreCase("Sumi"));
	  System.out.println("Trim=" + s.trim());
	  
	  
	  //String Tokenizer
	  StringTokenizer s2= new StringTokenizer("Sumi:Celine:John","");
	  StringTokenizer s3= new StringTokenizer("Sumi:Celine:John",":");
	  StringTokenizer s4= new StringTokenizer("Sumi:Celine:John",":",false);
	  while(s2.hasMoreTokens())
		  System.out.println("Tokenizer=" + s2.nextToken() );
	  while(s3.hasMoreTokens())
		  System.out.println("Tokenizer=" + s3.nextToken() );
	  while(s4.hasMoreTokens())
		  System.out.println("Tokenizer=" + s4.nextToken() );	  
  }
}
