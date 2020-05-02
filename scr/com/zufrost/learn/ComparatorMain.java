package com.zufrost.learn;

import java.util.*;

public class ComparatorMain {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person(701, "Bob"));
        list.add(new Person(509, "Jack"));
        list.add(new Person(817, "Robin"));
        list.add(new Person(109, "Peter"));
//        set.add(new Person(701, "Bob"));
        System.out.println(list);
//        Collections.sort(list, new PersonNameComparator());
        list.sort(new Person.NameComparator());
        System.out.println(list);

    }
}
