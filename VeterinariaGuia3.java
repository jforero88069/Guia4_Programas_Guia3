package veterinariaguia3;

import java.util.ArrayList;
import java.util.Scanner;
import veterinariaguia3.Perros;

public class VeterinariaGuia3 {

    static int a = 5, opc;
    static char r = 'n';
    static  String localidad;
    static Scanner scanner = new Scanner(System.in);
    static Perros perro, perro1, perro2, perro3, perro4, perro5, perro6, perro7, perro8, perro9, perro10;
    static ArrayList<Perros> listPerros = new ArrayList<Perros>();
    static ArrayList<String> listLocal = new ArrayList<String>();
    
    public static void main(String[] args) {
        System.out.println("Bienvenido a la Veterinaria Guia 3");        
        System.out.println("      Base de Datos de Perros");      
    
    //Generamos Base de datos Inicial (10 Perros)
    // Perro 1
    perro1 = (Perros) new Perros();
        perro1.setNombre((String)"Bruno");
        perro1.setRaza((String)"Labrador");
        localidad = (String)"suba";
        perro1.setLocalidad(localidad);
        perro1.setDueño((String)"Andrea");
        perro1.setCedula((String)"477" );
        perro1.setTelefono((String)"4760322");
        perro1.setAsistencia((String)"Lunes");
        listPerros.add(perro1);            
        boolean existe = false;
            for (int i = 0; i < listLocal.size(); i++){
                if (listLocal.get(i).equals(localidad)){
                    existe = true;
                }
            }
            if (existe == false){
                listLocal.add(localidad);
            }    
    // Perro 2
    perro2 = (Perros) new Perros();
        perro2.setNombre((String)"Mateo");
        perro2.setRaza((String)"Pastor Aleman");
        localidad = (String)"chapinero";
        perro2.setLocalidad(localidad);
        perro2.setDueño((String)"Juan");
        perro2.setCedula((String)"507" );
        perro2.setTelefono((String)"5610354");
        perro2.setAsistencia((String)"Miercoles");
        listPerros.add(perro2);            
            for (int i = 0; i < listLocal.size(); i++){
                if (listLocal.get(i).equals(localidad)){
                    existe = true;
                }
            }
            if (existe == false){
                listLocal.add(localidad);
            }
       
    // Perro 3
    perro3 = (Perros) new Perros();
        perro3.setNombre((String)"Max");
        perro3.setRaza((String)"Golden");
        localidad = (String)"usaquen";
        perro3.setLocalidad(localidad);
        perro3.setDueño((String)"John");
        perro3.setCedula((String)"703" );
        perro3.setTelefono((String)"3619500");
        perro3.setAsistencia((String)"Martes");
        listPerros.add(perro3);            
            for (int i = 0; i < listLocal.size(); i++){
                if (listLocal.get(i).equals(localidad)){
                    existe = true;
                }
            }
            if (existe == false){
                listLocal.add(localidad);
            }        
    
    // Perro 4
    perro4 = (Perros) new Perros();
        perro4.setNombre((String)"Cody");
        perro4.setRaza((String)"Beagle");
        localidad = (String)"teusaquillo";
        perro4.setLocalidad(localidad);
        perro4.setDueño((String)"Vivian");
        perro4.setCedula((String)"831" );
        perro4.setTelefono((String)"2805834");
        perro4.setAsistencia((String)"Jueves");
        listPerros.add(perro4);            
            for (int i = 0; i < listLocal.size(); i++){
                if (listLocal.get(i).equals(localidad)){
                    existe = true;
                }
            }
            if (existe == false){
                listLocal.add(localidad);
            }        
    
    // Perro 5
    perro5 = (Perros) new Perros();
        perro5.setNombre((String)"Scott");
        perro5.setRaza((String)"Bulldog");
        localidad = (String)"teusaquillo";
        perro5.setLocalidad(localidad);
        perro5.setDueño((String)"Nicolas");
        perro5.setCedula((String)"293" );
        perro5.setTelefono((String)"7108121");
        perro5.setAsistencia((String)"Miercoles");
        listPerros.add(perro5);            
            for (int i = 0; i < listLocal.size(); i++){
                if (listLocal.get(i).equals(localidad)){
                    existe = true;
                }
            }
            if (existe == false){
                listLocal.add(localidad);
            }         
    
    // Perro 6
    perro6 = (Perros) new Perros();
        perro6.setNombre((String)"Ramon");
        perro6.setRaza((String)"Pug");
        localidad = (String)"chapinero";
        perro6.setLocalidad(localidad);
        perro6.setDueño((String)"Nathaly");
        perro6.setCedula((String)"995" );
        perro6.setTelefono((String)"8012901");
        perro6.setAsistencia((String)"Viernes");
        listPerros.add(perro6);            
            for (int i = 0; i < listLocal.size(); i++){
                if (listLocal.get(i).equals(localidad)){
                    existe = true;
                }
            }
            if (existe == false){
                listLocal.add(localidad);
            } 
    
    // Perro 7
    perro7 = (Perros) new Perros();
        perro7.setNombre((String)"Lulu");
        perro7.setRaza((String)"Yorkshire");
        localidad = (String)"usaquen";
        perro7.setLocalidad(localidad);
        perro7.setDueño((String)"Daniela");
        perro7.setCedula((String)"394" );
        perro7.setTelefono((String)"7940372");
        perro7.setAsistencia((String)"Lunes");
        listPerros.add(perro7);            
            for (int i = 0; i < listLocal.size(); i++){
                if (listLocal.get(i).equals(localidad)){
                    existe = true;
                }
            }
            if (existe == false){
                listLocal.add(localidad);
            }
    
    // Perro 8
    perro8 = (Perros) new Perros();
        perro8.setNombre((String)"Kira");
        perro8.setRaza((String)"Doberman");
        localidad = (String)"teusaquillo";
        perro8.setLocalidad(localidad);
        perro8.setDueño((String)"Julian");
        perro8.setCedula((String)"392" );
        perro8.setTelefono((String)"7104050");
        perro8.setAsistencia((String)"Jueves");
        listPerros.add(perro8);            
            for (int i = 0; i < listLocal.size(); i++){
                if (listLocal.get(i).equals(localidad)){
                    existe = true;
                }
            }
            if (existe == false){
                listLocal.add(localidad);
            }        
    
    // Perro 9
    perro9 = (Perros) new Perros();
        perro9.setNombre((String)"Coco");
        perro9.setRaza((String)"Chihuahua");
        localidad = (String)"suba";
        perro9.setLocalidad(localidad);
        perro9.setDueño((String)"Carolina");
        perro9.setCedula((String)"444" );
        perro9.setTelefono((String)"3290120");
        perro9.setAsistencia((String)"Martes");
        listPerros.add(perro9);            
            for (int i = 0; i < listLocal.size(); i++){
                if (listLocal.get(i).equals(localidad)){
                    existe = true;
                }
            }
            if (existe == false){
                listLocal.add(localidad);
            }         

    // Perro 10
    perro10 = (Perros) new Perros();
        perro10.setNombre((String)"Draco");
        perro10.setRaza((String)"Huskie");
        localidad = (String)"chapinero";
        perro10.setLocalidad(localidad);
        perro10.setDueño((String)"Francy");
        perro10.setCedula((String)"644" );
        perro10.setTelefono((String)"4490512");
        perro10.setAsistencia((String)"Viernes");
        listPerros.add(perro10);            
            for (int i = 0; i < listLocal.size(); i++){
                if (listLocal.get(i).equals(localidad)){
                    existe = true;
                }
            }
            if (existe == false){
                listLocal.add(localidad);
            }  
            
        Menu();
        System.out.println("a = " + a);
    } 
    
    public static void DatosPerros() {
        
        do{
            perro = (Perros) new Perros();
            System.out.println("________________________________");
            System.out.println("1.Ingrese datos del Perro");
            System.out.print("  a. Nombre:");
            perro.setNombre((String)scanner.next());
            System.out.print("  b. Raza:");
            perro.setRaza((String)scanner.next());
            System.out.print("  c. Localidad (Sin Mayusculas):");
            localidad = (String)scanner.next();
            perro.setLocalidad(localidad);
            System.out.print("  d. Nombre del Dueño:");
            perro.setDueño((String)scanner.next());
            System.out.print("  e. Cedula:");
            perro.setCedula((String)scanner.next());
            System.out.print("  f. Telefono :");
            perro.setTelefono((String)scanner.next());
            System.out.print("  g. Dia de Asistencia :");
            perro.setAsistencia((String)scanner.next());
            listPerros.add(perro);
            System.out.print("¿Desea Registrar otro perro? (s/n): ");
            r = scanner.next().charAt(0);
            boolean existe = false;
            for (int i = 0; i < listLocal.size(); i++){
                if (listLocal.get(i).equals(localidad)){
                    existe = true;
                }
            }
            if (existe == false){
                listLocal.add(localidad);
            }
        } while(r == 's');
       Menu();
    }   

    public static void ListPerros(){
        System.out.println("________________________________");
        System.out.println("2. Lista de Perros");
        
        for (int i = 0; i < listPerros.size(); i++){
            System.out.println("Numero de Perro " + (i + 1));
            System.out.println("    Nombre del perro: "+listPerros.get(i).getNombre());
            System.out.println("    Raza: "+listPerros.get(i).getRaza());
            System.out.println("    Loocalidad: "+listPerros.get(i).getLocalidad());
            System.out.println("    Nombre del Duseño: "+listPerros.get(i).getDueño());
            System.out.println("    Cedula: "+listPerros.get(i).getCedula());
            System.out.println("    Telefono: "+listPerros.get(i).getTelefono());
            System.out.println("    Dia de Asistencia: "+listPerros.get(i).getAsistencia());
            System.out.println("___________________________________________");
        }
        System.out.println("Fin del listado.");
        Menu();
    }
    
    public static void MenuListlocal(){
        System.out.println("________________________________");
        System.out.println("3. Listado de Localidades");
        
        for (int i = 0; i < listLocal.size(); i++){
            System.out.println((i + 1) + ". " + listLocal.get(i));
        }
        System.out.println("___________________________________________");
        System.out.println("0.salir");
        System.out.println("ingrese la opcion: ");
        opc = (int)scanner.nextInt();
        Listlocal();
    }
        
    public static void Listlocal(){
        
        if ( opc != 0){
            int a = 0;
            for (int i = 0; i < listPerros.size(); i++){
                if (listPerros.get(i).getLocalidad().equals(listLocal.get(opc-1))){
                    a++;
            System.out.println("________________________________");
            System.out.println("Numero de Perro " + (i + 1));
            System.out.println("    Nombre del perro: "+listPerros.get(i).getNombre());
            System.out.println("    Raza: "+listPerros.get(i).getRaza());
            System.out.println("    Loocalidad: "+listPerros.get(i).getLocalidad());
            System.out.println("    Nombre del Duseño: "+listPerros.get(i).getDueño());
            System.out.println("    Cedula: "+listPerros.get(i).getCedula());
            System.out.println("    Telefono: "+listPerros.get(i).getTelefono());
            System.out.println("    Dia de Asistencia: "+listPerros.get(i).getAsistencia());
            System.out.println("___________________________________________");

                }
            }
            MenuListlocal();
        }
        else {            
            Menu();
        }
    }
  
    public static void Menu() {
        System.out.println("               Menu");
        System.out.println("________________________________");
        System.out.println("1.Ingresar Nuevo Perro");
        System.out.println("2.Ver lista de Perros");
        System.out.println("3.Ver lista de Localidades de Perros");
        System.out.println("0.Salir");
        System.out.println("Ingrese la opcion: ");

        opc = (int)scanner.nextInt();
        switch(opc){
            case 1:
                DatosPerros();
                break;
            case 2:
                ListPerros();
                break;
            case 3:
                MenuListlocal();
                break;
            case 0:
                System.exit(0);
            default:
                Menu();
        }
    }

}
