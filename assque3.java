import java.util.*;
class Ass1que3
{
public static int[] intersection(int n,int[] arr,int[] arr1)
{
int k=0;
int arr3[]=new int[n];
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
if(arr[i]==arr1[j])
{
arr3[k]=arr[i];
k++;
break;
}
}
}
return arr3;
}
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int arr[]=new int[n];
int arr1[]=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
arr1[i]=sc.nextInt();
}
int out[]=printwave(n,arr,arr1);
for(int i=0;i<n;i++)
{
System.out.println(out[i]);
}
}
}