package com.nariq;

import java.util.stream.IntStream;

public class ProjectEuler1 {
    public static void main(String[] args) {
        System.out.println(IntStream.range(1, 1000).filter(i -> i % 3 == 0 | i % 5 == 0).sum());
    }
}


