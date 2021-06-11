package com.javacafe.study.colection_more;

import java.util.*;

public class PerformanceTest {
    public static void main(String[] args) throws InterruptedException {
        for (int idx = 0; idx < 100; idx++) {
            massiveAddArrayList();
//            massiveAddLinkedList();

            System.gc();
            Thread.sleep(50);
        }
    }

    private static void massiveAddArrayList() {
        long startTime = System.currentTimeMillis();
        List<Integer> a = new ArrayList<>();
        for (int idx = 0; idx < 1_000_000; idx++) {
            a.add(idx);
        }

        System.out.println("arrayList elapseTime : " + (System.currentTimeMillis() - startTime));
    }

    private static void massiveAddLinkedList() {
        long startTime = System.currentTimeMillis();
        List<Integer> a = new LinkedList<>();
        for (int idx = 0; idx < 1_000_000; idx++) {
            a.add(idx);
        }

        System.out.println("linkedList elapseTime : " + (System.currentTimeMillis() - startTime));
    }
}
