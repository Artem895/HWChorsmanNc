package ChorsmanHomeWork.ChHW3.Ch3;

public class PWFp36 {
    private String name="";
    private String friends="";

    public PWFp36(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void delf(){
        this.friends=" ";
    }
    public void getFreindcount(){
        String[] ar=this.friends.split(" ");
        int i=0;
        for (String a:ar){
            if(!a.equals("")){
                i++;
            }
        }
        System.out.println(this.getName()+" has :"+ i+" freinds");
    }
    public String getFriends() {
        return friends;
    }
    public void befriend(PWFp36 p){
        this.friends+=p.getName()+" ";
        p.friends+=this.getName()+" ";
    }
    public void unfriend(PWFp36 p){
        String[] ar=this.friends.split(" ");
        this.friends=" ";
        int count=0;
        for(int i=0;i<ar.length-1;i++){
            if(!p.getName().equals(ar[i])){
                String[] par=p.getFriends().split(" ");
                p.delf();
                for(int j=0;j<par.length;j++) {
                    if(!this.getName().equals(par[j])){
                        p.friends+=par[j]+" ";
                    }
                }
                this.friends+=ar[i]+" ";
            }
        }

    }
}
