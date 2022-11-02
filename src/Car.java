import java.io.IOException;

public class Car extends Throwable implements AutoCloseable {
    @Override
    public void close() throws IOException {
        System.out.println("Машина жабылып жатат");
    }
}
