package com.wileyedge.classroster.ui;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component("userIO")
public class UserIOConsoleImpl implements UserIO{

    final private Scanner input = new Scanner(System.in);

    @Override
    public void print(String message) {
        System.out.println(message);
    }

    @Override
    public String readString(String prompt) {
        print(prompt);
        return input.nextLine();
    }

    @Override
    public int readInt(String prompt) {
        print(prompt);
        return input.nextInt();
    }

    @Override
    public int readInt(String prompt, int min, int max) {
        print(prompt);
        int num = input.nextInt();
        while (num > max || num < min) {
            print("Error - enter a number between " + min + " and " + max);
            num = input.nextInt();
        }
        return num;
    }

    @Override
    public double readDouble(String prompt) {
        print(prompt);
        return input.nextDouble();
    }

    @Override
    public double readDouble(String prompt, double min, double max) {
        print(prompt);
        double num = input.nextDouble();
        while (num > max || num < min) {
            print("Error - enter a number between " + min + " and " + max);
            num = input.nextDouble();
        }
        return num;
    }

    @Override
    public float readFloat(String prompt) {
        print(prompt);
        return input.nextFloat();
    }

    @Override
    public float readFloat(String prompt, float min, float max) {
        print(prompt);
        float num = input.nextFloat();
        while (num > max || num < min) {
            print("Error - enter a number between " + min + " and " + max);
            num = input.nextFloat();
        }
        return num;
    }

    @Override
    public long readLong(String prompt) {
        print(prompt);
        return input.nextLong();
    }

    @Override
    public long readLong(String prompt, long min, long max) {
        print(prompt);
        long num = input.nextLong();
        while (num > max || num < min) {
            print("Error - enter a number between " + min + " and " + max);
            num = input.nextLong();
        }
        return num;
    }
}
