package ChorsmanHomeWork.ChHW2;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.List;

public class MainTest {
    public static  void main(String[] args) throws FileNotFoundException {
        List<Mycl> mycls3= new CsvToBeanBuilder(new FileReader("C:\\Users\\newes\\Desktop\\laba\\submissions_data_train.csv"))
                .withType(Mycl.class).build().parse();
        for(Mycl cl:mycls3){
            System.out.println(cl.getStep_id()+" "+ cl.getSubmission_status()+" "
                    + cl.getTimestamp()+" "+cl.getUser_id());
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


