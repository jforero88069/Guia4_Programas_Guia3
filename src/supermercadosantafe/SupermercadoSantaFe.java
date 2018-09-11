package supermercadosantafe;

import java.util.ArrayList;
import java.util.Scanner;
import supermercadosantafe.Empleado;

public class SupermercadoSantaFe {
    static int a = 5, opc;
    static char r = 'n';
    static  String depto;
    static Scanner scaner = new Scanner(System.in);
    static Empleado empleado;
    static ArrayList<Empleado> listEmpl = new ArrayList<Empleado>();
    static ArrayList<String> listDepto = new ArrayList<String>();
    
    public static void main(String[] args) {
        System.out.println("Bienvenido al supermercado Santa Fe");        
        System.out.println("       Sede en Fontibón");
        System.out.println("....................................");
        System.out.println("      Gestor de Empleados");
        
        DatosEmpl();
        System.out.println("a = " + a);
    }

    public static void DatosEmpl() {
        do{
            empleado = (Empleado) new Empleado();
            System.out.println("....................................");
            System.out.println("1.Ingrese datos del empleado");
            System.out.print("  a.nombre:");
            empleado.setNombre((String)scaner.next());
            System.out.print("  b.servicio/departamento:");
            depto = (String)scaner.next();
            empleado.setDepto(depto);
            System.out.print("  c.posición :");
            empleado.setPosicion((String)scaner.next());
            System.out.print("  d.salario :");
            empleado.setSalario((String)scaner.next());
            listEmpl.add(empleado);
            System.out.print("Desea ingresar otro empleado? (s/n): ");
            r = scaner.next().charAt(0);
            
            boolean existe = false;
            for (int i = 0; i < listDepto.size(); i++){
                if (listDepto.get(i).equals(depto)){
                    existe = true;
                }
            }
            if (existe == false){
                listDepto.add(depto);
            }
        } while(r == 's');
        Menu();
    }
    
    public static void ListEmpl(){
        System.out.println("....................................");
        System.out.println("2.Lista de empleados");
        
        for (int i = 0; i < listEmpl.size(); i++){
            System.out.println("Empleado numero " + (i + 1));
            System.out.println("    Nombre: "+listEmpl.get(i).getNombre());
            System.out.println("    Servicio/depto: "+listEmpl.get(i).getDepto());
            System.out.println("    Posicion: "+listEmpl.get(i).getPosicion());
            System.out.println("    Salario: "+listEmpl.get(i).getSalario());
        }
        System.out.println("No Hay mas empleados.");
        System.out.println("");
        Menu();
    }
    
    public static void MenuListdepto(){
        System.out.println("....................................");
        System.out.println("3.Lista de sercicios/departamentos");
        
        /*for (int i = 0; i < listEmpl.size(); i++){
            System.out.println((i + 1) + ". " + listEmpl.get(i).getDepto());
            
        }*/
        for (int i = 0; i < listDepto.size(); i++){
            System.out.println((i + 1) + ". " + listDepto.get(i));
        }
        System.out.println("0.salir");
        System.out.println("ingrese la opcion: ");
        opc = (int)scaner.nextInt();
        Listdepto();
    }
    
    public static void Listdepto(){
        
        if ( opc != 0){
            int a = 0;
            for (int i = 0; i < listEmpl.size(); i++){
                if (listEmpl.get(i).getDepto().equals(listDepto.get(opc-1))){
                    a++;
                    System.out.println("...........................");
                    System.out.println("Empleado numero " + a);
                    System.out.println("    Nombre: "+listEmpl.get(i).getNombre());
                    System.out.println("    Posicion: "+listEmpl.get(i).getPosicion());
                    System.out.println("    Salario: "+listEmpl.get(i).getSalario());

                }
            }
            MenuListdepto();
        }
        else {            
            Menu();
        }
    }

    public static void Menu() {
        System.out.println("....................................");
        System.out.println("      Gestor de Empleados");
        System.out.println("Menu.................................");
        System.out.println("1.Ingresar empleado");
        System.out.println("2.Ver lista de empleados");
        System.out.println("3.Ver lista de sercicios/departamentos");
        System.out.println("0.Salir");
        System.out.println("Ingrese la opcion: ");

        opc = (int)scaner.nextInt();
        switch(opc){
            case 1:
                DatosEmpl();
                break;
            case 2:
                ListEmpl();
                break;
            case 3:
                MenuListdepto();
                break;
            case 0:
                System.exit(0);
            default:
                Menu();
        }
    }
}
