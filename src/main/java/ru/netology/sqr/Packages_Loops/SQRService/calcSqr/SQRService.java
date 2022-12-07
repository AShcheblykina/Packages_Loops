package ru.netology.sqr.Packages_Loops.SQRService.calcSqr;

public class SQRService {

    public int calcSqr(int x) {
        int bottomline = 400;
        int upperbound = 500;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= x)
                if (bottomline >= 400)
                    if (upperbound <= 500) {
                        return i;
                    }
        }
        return -1;
    }
}





