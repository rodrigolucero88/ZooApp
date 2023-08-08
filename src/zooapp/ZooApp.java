
package zooapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 Un zoológico necesita cargar los animales q posee en el sector norte de este, allí se encuentran 6 especies, 
  todos animales comparten algunas características como, peso, nombre, sexo,edad , y algunos particulares como
  el elefante el largo de la trompa, de la jirafa el largo de cuello, el rinoceronte el largo de su cuerno mayor, 
  del cocodrilo su longitud, de mono la especie y de aves el color y la especie. Cada animal tiene un código único de identificación.
  También se desea agregar en un registro los empleados y el turno en q trabajaron,
  el zoo cuenta con 4 turnos y 4 empleados con turnos rotativos.
Además se debe poder consultar cuanta comida requiere cada especie. El cálculo se basa según su peso, el elefante come 4 veces su peso,
 el rinoceronte 3 veces su peso, la jirafa la mitad de su peso, el mono un cuarto de su peso las aves un tercio y el cocodrilo su mismo peso.
El sistema debe tener un menú por el cual podamos agregar un animal nuevo, un empleado nuevo, eliminar un animal y un empleado,
 consultar la lista de animales, completo o por especie, consultar los empleados y sus turnos. 
 Consultar cuanto alimento se le debe dar a cada animal qué se desee alimentar.
También el sistema debe permitir el logueo al sistema de los empleados antes de realizar cualquier tarea.
 */
public class ZooApp {

    private static List<Animal> animales = new ArrayList<>();
    private static List<Empleado> empleados =  new ArrayList<>();
    private static Map<String,String> usuarios = new HashMap<>();
    
    public static void main(String[] args) {
        usuarios.put("usuario1","password1");
        
        
      Scanner leer = new Scanner(System.in);
           
      
      boolean autenticado = false;
      
      do {
          System.out.println("Usuario: ");
          String usuario = leer.nextLine();
          System.out.println("Contraseña: ");
          String contraseña = leer.nextLine();
          autenticado = autenticar(usuario, contraseña);
      }while(!autenticado);
        
        
        
        
    }
    
    private static boolean autenticar(String usuario, String contraseña){
        String contraseñaGuardada = usuarios.getOrDefault(usuario, "");
        return contraseñaGuardada.equals(contraseña);
    }
     
    private static void mostrarMenu() {
        System.out.println("----- Menú -----");
        System.out.println("1. Agregar animal");
        System.out.println("2. Agregar empleado");
        System.out.println("3. Eliminar animal");
        System.out.println("4. Eliminar empleado");
        System.out.println("5. Consultar animales");
        System.out.println("6. Consultar empleados");
        System.out.println("7. Alimentar animal");
        System.out.println("8. Salir");
        System.out.print("Ingrese una opción: ");
    }
    
}
