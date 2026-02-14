package POO2;

public class Main {
    public static void main(String[] args) {
        Computer myComputer = new Computer("Acer", "12grate", 16, 250);
        System.out.println(myComputer.toString());;

        int newRam = myComputer.addRam(123);
        int newStorage = myComputer.addStorage(2343);

        if (newRam == -1) {
            System.out.println("No se puede agregar nueva ram");
        }
        if (newStorage == -1 ) {
            System.out.println("No se puede agregar nuevo storage");
        }
        System.out.println(myComputer.toString());;
    }
}
