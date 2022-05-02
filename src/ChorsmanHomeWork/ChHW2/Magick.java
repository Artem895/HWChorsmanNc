package ChorsmanHomeWork.ChHW2;

import java.util.Arrays;
import java.util.Scanner;

public class Magick {
   public static void msquer(){
       Scanner consol = new Scanner(System.in);
       int n;
       int i=0;
       consol.useDelimiter("\n");
       System.out.println("Enter squer size (int):");
       n=consol.nextInt();
       consol.nextLine();
       String lin="www";
       int [][] squer=new int[n][n];
       System.out.println(squer[i].length+" длинна массива");
       squer=creat(lin,n,squer,i,consol);
       view(squer);
       proverka(n,squer);
    }
    private static int[][] creat(String lin,int n,int[][] squer,int i,Scanner consol){
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
                    squer[i]= Arrays.stream(lin.split(" ")).mapToInt(Integer::parseInt).toArray();
                    System.out.println(lin);
                    System.out.println(i);
                    i++;
                }
            }
            //else continue;
        }
        return squer;
    }
    private static void view(int [][] squer){
        System.out.println("твой квадрат ");
        for (int[] a:squer){
            for(int m: a){
                System.out.print(m+" ");
            }
            System.out.println();
        }
    }
    private static void proverka(int n,int[][] squer){
        boolean aurum=true;
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
    }
}
