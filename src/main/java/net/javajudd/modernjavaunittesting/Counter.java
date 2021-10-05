package net.javajudd.modernjavaunittesting;

public class Counter {

    private int value;
    private int original_value;

    public Counter() {
        this(0);
    }

    public Counter(int i) {
        value = original_value = i;
    }

    public int getValue() {
        return value;
    }

    public void increment() {
        value++;
    }

    public void decrement() {
        value--;
    }

    public void reset() {
        value = original_value;
    }

}