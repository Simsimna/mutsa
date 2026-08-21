package type01.primitive;

public class Type01_byte {


    // package : 서로 관련있는 클래스들의 모음 ( = 폴더, 디렉토리)
    // keyword(예약어) : 언어 내에서 미리 정해 놓은 단어 (-> 우리가 사용할 수 없다)
    /*
    Primitive Type
        Number Type
            integral Type : byte(1byte), short(2byte), int(4byte), long(8byte), char(2byte)
            FloatingPoint Type : float(4byte), double(8byte)
        boolean (1byte)

    */

    // program의 주 진입점
    // void main(){} 자바 25부터는 이렇게 입력해도 가능
    public static void main(String [] args){
        //type variable = literal
        // = : 대입 연산자
        //literal : 값 그 자체

        byte b01 = 127; // byte 타입, 변수 b01 = 값 127
        System.out.println(b01);

        // 00000000 ~ 11111111
        // -128 ~ 127
        // byte b02 = 128; // 128이라는 값을 byte 타입에 담을 수 없음

        byte b02 = (byte)128;
        IO.println(b02); //자바 25버전에서 새로나온 버전, System.out.println()과 같음
        //-128 출력, 한바퀴 넘어서 끝나리인 오버플로우
        // 2진수, 보수 찾아보기

        // 정수 값 default type : int
        byte sum = (byte)(b01 - 1);
        System.out.println(sum);
    }

}
 // 주강사님의 내용을 실습하기

// ex)java.lang 패키지
// 오늘 수업은 type01.primitive라는 패키지