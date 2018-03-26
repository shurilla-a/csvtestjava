import com.opencsv.CSVReader;

import java.io.FileReader;
//import java.io.Reader;
import java.io.IOException;
//import java.util.regex.Pattern;
//import java.util.regex.Matcher;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.util.List;
public class CsvReader {

    private static final String SAMPLE  = "//home//shurilla//mobizon.csv";//задаем константу пути к файлу
    private static final String SAMPLE1 = "//home//shurilla//mobizonlk1.csv";

    //char csvSplitby = ';';
    public static void main (String [] agrs)
//            throws IOException
    {
         try {
             // Reader reader = Files.newBufferedReader(Paths.get(SAMPLE ));
      CSVReader csvReader = new CSVReader(new FileReader(SAMPLE));
      CSVReader csvReader1 = new CSVReader(new FileReader(SAMPLE1));
             //
                   // System.out.println(csvReader.getLinesRead());
             //              )

             String[] nextRecord;
             while ((nextRecord = csvReader.readNext()) != null) {
              System.out.println("Телефон   " + nextRecord[3] + "  Статус  " + nextRecord [5]);
                      }
                                            //List<String[]> records = csvReader.readAll();
             //for (String[] record : records){
 String [] nextRecord1;
             while ((nextRecord1 = csvReader1.readNext()) !=null) {
                 System.out.println("Телефон " + nextRecord1[0] + " Статус " + nextRecord1[4]);
             }




         } catch (IOException e) {
             System.out.println(e.getMessage());
         }

}
        }




