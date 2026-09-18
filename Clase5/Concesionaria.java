package Clase5;
import java.util.ArrayList; // Importación necesaria para usar listas dinámicas
import java.util.List;      // Importación de la interfaz List

public class Concesionaria {
    // Atributos de la concesionaria
    private String nombre;
    private List<Vehiculo> vehiculos; // Colección de vehículos

    // Constructor que inicializa la lista vacía de vehículos
    public Concesionaria(String nombre) {
        this.nombre = nombre;
        this.vehiculos = new ArrayList<>(); // Instanciación del ArrayList
    }

    // Retorna el nombre de la concesionaria
    public String getNombre() {
        return nombre;
    }

    // Agrega un nuevo vehículo a la colección si no es nulo
    public void agregarVehiculo(Vehiculo v) {
        if (v != null) {
            vehiculos.add(v); // Añade el objeto a la lista
        }
    }

    // Busca y retorna el primer vehículo que coincida con la marca o null si no existe
    public Vehiculo buscarPorMarca(String marca) {
        for (Vehiculo v : vehiculos) {
            // equalsIgnoreCase compara el texto ignorando mayúsculas y minúsculas
            if (v.getMarca().equalsIgnoreCase(marca)) {
                return v; // Retorna el primer vehículo encontrado
            }
        }
        return null; // Retorna null si la búsqueda no tuvo coincidencias
    }

    // Calcula y retorna la suma de los precios de todos los vehículos
    public double valorTotalStock() {
        double total = 0;
        for (Vehiculo v : vehiculos) {
            total += v.getPrecio(); // Suma el precio de cada vehículo al acumulador
        }
        return total;
    }
}