/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sree ram charan
 */
import java.util.*;
public class Min_Operations {
 
/* NOte--
   The problem is to find the minimum no of operations to be preformed to conver given no into 1 using followig operations
   operatioon 1: n=n-1;
   operatioon 2: if(n%2==0) n=n/2; i.e(if n is divisble by 2 n can be reduced to half of its present value)
   operatioon 3: if(n%3==0) n=n/3; i.e(if n is divisbible by 3 n can be reduced to one third of its resent value 
    
    */
public static void main(String a[]){
  
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number: ");
int n=sc.nextInt();
int arr[]=new int[n+1];
Arrays.fill(arr,-1);
arr[0]=0;
arr[1]=0;
System.out.println("The minimum number of steps to make n to 1 is : "+ minOperations(n,arr));        
}


public static int minOperations(int n,int arr[]){

int ans1,ans2,ans3;
for(int t=2;t<=n;t++){
ans1=1+arr[t-1];
ans2=Integer.MAX_VALUE;
ans3=Integer.MAX_VALUE;
if(t%2==0)
ans2=1+arr[t/2];
if(t%3==0)
ans3=1+arr[t/3];
arr[t]=ans1<ans2?ans1<ans3?ans1:ans3:ans2<ans3?ans2:ans3;
}
return arr[n];
}
}