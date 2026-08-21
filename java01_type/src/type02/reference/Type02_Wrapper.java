package type02.reference;

public class Type02_Wrapper {
    public static void main(String[]args){
        /*
        primitive          ->          wrapper

        byte                            Byte
        short                           Short
        int                             Integer
        long                            Long
        float                           Float
        double                          Double
        char                            Character
        boolean                         Boolean
                                      얘네는 전부 class
                                      모든 wrapper클래스는 참조타입
        primitive : 값을 저장하고, 그값을 가져오기만 함
        wrapper : 값을 가지고 이것저것 하고싶음, 기능을 추가하고 싶어서 primitive타입을 wrapper타입으로 바꿔놓은 애들

        Byte들은 누구를 멤버로 가지고 있는가.


         */
        System.out.println(Byte.MIN_VALUE+"~"+Byte.MAX_VALUE);
        //MIN_VALUE 전부 대문자, ()없음 -> 상수
    }
}
