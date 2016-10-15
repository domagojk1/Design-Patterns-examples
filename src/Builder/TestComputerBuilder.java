package Builder;

/**
 * Created by domagoj on 10/15/16.
 */
public class TestComputerBuilder {

    public static void main (String[] args) {
        Computer computer = new Computer.ComputerBuilder ("500 GB", "8 GB")
                .setBluetoothEnabled (false)
                .setGraphicsEnabled (true)
                .build();

        System.out.println (computer.getHdd());
    }
}
