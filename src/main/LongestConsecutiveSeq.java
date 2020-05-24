package main;

import java.util.*;

/*
* Author: Aditya, GFG
* Problem: Find the longest consecutive sequence
* in the array irrespective of order
*
* Solution:
* Store array in HashSet
* Iterate over elements
* Check if i is first element in sequence by checking arr[i]-1 is present in HashSet
* Find the sequence by checking for arr[i]+1 till sequence breaks
* finally use start and end of largest sequence.
*
* *********Findings**********
* HashSet: uses hashing to store values and its a set thus don't allows
* duplicate elements
* Methods:
* add(object e)
* contains(object e)
*
* Constant for largest and smallest value for Integer
* Integer.MAX_VALUE
* Integer.MIN_VALUE
*
* */
public class LongestConsecutiveSeq {

    public static ArrayList<Integer> longestConsecutiveSeq(int[] arr) {

        HashSet<Integer> map = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            map.add(arr[i]);
        }
        int maxSeq = Integer.MIN_VALUE;
        int fStart = arr[0];
        int fEnd = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int currSeq = 0;
            int start, end;
            if (!map.contains(arr[i] - 1)) {
                start = arr[i];
                end = arr[i] + 1;
                while (map.contains(end)) {
                    currSeq++;
                    end++;
                }
                if (currSeq > maxSeq) {
                    maxSeq = currSeq;
                    fStart = start;
                    fEnd = end;
                }
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = fStart; i < fEnd; i++) {
            ans.add(i);
        }

        return ans;
    }
}
