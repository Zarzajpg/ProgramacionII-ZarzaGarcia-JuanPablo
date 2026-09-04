// Importación de clases de la API java.time para manejar fechas y calcular lapsos de tiempo
import java.time.LocalDate;
import java.time.Period;

/**
 * Clase que representa a una Persona y gestiona la captura
 * de sus datos personales y el cálculo de su edad.
 */
public class Pruebapersona {
    // Atributos de la clase
    // al no llevar 'private', tienen visibilidad por defecto (package-private).
	String nombre;
    String apellido;
    LocalDate nacimiento;
    /**
     * Punto de entrada principal del programa.
     */
    public static void main(String[] args) {
        //Creación e interacción con el primer objeto Persona
		Pruebapersona p1 = new Pruebapersona();
		p1.mostrarNombre(); //Captura del nombre
		p1.mostrarApellido(); //Captura del apellido
		p1.mostrarnacimiento(); //Captura de la fecha de nacimiento
        
        //Creación e interacción con el segundo objeto Persona
        Pruebapersona p2 = new Pruebapersona(); 
		p2.mostrarNombre(); //Captura del nombre
		p2.mostrarApellido(); //Captura del apellido
		p2.mostrarnacimiento(); //Captura de la fecha de nacimiento
        
        //Muestra en consola el saludo con los datos procesados de cada persona
        p1.saludo();
        p2.saludo();
	}
    
    /**
     * Solicita por consola el nombre de la persona y lo asigna al atributo nombre.
     */
    public void mostrarNombre() {
        System.out.println("Ingrese su nombre: ");
        // Lee la entrada de texto ingresada por el usuario y la asigna al atributo nombre
        nombre = System.console().readLine();
    }

    /**
     * Solicita por consola el apellido de la persona y lo asigna al atributo apellido.
     */
    public void mostrarApellido() {
        System.out.println("Ingrese su apellido: ");
        // Lee la entrada de texto ingresada por el usuario y la asigna al atributo apellido
        apellido = System.console().readLine();
    }

    /**
     * Solicita por consola la fecha de nacimiento en formato YYYY-MM-DD y lo convierte a un objeto de tipo LocalDate.
     */
    public void mostrarnacimiento() {
        System.out.println("Ingrese su fecha de nacimiento (YYYY-MM-DD): ");
        String fechaNacimientoStr = System.console().readLine();
        //Convierte el String leido a una instancia valida de LocalDate.
        nacimiento = LocalDate.parse(fechaNacimientoStr);
    }

    /**
     * Calcula la edad actual en años a partir de la fecha de nacimiento
     * e imprime un saludo descriptivo en la consola.
     */
    public void saludo() {
        LocalDate hoy = LocalDate.now();
        // Calcula el período (diferencia) transcurrido entre la fecha de nacimiento y hoy
        Period edad = Period.between(nacimiento, hoy);
       
       // Imprime el mensaje final obteniendo solo la parte correspondiente a los años
        System.out.println("Hola mi nombre es " + nombre + " " + apellido + ", tengo " + edad.getYears() + " años.");
    }

}
