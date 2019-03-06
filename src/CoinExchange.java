/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sree ram charan
 */
import java.util.Arrays;
public class CoinExchange {
    
   static int coinExchange(int []coins,int N,int M,int dp[][]){
   if(N==0)
       return 1;
   if(coins.length==0)
       return 0;
   if(N<0)
       return 0;
   if(dp[N][M]>=0)
       return dp[N][M];
   else
   {
   dp[N][M]=coinExchange(coins,N-coins[coins.length-1],coins.length,dp)+coinExchange(Arrays.copyOfRange(coins,0,coins.length-1),N,coins.length-1,dp);
   }
   
   return dp[N][M];
   }
    public static void main(String args[]){
    int[] coins={1,5,10};
    int N=12;
    int[][] dp=new int[N+1][coins.length+1];
   for(int t=0;t<dp.length;t++)
       Arrays.fill(dp[t],-1);
    System.out.println("No of ways of gving change is: "+coinExchange(coins,N,coins.length,dp));
    System.out.println("Memoization Array") ;
    for(int t=0;t<dp.length;t++){
      for(int t1=0;t1<dp[t].length;t1++)
    System.out.print(dp[t][t1]+" ");
      System.out.println();
      }

    }
}
