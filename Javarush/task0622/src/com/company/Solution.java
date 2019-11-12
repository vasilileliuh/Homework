package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arrayName = new int[5];
        for (int i = 0; i < 5; i++) {
            arrayName[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(arrayName);
        for (int i = 0; i < 5; i++) {
            System.out.println(arrayName[i]);
        }
    }
}
