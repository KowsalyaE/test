import java.util.*;
import java.lang.*;
public class reverse
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
 String s1=s.next();
  StringBuffer s2= new StringBuffer();
  s2.append(s1);
  s2=s2.reverse(); 
  for (int i=0;i<s2.length();i++)
	{
	  System.out.print(s2.charAt(i)+" ");  
	}
String s3=s2.toString();
String out=s3.replaceAll("[aeiouAEIOU]","");
System.out.println(out);
}
}