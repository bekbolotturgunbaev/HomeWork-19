import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        try (Car car = new Car()) {
            System.out.println(drive("Машина журуп бара жатат"));
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static String drive(String car) {
            return car;
    }
}
