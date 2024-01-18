package ch05_reference;

import java.util.Scanner;

public class Ex12_StringMethod {
    public static void main(String[] args) {
        String str1 = "Hello Java";
        String str2 = "안녕하세요? 반갑습니다.";

        System.out.println(str2.charAt(0) + ", " + str2.charAt(7));

        String ssn = "010624-3123456";
        char gender = ssn.charAt(7);
        switch (gender){
            case '1' : case '3':
                System.out.println("남자"); break;
            case '2' : case '4':
                System.out.println("여자"); break;
        }
    }
}
