package ru.systemoteh.java;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        dataTypes();            // типы данных
        controlStructures();    // управляющие конструкции
        arrays();               // массивы
        loops();                // циклы
        collections();          // коллекции
        maps();                 // карты
    }

    private static void dataTypes() {

        byte var01 = 0;     // 8 bit { -128 .. 127 }
        short var02 = 0;    // 16 bit { -32768 .. 32767 }
        int var03 = 0;      // 32 bit { -2147483648 .. 2147483647 }
        long var04 = 0L;    // 64 bit { -9223372036854775808L .. 9223372036854775807L }
        float var05 = 0.0f;
        double var06 = 0.0d;

        boolean var07 = false;      // 8 bit { false/true }
        char var08 = '\u0000';      // 16 bit UTF-8 { '\u0000' .. '\uFFFF' } or { 0 .. 65535 }
        String anyObject = null;
    }

    private static void controlStructures() {

        int i = 10;
        if (i < 10) {
            // logic here
        }

        if (i < 10) {
            // logic here
        } else {
            // logic here
        }

        if (i < 10) {
            // logic here
        } else if (i > 10) {
            // logic here
        } else {
            // logic here
        }

        String ternary = i < 10 ? "Yes" : "No";

        switch (i) {
            case 1:
                i++;
                break;
            case 2:
                i--;
                break;
            case 3:
                ++i;
                break;
            default:
                --i;
        }
    }

    private static void arrays() {

        int[] ints = new int[3]; // size
        ints[0] = 1;
        ints[1] = 2;
        ints[2] = 3;

        String[] strings = {"one", "two", "three"};
        String three = strings[2];

        String printedArray = Arrays.toString(ints);

        char[][] chars = {{'a', 'b', 'c'}, {'d', 'e', 'f'}};
        chars[0][0] = 'A';
        chars[1][1] = 'E';
    }

    private static void loops() {

        for (int i = 0; i < 10; i++) {
            // logic here
        }

        for (Object obj : Collections.EMPTY_LIST) {
            // logic here
        }

        int i = 0;
        while (i < 10) {
            // logic here
            i++;
        }

        int j = 0;
        do {
            // logic here
            j++;
        }
        while (j < 10);
    }


    private static void collections() {

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("one");
        stringList.add("two");
        String elem = stringList.get(0);
        stringList.remove(0);
        stringList.clear();
        stringList.trimToSize();

        LinkedList<String> linkedList = new LinkedList<>(stringList);
        linkedList.add("three");
        linkedList.add("four");
        linkedList.removeFirstOccurrence("three");
        linkedList.removeLast();

        Set<Integer> integerSet = new HashSet<>();
    }

    private static void maps() {

        Map<String, Object> objectMap = new HashMap<>();
        objectMap.put("one", new Object());
        objectMap.put("two", new Object());
        Set<Map.Entry<String, Object>> entrySet = objectMap.entrySet();
        for (Map.Entry<String, Object> entry : entrySet) {
            String key = entry.getKey();
            Object value = entry.getValue();
        }

        SortedMap<String, Object> treeMap = new TreeMap<>();
        treeMap.put("First", new Object());
        treeMap.firstKey();
        treeMap.lastKey();
    }
}
