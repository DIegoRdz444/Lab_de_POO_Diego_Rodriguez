package Lab02;

public class Animal {
    private String nombre;
    private int edad;
    private double peso;

    public Animal(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }

    public void dormir() {
        System.out.println(nombre + " está durmiendo.");
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " | Edad: " + edad + " años | Peso: " + peso + " kg";
    }

    // Getter para nombre (para usar en clases hijas)
    public String getNombre() {
        return nombre;
    }
}
