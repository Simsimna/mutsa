package basic.operator;

import java.sql.SQLOutput;

public class BasicOperator {

    // final : 상수
    static final int TEN = 10;


    public static void main(String[]args) {

        System.out.println("1. 괄호()");
        int result01 = (TEN + 3) * 4;
        System.out.println(result01);
        int result02 = TEN + 3 * 4;
        System.out.println(result02);

        System.out.println("----------");

        System.out.println("2. 증감 / 단항 (++ -- ! ~)");
        /*
        증감연산자
        ++, --
        변수의 앞/뒤에 증감연사자를 붙이게 되면, 변수가 가진 값을 1씩 증감하게 된다.
        전위 연산자 (++i) : 연산자를 변수 앞에 붙여서 연산을 먼저 하고, 값을 나중에 리턴한다.
        후위 연산자 (i++) : 연산자를 변수 뒤에 붙여서 값을 먼저 리턴하고, 연산을 나중에 한다.

        */
        int i = TEN;             // 10
        System.out.println(++i); // 11
        System.out.println(i++); // 11 (12)
        System.out.println(i);   // 12

        int a = 10;
        int b = 2;
        int c = a++ + --b + b++ + ++a;
        //     10(11)   1   1(2)   12(12) : a = 12, b=2, c= 24;

        // c = 23 a = 12 b = 2

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        // ! : not
        System.out.println(!true);
        System.out.println(!false);

        // ~ : bit 반전
        System.out.println(~TEN);
        // 0000 0000 0000 0000 0000 0000 0000 1010 (=10)
        // 1111 1111 1111 1111 1111 1111 1111 0101 (-11)

        System.out.println("----------");

        System.out.println("3. 산술 (* / % )");
        int result03 = TEN + 6 / 2;
        int result04 = TEN * 2;
        int result05 = TEN % 6;

        System.out.println(result03);
        System.out.println(result04);
        System.out.println(result05);

        System.out.println("4. 산술 (+ -)");
        int result06 = TEN - 6 + 2;
        System.out.println(result06);

        System.out.println("----------");

        System.out.println("5. 시프트 (<< >> >>>)");

        /*
        << : 2^n 2^n을 곱하기 느낌,
        >> : 부호를 유지
        >>> : 부호 없는
         */

        int positiveTen = 10;
        // 0000 0000 0000 0000 0000 0000 0000 1010
        int negativeTen = -10;
        // 1111 1111 1111 1111 1111 1111 1111 0110

        int leftShiftPositive = positiveTen << 2;
        // 0000 0000 0000 0000 0000 0000 0000 1010
        // 0000 0000 0000 0000 0000 0000 0010 1000
        System.out.println(leftShiftPositive);

        int rightShiftPositive = positiveTen >> 2;
        // 0000 0000 0000 0000 0000 0000 0000 1010
        // 0000 0000 0000 0000 0000 0000 0000 0010
        System.out.println(rightShiftPositive);

//        int rightShiftPositive2 = positiveTen >> 16;
//        // 0000 0000 0000 0000 0000 0000 0000 1010
//        // 0000 0000 0000 0000 0000 0000 0000 0010
//        System.out.println(rightShiftPositive2);

        int unsignedRightShiftPositive = positiveTen >>> 2;
        // 0000 0000 0000 0000 0000 0000 0000 1010
        // 0000 0000 0000 0000 0000 0000 0000 0010
        System.out.println(unsignedRightShiftPositive);

        int leftShiftNegative = negativeTen << 2;
        // 1111 1111 1111 1111 1111 1111 1111 0110
        // 1111 1111 1111 1111 1111 1111 1101 1000
        System.out.println(leftShiftNegative);

        int rightShiftNegative = negativeTen >> 2;
        // 1111 1111 1111 1111 1111 1111 1111 0110
        // 1111 1111 1111 1111 1111 1111 1111 1101
        System.out.println(rightShiftNegative);

        int unsignedRightShiftNegative = negativeTen >>> 2;
        // 1111 1111 1111 1111 1111 1111 1111 0110
        // 0011 1111 1111 1111 1111 1111 1111 1101  // 두칸 움직이지만, 부호비트를 채우지않음
        System.out.println(unsignedRightShiftNegative);

        System.out.println("----------");

        System.out.println("6. 비교 ( < > <= >= instanceof)");

        boolean result07 = TEN > (5 + 3);
        boolean result08 = TEN <= (5 * 3);

        System.out.println(result07);
        System.out.println(result08);


        Integer intValue = Integer.valueOf(TEN); // intValue 변수에 참조타입이 담겨있음 , 왜 참조타입? 설명할줄 알아야함
        // wrapper class의 객체?
        // Integer 라는 wrapper클래스가 intValue에 숫자 10을 가지고있는 주소를
        // 대입 되어있어 주소가 들어가있음
        boolean result09 = intValue instanceof Integer; // instanceof??
        System.out.println(result09);


        System.out.println("----------");
        System.out.println("7. 동등 연산자 (== !=)");

        System.out.println(TEN == 10); // =는 대입연산자니까 ==
        System.out.println(TEN != 10); // !, not, !=, 같지않다

        //type variable = literal; 타입 변수 = 값


        System.out.println("----------");
        System.out.println("8. 비트 AND (&)");

        int result10 = TEN & 2;
        //  0000 0000 0000 0000 0000 0000 0000 1010
        //& 0000 0000 0000 0000 0000 0000 0000 0010
        //-----------------------------------------
        //  0000 0000 0000 0000 0000 0000 0000 0010 // 0이랑 0은 0임
        System.out.println(result10);

        System.out.println("9. 비트 XOR (^)");
        int result11 = TEN ^ 2;
        //  0000 0000 0000 0000 0000 0000 0000 1010
        //^ 0000 0000 0000 0000 0000 0000 0000 0010 (XOR : 같으면0, 다르면1)
        //-----------------------------------------
        //  0000 0000 0000 0000 0000 0000 0000 1000
        System.out.println(result11);


        System.out.println("10. 비트 OR (|)");
        int result12 = TEN | 2;
        //  0000 0000 0000 0000 0000 0000 0000 1010
        //^ 0000 0000 0000 0000 0000 0000 0000 0010 (둘중에 하나라도 1이면 1)
        //-----------------------------------------
        //  0000 0000 0000 0000 0000 0000 0000 1010
        System.out.println(result12);

        System.out.println("----------");
        System.out.println("11. 논리 AND (&&)"); //★ 조건 , 얘는 중요

        boolean result13 = false && (TEN == 10); //&& 얘는, 왼쪽도 true 오른쪽도 true여야함
        // && 연산자 왼쪽의 조건값이 false 면 어차피 false이기 때문에 오른쪽은 연산하지 않는다.
        System.out.println(result13);

        System.out.println("12. 논리 OR (||)"); // 왼쪽이나 오른쪽에서 하나만 참이면 참
        boolean result14 = true || (TEN !=10);
        // || 연산자 왼쪽의 조건값이 true 면 어차피 true이기 때문에 오른쪽은 연산하지 않는다.
        System.out.println(result14);


        System.out.println("----------");
        System.out.println("13. 삼항 연산자( ? : )");
        // (조건) ? 조건이 참일 때 return 값 : 조건이 거짓일 때 return 값;
        int result15 = (TEN > 5) ? TEN : 5; //참이면 TEN 거짓이면 5
        System.out.println(result15);

        String result16 = (TEN > 5) ? "실습강사가 잘생겼다." : "못생겼다.";
        // 주의점, 참일때 리턴값과, 거짓일때 리턴값은 같은 타입이어야함
        System.out.println(result16);

        // 삼항연산자는 자주 쓰일 예정, 조건문 반복문을 쓸 때도?


        System.out.println("----------");
        System.out.println("14. 대입 연산자 (=, 복합대입)");

        int result17 = TEN;
        result17 = result17 + 5;
        System.out.println(result17);

        int result18 = TEN;
        result18 += 5; // result18 = result18 + 5; 같은말
        System.out.println(result18);






    }
}
