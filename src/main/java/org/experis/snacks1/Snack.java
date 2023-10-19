package main.java.org.experis.snacks1;

public class Snack {

    public int printBiggest(int a, int b) {
        return a == b ? 0 : Math.max(a, b);
    }

    public String getLonger(String a, String b) {
        return a.length() > b.length() ? a : b;
    }

}
