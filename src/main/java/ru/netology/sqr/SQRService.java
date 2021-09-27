package ru.netology.sqr;

public class SQRService {
    public int rootEnumerate(int lowLimit, int upLimit) {
        int rootNumber = 0;
        for (int i = 10; i <= 99; i++) {
            int square = i * i;
            if (square >= lowLimit && square <= upLimit) {
                rootNumber = rootNumber + 1;
                System.out.println(rootNumber);
            }
        }
        return rootNumber;
    }
}

