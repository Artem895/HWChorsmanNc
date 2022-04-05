package ChorsmanHomeWork.ChHW2.Chapter2;

import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class MainTest {
    public static  void main(String[] args) throws FileNotFoundException {
        List<Mycl> mycls3= new CsvToBeanBuilder(new FileReader("C:\\Users\\newes\\Desktop\\laba\\submissions_data_train.csv"))
                .withType(Mycl.class).build().parse();
       //System.out.println(mycls3.get(0).getStep_id());
        int len=mycls3.size();
        System.out.println(len+" lkbyyf" );
       for(int i=0;i<=len-1;i++){
           if(mycls3.get(i).getSubmission_status().equals("wrong")){
               System.out.println(mycls3.get(i).getUser_id()+"-не закончил шаг  -"+mycls3.get(i).getStep_id());
           }
       }

           /* Mycl mycl1=new Mycl(1,1,"wrong",34);
            Mycl mycl2=new Mycl(2,2,"wrong",35);
            Mycl mycl3=new Mycl(3,3,"wrong",36);
            List<Mycl> mycls1=new ArrayList<>();
            mycls1.add(mycl1);
            mycls1.add(mycl2);
            mycls1.add(mycl3);
            Writer writer = new FileWriter("src/ChorsmanHomeWork/ChHW2/ttt.csv");
            StatefulBeanToCsv beanToCsv = new StatefulBeanToCsvBuilder(writer).build();
            beanToCsv.write(mycls1);
            writer.close();
           CSVReader reader = new CSVReader(new FileReader("src/ChorsmanHomeWork/ChHW2/submissions_data_train.csv"));
            String [] nextLine;
            List<Mycl> mycls2=new ArrayList<>();
            while ((nextLine = reader.readNext()) != null) {
                for(String par:nextLine){
                    System.out.print(par+" ");
                }
                System.out.println();
            }*/

        }

    }


