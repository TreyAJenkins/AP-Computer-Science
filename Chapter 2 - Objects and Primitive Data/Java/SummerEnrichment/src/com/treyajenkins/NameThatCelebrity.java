package com.treyajenkins;

public class NameThatCelebrity {
    public static String identity = "Lesson: Simple String Operations | Project: Name That Celebrity";

    public static void main(String[] args) {
        String s1 = "Allan Alda";
        String s2 = "John Wayne";
        String s3 = "Gregory Peck";

        System.out.println(s1 + ">>>" + s1.substring(2, s1.length()-3));
        System.out.println(s2 + ">>>" + s2.substring(2, s2.length()-3));
        System.out.println(s3 + ">>>" + s3.substring(2, s3.length()-3));

    }
}
