package Task1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by 1 on 22.06.2017.
 */
public class Task1 {
    public static void main(String[] args) throws IOException {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader("src/Task1/input.txt"));
        int simbol = reader.read();
        while(simbol!=' '){
            simbol +=  reader.read();
        }
        while (simbol != '#' ){
            char c = (char) simbol;
            if (simbol != ' '){
                if(hashMap.containsKey(simbol)){
                    hashMap.put((char) simbol,hashMap.get(simbol)+1);
                }else {
                    hashMap.put((char) simbol, 1);
                }
            }
            simbol = reader.read();
            while(simbol!=' ' || simbol!='#'){
                simbol += reader.read();
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue() + " раз");
        }
    }


}
