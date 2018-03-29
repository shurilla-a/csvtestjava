import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.io.FileReader;
//import java.io.Reader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

//import java.util.regex.Pattern;
//import java.util.regex.Matcher;
//import java.nio.file.Files;
//import java.nio.file.Paths;

public class CsvReader {

    private static final String SAMPLE  = "//home//shurilla//mobizon.csv";//задаем константу пути к файлу
    private static final String SAMPLE1 = "//home//shurilla//mobizonlk2.csv";
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
             System.out.println("start read file1");
             while ((nextRecord = csvReader.readNext()) != null) {
                // System.out.println("Телефон   " + nextRecord[3] + "  Статус  " + nextRecord[5]);
                 mobizon.add(nextRecord);
             }

             System.out.println(mobizon.size());


             String[] nextRecord1;
             System.out.println("start read file2");
             while ((nextRecord1 = csvReader1.readNext()) != null) {
                 //System.out.println("Телефон " + nextRecord1[0] + " Статус " + nextRecord1[4]);
                 mobizonlk1.add(nextRecord1);

             }
             System.out.println(mobizonlk1.size());

             long progress = 0;
             for (String[] mobiz1 : mobizon) {
                for (String[] mobiz2 : mobizonlk1) {
                    System.out.format("\r[%d/%d] ", progress, mobizon.size());
                     //if ((mobiz1[4] == mobiz2[4]) && (mobiz1[5] == mobiz2[5])) {
                    if ((mobiz1[3].equals(mobiz2[0]) && (mobiz1[5].equals(mobiz2[4]))) ) {
                        System.out.println("Дата " + mobiz1[0] + " ID " + mobiz1[1] + " Номер " + mobiz1[3] + " Статус " + mobiz1[5] + " Дата и Время " + mobiz1[6]);

                        CSVWriter writer = new CSVWriter(new FileWriter(OUT,true));
                        writer.writeNext(mobiz1);
                         writer.flush();
                    }

//                     CSVWriter writer = new CSVWriter(new FileWriter(OUT));
//                     writer.writeNext(mobiz1);
//                     writer.close();

                    //                 System.out.println("Дата " + mobiz1[0] + " ID " + mobiz1[1] + " Номер " + mobiz1[3] + " Статус " + mobiz1[5] + " Дата и Время " + mobiz1[6]);


  ///               CSVWriter writer = new CSVWriter(new FileWriter(OUT));
     //            writer.writeNext(mobiz1);
       //          writer.close();

                }

                progress++;
             }
         } catch (IOException e) {
             System.out.println(e.getMessage());
         }
    }
}