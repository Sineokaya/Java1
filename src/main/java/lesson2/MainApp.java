package lesson2;

import java.util.Arrays;

//ДЗ 2 урок Синеокая Марина
public class MainApp {
    public static void main(String[] args) {

        //вызов методов
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal(4);
        minMax();

        //вызов метода задание 6
        int[] args2 = {2, 2, 2, 1, 2, 2, 10,1};
        boolean res2=checkBalance2(args2);
        System.out.println(res2);
        //вызов метода задание 7
        int[] args3 = {1, 2, 3, 4};
        int shift1=2;
        shift(args3, shift1);
        invArray();
    }

    //1. В методе задан целочисленный массив, состоящий из элементов 0 и 1
    //С помощью цикла и условия заменяем 0 на 1, 1 на 0
    public static void invertArray() {
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Задание 1");
        //печатаем исходный массив
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(arr1));
        //печатаем измененный массив
        System.out.println("Измененный массив:");
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0) {
                arr1[i] = 1;
            } else {
                arr1[i] = 0;
            }
            //печатаем измененный массив
            System.out.print(arr1[i] + "  ");

        }

    }

    //2. В методе задан пустой целочисленный массив размером 8
    //С помощью цикла заполняем его значениями 0 3 6 9 12 15 18 21
    public static void fillArray() {
        int count = 0;
        int[] arr = new int[8];
        System.out.println();
        System.out.println();
        System.out.println("Задание 2");
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(arr));
        System.out.println("Измененный массив:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = count;
            System.out.print(arr[i] + "  ");
            count = count + 3;

        }
    }

    //3.В методе задан массив [1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1]
    //Пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static void changeArray() {
        int[] w = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println();
        System.out.println();
        System.out.println("Задание 3");
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(w));
        System.out.println("Измененный массив:");
        for (int i = 0; i < w.length; i++) {
            if (w[i] < 6) {
                w[i] = w[i] * 2;
            }
            System.out.print(w[i] + "  ");
        }
    }


    //4.В методе создан квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое)
    //С помощью цикла(-ов) заполнить его диагональные элементы единицами
    public static void fillDiagonal(int k) {
        int[][] arr = new int[k][k];
        System.out.println();
        System.out.println();
        System.out.println("Задание 4");
        System.out.println("Измененный массив:");
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }

    //5.В методе задан одномерный массив, в нем найти минимальный и максимальный элементы
    public static void minMax() {
        int[] w = {6, 5, 3, 2, 11, 4, 5, 2, 19, 8, 9, 5};
        System.out.println();
        System.out.println("Задание 5");
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(w));
        System.out.println("Результат:");
        int max=w[0];
        int min=w[0];
        for (int i = 1; i < w.length; i++) {
            if (w[i] >max) {
                max=w[i];
            }
            if (w[i]<min) min = w[i];
        }
        System.out.println("min=" + min+ " max="+max);
    }

    /*6.
       Одномерный массив задан внутри метода, упрощенный вариант метода
       Метод должен вернуть true
       если в массиве есть место, в котором сумма левой и правой части массива равны
        public static boolean checkBalance() {
        int[] args = {1, 1, 1, 2, 1,};
            System.out.println();
            System.out.println("Задание 6");
            System.out.println("Исходный массив:");
            System.out.println(Arrays.toString(args));
        int leftSum;
        int rightSum;
        int p;
        for (int i = 0; i < args.length; i++) {
            leftSum=args[0];
            rightSum=args[(args.length-1)];

            //сумма слева
            for (int j=0; j < i; j++) {
                leftSum= leftSum+args[j+1];
            }
            //печать найденной суммы слева (для наглядности)
            System.out.println("leftSum=" + leftSum);

            //сумма справа
            for (int l= 2; l< args.length-i; l++) {
                p= args.length-l;
                rightSum= rightSum+args[p];
            }

            System.out.println("rightSum=" + rightSum);

                if (leftSum==rightSum) return true;
        }
        return false;
    }
    */

    //6.Методу на вход подается одномерный массив.
    // Метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны
    public static boolean checkBalance2(int args2[]) {
        System.out.println();
        System.out.println("Задание 6");
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(args2));
        int leftSum;
        int rightSum;
        int p;
        for (int i = 0; i < args2.length; i++) {
            leftSum=args2[0];
            rightSum=args2[(args2.length-1)];
            //сумма слева
            for (int j=0; j < i; j++) {
                leftSum= leftSum+args2[j+1];
            }
            //печать найденной суммы слева (для наглядности)
            System.out.println("leftSum=" + leftSum);

            //сумма справа
            for (int l= 2; l< args2.length-i; l++) {
                p= args2.length-l;
                rightSum= rightSum+args2[p];

            }
            //печать найденной суммы справа (для наглядности)
            System.out.println("rightSum=" + rightSum);

            //сверка левой и правой части
            if (leftSum==rightSum) return true;

        }
        return false;
    }


    //7. метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
    // при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
    public static void shift(int args3[], int shift1) {
        System.out.println();
        System.out.println("Задание 7");
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(args3));
        System.out.println("Сдвинутый массив:");
        //сколько раз сдвиг на 1
        for (int i = 0; i < shift1; i++) {
            // убираем первый элемент в буфер, а на его место ставим последний элемент
            int buffer = args3[0];
            args3[0] = args3[args3.length - 1];
            //сдвигаем на 1 весь массив
            for (int j = 1; j < args3.length - 1; j++) {
                args3[args3.length - j] = args3[args3.length - j - 1];
            }
            // ставим нулевой элемент в 1 ячейку
            args3[1] = buffer;
        }
        //сдвиг
        System.out.println("сдвиг на: "+shift1);
        //печать полученного массива
        for (int i = 0; i < args3.length; i++) {
            System.out.print(args3[i] + "  ");
        }
    }


    //метод, который считает сумму всех элементов одномерного массива
    public static void invArray() {
        int[] arr1 = {1, 1, 5, 6, 1, 2, 1};
        System.out.println("Задание 1");
        //печатаем исходный массив
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(arr1));
        //печатаем измененный массив
        System.out.println("Измененный массив:");
        int count=0;
        for (int i = 0; i < arr1.length; i=i+2) {

            count=count+arr1[i];}
        System.out.println(count);}




    }

