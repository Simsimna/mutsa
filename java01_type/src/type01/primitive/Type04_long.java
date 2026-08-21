package type01.primitive;

public class Type04_long {
    public static void main(String[] args){
        // 8byte
        // 접미사 l, L

//        long l01 = 3000000000;
//        long l02 = 4000000000; large, 오류

        long l01 = 3000000000l;
        long l02 = 4000000000L;

        long sum = l01 +l02;

        System.out.println(sum);

    }


}
