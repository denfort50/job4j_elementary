package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2 + 3;
        }
        for (int index = 0; index < numbers.length; index++) {
            if (index % 2 == 0) {
                System.out.println(numbers[index]);
            }
        }
    }
}
