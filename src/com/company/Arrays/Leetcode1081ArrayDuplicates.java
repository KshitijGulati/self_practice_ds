package com.company.Arrays;

import java.util.Stack;

public class Leetcode1081ArrayDuplicates {

    public static void main(String[] args) {
        new Leetcode1081ArrayDuplicates().removeDuplicateCharacters("bcabc");
    }

    private String removeDuplicateCharacters(String s){
       int [] lastIndex= new int[26];
       for(int i =0 ; i< s.length(); i++){
           lastIndex[s.charAt(i)- 'a']= i;
       }
       boolean[] seen = new boolean[26];
        Stack<Integer> stack = new Stack<>();
        for (int i =0 ; i< s.length(); i++){
            int current = s.charAt(i)- 'a';
            if (seen[current])
                continue;
            while (!stack.isEmpty() && stack.peek()> current && i<lastIndex[stack.peek()])
                seen[stack.pop()] = false;
                stack.push(current);
                seen[current] = true;

        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()){
            stringBuilder.append((char)(stack.pop() + 'a'));
        }
        System.out.println(stringBuilder.reverse().toString());
        return stringBuilder.reverse().toString();
    }
}
