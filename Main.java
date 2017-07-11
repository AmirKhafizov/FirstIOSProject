import java.io.IOException;

/**
 * Created by 1 on 14.05.2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "src/znachenie.txt";
        AlgoritmDeykstra adasd = new AlgoritmDeykstra(fileName);
        System.out.println(adasd.relisation(0,9));
    }
}
