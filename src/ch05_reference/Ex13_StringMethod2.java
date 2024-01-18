package ch05_reference;

public class Ex13_StringMethod2 {
    public static void main(String[] args) {
        String snn1 = "880927-1234567";
        String snn2 = "010117-4123456";

        for(int i =0;i<snn1.length();i++){
            System.out.print(snn1.charAt(i));
        }
        System.out.println(snn1.charAt(0));
    }
}
