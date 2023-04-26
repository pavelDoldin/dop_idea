import java.io.IOException;

public class start {
    public static void main(String[] args) throws IOException {
        ex7();
    }
    static void ex0(){
        // целые числа
        byte num = 100;   // 8 бит хронит в себе от -128 до + 127
        short num1 = 131; // 16 бит хронит в себе от -32768 до + 32767
        int num2 = 141;   // 32 бита хронит в себе от -2_147_483_648 до +2_147_483_647
        long num3 = 123;  // 64 бита -9_223_372_036_854_775_888 до +9_223_372_036_854_775_887
        // Дробные числа
        float num4 = 1.1f;  // 32 бита  1,123456   после запятой 6 или 7 симвалов
        double num5 = 1.11; // 64 бита  после запятой 15 симвалов

        char ch = '/';      // 16 бит принемает в себя символ, пробел то же символ

        //                  истина      ложь
        boolean bo = false; // 1 бит проверяет на true или false
    }
    static void ex1(){

    final int number = 142;   // final означает константа которую нельзя менять
    }
    static void ex2(){
        int nam1 = 7;
        int nam2 = 7;
        int nam3 = 5;
        int nam4 = 3;

        if (nam1 == nam2 && nam3 > nam4){
            System.out.println("Результат верен :");
        } else {
            System.out.println("Результат не верен :");
        }

        int result = nam1 % nam2;  //можно поменять на другие значения + - * / %

        System.out.println("Результат:  " + result);
    }
    static void ex3() throws IOException {

    char ch, answer = 'B';
        System.out.println("Угадай какую букву я загадал !");
        System.out.print("Игра началась( : ");

        ch = (char)System.in.read();

        if (ch == answer){
            System.out.print("Поздравляю ты угадал !");
        } else if (ch > answer) {
            System.out.print("Ты ее перескочил) ");
        }else {
            System.out.print("До нее ещё чуть чуть ! ");
        }

    }
    static void ex4()throws IOException {

        int month = 6;

        String monthString;

        switch (month){
            case 1: monthString = "Январь";
                break;
            case 2: monthString = "Февраль";
                break;
            case 3: monthString = "Март";
                break;
            case 4: monthString = "Апрель";
                break;
            case 5: monthString = "Май";
                break;
            case 6: monthString = "Июнь";
                break;
            case 7: monthString = "Июль";
                break;
            case 8: monthString = "Август";
                break;
            case 9: monthString = "Сентябрь";
                break;
            case 10: monthString = "Октябрь";
                break;
            case 11: monthString = "Ноябрь";
                break;
            case 12: monthString = "Декабрь";
                break;
            default: monthString = "Не знаю такого";
                break;
        }
        System.out.println(monthString);
    }
    static void ex5() throws IOException {
        int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.println(" Итерация " + i);
        }

    }
    static void ex6(){
//        int[] nums = {1, 1, 1, 1};
        int[] nums = new int[4];

        for (int i = 0; i < 4; i++) {
            nums[i] = i;
        }
        nums[3] = 100;
        for (int e : nums) {
            System.out.println(e);
        }
    }
    static void ex7(){

    }
}



















