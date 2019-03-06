/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sree ram charan
 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JavaConcepts {

    // Complete the getWays function below.
    static long getWays(long n, long[] c) {
    long[][] dp=new long[(int)n+1][c.length+1];
    for(int t=0;t<dp.length;t++)
       Arrays.fill(dp[t],-1);

    return coinExchange(c,n,c.length,dp);
    
    }
    static long coinExchange(long []coins,long N,int M,long dp[][]){
   if(N==0)
       return (long)1;
   if(coins.length==0)
       return (long)0;
   if(N<0)
       return (long)0;
   if((dp[(int)N][M]>=0))
       return dp[(int)N][M];
   else
   {
   dp[(int)N][M]=coinExchange(coins,N-coins[coins.length-1],coins.length,dp)+coinExchange(Arrays.copyOfRange(coins,0,coins.length-1),N,coins.length-1,dp);
   }
   
   return dp[(int)N][M];
   }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        long[] c = new long[m];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            long cItem = Long.parseLong(cItems[i]);
            c[i] = cItem;
        }

        // Print the number of ways of making change for 'n' units using coins having the values given by 'c'

        long ways = getWays(n, c);

        bufferedWriter.close();

        scanner.close();
    }
}
