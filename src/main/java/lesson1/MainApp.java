package lesson1;
//ДЗ 1 урок
public class MainApp {
    public static void main(String[] args) {

        //cоздание переменных всех пройденных типов данных, инициализация их значений
        byte a=1;
        short b=7;
        int c=5;
        long d=200L;
        float r=80.28f;
        double k=123.223;
        char p='\42';
        boolean u=true;
        //печать значений разных типов переменных
        System.out.println("byte="+a);
        System.out.println("short="+b);
        System.out.println("int="+c);
        System.out.println("long="+d);
        System.out.println("float="+r);
        System.out.println("double="+k);
        System.out.println("char="+p);
        System.out.println("boolean="+u);

        //вызов метода, вычисляющего выражение a * (b + (c / d)) и печать результата
        float result=calculate(3.1f,4.2f,5.1f,1.2f);
        System.out.println("result="+result );

        // вызов метода, принимающего на вход два целых числа и проверяющего,
        // что их сумма лежит в пределах от 10 до 20 и печать результата
        boolean resultTask=task10and20(14,8);
        System.out.println("resultTask="+resultTask );

        //вызов метода, который должен напечатать в консоль, положительное ли число передали или отрицательное
        isPositiveOrNegative(-5);

        // Вызов метода, который должен вернуть true, если число отрицательное, и вернуть false если положительное
        boolean result17=isNegative(-17);
        System.out.println(result17);

        //вызов метода, который должен вывести в консоль сообщение «Привет, указанное_имя!»
        greetings("Марина");

        //вызов метода, который определяет, является ли год високосным, и выводит сообщение в консоль
        leapYear(2000);

    }

    // метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат
    public static float calculate(float a, float b, float c, float d) {
        return a*(b+(c/d));
    }

    // метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20
    public static boolean task10and20(int x1, int x2) {
        if ((x1 + x2 >= 10)&&(x1 + x2 <= 20)) {
            return true;}
        else {return false; }
    }

    //метод должен напечатать в консоль, положительное ли число передали или отрицательное
    public static void isPositiveOrNegative(int x) {
        if(x>=0) {
            System.out.println("число положительное");
        } else {
            System.out.println("отрицательное");
        }
    }

    //метод, которому в качестве параметра передается целое число.
    // Метод должен вернуть true, если число отрицательное, и вернуть false если положительное
    public static boolean isNegative(int x) {
        if(x<0) {
            return true;
        }
        return false;
    }

    //Метод, которому в качестве параметра передается строка, обозначающая имя.
    // Метод должен вывести в консоль сообщение «Привет, указанное_имя!»
    public static void greetings(String name) {
        System.out.println("Привет, "+name+"!");
    }

    //метод, который определяет, является ли год високосным, и выводит сообщение в консоль
    public static void leapYear(int x) {
        if((x%4 == 0)&&(x%100!=0)||(x%400==0)) {
            System.out.println("Leap year");
        }else{
            System.out.println("Not leap");
        }
        }

}
