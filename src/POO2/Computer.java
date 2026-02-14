package POO2;

public class Computer {
    private String brand;
    private String model;
    private int ram;
    private int storage;

    public Computer(String brand, String model, int ram, int storage) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ram='" + ram + '\'' +
                ", storage=" + storage +
                '}';
    }

    public int addRam (int ramAddition) {
        int[] capacities = {4,8,16,32,64};
        for (int c : capacities) {
            if (ramAddition == c) {
                return this.ram = ramAddition;
            }
        }
        return -1;
    }

    public int addStorage (int storageAddition) {
        int[] capacities = {256,512,1000,2000};
        for (int c : capacities) {
            if (storageAddition == c) {
                return this.storage = storageAddition;
            }
        }
        return -1;
    }

}
