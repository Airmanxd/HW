package com.company;
import java.lang.Math;
public class Main {

    public static void main(String[] args) {
    double[] arr = new double[25];
    int i;
    double min = 1, max = 0, average = 0;
    for (i = 0; i < 25; i++) {
        arr[i] = Math.random();
        average += arr[i];
        if (arr[i] > max)
        max = arr[i];
        if (arr[i] < min)
        min = arr[i];
        System.out.println(arr[i]);
    }
    average /= 25;
    System.out.println("Minimum: " + min);
    System.out.println("Maximum: " + max);
    System.out.println("Average: " + average);

    }
}
