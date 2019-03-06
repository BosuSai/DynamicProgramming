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
public class Fibonacci { 

/* Notes:
    There are actually 2^n function calss out of which only n of them ae unique so lot of repertions in brute process processs
    We are not comparmsing on space complexity
    in all the three cases space complexity is o(n);
    
/* Solution--1  Brute process    
static int fibonacci(int n){
    if(n==0||n==1)
        return n;
    else 
        return fibonacci(n-1)+fibonacci(n-2);
}
public static void main(String a[]){
    System.out.println("The fibonacci number is; "+fibonacci(10));       
}   
}
*/

    
/* Solution 2--Time complexity if o(n) but no so efficent, so we use iterative process.
public static void main(String a[]){
    
Scanner sc=new Scanner(System.in);
System.out.println("Enter the nth fibonacci number to be find in sequence");
int n=sc.nextInt();
long fib[]=new long[n+1];
Arrays.fill(fib,-1);
fib[0]=(long)0;
fib[1]=(long)1;  
long fib_val=DP_fibonacci(n,fib);
System.out.println("The fibonacci number is: "+fib_val);
}

static long DP_fibonacci(int n,long fib[]){
  
if(fib[n]!=-1)
    return fib[n];
else{
    fib[n]=DP_fibonacci(n-1,fib)+DP_fibonacci(n-2,fib);
    return fib[n];
}   
}
} */


/* Solution 3--Time complexity if o(n) and efficent as  ompared to above.
public static void main(String a[]){
    
Scanner sc=new Scanner(System.in);
System.out.println("Enter the nth fibonacci number to be find in sequence");
int n=sc.nextInt();
long fib[]=new long[n+1];
Arrays.fill(fib,-1);
fib[0]=(long)0;
fib[1]=(long)1;  
long fib_val=DP_fibonacci(n,fib);
System.out.println("The fibonacci number is: "+fib_val);
}

static long DP_fibonacci(int n,long fib[]){
  
for(int t=2;t<=n;t++){
    fib[t]=fib[t-1]+fib[t-2];
}   
return fib[n];
}   */

}
