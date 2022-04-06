package ChorsmanHomeWork.ChHW2.Chapter3;

import java.util.Arrays;
import java.util.NoSuchElementException;

public interface IntSequence {

    void sequnse();

   static IntSequence of(int... values) {
        return new IntSequence() {

            int[] elementData = Arrays.copyOf(values, values.length);

            @Override
            public void sequnse() {
                for(int e:elementData){
                    System.out.println(" "+e);
                }
            }
        };
    }
    static IntSequence cn(int j,int len){
        return ()-> {
            for(int i=0;i<=len;i++)
                System.out.println(j);
        };
    }
    static void constanta(int i, int len) {
        for (int j = 0; j <= len; j++) {
            System.out.print(i);
        }
    }
}
