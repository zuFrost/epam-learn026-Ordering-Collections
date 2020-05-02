package com.zufrost.learn;

import java.util.TreeSet;

public class ComparableMain {
    public static void main(String[] args) {
        TreeSet<Person> set = new TreeSet<>();
        set.add(new Person(701, "Bob"));
        set.add(new Person(509, "Jack"));
        set.add(new Person(817, "Robin"));
        set.add(new Person(109, "Peter"));
//        set.add(new Person(701, "Bob"));
        System.out.println(set);
    }
}
