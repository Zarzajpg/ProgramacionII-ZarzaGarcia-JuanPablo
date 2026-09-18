package Clase5;
public class PruebaConcesionaria {

    public static void main(String[] args) {
        // Creación del objeto concesionaria
        Concesionaria concesionaria = new Concesionaria("AutoCentral");

        // Carga de 5 vehículos de marcas distintas
        concesionaria.agregarVehiculo(new Vehiculo("Toyota", "Corolla", 22000.0));
        concesionaria.agregarVehiculo(new Vehiculo("Ford", "Focus", 18500.0));
        concesionaria.agregarVehiculo(new Vehiculo("Chevrolet", "Cruze", 19000.0));
        concesionaria.agregarVehiculo(new Vehiculo("Volkswagen", "Golf", 21000.0));
        concesionaria.agregarVehiculo(new Vehiculo("Honda", "Civic", 23500.0));

        // Muestra el nombre de la concesionaria
        System.out.println("=== " + concesionaria.getNombre().toUpperCase() + " ===");

        // Prueba 1: Cálculo del valor total del stock
        System.out.println("Valor total del stock: $" + concesionaria.valorTotalStock());

        // Prueba 2: Búsqueda exitosa
        System.out.println("\n--- Búsqueda exitosa ---");
        String marcaBuscada = "Honda";
        Vehiculo encontrado = concesionaria.buscarPorMarca(marcaBuscada);
        if (encontrado != null) {
            System.out.println("Vehículo encontrado para " + marcaBuscada + ": " + encontrado);
        } else {
            System.out.println("No se encontró ningún vehículo de la marca " + marcaBuscada);
        }

        // Prueba 3: Búsqueda sin resultados
        System.out.println("\n--- Búsqueda sin resultados ---");
        String marcaInexistente = "Fiat";
        Vehiculo noEncontrado = concesionaria.buscarPorMarca(marcaInexistente);
        if (noEncontrado != null) {
            System.out.println("Vehículo encontrado para " + marcaInexistente + ": " + noEncontrado);
        } else {
            System.out.println("No se encontró ningún vehículo de la marca " + marcaInexistente);
        }
    }
}
