package com.company;

public class Main {

    public static void main(String[] args) {
        String[] strings = {"Computer", "Plate", "Chair", "Girl", "Boy"};
        startsC(strings);
        endsE(strings);
        fiveLetters(strings);
        containsЕ(strings);
        containТе(strings);
        histogram(strings);
    }

    static void startsC(String[] strings) {
        int cCount = 0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].startsWith("C")) {
                cCount++;
            }
        }
        System.out.println(cCount + " words start with the letter 'c'");
    }

    static void endsE(String[] strings) {
        int eEnds = 0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].endsWith("e")) {
                eEnds++;
            }
        }
        System.out.println(eEnds + " words end with the letter 'e'");
    }
    static void fiveLetters(String[] strings) {
        int five = 0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length()==5) {
                five++;
            }
        }
        System.out.println(five + " words consists of 5 letters");
    }
    static void containsЕ(String[] strings) {
        int e = 0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].contains("e")) {
                e++;
            }
        }
        System.out.println(e + " words contain the letter 'e' inside");
    }
    static void containТе(String[] strings) {
        int i = 0;
        if (strings[i].contains("te"))
            System.out.println("There are words that contain the letter combination 'te' inside");
        else
            System.out.println("There are no words that contain the letter combination 'te' inside");
    }

    static int lengthW(String[] strings){
        int lengths = 0;
        for (int i=0; i<strings.length; i++) {
            if (strings[i].length() > lengths){
                lengths = strings[i].length();
            }
        }
        return lengths;
    }

    static void histogram(String[] strings) {

        int count = 1;
        while (count <= lengthW(strings)) {
            int number = 0;
            for (int i=0; i<strings.length; i++) {
                if (strings[i].length() == count) {
                    number++;
                }
            }
            System.out.println(number + " words are " + count + " letters long");
            count++;
        }
    }

}
