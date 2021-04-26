package org.iesfm.company;

import java.util.ArrayList;
import java.util.List;

public class ListUtils {

    public static <T> List<T> toList(T ... values) {
        List<T> list = new ArrayList<>();
        for(T value:values) {
            list.add(value);
        }
        return list;
    }

    public static <T> void print(List<T> list) {
        for (T v: list) {
            System.out.println(v);
        }
    }
}
