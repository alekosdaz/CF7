package gr.aueb.cf.ch7;

public class StrEquals {

    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = "Athens";
        String s3 = "ATHENS";

        boolean equall1 = s1.equals(s2);  //true
        boolean equall2 = s1.equals(s3);  //false
        boolean equall3 = s1.equals(s3);  //true

        boolean equall4 = s1.toUpperCase().equals(s3.toUpperCase()); // normalize to uppercase
    }
}
