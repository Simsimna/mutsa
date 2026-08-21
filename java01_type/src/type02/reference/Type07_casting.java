package type02.reference;

public class Type07_casting {
    static void main(String[] args){

        // boxing
        int a = 100;
        Integer boxedA = Integer.valueOf(a);
        System.out.println("boxedA : "+ boxedA);

        // int의 primitive 값을 wrapper클래스에 넣어줬다 => 박싱했다

        // auto boxing
        int b = 100;
        Integer autoBoxedB= b;
        System.out.println(autoBoxedB);



        // unboxing
        Integer c = Integer.valueOf(200);
        int unboxedC = c.intValue();
        System.out.println("unboxedC : " +unboxedC);

        Integer d = Integer.valueOf(200);
        int autoUnboxedD = d;
        System.out.println(autoUnboxedD);

    }
}

// 깨알상식
// alt+1 -> 프로젝트로감 alt insert 생성
