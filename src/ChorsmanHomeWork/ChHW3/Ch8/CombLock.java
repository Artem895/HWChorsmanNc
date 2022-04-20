package ChorsmanHomeWork.ChHW3.Ch8;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class CombLock {
    private String secret1;
    private String secret2;
    private String secret3;
    private int givensecret1;
    private int givensecret2;
    private int givensecret3;
    private int count;

    public CombLock(int secret1,int secret2,int secret3) throws NoSuchAlgorithmException {
        this.secret1 = this.hash(secret1);
        this.secret2 = this.hash(secret2);
        this.secret3 = this.hash(secret3);
    }
    public void instruction(){
        System.out.println("U need 1st to call turnright method ");
        System.out.println("Then u need to call turnleft method  ");
        System.out.println("after turnleft u need to call  turnright method ");
        System.out.println("And finally u need to  call open method ");
        System.out.println("That return true if your combination equals to the secretcombination ");
    }

    public String getSecret1() {
        return secret1;
    }

    public String getSecret2() {
        return secret2;
    }

    public String getSecret3() {
        return secret3;
    }

    public void reset(){
        this.givensecret1=0;
        this.givensecret2=0;
        this.givensecret3=0;

    }
    public void Turnright(int ticks) {
        if(count==0){
            this.givensecret1+=ticks;
            this.givensecret2=this.givensecret1;
            count++;
            System.out.println(this.givensecret1+" -1");
        }
        else if(count==1){
            System.out.println("Now u need to turn left");
        }
        else if(count==2){
            this.givensecret3+=ticks;
            if(this.givensecret3>39){
                this.givensecret3=this.givensecret3-39;
            }
            count=0;
            System.out.println(this.givensecret3+" -3");
            System.out.println("It was the last");
        }
    }
    public void TurnLeft(int tiks)  {
        if (count==1){
            this.givensecret2-=tiks;
            if(this.givensecret2<0){
                this.givensecret2=39+this.givensecret2;
            }
            this.givensecret3=this.givensecret2;
            count++;
            System.out.println(this.givensecret2+" -2");
        }else System.out.println("U need to turn right");
    }
    public boolean open() throws NoSuchAlgorithmException {
        return this.hash(this.givensecret1).equals(secret1)&&
                this.hash(this.givensecret2).equals(secret2)&&
                this.hash(this.givensecret3).equals(secret3);
    }
    private String hash(int s) throws NoSuchAlgorithmException {
        String str=Integer.toString(s);
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        md5.update(StandardCharsets.UTF_8.encode(str));
        return String.format("%032x", new BigInteger(1, md5.digest()));

    }
}
