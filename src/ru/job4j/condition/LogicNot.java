package ru.job4j.condition;

public class LogicNot {
    public boolean isEven(int num) {
        return num % 2 == 0;
    }

    public boolean isPositive(int num) {
        return num > 0;
    }

    public boolean notEven(int num) {
        return !isEven(num);
    }

    public boolean notPositive(int num) {
        return !isPositive(num);
    }

    public boolean notEvenAndPositive(int num) {
        return notEven(num) && isPositive(num);
    }

    public boolean evenOrNotPositive(int num) {
        return isEven(num) || notPositive(num);
    }

    public static void main(String[] args) {
        LogicNot ln = new LogicNot();
        System.out.println(ln.isEven(10));
        System.out.println(ln.isPositive(10));
        System.out.println(ln.notEven(10));
        System.out.println(ln.notPositive(10));
        System.out.println(ln.notEvenAndPositive(10));
        System.out.println(ln.evenOrNotPositive(10));
    }
}
