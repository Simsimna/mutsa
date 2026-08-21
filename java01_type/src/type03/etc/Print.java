package type03.etc;

public class Print {

        /*
        print : 줄 바꿈 없음
        println : 줄 바꿈 포함 (line)
        printf : formatter(자리 or 형식을 포맷)
        */

    public static void main(String[] args){
        String name = "daeyeon";
        int age = 100;
        System.out.print("1. nava : " + name + "\n"); // \n
        System.out.println("2. age : " +age);
        System.out.printf("3. format : _%10d_%5d\n", age, age); //%10d 숫자포함 10칸, %5d 숫자포함 5칸

        double pi = 3.141592;
        String formatString = String.format("My name is %s. \nPi = %.2f", name, pi); // String 참조
        System.out.println(formatString);

        //공식문서 String -> format -> 찾아가보니 똑같이 씀 %s, %d
    }
}
