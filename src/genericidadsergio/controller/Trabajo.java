package genericidadsergio.controller;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class Trabajo {
    
    
    public static void main(String[] arg){
        int num;
        Scanner in= new Scanner(System.in);
        System.out.println("Escriba 1 para guardar a alguien o 2 para ver los Pairs");
        num= in.nextInt();
        do{
        if(num==1){
            crearPersonayPair();
            System.out.println("Otro?");
            num= in.nextInt();
        }else if(num==2){
            for(Object pairs: Pair.getGuardados()){
                System.out.println(pairs.toString());
                num=3;
            }
        }
        else{num=3;}
        }while(num==1 || num==2);
    }
    
    public static void crearPersonayPair(){
        String nombre;
        Integer edad;
        String eps;
        LocalDate fecha;
        Scanner in= new Scanner(System.in);
        System.out.println("Hola, digite el nombre que le plazca");
        nombre= in.nextLine();
        System.out.println("Hola, digite la edad que le plazca");
        edad= in.nextInt();
        in.nextLine();
        System.out.println("Hola, digite su eps");
        eps= in.nextLine();
        System.out.println("Hola, su nacimiento es el 22 de junio del 2005");
        fecha= LocalDate.of(2005, Month.JUNE, 22);
        Object[] arreglo= new Object[]{edad, eps, fecha};
        Persona.setPersonas(new Persona(nombre, edad, eps, fecha));
        Pair<String, Object> guardado = new Pair<>(nombre, arreglo);
        Pair.setGuardados(guardado);
    }
    
}
