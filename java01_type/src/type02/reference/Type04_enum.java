package type02.reference;

public class Type04_enum {
    public static void main (String[]args){
        // enum : 열거형 class (상수들의 집합을 정의)
        enum Day {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}
        // 애는 세미콜론이 왜 없을까.

        System.out.println(Day.FRIDAY);

        System.out.println(1); System.out.println(2); System.out.println(3);
        // ; : 해당 명령이 끝났다, 위의 1 2 3 은 각각의 명령이 끝났으므로 3줄이나 마찬가지.
    }
}
