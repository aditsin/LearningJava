package main;

import java.util.Arrays;

public class Java8Features {

    public static void main(String [] args){

        /*
        * Find sum, average of array
        * */
        int [] arr = {5, 2, 3, 4, 6, 7, 1, 8, 9, 10};

        //parallel() will use multiple CPU cores to calculate sum, min, max, etc.
        //it will not guarantee to improve performance always/
        int sum = Arrays.stream(arr).parallel().sum();

        //orElse() is used in case array is empty
        double avg = Arrays.stream(arr).average().orElse(0);
        System.out.println("Sum: "+sum);
        System.out.println("Average: "+avg);

        //this can also be used to perform other tasks
        System.out.println(Arrays.stream(arr).max());
        System.out.println(Arrays.stream(arr).min());

    }
}
