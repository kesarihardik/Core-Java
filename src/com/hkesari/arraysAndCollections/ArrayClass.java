package com.hkesari.arraysAndCollections;
import java.util.*;

//array doesn't come in collection framework
public class ArrayClass {
    public static void main(String[] args){
//        int [] arr = new int[5];
//        Arrays.fill(arr,2);
//        arr[3]=3;
//        System.out.println(arr.length);

         int [] arr = {4,3,2,1} ;
         Arrays.sort(arr);
        for(int i: arr)
         System.out.println(i) ;


        double[][] val = {{1,2},{3,2},{5,4}};


//        Comparator<double[]> custom = new Comparator<double[]>(){
//            @Override
//            public int compare(double[] val1, double[] val2){
//                return Double.compare(val2[1],val1[1]);
//            }
//        };
//
//        Arrays.sort(val,custom);
//

        // anonymous class
//        Arrays.sort(val, new Comparator<double[]>(){
//            @Override
//            public int compare(double[] val1, double[] val2){
//                return Double.compare(val2[1],val1[1]);
//            }
//        });

        //lambda
        Arrays.sort(val,(a,b)-> Double.compare(b[1],a[1])
        );



        for(double[] row : val){
            for(double x: row) {
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
