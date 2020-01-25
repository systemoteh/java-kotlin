package java;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        dataTypes();            // типы данных
        controlStructures();    // управляющие конструкции
        loops();                // циклы
    }

    private static void dataTypes() {
        // default value
        // numeric
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

}
