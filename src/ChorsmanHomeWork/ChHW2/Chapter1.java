package ChorsmanHomeWork.ChHW2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Chapter1 {
    //Exercise 2
    public  static int normalizeone(int a) {
        return a<0?a%359+359:a%359;
    }
    public static   int normalizetwo(int a) {
        /*
        * работа floorMod
        * на вход поступает два числа x и y
        *  возвращает x - floorDiv(x, y) * y;
        * -450-floorDiv(-450,359)*359
        * floorDiv:
        * int r = x / y;// деление целых чисел возвращает целое число , те целое от деления 4/3=1,-4/3=-1//-450/359=-1
        if ((x ^ y) < 0//проверяет разного ли занака х и у && (r * y != x))//проверяет есть ли вообще остаток от деления 359*-1!=-450 true {
            r--;-1-1=-2
        }
        return r;
        * -450-(-2)*359=268 те как раз отнормированный угол
        * */
        return Math.floorMod(a,359);
    }
    //========================================
    //Exercise 6
    public static BigInteger fac(BigInteger n){
        if(n.compareTo(BigInteger.valueOf(1))<0){
            return BigInteger.valueOf(1);
        }
        return fac(n.subtract(BigInteger.valueOf(1))).multiply(n);
    }
    //Exercise 8
    public static void noempetysubstrings(String str){
        String[] str1=str.split(" ");
        for (String s:str1){
            if(s.equals("")) continue;
            else System.out.println(s);
        }
    }
    //Exercise 13
    public static void loteri() {
        ArrayList<Integer> sup= new ArrayList<>();
        int[] res=new int[6];
        for (int i=1; i<=49;i++){
            sup.add(i);
        }
        for (int i=0;i<6;i++){
            int index=rnd(0,sup.size()-1);
            res[i]=sup.get(index);
            sup.remove(index);
        }
        Arrays.sort(res);
        for (int s:res){
            System.out.println(s);
        }
    }
    private static int rnd(int min , int max){
        max -= min;
        return (int) (Math.random()* ++max) + min;
    }
    //Exercises 14
    /*public static void magick(){
        Scanner consol = new Scanner(System.in);
        int n;
        int i=0;
        boolean aurum=true;
        consol.useDelimiter("\n");
        System.out.println("Enter squer size (int):");
        n=consol.nextInt();
        consol.nextLine();
        String lin="www";
        int [][] squer=new int[n][n];
        System.out.println(squer[i].length+" длинна массива");
        while (!lin.equals("")) {
            System.out.println("Next line :");
            lin=consol.nextLine();
            if(!lin.equals("")){
                if(lin.split(" ").length>n){
                    System.out.println("Привышен размер массива");
                    System.out.println("Поброуй еще раз ");
                }
                else if(i>n-1){
                    System.out.println("Привышен размер массива");
                    System.out.println("Навводился строк ,хватит ");
                    break;
                }
                else {
                    //squer[i] = lin.split(" ");
                    squer[i]=Arrays.stream(lin.split(" ")).mapToInt(Integer::parseInt).toArray();
                    System.out.println(lin);
                    System.out.println(i);
                    i++;
                }
            }
            //else continue;
        }
        System.out.println("твой квадрат ");
        for (int[] a:squer){
            for(int m: a){
                System.out.print(m+" ");
            }
            System.out.println();
        }
        int maindiag=0;
        int pobochdiag=0;
        int rsum=0;
        int csum=0;
        int len=n;
        mark:
        while (len>0) {
            for (int row= 0; row <=n-1; row++) {
                for (int col= 0; col <=n-1; col++) {
                    maindiag += squer[col][n-1 - col];
                    pobochdiag += squer[col][col];
                    rsum += squer[row][col];
                    csum += squer[col][row];
                }
                if(maindiag!=pobochdiag||rsum!=maindiag||csum!=maindiag){
                    System.out.println("Плохой квадарт");
                    aurum=false;
                    break mark;
                }
                maindiag=0;
                pobochdiag=0;
                rsum=0;
                csum=0;
                len--;
            }

        }
        if(aurum){
            System.out.println("ЗБс квадратик ");
        }
    }*/

}
