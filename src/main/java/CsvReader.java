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

    private static final String SAMPLE  = "C:\\1\\kapot.csv";//задаем константу пути к файлу
    private static final String SAMPLE1 = "C:\\1\\automarshal.csv";

    //char csvSplitby = ';';
    public static void main (String [] agrs)
//            throws IOException
    {
         try {
             // Reader reader = Files.newBufferedReader(Paths.get(SAMPLE ));
             CSVReader csvReader = new CSVReader(new FileReader(SAMPLE), ';');
      CSVReader csvReader1 = new CSVReader(new FileReader(SAMPLE1),';');
             //
                   // System.out.println(csvReader.getLinesRead());
             //              )

             String[] nextRecord;
             while ((nextRecord = csvReader.readNext()) != null) {
                System.out.println("Артикул    " + nextRecord[0]);
                              }
                                            //List<String[]> records = csvReader.readAll();
             //for (String[] record : records){
String [] nextRecord1;
             while ((nextRecord1 = csvReader1.readNext()) !=null) {
                 System.out.println(nextRecord1[0]);
             }




         } catch (IOException e) {
             System.out.println(e.getMessage());
         }

}
        }




