package ChorsmanHomeWork.ChHW2.Chapter3;

public class tets {
    public static void main(String[] args) {
        Measurable e1=new Employ(230,"Josh");
        Measurable e2=new Employ(130,"Bob");
        Measurable e3=new Employ(330,"Bread");
        Measurable e4=new Employ(730,"Dean");
        Measurable e5=new Employ(430,"Sam");
        Measurable e6=new Employ(530,"Kas");
        Measurable e7=new Employ(630,"Lusi");
        Measurable e8=new Employ(30,"Vagner");
        Measurable[] arr={e1,e2,e3,e4,e5,e6,e7,e8};
        System.out.println(average(arr));
        largest(arr);
        /*IntSequence sequence = IntSequence.of(3, 1, 4, 1, 5, 9);
        sequence.sequnse();*/
        System.out.println();
        IntSequence in=IntSequence.cn(1,7);
        in.sequnse();
    }

    public static double average(Measurable[] objs){
        double avg = 0;
        for(Measurable m:objs){
            avg+=m.getMeasure()/objs.length;
        }
        return avg;
    }
    static void largest(Measurable[] objs){
        Employ maxwrk= (Employ) objs[0];
        /*
         * кастую ток потому что у Employ имеет метод getname
         * Merurable-нет
         *
         */
        for(Measurable m:objs){
            Employ wrk=(Employ) m;
            if(wrk.getMeasure()> maxwrk.getMeasure()){
                maxwrk=wrk;
            }
        }
        System.out.println(maxwrk.getName());
    }

}
