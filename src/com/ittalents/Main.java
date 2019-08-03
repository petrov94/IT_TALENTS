package com.ittalents;
import java.util.Arrays;

public class Main {


    private static void printTable(byte n) {
        System.out.println(n);
        int initnum = --n;
        printRow((byte) n, (byte) (initnum));
        for (int i = 0; i < n; i++) {
            ++initnum;
            printRow(n, (byte) (++initnum));
        }
    }

    private static void printRow(byte times, byte numer) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= times; i++) {
            sb.append(numer);
        }
        System.out.println(sb.toString());
    }

    private static boolean isPrime(int num) {
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


    private static void printElha(int num) {

        for (int i = 0; i < num; i++) {
            if (i % 2 == 0) continue;
            int r = 0;
            for (; r <= (num - i) / 2; r++) {
                System.out.print(" ");
            }
            for (int l = 0; l < i; l++) {
                if (i != num - 1) {
                    if (l == 0 || l == i - 1)
                        System.out.print("*");
                    else System.out.print(" ");
                } else {
                    System.out.print("*");
                }

            }
            System.out.println();
        }

    }

    private static void printNotSequnceNum() {
        for (int i = 100; i < 1000; i++) {
            if ((i % 10) == (i / 10 % 10)) continue;
            else if ((i / 10 % 10) == (i / 100)) continue;
            else if ((i % 10) == (i / 100)) continue;
            else {
                System.out.println(i);
            }
        }
    }

    private static void printNumdevideby7(int num) {
        for (; num > 0; num--) {
            if (num % 7 == 0) System.out.println(num);
        }
    }

    private static void printsquare(int squareSide, char symbol) {
        for (int i = 0; i < squareSide; i++) {
            for (int j = 0; j < squareSide; j++) {
                if (i == 0 || i == squareSide - 1 || j == 0 || (j == squareSide - 1)) System.out.print("*");
                else System.out.print(symbol);
            }
            System.out.println();
        }
    }

    private static void devideProgram(float num) {
        while (num >= 2) {
            if ((int) num % 2 == 0) {
                num = num * (1f / 2f);
            } else {
                num = 3 * num + 1;
            }
            System.out.println((int) num);
        }
    }

    private static void squarePrint() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print((j + i) % 10 + " ");
            }
            System.out.println();
        }
    }

    public enum TypesCards {
        spatiq, karo, kupa, pika
    }

    private static void printTeste(int num) {
        int card = 0;
        int colour = 0;
        if (num > 13) {
            card = (num / 4) + 1;
            colour = num / 13;
        } else {
            card = num + 1;
            colour++;
        }
        for (; card < 14; card++) {
            for (int i = colour; i <= TypesCards.values().length; i++) {
                switch (card) {
                    case 10:
                        System.out.printf("%s %s", "Вале", TypesCards.values()[i - 1]);
                        break;
                    case 11:
                        System.out.printf("%s %s", "Дама", TypesCards.values()[i - 1]);
                        break;
                    case 12:
                        System.out.printf("%s %s", "Поп", TypesCards.values()[i - 1]);
                        break;
                    case 13:
                        System.out.printf("%s %s", "Асо", TypesCards.values()[i - 1]);
                        break;
                    default:
                        System.out.printf("%s %s", card, TypesCards.values()[i - 1]);
                        break;
                }
            }
            System.out.println();
            colour = 1;
        }

    }

    private static void printNumbers(int num) {
        int count = 1;
        while (count <= 10) {
            if (num % 2 == 0 || num % 3 == 0 || num % 5 == 0) {
                System.out.println(count + ":" + num);
                count++;
            }
            num++;
        }
    }

    private static void printMultiplyTable() {
        int i = 1;
        while (i < 10) {
            int j = 1;
            while (j < 10) {
                if (i <= j)
                    System.out.print(i + "*" + j + "  ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    private static boolean checkPolinom(int num) {
        int digit = num;
        int counter = 0;
        do {
            digit = digit / 10;
            counter++;
        } while (digit >= 1);
        int rightDigit = counter - 1;
        int leftDigit = 0;
        do {
            if ((int) ((num / Math.pow(10, rightDigit)) % 10) != (int) ((num / Math.pow(10, leftDigit)) % 10)) {
                System.out.println("NOT");
                return false;
            }
            rightDigit--;
            leftDigit++;
            counter--;
        } while (counter >= 0);
        System.out.println("VAJI");
        return true;
    }

    private static void print_Elha(int num) {
        for (int k = num; k >= 0; k--) {
            for (int j = 0; j <= (num - k) / 2; j++) System.out.print(" ");
            for (int i = 0; i <= k; i++) System.out.print("*");
            System.out.println();
        }
    }

    private static void fincMaxMinSalary() {
        int salaries[] = {15, 20, 11, 16, 17, 18, 19, 20, 21, 22};
        int max = 0, min = salaries[0];
        for (int i = 0; i < salaries.length; i++) {
            if (max < salaries[i]) max = salaries[i];
            if (min > salaries[i]) min = salaries[i];
        }
        System.out.println(max + "      " + min);

    }

    private static void temperature2() {
        int[] monthTemperature = {10, 10, 10, 10, 10, 10, 17, 18, 19, 20, 9, 9, 9, 9, 9, 9, 9, 25, 26, 27, 28, 29, 30, 11, 10, 9, 11, 38};
        int sum = 0;
        for (int i = 0; i < monthTemperature.length; i++) {
            sum += monthTemperature[i];
        }
        int averageTemp = sum / monthTemperature.length;

        int counter = 0, counter1 = 0, startIndex = 0, endIndex = 0, startIndex1 = 0, endIndex1 = 0;

        for (int i = 0; i < monthTemperature.length; i++) {
            if (monthTemperature[i] < averageTemp && monthTemperature[i] > monthTemperature[i + 1]) {
                if (i == 0 || startIndex == -1 || startIndex == 0) {
                    startIndex = i;
                }
                endIndex = i;
                counter++;
            } else {
                if (counter > counter1) {
                    startIndex1 = startIndex;
                    endIndex1 = endIndex;
                    counter1 = counter;
                    counter = 0;
                    if (i != (monthTemperature.length - 1))
                        startIndex = -1;
                }
            }
            if ((i == (monthTemperature.length - 1)) && (counter1 > counter)) {
                startIndex = startIndex1;
                endIndex = endIndex1;
            }
        }

        System.out.println("The most cold period of the month");
        for (int i = startIndex; i <= endIndex; i++) {
            System.out.println("Temperature of " + (i + 1) + " is " + monthTemperature[i]);
        }


    }

    private static void checkMirrorArray() {
        int arr[] = {4};
        for (int i = 0; i < arr.length; i++) {
            if (arr[(arr.length - 1 - i)] != arr[i]) {
                System.out.println("NOT");
                return;
            }
        }
        System.out.println("YES");
    }


    private static void temperature1() {
        int[] oldArray = {10, 10, 10, 10, 10, 10, 17, 18, 19, 20, 9, 9, 9, 9, 9, 9, 9, 25, 26, 27, 28, 29, 30, 11, 10, 9, 11, 38};
        for (int i = 0; i < oldArray.length; i++) {
            if (i == 0 || i == (oldArray.length - 1)) {
                System.out.println(oldArray[i]);
            } else
                System.out.println(oldArray[i - 1] + oldArray[i]);
        }
    }

    private static void temperature() {
        int[] monthTemperature = {10, 10, 10, 10, 10, 10, 10, 10, 17, 18, 19, 20, 5, 5, 5, 5, 5, 25, 26, 27, 28, 29, 30, 11, 10, 9, 11, 38};

        int counter = 0, counter1 = 0, startIndex = 0, endIndex = 0, startIndex1 = 0, endIndex1 = 0;
        boolean last = true;
        for (int i = 0; i < monthTemperature.length - 1; i++) {
            if (monthTemperature[i] == monthTemperature[i + 1]) {
                if (i == 0 || last == false) {
                    startIndex = i;
                    last = true;
                }
                endIndex = i;
                counter++;
            } else {
                if (counter > counter1) {
                    startIndex1 = startIndex;
                    endIndex1 = endIndex++;
                    counter1 = counter;
                    counter = 0;
                    last = false;
                }
            }
            if ((i == (monthTemperature.length - 2)) && (counter1 > counter)) {
                startIndex = startIndex1;
                endIndex = endIndex1;
            }
        }

        System.out.println("The most cold period of the month");
        for (int i = startIndex; i <= endIndex; i++) {
            System.out.println("Temperature of " + (i + 1) + " is " + monthTemperature[i]);
        }
    }

    private static void reverseArray() {
        int[] monthTemperature = {10, 10, 10, 10, 10, 10, 10, 10, 17, 18, 19, 20, 5, 5, 5, 5, 5, 25, 26, 27, 28, 29, 30, 11, 10, 9, 11, 38};

        for (int i = 0; i < (monthTemperature.length / 2); i++) {
            int temp = 0;
            temp = monthTemperature[i];
            monthTemperature[i] = monthTemperature[(monthTemperature.length - 1) - i];
            monthTemperature[(monthTemperature.length - 1) - i] = temp;
        }

        for (int i : monthTemperature) {
            System.out.print(i + ", ");
        }
    }

    private static void numCloseToAverage() {
        int[] monthTemperature = {1, 2, 3, 4, 5, 6, 7};
        int sum = 0;
        for (int i : monthTemperature) {
            sum += i;
        }
        int average = sum / monthTemperature.length;

        double[] arr2 = new double[monthTemperature.length];
        for (int i = 0; i < monthTemperature.length; i++) {
            arr2[i] = Math.abs(monthTemperature[i] - average);
        }
        double min = Double.MAX_VALUE;
        for (int i = 0; i < arr2.length; i++) {
            if (min > arr2[i]) {
                min = arr2[i];
            }
        }

        for (int i = 0; i < monthTemperature.length; i++) {
            if (arr2[i] == min) {
                System.out.println(monthTemperature[i]);
                break;
            }
        }
    }

    private static void switchNumbers() {
        int[] monthTemperature = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < monthTemperature.length; i++) {
            if (i == 0) {
                int temp = monthTemperature[i];
                monthTemperature[i] = monthTemperature[i + 1];
                monthTemperature[i + 1] = temp;
            } else if (i == 2) {
                monthTemperature[i + 1] = monthTemperature[i] + monthTemperature[i + 1];
                monthTemperature[i] = monthTemperature[i + 1] - monthTemperature[i];
                monthTemperature[i + 1] = monthTemperature[i + 1] - monthTemperature[i];
            } else if (i == 4) {
                monthTemperature[i + 1] = monthTemperature[i] * monthTemperature[i + 1];
                monthTemperature[i] = monthTemperature[i + 1] / monthTemperature[i];
                monthTemperature[i + 1] = monthTemperature[i + 1] / monthTemperature[i];
            }
        }
        for (int i : monthTemperature) {
            System.out.print(i);
        }
    }

    private static void findMaxSum() {
        double[] monthTemperature = {7.13, 0.2, 4.9, 5.1, 6.34, 1.12};
        for (int i = 0; i < 3; i++) {
            double max = monthTemperature[i];
            int counter = 0;
            for (int j = i + 1; j < monthTemperature.length; j++) {
                if (max < monthTemperature[j]) {
                    max = monthTemperature[j];
                    counter = 0;
                } else {
                    counter++;
                }
            }
            System.out.println(max);
            monthTemperature[monthTemperature.length - counter - 1] = 0;
        }
    }

    private static boolean checkZigZag() {
        int[] monthTemperature = {1, 3, 2, 4, 3, 7};
        for (int i = 1; i < monthTemperature.length; i += 2) {
            boolean check1 = false;
            if (monthTemperature[i - 1] < monthTemperature[i]) {
                check1 = true;
                if (i + 1 == monthTemperature.length) {
                    return check1;
                }
                if (monthTemperature[i] > monthTemperature[i + 1] && check1) {
                    continue;
                }
            } else {
                return false;
            }

        }
        return true;
    }

    private static void showDiagonal() {
        int[][] array = {{1, 4, 6, 3}, {5, 9, 7, 2}, {4, 8, 1, 9}, {2, 3, 4, 5}};
        int diagonal1[] = new int[4];
        int diagonal2[] = new int[4];
        int index1 = 0, index2 = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    diagonal1[index1] = array[i][j];
                    index1++;
                } else if (i == ((array[i].length - 1) - j)) {
                    diagonal2[index2] = array[i][j];
                    index2++;
                }
            }
        }

        for (int i : diagonal1) {
            System.out.print(" " + i);
        }
        System.out.println();
        for (int i : diagonal2) {
            System.out.print(" " + i);
        }
    }

    private static void rotateMatrix() {
        int[][] array = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int[][] newArray = new int[array.length][array[0].length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                newArray[i][j] = array[j][i];
            }
        }

        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[i].length; j++) {
                System.out.print(" " + newArray[i][newArray[i].length - 1 - j]);
            }
            System.out.println();
        }
    }

    private static void checkSum() {
        int[][] array = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int maxColumn = 0, maxRow = 0;
        for (int i = 0; i < array.length; i++) {
            int sum_column = 0;
            int sum_row = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum_row += array[i][j];
                sum_column += array[j][i];
            }
            if (maxRow < sum_row) {
                maxRow = sum_row;
            }
            if (maxColumn < sum_column) {
                maxColumn = sum_column;
            }
        }
        if (maxRow > maxColumn) {
            System.out.println(maxRow);
            System.out.println("Най-големия брой е в редовете");
        } else {
            System.out.println(maxColumn);
            System.out.println("Най-големия брой е в колоните");
        }
    }

    private static void allSums() {
        int[][] array = {{11, 12, 13, 14, 15, 16}, {21, 22, 23, 24, 25, 26}, {31, 32, 33, 34, 35, 36}, {41, 42, 43, 44, 45, 46}, {51, 52, 53, 54, 55, 56}, {61, 62, 63, 64, 65, 66}};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            int sum_row = 0;
            if (i % 2 != 0) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print("  " + array[i][j]);
                    sum_row += array[i][j];
                    sum += array[i][j];
                }
                System.out.println("Сумата е " + sum_row);
            }
        }
        System.out.println("Сума на елементите " + sum);
    }

    private static void sumOddNums() {
        int[][] array = {{11, 12, 13, 14, 15, 16}, {21, 22, 23, 24, 25, 26}, {31, 32, 33, 34, 35, 36}, {41, 42, 43, 44, 45, 46}, {51, 52, 53, 54, 55, 56}, {61, 62, 63, 64, 65, 66}};
        int sumFinal = 0;
        int sum = 0;
        for (int i = 0; i < 36; i++) {
            if (i % 6 == 0) {
                System.out.println("Сумата от елементите на реда е " + sum);
                sumFinal += sum;
                sum = 0;
            }
            if (((i / 6) + (i % 6)) % 2 == 0) {
                sum += array[i / 6][i % 6];
                System.out.print(array[i / 6][i % 6] + ", ");
            } else if (!(i % 6 == 0)) {
                System.out.print(",");
            }
        }
        System.out.println("Сума на елементите: " + sumFinal);
    }

    private static void maxRowSum() {
        int[][] array = {{11, 12, 13, 14, 15, 16}, {21, 22, 23, 24, 25, 26}, {31, 32, 33, 34, 35, 36}, {41, 42, 43, 44, 45, 46}, {51, 52, 53, 54, 55, 56}, {61, 62, 63, 64, 65, 66}};
        int maxSum = 0, sumRow = 0, row = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sumRow += array[i][j];
            }
            if (sumRow > maxSum) row = i;
        }

        System.out.println("Max sum is at line " + row);
    }

    private static void printNumbersUnderMainDia() {
        boolean[][] array = {{false, false, false, false, false, true}, {false, false, false, false, true, true}, {false, false, false, true, true, true}, {false, false, true, true, true, true}, {false, true, true, true, true, true}, {true, true, true, true, true, true}};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i < array[i].length - 1 - j && array[i][j] == true) {
                    System.out.println("There is a true value");
                    return;
                }
            }
        }
        System.out.println("There isn't a true value");
    }

    private static void tryArray() {
        int[][] array = {{11, 12, 13, 14, 15, 16}, {21, 22, 23, 24, 25, 26}, {31, 32, 33, 34, 35, 36}, {41, 42, 43, 44, 45, 46}, {51, 52, 53, 54, 55, 56}, {61, 62, 63, 64, 65, 66}};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i > array[i].length - 1 - j) {
                    System.out.print(array[i][j] + ",");
                } else {
                    System.out.print("  ,");
                }
            }
            System.out.println();
        }
    }

    private static void maxSubSquare() {
        int[][] array = {{11, 12, 13, 14, 15, 16}, {21, 22, 23, 24, 25, 26}, {31, 32, 33, 34, 35, 36}, {41, 42, 43, 44, 45, 46}, {51, 52, 53, 54, 55, 56}};
        int maxSum = 0, iindex = 0, jindex = 0;
        int arrayLength = -2;
        if (array.length % 2 == 0) {

        }
        for (int i = 0; i < array.length - 1; i++) {
            int squareSum = 0;
            for (int j = 0; j < array[i].length - 1; j++) {
                squareSum = array[i][j] + array[i][j + 1] + array[i + 1][j] + array[i + 1][j + 1];
                if (squareSum > maxSum) {
                    maxSum = squareSum;
                    iindex = i;
                    jindex = j;
                }
            }
        }

        System.out.println(array[iindex][jindex] + ", " + array[iindex][jindex + 1]);
        System.out.println(array[iindex + 1][jindex] + ", " + array[iindex + 1][jindex + 1]);
    }

    private static void findDuplicateValues() {
        int[] monthTemperature = {1, 3, 2, 4, 3, 7};
        int numberOfEqual = 1;
        for (int i = 0; i < monthTemperature.length - 1; i++) {
            for (int j = i + 1; j < monthTemperature.length; j++) {
                if (monthTemperature[i] == monthTemperature[j]) {
                    System.out.println("Duplicate value is " + monthTemperature[i]);
                    monthTemperature[i] = 0;
                    monthTemperature[j] = 0;
                    numberOfEqual++;
                }
            }
        }
        int[] result = new int[monthTemperature.length - numberOfEqual];
        int k = 0;
        for (int i = 0; i < monthTemperature.length; i++) {
            if (monthTemperature[i] != 0) {
                result[k] = monthTemperature[i];
                k++;
            }
        }

        for (int i : result) {
            System.out.print(i + ", ");
        }

    }

    private static void findSecondMaxElement() {
        int[] monthTemperature = {1, 3, 2, 4, 3, 7};
        int max1 = 0, max2 = 0;
        for (int i = 0; i < monthTemperature.length; i++) {
            if (max2 < monthTemperature[i]) {
                max2 = monthTemperature[i];
                if (max2 > max1) {
                    int temp = max1;
                    max1 = max2;
                    max2 = temp;
                }
            }
        }

        System.out.println(max1 + " " + max2);
    }

    private static void findSecondMinElement() {
        int[] monthTemperature = {1, 3, 2, 4, 3, 7};
        int max1 = Integer.MAX_VALUE, max2 = Integer.MAX_VALUE;
        for (int i = 0; i < monthTemperature.length; i++) {
            if (monthTemperature[i] < max2) {
                max2 = monthTemperature[i];
                if (max2 < max1) {
                    int temp = max1;
                    max1 = max2;
                    max2 = temp;
                }
            }
        }

        System.out.println(max1 + " " + max2);
    }

    private static void printAccurances() {
        int[] array = {5, 10, 2, 5, 50, 5, 10, 1, 2, 2};

//        for(int i=0;i<array.length;i++){
//            int counter=1,number=array[i];
//            for (int j = i+1;j<array.length;j++){
//                if(number==array[j]&&number!=0){
//                    counter++;
//                    array[j]=0;
//                    array[i]=0;
//                }
//            }
//
//            System.out.println(number!=0?"Occurance of " + number + " is " + counter:"");
//        }

        int index = 0;
        do {
            int counter = 1;
            for (int j = index + 1; j < array.length; j++) {
                if (array[index] == array[j]) {
                    int temp = array[j];
                    array[j] = array[index + counter];
                    array[index + counter] = temp;
                    counter++;
                }
            }
            System.out.printf("Frequency of %d = %d\n", array[index], counter);
            index += counter;
        } while (index < array.length);
        System.out.println();
        for (int i : array) {
            System.out.print(i + ", ");
        }
    }

    private static void diagonalMatrix() {
        int[][] array = new int[4][5];
        int number = 1;
        for (int i = 0; i < array.length; i++) {
            int iteration = 0, row = i;
            while (row >= 0) {
                array[row][iteration] = number;
                number++;
                row--;
                iteration++;
            }

        }

        for (int i = 0; i < array.length; i++) {
            int iteration = i + 1, row = array.length - 1;
            while (iteration <= 4) {
                array[row][iteration] = number;
                number++;
                row--;
                iteration++;
            }

        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + ",");
            }
            System.out.println();
        }
    }

    private static void multiplyMatrix() {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        int result[][] = new int[3][3];

        for (int k = 0; k < matrix1.length; k++) {
            for (int i = 0; i < matrix1.length; i++) {
                int sum = 0;
                for (int j = 0; j < matrix1[i].length; j++) {
                    sum += matrix1[k][j] * matrix2[j][i];
                }
                result[k][i] = sum;
            }

        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + ", ");
            }
            System.out.println();
        }
    }

    private static void sumOfSecondDiagonal() {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = 0;
        for (int i = 0; i < matrix1.length; i++) {
            sum += matrix1[i][matrix1.length - 1 - 1];
        }
    }

    private static void sumColumnRows() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < matrix.length; i++) {
            int sumRow = 0;
            int sumColumn = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sumRow += matrix[i][j];
                sumColumn += matrix[j][i];
            }
            System.out.printf("The sum of row %d is %d\n", i + 1, sumRow);
            System.out.printf("The sum of column %d is %d\n", i + 1, sumColumn);
        }
    }


    private static void changeDiagonalValues() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < matrix.length; i++) {
            int temp = matrix[i][i];
            matrix[i][i] = matrix[i][matrix.length - 1 - i];
            matrix[i][matrix.length - 1 - i] = temp;
        }
    }

    private static void checkUpperTriangularMatrix() {
        int[][] matrix = {{1, 2}, {0, 4}};

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i > j && matrix[i][j] != 0) {
                    System.out.println("NOT");
                    return;
                }
            }
        }
        System.out.println("YES");
    }

    private static void checkLowerTriangularMatrix() {
        int[][] matrix = {{1, 0, 0}, {4, 5, 0}, {7, 8, 9}};

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i < j && matrix[i][j] != 0) {
                    System.out.println("NOT");
                    return;
                }
            }
        }
        System.out.println("YES");
    }

    private static void transposeMatrix() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix1 = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix1[i][j] = matrix[j][i];
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix1[i][j] + ", ");
            }
            System.out.println();
        }

    }

    private static void fibonaci(int n) {
        int num = 0, previous = 1;
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == 1) {
                num = 1;
                continue;
            }
            num = num + previous;
            previous = num - previous;
        }
        System.out.println(num);
    }


    //STRINGS
    private static void swapStrings(String str1, String str2) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder1 = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            stringBuilder.append(str2.charAt(i));
            stringBuilder1.append(str1.charAt(i));
        }
        stringBuilder.append(str1.substring(5, str1.length()));
        stringBuilder1.append(str2.substring(5, str2.length()));

        if (stringBuilder.length() > stringBuilder1.length()) {
            System.out.println(stringBuilder.length() + " " + stringBuilder.toString());
        } else {
            System.out.println(stringBuilder1.length() + " " + stringBuilder1.toString());
        }
    }


    private static void printStrngs(String s1, String s2) {
        int index = -1;
        for (int i = 0; i < s1.length(); i++) {
            int currentIndex = s2.indexOf(s1.charAt(i));
            if (currentIndex > 0) {
                index = currentIndex;
                break;
            }
        }

        if (index == -1) {
            System.out.println("The two strings there are not equal characters");
        }
        int indexOfS1 = s1.indexOf(s2.charAt(index));
        for (int i = 0; i < s2.length(); i++) {
            if (index == i) {
                for (int j = 0; j < s1.length(); j++) {
                    System.out.print(s1.charAt(j) + " ");
                }
                System.out.println();
            } else {
                for (int j = 0; j < indexOfS1; j++) {
                    System.out.print(" ");
                }
                System.out.print(s2.charAt(i));
                System.out.println();
            }
        }
    }

    private static void Sum(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); ) {
            if (str.charAt(i) == '-' || Character.isDigit(str.charAt(i))) {
                StringBuilder number = new StringBuilder();
                if (str.charAt(i) == '-') {
                    number.append(str.charAt(i));
                    i++;
                }
                while (i < str.length() && Character.isDigit(str.charAt(i))) {
                    number.append(str.charAt(i));
                    i++;
                }
                sum += Integer.parseInt(number.toString());
            } else
                i++;
        }

        System.out.println("The total amount is " + sum);

    }

    private static int fibunaciRecursion(int n) {

        if (n == 1) return 0;
        if (n == 2) return 1;
        return fibunaciRecursion(n - 1) + fibunaciRecursion(n - 2);
    }

    private static void findMaxElementArray(int[] array, int index, int maxelement) {
        if (index == array.length) {
            System.out.println(maxelement);
            return;
        }
        if (array[index] > maxelement) {
            maxelement = array[index];
        }
        findMaxElementArray(array, ++index, maxelement);
    }

    private static void createMultiplicationBySum(int number, int step) {
        int power = 0;
        for (int i = 0; i < step; i++) {
            for (int j = 0; j < number; j++) {
                power += number;
            }
        }
        System.out.println(power);
    }


    private static int multiplicationRecursion(int number1, int number2) {
        if (number1 == 0) return 0;

        return number2 + multiplicationRecursion(--number1, number2);
    }

    private static void printNumbers(int startnumber, int lastnumber, int currentrow) {
        if (currentrow == lastnumber) {
            printRow(lastnumber, startnumber);
            return;
        }
        printRow(currentrow, startnumber);
        ++currentrow;
        System.out.println();
        printNumbers(startnumber, lastnumber, currentrow);
    }

    private static void printRow(int lastnumber, int currentrow) {
        if (currentrow == lastnumber) {
            System.out.print(currentrow);
            return;
        }
        System.out.print(currentrow);
        printRow(lastnumber, ++currentrow);
    }

    private static void printRserveNumber(int num) {
        if (num != 0) {
            System.out.print(num % 10);
            printRserveNumber(num / 10);
        } else return;

    }

    private static int powerNumberWithRec(int number, int step) {
        if (step == 1) {
            return number;
        }
        return powerNumberWithRec(number, --step) + multiplicationRecursion(number, number);
    }

    private static void printMatrix(int start, int current, int max) {
        if (current > max) {
            return;
        }
        printRowRecursively(start, current);
        printMatrix(start, current + 1, max);
    }

    private static void printRowRecursively(int current, int max) {
        if (current >= max) {
            System.out.print(current);
            System.out.println();
            return;
        }
        System.out.print(current + " ");
        printRowRecursively(current + 1, max);
    }

    private static void miracleNumber(int originalone, int tempnumber, int reverse) {
        if (tempnumber == 0) {
            if (originalone == reverse) {
                System.out.println("The number is polydrom." + reverse);
            }
            return;
        }
        reverse = reverse * 10 + tempnumber % 10;
        miracleNumber(originalone, tempnumber / 10, reverse);
    }


    private static void revertSentance(String str) {
        String[] arr = str.split(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i].replace(".", ""));
            if (i != 0) {
                System.out.print(" ");
            }
        }
    }

    private static void checkMaxChar(String str) {
        char ch = 0, ch1 = 0;
        int count = 0, count1 = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == ' ') break;
                if (str.charAt(i) == str.charAt(j)) {
                    ch = str.charAt(i);
                    count++;
                }
                if (j == str.length() - 1) {
                    if (count1 < count) {
                        count1 = count;
                        ch1 = ch;
                    }
                    count = 0;
                    ch = 0;
                }
            }
        }

        System.out.println("Max occurance is " + count1 + " of character " + ch1);
    }

    private static void checkMinChar(String str) {
        char ch = 0, ch1 = 0;
        int count = 0, count1 = Integer.MAX_VALUE;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == ' ') break;
                if (str.charAt(i) == str.charAt(j)) {
                    ch = str.charAt(i);
                    count++;
                }
                if (j == str.length() - 1) {
                    if (count > 0 && count1 > count) {
                        count1 = count;
                        ch1 = ch;
                    }
                    count = 0;
                    ch = 0;
                }
            }
        }

        System.out.println("MIN occurance is " + count1 + " of character " + ch1);
    }


    private static void findMaxElement(int arr[][], int max, int row, int column) {

        if (arr[row][column] > max) {
            max = arr[row][column];
        }

        if (row == arr.length - 1 && column == arr[0].length - 1) {
            System.out.println(max);
            return;
        }

        if (column == arr[0].length - 1) {
            findMaxElement(arr, max, row + 1, 0);
        } else {
            findMaxElement(arr, max, row, column + 1);
        }
    }

    //SELECTIONSORT
    private static int[] selectionSort(int arr[]) {
        for (int i = 0; i < arr.length / 2; i++) {
            int min = arr[i], minindex = i, max = arr[i], maxIndex = i;
            boolean changemin = false, changemax = false;
            for (int j = i + 1; j < arr.length - i; j++) {
                if (min > arr[j]) {
                    changemin = true;
                    min = arr[j];
                    minindex = j;
                }
                if (max < arr[j]) {
                    changemax = true;
                    max = arr[j];
                    maxIndex = j;
                }
            }
            if (changemin) {
                int temp = arr[i];
                arr[i] = min;
                arr[minindex] = temp;
            }
            //optimization
            if (changemax) {
                int temp = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = max;
                arr[maxIndex] = temp;
            }
        }
        return arr;
    }

    private static int[] countingSort(int arr[]) {
        int maxElement = Integer.MIN_VALUE;
        for (int element : arr) {
            maxElement = maxElement < element ? element : maxElement;
        }
        int helper[] = new int[maxElement + 1];
        for (int i = 0; i < arr.length; i++) {
            helper[arr[i]]++;
        }
        int index = 0;
        for (int i = 0; i < helper.length; i++) {
            while (helper[i] > 0) {
                arr[index] = i;
                helper[i]--;
                index++;
            }
        }
        return arr;
    }

    private static void binarySearch(int arr[], int number, int startposition, int endposition) {
        if (startposition > endposition) {
            System.out.println("There is no such element.");
            return;
        }
        int midIndex = (endposition + startposition) / 2;
        if (number == arr[midIndex]) {
            System.out.println("index " + midIndex + " value " + arr[midIndex]);
            return;
        }
        if (number > arr[midIndex]) binarySearch(arr, number, midIndex + 1, endposition);
        else if (number < arr[midIndex]) binarySearch(arr, number, startposition, midIndex - 1);
    }

    private static int partition(int arr[], int start, int end) {
        int pivot = arr[end], index = start;
        for (int i = start; i < end; i++) {
            if (arr[i] < pivot) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
        }
        int temp = arr[index];
        arr[index] = arr[end];
        arr[end] = temp;
        return index;
    }

    private static void quicksort(int arr[], int start, int end) {
        if (start > end) {
            return;
        }
        int index = partition(arr, start, end);
        quicksort(arr, start, index - 1);
        quicksort(arr, index + 1, end);
    }

    private static int[] bubblesort(int arr[]) {
        boolean sorted = true;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                count++;
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    sorted = false;
                }
            }
            System.out.println(Arrays.toString(arr));
            if (sorted == true) {
                return arr;
            }
        }
        System.out.println(count);
        return arr;
    }

    private static int[] bubblesortoptimization(int arr[]) {
        boolean issorted = false;
        int iteration = 0;
        while (issorted == false) {
            issorted = true;
            for (int j = 0; j < arr.length - iteration - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    issorted = false;
                }
            }
            iteration++;
        }
        return arr;
    }

    private static int[] selectionSortCheck(int arr[]) {
        int min = Integer.MAX_VALUE, index = 0, indexmax = 0, max = Integer.MIN_VALUE;
        boolean swap = false, swapmax = false;
        for (int i = 0; i < arr.length / 2; i++) {
            for (int j = i; j < arr.length - i; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    index = j;
                    swap = true;
                }
                if (max < arr[j]) {
                    max = arr[j];
                    indexmax = j;
                    swapmax = true;
                }
            }
            if (swap) {
                int temp = arr[i];
                arr[i] = min;
                arr[index] = temp;
                index = 0;
                min = Integer.MAX_VALUE;
                swap = false;
            }
            if (swapmax) {
                int temp = arr[(arr.length - 1) - i];
                arr[(arr.length - 1) - i] = max;
                arr[indexmax] = temp;
                indexmax = arr.length - 1;
                max = Integer.MIN_VALUE;
                swapmax = false;
            }
        }
        return arr;
    }

    private static int binarySearchCheck(int arr[], int element, int start, int end) {
        if (start > end) {
            System.out.println("There is no such element");
            return -1;
        } else if (element == arr[(((start + end) / 2))]) {
            System.out.println("Element was found index " + (((start + end) / 2)));
            return (start + end) / 2;
        }

        return element > arr[((start + end) / 2)] ? binarySearchCheck(arr, element, ((start + end) / 2) + 1, end) : binarySearchCheck(arr, element, 0, ((start + end) / 2) - 1);
    }

    private static int[] quickSortCheck(int[] arr, int start, int end) {
        if (start > end) {
            return arr;
        }
        int index = partitioncheck(arr, start, end);
        quickSortCheck(arr, start, index - 1);
        quickSortCheck(arr, index + 1, end);
        return arr;
    }

    private static int partitioncheck(int[] arr, int start, int end) {
        int pivot = arr[end], index = start;
        for (int i = start; i < end; i++) {
            if (arr[i] <= pivot) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
        }
        int temp = arr[index];
        arr[index] = arr[end];
        arr[end] = temp;
        return index;
    }

    private static int[][] bubblesortMatrix(int arr[][], int row) {
        if (row > arr.length - 1) {
            return arr;
        }
        bubblesortIteration(arr, 0, 0);
        bubblesortMatrix(arr, row + 1);
        return arr;
    }

    private static int[][] bubblesortIteration(int arr[][], int column, int row) {
        if (column < arr[row].length - 1) {
            if (row < arr.length) {
                bubblesortRecursion(arr, column, row, column + 1, row);
                bubblesortIteration(arr, column + 1, row);
            }
        } else {
            if (row < arr.length - 1) {
                bubblesortRecursion(arr, column, row, 0, ++row);
                column = 0;
                bubblesortIteration(arr, column, row);
            }
        }
        return arr;
    }

    private static void bubblesortRecursion(int arr[][], int column, int row, int column2, int row2) {
        if (arr[row][column] > arr[row2][column2]) {
            int temp = arr[row][column];
            arr[row][column] = arr[row2][column2];
            arr[row2][column2] = temp;
        }
    }

    private static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void countMaxSubArray(int[] arr) {
        int countBlocks = 0, countCurrentBlock = 0, countMaxBlock = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                countCurrentBlock++;
            } else if (countCurrentBlock > 0) {
                countCurrentBlock++;
                countBlocks++;
                if (countMaxBlock < countCurrentBlock) {
                    countMaxBlock = countCurrentBlock;
                }
                countCurrentBlock = 0;
            }
        }

        System.out.println("Най-дългата площадка е: " + countMaxBlock + "елемента. Брой на площадките: " + countBlocks);
    }

    private static void isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println("Array is not sorted. on positions " + i + " and " + (i + 1));
            }
        }
    }

    private static int BinarySeach(int[] arr, int element, int start, int end) {
        if (start > end) {
            System.out.println("There is no such elemnt");
            return -1;
        }
        int currentIndex = (start + end) / 2;
        if (arr[currentIndex]<=element && arr[currentIndex+1]>=element) {
            return currentIndex+1;
        } else if (element < arr[currentIndex]) {
            return BinarySeach(arr, element, start, currentIndex - 1);
        } else {
            return BinarySeach(arr, element, currentIndex + 1, end);
        }
    }

    private static int [] addNewElement(int arr[],int element){
        int [] arr2 = new int [arr.length+1];
        int index = BinarySeach(arr,element,0,arr.length-1);
        for(int i=0; i<arr.length;i++){
            if(i<index){
                arr2[i]=arr[i];
            }else if(i==index){
                arr2[index]=element;
                arr2[index+1]=arr[i];
            }else {
                arr2[i+1]=arr[i];
            }
        }
        return arr2;
    }

    private static int [] addNewElementRecursively(int arr[],int element){
        int [] arr2 = new int [arr.length+1];
        int index = BinarySeach(arr,element,0,arr.length-1);
        addNewElement(arr2,arr,element,index,0);
        return arr2;
    }

    private static void addNewElement(int [] arr2, int [] arr,int element,int index, int currentIndex){
        if(currentIndex==arr2.length){
            return;
        }
        if(currentIndex<index){
            arr2[currentIndex]=arr[currentIndex];
        }else if(currentIndex==index){
            arr2[index]=element;
        }else {
            arr2[currentIndex]=arr[currentIndex-1];
        }
        addNewElement(arr2,arr,element,index,currentIndex+1);
    }

    private static void reverseNumber(int number) {
        if(number==0) return;
        System.out.print(number % 10);
        reverseNumber(number / 10);

    }

    private static void palindrom(int number){
        int digits = digits(number,0);
        if(checkDigits(number,digits,0)){
            System.out.println("Number is palindrom");
        }else {
            System.out.println("Number is not palindrom");
        }
    }

    private static int digits(int number,int count){
        if(number==0)return count;
        count++;
        return digits(number/10,count);
    }

    private static boolean checkDigits(int number, int digits,int iteration){
        if((digits/2)>=iteration){
            if(((int)(number/Math.pow(10,(digits-1)))%10)!=(((int)(number/Math.pow(10,iteration)))%10)){
                return false;
            }
        }else if((digits/2)<iteration) {
            return true;
        }
        return checkDigits(number,digits-1,iteration+1);
    }

    private static int calculateNumberSum(int number,int sum){
        if(number==0){
            return sum;
        }
        return calculateNumberSum(number/10,sum+(number%10));
    }

    private static int factorial(int factorial){
        if(factorial==0){
            return 1;
        }
        return factorial*factorial(--factorial);
    }

    private static int nNumberOfFibonacci(int i){
        if(i==0){
            return 0;
        }else if(i==1){
            return 1;
        }else{
            return nNumberOfFibonacci(i - 1) + nNumberOfFibonacci(i - 2);
        }
    }

    private static int nNumberOfFibonacciNotRecursively(int i){
        int number1=0,number2=1,number=0;
        for(int j=i; j>=2;j--){
            number=number1+number2;
            number1=number2;
            number2=number;
        }
        return number;
    }

    private static void printArray(int arr[],int currentIndex){
        if(currentIndex==arr.length){
            return;
        }
        System.out.print(arr[currentIndex]);
        printArray(arr,currentIndex+1);
    }

    private static void sumArray(int arr[],int sum,int currentIndex){
        if(currentIndex==arr.length){
            System.out.println(sum);
            return;
        }
        sumArray(arr,sum+arr[currentIndex],currentIndex+1);
    }

    private static void findMinMaxArray(int arr[], int minElement, int maxElement,int currentIndex){
        if(currentIndex==arr.length){
            System.out.println("Min "+ minElement + " Max "+ maxElement);
            return;
        }
        findMinMaxArray(arr,minElement>arr[currentIndex]? arr[currentIndex] : minElement,maxElement<arr[currentIndex]? arr[currentIndex] : maxElement,currentIndex+1);
    }

    private static int [] reverArrayRecursively(int arr[],int currentIndex){
        if(currentIndex==(arr.length/2)){
            return arr;
        }

        int temp = arr[currentIndex];
        arr[currentIndex] = arr[arr.length-1-currentIndex];
        arr[arr.length-1-currentIndex]=temp;
        return reverArrayRecursively(arr,currentIndex+1);
    }

    private static void findMostDublicatedNumber(int arr[],int currentIndex,int maxOccurances, int number){
        if(currentIndex==arr.length){
            System.out.println("Maxoccurrences " + maxOccurances + " of element "+number);
            return;
        }

        int tempmaxOccurances=occurencesOfSpecificNumber(arr,currentIndex+1,arr[currentIndex],1);

        if(tempmaxOccurances>maxOccurances){
            maxOccurances=tempmaxOccurances;
            number=arr[currentIndex];
        }

        findMostDublicatedNumber(arr,++currentIndex,maxOccurances,number);
    }

    private static int occurencesOfSpecificNumber(int arr[],int currentindex,int number,int occurrences){
        if(currentindex==arr.length){
            return occurrences;
        }

        if(arr[currentindex]==number){
            occurrences++;
        }

        return occurencesOfSpecificNumber(arr,++currentindex,number,occurrences);
    }

    private static void findNumberOfDublicationOfEachNumber(int arr[],int currentIndex){
        if(currentIndex==arr.length){
            return;
        }


        if(arr[currentIndex]!= Integer.MAX_VALUE){
            int numberOccurances=occurencesOfNumber(arr,currentIndex+1,arr[currentIndex],1);
            System.out.println("Occurances of number " + arr[currentIndex] + " is " + numberOccurances);
        }



        findNumberOfDublicationOfEachNumber(arr,++currentIndex);
    }

    private static int occurencesOfNumber(int arr[],int currentindex,int number,int occurrences){
        if(currentindex==arr.length){
            return occurrences;
        }

        if(arr[currentindex]==number && number != Integer.MAX_VALUE){
            arr[currentindex]=Integer.MAX_VALUE;
            occurrences++;
        }

        return occurencesOfNumber(arr,++currentindex,number,occurrences);
    }

    private static void findSumOfAllElements(int arr[],int currentIndex,int sum){
        if(currentIndex==arr.length){
            System.out.print("Sum is "+sum);
            return;
        }

        findSumOfAllElements(arr,currentIndex+1,sum+=arr[currentIndex]);
    }

    private static void findAvarageValue(int arr[],int currentIndex,int sum){
        if(currentIndex==arr.length){
            System.out.print("Avarage is "+ (sum/arr.length));
            return;
        }

        findAvarageValue(arr,currentIndex+1,sum+=arr[currentIndex]);
    }

    private static void findASpecificNumber(int arr[],int currentIndex,int number){
        if(currentIndex==arr.length){
            System.out.print("Number is not found.");
            return;
        }

        if(arr[currentIndex]==number){
            System.out.println("Index of " + number + " is "+currentIndex);
            return;
        }

        findASpecificNumber(arr,currentIndex+1,number);
    }


    private static void findSumOfAllElementsInMatrix(int arr[][],int sum, int currentRow, int currentColumnn){
        if(currentRow==arr.length-1 && currentColumnn>=arr[currentRow].length){
            System.out.println("Sum is "+sum);
            return;
        }

        if(currentRow<arr.length-1 && currentColumnn==arr[currentRow].length){
            currentRow++;
            currentColumnn=0;
        }
        findSumOfAllElementsInMatrix(arr,sum+=arr[currentRow][currentColumnn],currentRow,currentColumnn+1);
    }


    private static void findAvarageElementInMatrix(int arr[][],int sum, int currentRow, int currentColumnn){
        if(currentRow==arr.length-1 && currentColumnn>=arr[currentRow].length){
            System.out.println("Sum is "+sum/(arr.length*arr[currentRow].length));
            return;
        }

        if(currentRow<arr.length-1 && currentColumnn==arr[currentRow].length){
            currentRow++;
            currentColumnn=0;
        }
        findAvarageElementInMatrix(arr,sum+=arr[currentRow][currentColumnn],currentRow,currentColumnn+1);
    }

    private static void findElementsInMatrix(int arr[][],int number, int currentRow, int currentColumnn){
        if(currentRow==arr.length-1 && currentColumnn>=arr[currentRow].length){
            System.out.println("There is no such number");
            return;
        }

        if(currentRow<arr.length-1 && currentColumnn==arr[currentRow].length){
            currentRow++;
            currentColumnn=0;
        }
        if(arr[currentRow][currentColumnn]==number){
            System.out.println("Index of number " + arr[currentRow][currentColumnn] +  " is " + currentRow + " " + currentColumnn);
            return;
        }
        findElementsInMatrix(arr,number,currentRow,currentColumnn+1);
    }

    private static int occurencesOfNumberInMatrix(int arr[][],int currentRow, int currentColumnn,int number,int occurrences){
        if(currentRow==arr.length-1 && currentColumnn>=arr[currentRow].length){
            return occurrences;
        }

        if(currentRow<arr.length-1 && currentColumnn==arr[currentRow].length){
            currentRow++;
            currentColumnn=0;
        }

        if(arr[currentRow][currentColumnn]==number && number != Integer.MAX_VALUE){
            arr[currentRow][currentColumnn]=Integer.MAX_VALUE;
            occurrences++;
        }

        return occurencesOfNumberInMatrix(arr,currentRow,++currentColumnn,number,occurrences);
    }

    private static void findNumberOfDublicationOfEachNumberInMatrix(int arr[][], int currentRow, int currentColumnn){
        if(currentRow==arr.length-1 && currentColumnn>=arr[currentRow].length){
            return;
        }

        if(currentRow<arr.length-1 && currentColumnn==arr[currentRow].length){
            currentRow++;
            currentColumnn=0;
        }

        if(arr[currentRow][currentColumnn]!= Integer.MAX_VALUE){
            int numberOccurances=occurencesOfNumberInMatrix(arr,currentRow,currentColumnn+1,arr[currentRow][currentColumnn],1);
            System.out.println("Occurances of number " + arr[currentRow][currentColumnn] + " is " + numberOccurances);
        }

        findNumberOfDublicationOfEachNumberInMatrix(arr,currentRow,currentColumnn+1);
    }



    public static void main(String[] args) {
        int[][] monthTemperature = {{1,2,3,3,3},{3,3,3,3,3},{3,4,2,2,2},{5,6,7,1,1}};
        int[] monthTemperature1 = {1,2,3,3,3,3,3,3,3,3,3,4,2,2,2,5,6,7,1,1};
        findNumberOfDublicationOfEachNumberInMatrix(monthTemperature,0,0);
    }
}