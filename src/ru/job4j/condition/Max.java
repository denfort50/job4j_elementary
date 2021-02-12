package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result;
        if (left != right) {
            result = Math.max(left, right);
        } else {
            result = left;
        }
        return result;
    }
}
