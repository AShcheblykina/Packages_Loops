package ru.netology.sqr.Packages_Loops.SQRService.calcSqr;

public class SQRService {

    public int calcSqr(int bottomline, int upperbound) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            int iSquare = i * i;
            if (iSquare >= bottomline)
                if (iSquare <= upperbound) {
                    counter++;
                }
        }
        return counter;
    }
}





