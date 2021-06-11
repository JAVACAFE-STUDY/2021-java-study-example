package com.javacafe.study.colection_more;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Immutable {
    public static void main(String[] args) {
        Store store = new Store("신라면", "초코파이", "사이다", "메로나");
        User user = new User();

        user.viewStore(store);
        System.out.println(store.findProduct("신라면"));

//        Collections.unmodifiableList()
//        Collections.unmodifiableSet()
    }


    static class Store {
        private final List<String> products;

        public Store(String... products) {
            this.products = Stream.of(products).collect(toList());
        }

        public List<String> getProducts() {
            return products;
        }

        public boolean findProduct(String product) {
            return products.contains("신라면");
        }
    }

    static class User {
        void viewStore(Store store) {
            store.getProducts().remove("신라면");
        }
    }
}
