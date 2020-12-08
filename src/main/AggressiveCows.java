package main;

import java.util.*;

/*
* Author: Aditya Kumar Singh
*
* Problem: given number of cows n and s stalls and an array
* arr[] that gives the position of the stalls find the minimum
* distance between the cows the should be as large as possible.
* example: n=3 s=5 arr={1, 2, 8, 4, 9}
* so if try to have min distance as 3 which is the answere here
* then cows can be arranged at
* 1, 4, 8 or 1, 4, 9
*
* Solution: find the distance between opposite end of the stalls
* 9 - 1 = 8;
* binary search in 0 to 8 and find value that allow all cows to fit
* but if we increase the value by 1 then they can't fit in.
*
* **************Findings***************
* finding the middle of two index don't subtract them before dividing by 2
* add them e.g. find middle between 3 and 7 => (3+7)/2 = 5
* */

public class AggressiveCows {

    public static int findDistance(int stalls, int cows, int []pos) {
        //this to check revert
        Arrays.sort(pos);

        int d = pos[stalls-1] - pos[0];

        int l = 0;
        int r = d;
        int middle = 0;
        while(l <= r){
            middle = (r + l)/2;
            if(isPossible(pos, middle, cows)){
                l=middle+1;
            }else{
                r = middle-1;
            }
        }

        //returning right side value 'r' because that's the value max that is possible.
        return r;

    }


    public static boolean isPossible(int [] pos, int d, int cows){
        int prev = pos[0];

        cows--;
        int j = 1;
        boolean ans = false;
        while(cows>0){
            if((pos[j]-prev)>=d){
                prev = pos[j];
                j++;
                cows--;
                if(cows == 0){
                    ans = true;
                    break;
                }else if(j>= pos.length && cows != 0){
                    ans = false;
                    break;
                }
            }else{
                j++;
                if(j >= pos.length && cows != 0){
                    ans = false;
                    break;
                }
            }
        }
        return ans;
    }
}
