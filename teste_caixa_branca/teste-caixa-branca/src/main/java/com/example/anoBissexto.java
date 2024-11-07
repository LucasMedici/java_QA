package com.example;

public class anoBissexto {

    public static boolean isBissexto(int ano) {
        if (ano % 4 == 0) {
            if (ano % 100 == 0) {
                return ano % 400 == 0;
            }
            return true;
        }
        return false;
    }
}

