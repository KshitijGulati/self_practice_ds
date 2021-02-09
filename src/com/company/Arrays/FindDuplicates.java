package com.company.Arrays;

public class FindDuplicates {

    public void hasDuplicates(int [] arrA){

        System.out.print("Array has duplicates ");
        for (int i = 0; i< arrA.length ; i++){
            if (arrA[Math.abs(arrA[i])] < 0){
                System.out.print(" " +Math.abs(arrA[i]));
            }else {
                arrA[Math.abs(arrA[i])]= arrA[Math.abs(arrA[i])]*-1;
            }
        }
    }

    public static void main(String[] args) {
        int[] input = {1,6,5,2,3,3,2};
        new FindDuplicates().hasDuplicates(input);

    }
}
