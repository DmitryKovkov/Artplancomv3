package com.company;

public class MyString {
    private String string;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public MyString (String string) {
        if (string=="") {

        }
        this.string = string;
    }

    public String flipString() {
        char[] chars = new char[this.string.length()];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = this.string.charAt(this.string.length()-i-1);
        }
    return String.copyValueOf(chars);
    }

    public void repeatFlipString(int n) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
             this.string = flipString();
        }
        long finish = System.currentTimeMillis();
        System.out.println(finish-start);

    }
}
