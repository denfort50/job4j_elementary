package ru.job4j.condition;

public class Max {
    public static int max(int l, int r) {
        int result;
        if (l != r) {
            result = Math.max(l, r);
        } else {
            result = l;
        }
        return result;
    }
}
