package type02.reference;

public class Type03_Person {
    public static void main(String[]args){
        // 참조타입 변수 = new 참조타입();
        // new -> constructor 호출하는 역할

        // 참조타입이라는 녀석들 전부 클래스
        // 'Person' 이라는 클래스 역시 참조타입

        Person daeyeon = new Person();

        System.out.println(daeyeon);
        System.out.println(daeyeon.name);
        System.out.println(daeyeon.age);

        // Person.name; // static이 안붙었기 때문에 안됨.
        // int age = 32;
        // String name = "dayeon";
        // 얘네는 변수, 필드, 인스턴스 변수?


    }

}
