package com.company.Howell;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("I");
        list.add("Need");
        list.add("Comments");
        System.out.println(list);
        System.out.println(list.get(1));

        Set<String> cities = new TreeSet<>();
        cities.add("Dayton");
        cities.add("Columbus");
        cities.add("Cleveland");
        cities.add("Columbus");//No duplicates aloud with Set
        System.out.println(cities);

        Map<Integer, String> funMap = new HashMap<>();
        funMap.put(9, "What");
        funMap.put(2, "If");
        funMap.put(3, "!");
        System.out.println(funMap);
        System.out.println(funMap.get(9));

    }
}