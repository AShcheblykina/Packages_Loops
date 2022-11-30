package ru.netology.sqr.Packages_Loops.SQRService.calcSqr;

public class SQRService {

    public int calcSqr(int x) {
        for (int i = 10; i <= x; i++) {
            if (i * i >= x) {
                return i;
            }
        }
        return -1;
    }
}



