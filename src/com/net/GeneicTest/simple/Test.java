package com.net.GeneicTest.simple;

import java.io.Serializable;
import java.nio.file.Watchable;
import java.util.Calendar;
import java.util.Collection;
import java.util.GregorianCalendar;

import static javafx.scene.input.KeyCode.T;

/**
 * Created by daidaijie on 2016/4/17.
 */
public class Test {
    public static void main(String[] args) {

//        Pair<String>[] table = new Pair<>[10];


        String[] words = {"Mary", "had", "a", "little", "lamb"};
        Pair<String> mm = ArrayAlg.minmax(words);
        System.out.println(mm.getClass().getName());
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());

        GregorianCalendar[] birthdays = {
                new GregorianCalendar(1906, Calendar.DECEMBER, 9),
                new GregorianCalendar(1815, Calendar.DECEMBER, 10),
                new GregorianCalendar(1903, Calendar.DECEMBER, 3),
                new GregorianCalendar(1910, Calendar.JUNE, 22),
        };

        Pair<GregorianCalendar> mm2 = ArrayAlg.minmax(birthdays);
        System.out.println("min = " + mm2.getFirst().getTime());
        System.out.println("max = " + mm2.getSecond().getTime());


    }


}

class ArrayAlg {
    static <T extends Comparable> Pair<T> minmax(T[] a) {
        if (a == null || a.length == 0) return null;
        T min = a[0];
        T max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min.compareTo(a[i]) > 0) min = a[i];
            if (max.compareTo(a[i]) < 0) max = a[i];
        }
        return new Pair<>(min, max);
    }

    @SafeVarargs
    public static <T> void addAll(Collection<T> coll, T... ts) {
        for (T t:ts) {
            coll.add(t);
        }
    }
}
