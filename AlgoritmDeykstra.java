import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 1 on 14.05.2017.
 */
public class AlgoritmDeykstra {
    private ArrayList<Point> top;
    public AlgoritmDeykstra(){
        this.top = new ArrayList<>();
    }
    public AlgoritmDeykstra(String fileName) throws IOException {
        this.top = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        List<String> lines = new ArrayList<String>();
        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }
        Point p ;
        for (int i = 0; i < lines.size() ; i++) {
            p = new Point(lines.get(i));
            top.add(p);
        }
    }
    public int relisation(int start, int end){
        int n = top.size();
        int [] arr = new int[n];
        int [] flag = new int[n];//0 - неопределенное 1 - знаем как дойти 2 - обошли вершину
        for (int i = 0; i <n ; i++) {
            arr[i] = (i==start)?0:-1;
            flag[i] = 0;
        }
        boolean flag2 = true;;
        int k = start;
        int t;
        while(flag2){
            for (int i = 0; i < top.get(k).getPoint().size() ; i++) {
                t = top.get(k).getPoint().get(i);
                if(arr[t] == -1 ){
                    arr[t] = top.get(k).getLength().get(i)+ arr[k];
                    flag[t] = 1;
                }else
                {
                    if(arr[k] + top.get(k).getLength().get(i) < arr[t]){
                        arr[t] = arr[k] + top.get(k).getLength().get(i);
                        flag[t] = 1;
                    }
                }
            }
            flag[k] = 2;
            flag2 = false;
            for (int i = 0; i < n ; i++) {
                if(flag[i] == 1){
                    flag2 = true;
                    k =i;
                    break;
                }
            }
        }
        return arr[end];
    }


}
