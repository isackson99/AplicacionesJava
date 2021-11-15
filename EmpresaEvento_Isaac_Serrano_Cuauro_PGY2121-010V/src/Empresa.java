
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isaac
 */
public class Empresa {
    
    public static void main(String[] args) {
        
        int opcion;
        boolean flag;
        //cliente
        int rut;
        String nombre, mail;
        char dv, antiguedad;
        //evento
        int precio, codigo, porcentaje, descuento;
        String nombre1, direccion, fecha;
        
        
        
        
        
        Scanner teclado = new Scanner(System.in);

        Cliente cliente = new Cliente();
        Evento evento = new Evento();

        do {
            System.out.println("·····MENU·····");
            System.out.println("1-Crear evento a un cliente");
            System.out.println("2-Hacer descuento");
            System.out.println("3-Mostrar evento informacion de evento");
            System.out.println("4-Salir");
            opcion = teclado.nextInt();
            
            switch (opcion){
                case 1:
                    Date fechaDate = null;
                    System.out.println("Ingrese nombre cliente");
                    nombre = teclado.next();                       
                    System.out.println("Ingrese mail");
                    mail = teclado.next();
                    System.out.println("Ingrese rut");
                    rut = teclado.nextInt();
                    System.out.println("Ingrese DV");
                    dv = teclado.next().charAt(0);
                    do{
                        System.out.println("Es nuevo o antiguo?");
                        antiguedad = teclado.next().charAt(0);   
                        flag = cliente.antiguo();
                        if(flag == false){
                            System.out.println("Caracter incorrecto, ingrese 'N' o 'A'.");
                        }
                    } while (flag == true);  
                    System.out.println("----------------------------------------");
                    System.out.println("Nombre de evento");
                    nombre1 = teclado.next();
                    System.out.println("Direccion de evento");
                    direccion = teclado.next();
                    System.out.println("Codigo de evento");
                    codigo = teclado.nextInt();
                    System.out.println("Fecha de evento");
                    fecha = teclado.next();
                    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                    do{
                        System.out.println("Precio de entrada");
                        precio = teclado.nextInt();
                        flag = evento.validarPrecio(precio);
                        if (flag== false){
                            System.out.println("Precio invalido");
                        }
                    }while(flag == false);

                    cliente.setNombre(nombre);
                    cliente.setRut(rut);
                    cliente.setDv(dv);
                    cliente.setMail(mail);
                    cliente.setAntiguedad(antiguedad);
                    
                    evento.setNombre1(nombre1);
                    evento.setDireccion(direccion);
                    evento.setCodigo(codigo);
                    evento.setFecha(fechaDate);
                    evento.setPrecio(precio);
                    System.out.println("----------------------------------------");
                    break;
                    
                case 2:
                    System.out.println("Ingrese porcentaje 1-100%");
                    porcentaje = teclado.nextInt();
                    descuento = evento.descontar(porcentaje);
                    System.out.println("Total: $" + evento.getPrecio());
                    System.out.println("Descuento: $" + descuento);
                    System.out.println("------------------------");
                    System.out.println("A Pagar: $" + (evento.getPrecio() - descuento));
                    break;

                case 3:
                    System.out.println("Mostrando solicitud");
                    evento.verInformacionEvento();
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }while(opcion != 4);
        
    }
}
