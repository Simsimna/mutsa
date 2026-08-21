package type03.etc;

public class LocalVariableType {

    public static void main(String[] args) {
        /*
        var : 지역 변수 타입 추론 (Local Variable Type Inference)
        - compile 시 값의 type을 추런 -> 이후에 다른 type으로 변환 불가
        - 지역변수 에서만 사용 가능
        - 반드시 초기화 필요 (선언으로 끝나면 안됨)
        - null로 초기화 불가
         */

        var i = Integer.valueOf(0); // i는 var 타입 -> Integer 클래스를 통해서 만들어진 객체의 주소 값
        System.out.println(i);

        i = null; // null로 초기화불가 ? => 인티저를 통해 온거라, 주소참조
                    // 변수를 만들고 값을 넣어주는게 초기화.
                    // 값을 안넣어주면 자바가 값을 넣어주더라.
        System.out.println(i);

//        var j ; 이것도 불가 선언으로만 끝나면안됨.
//        var j = null; // 이건 불가능

        var j = 1;

//        j = null;
        System.out.println(j);
//        j = "one";

    }
}
