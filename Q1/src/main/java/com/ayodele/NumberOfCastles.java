package com.ayodele;

public class NumberOfCastles {

    public static int numberOfCastles(int[] stretchOfLands) {

        int totalNumOfCastle = 0;

        for(int index = 0; index < stretchOfLands.length; index++){
            int previousIndex = index - 1;
            int nextIndex = index + 1;

            if (index == 0 ||
                    (index == stretchOfLands.length - 1 &&
                            (stretchOfLands[previousIndex] < stretchOfLands[index]
                    || stretchOfLands[previousIndex] > stretchOfLands[index]))
                    ||  (nextIndex < stretchOfLands.length &&
                    (stretchOfLands[index] < stretchOfLands[nextIndex]
                            || stretchOfLands[index] > stretchOfLands[nextIndex] )) )
            {
                totalNumOfCastle++;
            }

        }
        return totalNumOfCastle;
    }

}
