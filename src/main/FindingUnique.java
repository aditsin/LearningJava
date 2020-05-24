package main;

import java.util.*;

/*
* Author: Aditya Kumar Singh
* Problem: Finds a number that appears only once in the array
*
* ********Findings************
* HashMap returns null if value is not present for the
* key.
* */
public class FindingUnique {

    public static int findUnique(int arr[]){

        HashMap<Integer, Integer> map = new HashMap<>();

        int ans = -1;
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i]) == null){
                map.put(arr[i], 1);
            }else{
                map.put(arr[i], map.get(arr[i])+1);
            }
        }
        Set set = map.entrySet();
        Iterator itr = set.iterator();

        while(itr.hasNext()){
            Map.Entry entry = (Map.Entry)itr.next();
            if((Integer)entry.getValue() == 1){
                ans = (Integer)entry.getKey();
            }
        }
        return ans;
    }
}
