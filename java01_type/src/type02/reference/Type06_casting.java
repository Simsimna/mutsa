package type02.reference;

public class Type06_casting {
    public static void main(String[]args){
        // 묵시적 형변환 : 작은 타입에서 큰타입으로 변환되는 과정 - promotion (upCasting)

        byte b01 = (byte)100; // 명시적 형변환
        int i01 = b01; // byte->int로 형변환
        System.out.println(i01);

        // 명시적 형변환 : 큰 타입에서 작은 타입으로 변환되는 과정 - demotion (downcasting)

        int i02 = 100;
//        byte b02 = i02; 4바이트짜리를 1바이트에? 안됨.
        byte b02 = (byte)i02;
        System.out.println(b02);


    }
}
