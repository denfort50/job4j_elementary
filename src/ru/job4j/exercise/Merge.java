
package ru.job4j.exercise;
public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                rsl[count++] = left[i++];
            } else {
                rsl[count++] = right[j++];
            }
        }
        while (i < left.length) {
            rsl[count++] = left[i++];
        }
        while (j < right.length) {
            rsl[count++] = right[j++];
        }
        return rsl;
    }
}