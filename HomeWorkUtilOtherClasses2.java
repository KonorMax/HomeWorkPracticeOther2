package com.konor.HomeWorkPracticeOther2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HomeWorkUtilOtherClasses2 {
    public static void main(String[] args) throws IOException {
        int count = 0;
        double sum = 0.0;


        FileWriter fileWriter = new FileWriter("gapnumtest.txt");
        fileWriter.write("56,5 67,3 5, 9,3 87, 268,8 stop");
        fileWriter.close();

        FileReader fileReader = new FileReader("gapnumtest.txt");
        Scanner src = new Scanner(fileReader);

        while (src.hasNext()) {
            if (src.hasNextDouble()) {
                sum += src.nextDouble();
                count++;
            } else {
                String str = src.next();
                if (str.equals("stop")) break;
                else {
                    System.out.println("Wrong format!");
                    return;
                }
            }
        }
        src.close();
        System.out.println("Avg num = " + sum / count);
    }
}
