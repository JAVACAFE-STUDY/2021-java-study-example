package com.javacafe.study.collection_api;

import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EqualsAndHashCodeSample {

    public static void main(String[] args) {
        Product a = new Product("신라면", 600);
        Product b = new Product("신라면", 600);

        // 두 객체의 내부값은 같으므로.. 동일하다고 보는게 맞음
        System.out.println(a.equals(b));

//        List<Integer> c = Arrays.asList(1,2,3);
//        List<Integer> d = Arrays.asList(1,2,3);
//
//        System.out.println(c.equals(d));
    }

    static class Product {
        private String name;
        private Integer price;

        public Product(String name, Integer price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public Integer getPrice() {
            return price;
        }
    }
}
