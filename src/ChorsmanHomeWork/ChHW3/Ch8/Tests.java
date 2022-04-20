package ChorsmanHomeWork.ChHW3.Ch8;



import java.security.NoSuchAlgorithmException;

public class Tests {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        CombLock combLock=new CombLock(23,34,12);
        System.out.println(combLock.getSecret1());
        System.out.println(combLock.getSecret2());
        System.out.println(combLock.getSecret3());
        combLock.instruction();
        combLock.reset();
        combLock.Turnright(23);
        combLock.TurnLeft(28);
        combLock.Turnright(17);
        System.out.println(combLock.open());




    }
}
