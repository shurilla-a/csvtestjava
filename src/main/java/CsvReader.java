import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.io.FileReader;
//import java.io.Reader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

//import java.util.regex.Pattern;
//import java.util.regex.Matcher;
//import java.nio.file.Files;
//import java.nio.file.Paths;

public class CsvReader {

    private static final String SAMPLE  = "//home//shurilla//mobizon.csv";//задаем константу пути к файлу
    private static final String SAMPLE1 = "//home//shurilla//mobizonlk1.csv";
    private static final String OUT = "//home//shurilla//out.csv";
    //char csvSplitby = ';';
    public static void main (String [] agrs)
//            throws IOException
    {
         try {
             ArrayList<String[]> mobizon = new ArrayList<>();
             ArrayList<String[]> mobizonlk1 = new ArrayList<>();

             // Reader reader = Files.newBufferedReader(Paths.get(SAMPLE ));
             CSVReader csvReader = new CSVReader(new FileReader(SAMPLE));
             CSVReader csvReader1 = new CSVReader(new FileReader(SAMPLE1));


             String[] nextRecord;
             while ((nextRecord = csvReader.readNext()) != null) {
                // System.out.println("Телефон   " + nextRecord[3] + "  Статус  " + nextRecord[5]);
                 mobizon.add(nextRecord);
             }
             // System.out.println(mobizon.size());


             String[] nextRecord1;
             while ((nextRecord1 = csvReader1.readNext()) != null) {
                 //System.out.println("Телефон " + nextRecord1[0] + " Статус " + nextRecord1[4]);
                 mobizonlk1.add(nextRecord1);

             }
             for (String[] mobiz1 : mobizon) {


             for (String[] mobiz2 : mobizonlk1) {

             if ((mobiz1[3] == mobiz2[0] ) && (mobiz1[5] == mobiz2[4])) ;

  //               System.out.println("Дата "+ mobiz1 [0] + " ID " + mobiz1[1] + " Номер " + mobiz1[3] + " Статус " + mobiz1[5] + " Дата и Время " + mobiz1[6]);


//             System.out.println("Дата "+ mobiz1 [0] + " ID " + mobiz1[1] + " Номер " + mobiz1[3] + " Статус " + mobiz1[5] + " Дата и Время " + mobiz1[6]);

                 //CSVWriter writer = new CSVWriter(new FileWriter(OUT));
                 //writer.writeNext(mobiz1);
                 //writer.close();
             }
         System.out.println("Дата "+ mobiz1 [0] + " ID " + mobiz1[1] + " Номер " + mobiz1[3] + " Статус " + mobiz1[5] + " Дата и Время " + mobiz1[6]);
// !!!!!!!!!!!!!!!! Задать вопрос Леха почему вывод здесь  !!!!!!!!!!!!!!!!!
             }

  //         Arrays.equals(ne,nextRecord1);
//System.out.println(Arrays.equals(nextRecord,nextRecord1));
//System.out.println(nextRecord1);
         } catch (IOException e) {
             System.out.println(e.getMessage());
         }

}
        }




