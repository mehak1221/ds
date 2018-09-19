import java.util.Scanner;
class Ass2que1
{
public static String reverse(String str)
{
String rev="";
int len=str.length();
for(int i=len-1;i>=0;i--)
{
rev=rev+str.charAt(i);;
}
return rev;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
String revstr=reverse(str);
if(str.equals(revstr)){
System.out.println("palindrome");}
else{
System.out.println("nt palindrome");}
}
}