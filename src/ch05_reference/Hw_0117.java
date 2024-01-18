package ch05_reference;

import java.util.Arrays;

public class Hw_0117 {
    public static void main(String[] args) {
        // 연습문제
// 1. 1에서 1000사이에 0은 몇번, 1은 몇번, ..., 9는 몇번 사용되었는가?
//      1234567890101112131415...9991000
        System.out.println("1번");
        int[] arr = new int[10];
        Arrays.fill(arr, 0);

        String str = "";
        for (int i = 1; i <= 1000; i++) {
            str += i;
        }

        for (int i = 0; i < str.length(); i++) {
            int index = (int) str.charAt(i) - '0';
            arr[index]++;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + "은/는 " + arr[i] + "번 사용되었습니다.");
            System.out.println();
            ;
        }

// 2. 디지털 시계, 00:00 ~ 23:59
// 하루동안 3이 표시되는 시간은 몇초인가?
        System.out.println("\n2번");

        int cnt2 = 0;
        for (int i = 0; i < 24; i++) {
            for (int k = 0; k < 60; k++) {
                if (String.valueOf(i).contains("3")) {
                    cnt2 += 3600;
                    break;
                } else if (String.valueOf(k).contains("3")) {
                    cnt2 += 60;
                }
            }
        }
        System.out.println(cnt2);

// 3. 두개의 세자리수를 곱해서 나온 결과가 palindrome일때
// 가장 큰 palindrome 수와 어떤 수를 곱해서 나온 결과인가?
        System.out.println("\n3번");

        int n1 = 0, n2 = 0, n3 = 0;
        for (int i = 100; i < 1000; i++) {
            for (int k = 100; k < 1000; k++) {
                int num3 = i * k;
                String str3 = String.valueOf(num3);
                if (isPalindrome(str3)) {
                    if (num3 > n1) {
                        n1 = num3;
                        n2 = i;
                        n3 = k;
                    }
                }
            }
        }
        System.out.println(n2 + " * " + n3 + " = " + n1);

// 4. C:/Workspace/WebProject/03.JavaScript/ch07.표준내장객체/04.String연습.js
// 에서 파일명(04.String연습.js)만 출력하세요.
        System.out.println("\n4번");

        String path = "C:/Workspace/WebProject/03.JavaScript/ch07.표준내장객체/04.String연습.js";

        for (int i = 50; i < path.length(); i++) {
            System.out.print(path.charAt(i));
        }
    }

    static boolean isPalindrome(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }
}
