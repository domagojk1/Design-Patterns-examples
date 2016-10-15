package builder;

/**
 * Builder pattern implementation
 */
public class Computer {
    private String hdd;
    private String ram;
    private boolean isGraphicsEnabled;
    private boolean isBluetoothEnabled;

    private Computer(ComputerBuilder computerBuilder) {
        this.hdd = computerBuilder.hdd;
        this.ram = computerBuilder.ram;
        this.isGraphicsEnabled = computerBuilder.isGraphicsEnabled;
        this.isBluetoothEnabled = computerBuilder.isBluetoothEnabled;
    }

    public String getHdd() {
        return hdd;
    }

    public String getRam() {
        return ram;
    }

    public boolean isGraphicsEnabled() {
        return isGraphicsEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    public static class ComputerBuilder {
        private String hdd;
        private String ram;
        private boolean isGraphicsEnabled;
        private boolean isBluetoothEnabled;

        public ComputerBuilder(String hdd, String ram) {
            this.hdd = hdd;
            this.ram = ram;
        }

        public ComputerBuilder setGraphicsEnabled (boolean isGraphicsEnabled) {
            this.isGraphicsEnabled = isGraphicsEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled (boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Computer build () {
            return new Computer(this);
        }
    }
}
