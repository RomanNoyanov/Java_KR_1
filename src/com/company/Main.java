//1. 1-4
//2 16-2
//3 16-5
//4 16-47
//5 4-1
package com.company;
import java.io.File;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
////1.	Вывести на экран текст "Silence is golden".
//        System.out.println("Silence is golden");
// //4.	Вывести на экран букву "W" из символов "*" (звездочка).
//        System.out.println("W*");
//        System.out.println("*     *      *");
//        System.out.println(" *   * *    * ");
//        System.out.println("  * *   * *  ");
//        System.out.println("   *     *   ");
        //---------------------------------------------
        //---------------------2-----------------------
////        16.	Поменяйте местами значения двух переменных, не используя дополнительных переменных
//        int one=1;
//        int two=2;
//        System.out.println("До перестановки:"+"\n"+"one:"+one+ " \n" + "two:"+two);
//        one=one+two;
//        two=two-one;
//        two=-two;
//        one=one-two;
//        System.out.println("После перестановки:"+"\n"+"one:"+one+ " \n" + "two:"+two);
////2.	Пользователь вводит число. Выведите на экран квадрат этого числа, куб этого числа.
//        System.out.println("Введите число:");
//        Scanner in= new Scanner(System.in);
//        int x=in.nextInt();
//
//            System.out.println("Число "+x+" в квадрате "+ Math.pow(x,2));
//          System.out.println("Число "+x+" в кубе "+ Math.pow(x,3));
        //---------------------------------------------
        //---------------------3-----------------------
////5.	Дано два числа. Вывести yes, если они отличаются на 100, иначе вывести No
//        Scanner in=new Scanner(System.in);
//        System.out.println("Введите два числа");
//        int x=in.nextInt();
//        int y=in.nextInt();
//        if((x-y==100)|| (y-x==100)){
//            System.out.println("Yes");
//        }
//        else {System.out.println("No");}

      //55  16.	 Пользователь вводит четыре числа. Найдите наибольшее четное число среди них. Если оно не существует, выведите фразу "not found"
//        int i = 0;
//        int arr[] = new int[4];
//        int max=0;
//        System.out.println("Введите четыре числа для сравнения");
//
//        Scanner in = new Scanner(System.in);
//
//        for(int n = 0; n<arr.length;n++){
//            int x = in.nextInt();
//            arr[n]=x;
//            if(arr[n]%2==0){
//                if(arr[n]>max) {
//                    max = arr[n];
//                }
//            }
//
//
//        }
//        if(max==0){
//            System.out.println("not found"+"\n");
//        }
//        else {
//            System.out.println("\n" + "Наибольшее четное число:" + max);
//        }
//        for(int n = 0; n<arr.length;n++)
//
//    {
//        System.out.print(arr[n]+" ");
//    }

//---------------------------------------------
// ---------------------4-----------------------
//16.	Найдите сумму квадратов первых n натуральных чисел


//        Scanner in=new Scanner(System.in);
//        int n=in.nextInt();
//        int sum=0;
//        if ((n & 1) == 0) {
//            sum = ((n >> 1) * (n + 1));
//        } else {
//            sum = (n * ((n + 1) >> 1));
//        }
//        System.out.println(sum);


//        47.	Два числа называются дружественными, если каждое из них равно сумме всех делителей
//         второго не считая самого этого числа. Найдите все пары дружественных чисел на отрезке [a;b].
//        Scanner in = new Scanner(System.in);
//        int k, i, j, sum1, sum2 ;
//        System.out.print("Введите число с которого начать поиск: ");
//        int a = in.nextInt();
//        System.out.print("Введите число до которого вести поиск: ");
//        int b = in.nextInt();
//        //------------------
//        for (k = a; k <= b; k++) {
//            sum1 = 0;
//            for (i = 1; i < k; i++) {
//                if (k % i == 0) sum1 = sum1 + i;
//            }
//            //System.out.println(sum1);
//            sum2=0;
//            for (int m = 1; m < sum1; m++) {
//
//                if (sum1 % m == 0) sum2 = sum2 + m;
//            }//System.out.println(sum2);
//            if(k==sum2&sum1==sum1)System.out.print(sum1+" ");
//
//        }

//---------------------------------------------
//---------------------5-----------------------
//1.	Пользователь вводит англ. букву, вывести следующие три по алфавиту.
// Если алфавит закончился, то вывести циклично с начала алфавита, то есть если z, то a b c.
// Вывод только маленьких букв. Учесть, что пользователь может ввести заглавную

//
//            char n,i;
//            Scanner in = new Scanner(System.in);
//            System.out.print("Введите символ: ");
//            n=in.useDelimiter(" ").next().charAt(0);
//            System.out.println(n+" ");
//            for(i=n;i<='z';i++){
//                System.out.println(i+"0 ");
//            }
//
//
//                String alphabet = "abcdefghijklmnopqrstuvwxyzabc";
//                String input = new Scanner(System.in).next().substring(0,1);
//
//                int pos = alphabet.indexOf(input.toLowerCase());
//
//                Arrays.asList(alphabet.substring(pos + 1, pos + 4).split("")).forEach(s -> {System.out.println(s);});
//
//
//




//4.	Пользователь вводит положительное целое число.
// Зашифровать каждую цифру серией из букв (конкретный принцип составления серии букв разработать самостоятельно).
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите положительное целое число меньше 10:");
        int x = scanner.nextInt();
        String s;
        switch (x) {
            case 0:
                s = "aaa";
                break;
            case 1:
                s = "aab";
                break;
            case 2:
                s = "abb";
                break;
            case 3:
                s = "bbb";
                break;
            case 4:
                s = "bbc";
                break;
            case 5:
                s = "bcc";
                break;
            case 6:
                s = "ccc";
                break;
            case 7:
                s = "ccd";
                break;
            case 8:
                s = "cdd";
                break;
            case 9:
                s = "ddd";
                break;
            default:
                s = "Вы ввели неверное число";
        }
        System.out.println("Зашифрованная цифра " + x + ":\n" + s);
//
//----------------------------------------------------------------------
//       Scanner in= new Scanner(System.in);
//       int a =in.nextInt();
//        String s =""+a;
//        char[] chars = new char[] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
//        if (a<0) {
//           System.out.println("Число меньше нуля");
//
//       }
//       else{
//            char[] arrCh = s.split("");
//
//           for(int i=0;i<=arrCh.length; i++){
//               arrCh[i]=chars[i+2];
//           }
//        }


//
//        Random gen = new Random();
//        char[] chars = new char[] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
//        //'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
//        char[] cryptList = new char[26];
//
//        int tracker = 0;
//        while(tracker < 26)
//        {
//            int num = gen.nextInt(26);
//            if(cryptList[num] == '\u0000')
//            {
//                cryptList[num] = chars[tracker];
//                tracker++;
//            }
//        }
//
//        for(int i = 0; i < 26; i++)
//        {
//            System.out.println(chars[i] + " " + cryptList[i]);
//        }
//
//


    }

}
