import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 1 on 14.05.2017.
 */
public class Point {
    private ArrayList<Integer> point;
    private ArrayList<Integer> length;
    public ArrayList<Integer> getPoint(){
        return this.point;
    }
    public ArrayList<Integer> getLength(){
        return this.length;
    }
    public Point(String s) throws IOException {
        point = new ArrayList<>();
        length = new ArrayList<>();
        String [] str = s.split(" ");
        for (int i = 0; i < str.length; i++) {
            if(str[i].compareTo("0")!= 0){
                point.add(i);
                length.add(Integer.parseInt(str[i]));
            }
        }
    }
}
