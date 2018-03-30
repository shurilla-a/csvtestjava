import java.util.regex.*;
import com.opencsv.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.nio.file.*;
public class ReGexNew {

     private static final String SAMPLE = "//home//shurilla//mobizon.csv";
     private static final String SAMPLE2 = "//home//shurilla//mobizonlk1.csv";

     public static void main (String[] args) {



         try {

//          ArrayList<String[]>mobizon = new ArrayList<>();
//           ArrayList<String[]>mobizonlk1 = new ArrayList<>();
//
//           CSVReader csvReader2 = new CSVReader(new FileReader(SAMPLE));
//           CSVReader csvReader3 = new CSVReader(new FileReader(SAMPLE2));
//
//           String [] nextRecord2 ;
//
//           while ((nextRecord2 = csvReader2.readNext()) !=null){
//               mobizon.add(nextRecord2);
//           }
//           System.out.println("Размер Файла mobizon "+ mobizon.size() + " строк");
//
//           String[] nextRecord3 ;
//
//           while ((nextRecord3 = csvReader3.readNext())!=null){
//           mobizonlk1.add(nextRecord3);
//
//           }
//           System.out.println("Размер Файла mobizon " + mobizonlk1.size() + " строк");
//
//           String pattern = "(\\d+)";
//
//           Pattern r = Pattern.compile(pattern);
//           Matcher m = r.matcher((CharSequence) mobizon);
//
//           for (String[] mobiz2 : mobizonlk1){
//
//            if (m.find())_
//
//
//           }
//
//
//         } catch (IOException e) {
//
//             System.out.println(e.getMessage());
//           }
//
//     }
//
//  }
