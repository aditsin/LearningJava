package main;

import java.util.*;

/*
* Author: Coding ninja
* Problem: Find pair of numbers whose sum equals 0
* Solution: Used HashMap store frequency and then find
* correspond positive number for -ve number calculate
* possible combination pair including repeating.
* */
public class PairSumZero {

    public static void PairSum(int[] input, int size) {

        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Print the desired output and don't return anything.
         * Taking input is handled automatically.
         */

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<input.length;i++){
            if(map.get(input[i]) == null){
                map.put(input[i], 1);
            }else{
                map.put(input[i], map.get(input[i])+1);
            }
        }

        for(int i=0;i<input.length;i++){
            if(input[i]<=0 && map.get(input[i]*-1) != null && map.get(input[i]) != 0){
                int p = (Integer)map.get(input[i]) * (Integer)map.get(input[i]*-1);
                for(int j=0;j<p;j++){
                    System.out.println(input[i]+" "+(-1*input[i]));
                }
                map.put(input[i], 0);
                map.put(-input[i], 0);
            }
        }

    }
}
