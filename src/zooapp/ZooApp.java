
package zooapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
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
        
      int opcion=0;
      
      do{
        try{
          mostrarMenu();
          opcion=leer.nextInt();
          leer.nextLine();
          switch(opcion){
              case 1:
                  agregarAnimal(leer);
                  break;
              case 2:
                  agregarEmpleado(leer);
                  break;
              case 3:
                  eliminarAnimal(leer);
                  break;
              case 4:
                  eliminarEmpleado(leer);
                  break;
              case 5:
                  consultarAnimales();
                  break;
              case 6:
                  consultarEmpleado();
                  break;
              case 7:
                  alimentarAnimal(leer);
                  break;
              case 8:
                  System.out.println("Saliendo...");
                  break;
              default:
                  System.out.println("Opcion invalida.");
          }
          }catch(InputMismatchException e){
                  System.out.println("entrada no valida ingrese un numero valido");
                  leer.nextLine();
                  
          
        }
      }while(opcion !=8);
          
        leer.close();
        
        
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
    private static void agregarAnimal(Scanner leer){
        System.out.println("Ingrese el codigo del animal");
        int codigo=leer.nextInt();
        leer.nextLine();
        System.out.println("Ingrese el nombre del animal");
        String nombre=leer.nextLine();
     
        System.out.println("Ingrese el sexo del animal");
        String sexo=leer.nextLine();
        
        System.out.println("ingrese edad del animal");
        int edad=leer.nextInt();
        leer.nextLine();
        System.out.println("ingrese el peso del animal");
        double peso=leer.nextDouble();
       
        System.out.print("Elija la especie del animal:\n" +
                "1. Elefante\n" +
                "2. Jirafa\n" +
                "3. Rinoceronte\n" +
                "4. Cocodrilo\n" +
                "5. Mono\n" +
                "6. Ave\n" +
                "Ingrese la opción: ");
        int especieSeleccionada = leer.nextInt();
        leer.nextLine();

        Animal nuevoAnimal = null;
        switch(especieSeleccionada){
            case 1:
                System.out.println("Ingrese largo de la trompa:");
                int largoTrompa=leer.nextInt();
                nuevoAnimal=new Elefante(codigo, nombre, sexo, edad, peso, largoTrompa);
                break;
            case 2:
                System.out.println("Ingrese largo del cuello:");
                int largoCuello=leer.nextInt();
                nuevoAnimal=new Jirafa(codigo, nombre, sexo, edad, peso, largoCuello);
                break;
            case 3:
                System.out.println("Ingrese largo del cuerno:");
                int largoCuerno=leer.nextInt();
                nuevoAnimal=new Rinoceronte(codigo, nombre, sexo, edad, peso, largoCuerno);
                break;
            case 4:
                System.out.println("Ingrese longitud del cocodrilo:");
                int longitud=leer.nextInt();
                nuevoAnimal=new Cocodrillo(codigo, nombre, sexo, edad, peso, longitud);
                break;
            case 5:
                System.out.println("Ingrese la especie:");
                String especie=leer.nextLine();
                nuevoAnimal=new Mono(codigo, nombre, sexo, edad, peso, especie);
                break;
            case 6:
                System.out.println("Ingrese la especie del ave:");
                String especieAve=leer.nextLine();
                System.out.println("Ingrese el color del ave: ");
                String color=leer.nextLine();
                nuevoAnimal=new Ave(codigo, nombre, sexo, edad, peso, especieAve,color);
                break;
            default:
                System.out.println("Opcion de especie inválida.");
    }
        animales.add(nuevoAnimal);
    }
    
    private static void consultarAnimales (){
        System.out.println("------ Lista de animales------");
        for (Animal animal : animales){
            System.out.println("Codigo: " + animal.getCodigo());
            System.out.println("Nombre: " + animal.getNombre());
            System.out.println("Sexo: " + animal.getSexo());
            System.out.println("Edad: " + animal.getEdad());
            System.out.println("Peso: " + animal.getPeso());
            System.out.println("------------------------------------");
        }
            
    }//finconsultarAnimal
    private static void agregarEmpleado(Scanner leer){
        System.out.println("Ingrese el nombre del Empleado");
        String nombre=leer.nextLine();
        System.out.println("Elija el turno del empleado: \n " +
                "1. Turno 1\n "+
                "2. Turno 2\n "+
                "3. Turno 3\n "+
                "4. Turno 4\n "+
                "Ingrese la opcion: ");
        int turnoSeleccionado =leer.nextInt();
        String turno = "";
        
        switch (turnoSeleccionado){
            case 1:
                turno = "Turno 1 de 6 a 12";
                break;
            case 2:
                turno = "Turno 2 de 12 a 18";
                break;
            case 3:
                turno = "Turno 3 de 18 a 24";
                break;
            case 4:
                turno = "Turno 4 de 24 a 6";
                break;
            default: 
                System.out.println("Opcion de turno invalida");
                return;
        }
        
        Empleado nuevoEmpleado= new Empleado(nombre, turno);
        empleados.add(nuevoEmpleado);
        System.out.println("Empleado agregado exitosamente.");
    }
    private static void consultarEmpleado(){
        System.out.println("-------Lista de empleados-------");
        for(Empleado empleado: empleados){
            System.out.println("Nombre: " +empleado.getNombre());
            System.out.println("Nombre: " +empleado.getTurno());
            System.out.println("-------------------------------");
        }
    }
    
    private static Empleado encontrarEmpleadoPorNombre(String nombre){
        for (Empleado empleado : empleados) {
           if (empleado.getNombre().equalsIgnoreCase(nombre)){
               return empleado;
           }
            
        }
          return null;
    }
       private static void eliminarEmpleado(Scanner leer){
            System.out.println("Ingrese el nombre del empelado a eliminar");
            String nombre = leer.nextLine();
            
            Empleado empleadoEncontrado= encontrarEmpleadoPorNombre(nombre);
            if (empleadoEncontrado != null) {
                empleados.remove(empleadoEncontrado);
                System.out.println("Se elimino al empleado");
                
            }else{
                System.out.println("Empleado no encontrado");
            }
     }
       private static Animal encontrarAnimalPorCodigo(int codigo){
        for (Animal animal : animales) {
           if (animal.getCodigo()==(codigo)){
               return animal;
           }
            
        }
          return null;
    }
       private static void eliminarAnimal(Scanner leer){
            System.out.println("Ingrese el codigo del animal");
            int codigo = leer.nextInt();
            
            Animal animalEncontrado= encontrarAnimalPorCodigo(codigo);
            if (animalEncontrado != null) {
                empleados.remove(animalEncontrado);
                System.out.println("Se elimino el animal");
                
            }else{
                System.out.println("animal no encontrado");
            }
       }
            private static void alimentarAnimal(Scanner leer){
                System.out.println("Ingreso el  codigo del animal a alimentar");
                int codigo = leer.nextInt();
                leer.nextLine();
                
                Animal animalEncontrado = encontrarAnimalPorCodigo(codigo);
                if (animalEncontrado != null){
                    double comida = animalEncontrado.calcularComida();
                    System.out.println("Se debe dar " + comida + " kg de comida a " + animalEncontrado.getNombre());
                }else{
                    System.out.println("Animal no encontrado");
                }
                
            }
     }


