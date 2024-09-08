package com.ohgiraffers.section03.prectice;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        /* 1부터 100까지 합계를 구하고 결과를 출력하세요
         *
         * -- 출력 예시 --
         * 1부터 100까지의 합 : 5050
         * */
    }
    public void Test4() {

        int num = 0;

        for(int i = 1; i <= 100; i++) {
            num += i;
        }

        System.out.println("1부터 100까지의 합 : " + num);
    }
    public void Test5() {

        /* 1부터 100까지의 난수를 발생시킨 후 1부터 난수까지의 합을 구하는 함수를 작성하시오.
         *
         * 예)
         * 난수 : 10
         *
         * 1부터 10까지의 합은 = 55
         * */

        int random = (int) (Math.random() * 101) + 1;
        System.out.println("난수 : " + random);

        int sum = 0;

        for(int i = 1; i <= random; i++) {
            sum += i;
        }
        System.out.println("1부터 " + random + "까지의 합은 = " + sum);
    }
    public void Test6() {

        /* 2단부터 9단까지 단 중 짝수번째 단만 출력하시오.
         *  즉, 2단, 4단, 6단, 8단만 출력하시오
         *
         * 예 )
         * < 2단 >
         * 2 * 1 = 2
         * 2 * 2 = 4
         * 2 * 3 = 6
         * 2 * 4 = 8
         * 2 * 5 = 10
         * 2 * 6 = 12
         * 2 * 7 = 14
         * 2 * 8 = 16
         * 2 * 9 = 18
         */


        for(int i = 2; i <= 9; i++) {
            if(i % 2 == 0) {
                System.out.println("<" + i + "단 >");
                for(int j = 1; j < 10; j++) {
                    System.out.println(i + "*" + j + "=" + i * j);
                }
            }else {
//                continue;
            }
            System.out.println();
        }
    }

    public void Test7() {

        /*
    문제 1. for문을 이용하여 1부터 10까지 11을 만들 수 있는 모든 조합과 결과를 출력하시오
    * 예 ) 1 + 10 = 11
    *      2 + 9 = 11
    *      3 + 8 = 11
    *      4 + 7 = 11
    *      5 + 6 = 11
    *      6 + 5 = 11
    *      7 + 4 = 11
    *      8 + 3 = 11
    *      9 + 2 = 11
    *      10 + 1 = 11
    * */

        for (int i= 1; i <= 10; i++) {
            System.out.println(i + " + " + (11-i) + " = " + "11");
        }
    }

    public void Test8() {
        /*문제 2. 1부터 사용자가 입력한 정수까지의 홀수의 개수를 구하시오
         * 예 ) 정수를 하나 입력하세요 :
         * 1부터 10까지의 홀수의 개수는 5개입니다
         * */

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 하나 입력하세요 : ");
        int b = sc.nextInt();

        int num1 = 0;

        if (b % 2 == 0) {
            num1 = b / 2;
        }else { num1 = (b / 2)+ 1;

        }
        System.out.println("1부터 10까지의 홀수의 개수는 : " + num1 + "개");
    }
}
