import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FindPrice{
    public final static String FILE_NAME = "file.csv"; 
    
    public static int findProduct(int product_id){
        // FileInputStream is to read bytes but FileReader is to read texts. 
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        try{
            BufferedReader bfReader = new BufferedReader(new FileReader("product.csv")); 
            String line = bfReader.readLine();
            while((line = bfReader.readLine()) != null){
                String[] token = line.split(",");
                map.put(Integer.valueOf(token[0].trim()), Integer.valueOf(token[2].trim()));
            }
        } catch (FileNotFoundException e) {  // FileNotFoundException extends IOException. Hence subclass should be caught before baseclass.
            System.out.println(e);
        } catch (IOException e){
            System.out.println(e);
        } 

        return map.get(product_id);
    }

    public static void main(String[] args){

        System.out.println(findProduct(111));
    }



}