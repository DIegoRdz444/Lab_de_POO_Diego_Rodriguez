package lab03_encapsulamiento;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Sistema de Transporte Multimodal ===\n");

        // Automóvil
        Automovil auto = new Automovil("Toyota", "Corolla", 2022, 180.0, 4, false);
        System.out.println("-- Automovil --");
        System.out.println(auto);
        auto.setAnio(1800);       // error
        auto.setNumPuertas(10);   // error
        auto.setAnio(2023);       // válido
        auto.setNumPuertas(4);    // válido
        System.out.println(auto);

        System.out.println();

        // Avión
        Avion avion = new Avion("Boeing", "737", 2019, 850.0, 2, 12000);
        System.out.println("-- Avion --");
        System.out.println(avion);
        avion.setAltitudMaxima(-500); // error
        avion.setAltitudMaxima(13000); // válido
        System.out.println(avion);

        System.out.println();

        // Barco
        Barco barco = new Barco("Ferretti", "550", 2020, 45.0, "Fibra de vidrio", 300);
        System.out.println("-- Barco --");
        System.out.println(barco);
        barco.setTonelajeMaximo(-100); // error
        barco.setTonelajeMaximo(500);  // válido
        System.out.println(barco);
    }
}
