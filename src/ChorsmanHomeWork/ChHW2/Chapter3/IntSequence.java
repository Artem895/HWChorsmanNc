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
                for (int s : elementData) {
                    System.out.print(" " + s);
                }
            }

        };
    }

    static void constanta(int i, int len) {
        for (int j = 0; j <= len; j++) {
            System.out.print(i);
        }
    }
}
