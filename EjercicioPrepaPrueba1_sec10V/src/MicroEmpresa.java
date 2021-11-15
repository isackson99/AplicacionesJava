
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import modelo.Cliente;
import modelo.Producto;
import negocio.Solicitud;
import negocio.Valida;

/**
 *
 * @author Hernan
 */
public class MicroEmpresa {

    
    public static void main(String[] args) {
        //menú
        int opcion;
        boolean flag; //validaciones
        //cliente
        int rut, telefono;
        String nombre, mail, direccion;
        char dv;
        //producto
        int codigo, precio, cantidad, totalProductos;
        String subcategoria, descripcion;
        char medida;
        //solicitud
        int numero;
        String fecha;
        int porcentaje;
        int descuento;

        Scanner teclado = new Scanner(System.in);

        Valida valida = new Valida();
        Cliente cliente = new Cliente();
        Solicitud sol = new Solicitud();

        do {
            System.out.println("·····MENU·····");
            System.out.println("1 Ingresar Cliente");
            System.out.println("2 Ingresar Solicitud y sus Productos");
            System.out.println("3 Aplicar descuento");
            System.out.println("4 Salir (Ver Solicitud)");
            opcion = teclado.nextInt();

            //Datos Cliente
            switch (opcion) {
                case 1:
                    
                    do {
                        System.out.println("Ingrese rut");
                        rut = teclado.nextInt();
                        System.out.println("Ingrese DV");
                        dv = teclado.next().charAt(0);
                        flag = valida.validarRut(rut, dv);

                        if (flag == false) {
                            System.out.println("Rut inválido");
                        }
                    } while (flag == false);

                    System.out.println("Ingrese nombre");
                    nombre = teclado.next();

                    do {
                        System.out.println("Ingrese teléfono");
                        telefono = teclado.nextInt();
                        flag = valida.validarLargo8(telefono);
                        if (flag == false) {
                            System.out.println("Teléfono inválido (largo 8)");

                        }
                    } while (flag == false);

                    do {
                        System.out.println("Ingrese mail");
                        mail = teclado.next();
                        flag = valida.validarCorreo(mail);
                        if (flag == false) {
                            System.out.println("Mail inválido (mínimo largo 6)");

                        }
                    } while (flag == false);

                    System.out.println("Ingrese dirección");
                    direccion = teclado.next();

                    //guardar los datos válidos en cliente
                    cliente.setRut(rut);
                    cliente.setDv(dv);
                    cliente.setNombre(nombre);
                    cliente.setTelefono(telefono);
                    cliente.setMail(mail);
                    cliente.setDireccion(direccion);

                    System.out.println("----------------------------------------");
                    break;

                //Datos Solicitud y sus Productos
                case 2:
                    
                    //Solicitud
                    numero = sol.obtenerNumeroSolicitud();
                    sol.setNumero(numero);
                    sol.setCliente(cliente);
                    Date fechaDate = null;
                    do {
                        System.out.println("Ingrese Fecha (dd/mm/yyyy)");
                        fecha = teclado.next();
                        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

                        try {
                            fechaDate = formato.parse(fecha);
                            flag = valida.validarFecha(fechaDate);
                        } catch (ParseException ex) {
                            flag = false;
                            System.out.println("Fecha inválida (dd/mm/yyyy)");
                        }
                    } while (flag == false);

                    sol.setFecha(fechaDate);

                    //Productos     
                    System.out.println("¿Cuántos Productos Ingresará?");
                    totalProductos = teclado.nextInt();
                    for (int i = 1; i <= totalProductos; i++) {
                        Producto prod = new Producto();
                        codigo = 0;
                        precio = 0;
                        cantidad = 0;
                        subcategoria = "";
                        descripcion = "";
                        medida = ' ';
                        
                        do {
                            System.out.println("Ingrese código");
                            codigo = teclado.nextInt();
                            flag = valida.validarLargo4(codigo);
                            if (flag == false) {
                                System.out.println("Código inválido");
                            }
                        } while (flag == false);

                        do {
                            System.out.println("Ingrese precio");
                            precio = teclado.nextInt();
                            flag = valida.validarNumeroPositivo(precio);
                            if (flag == false) {
                                System.out.println("Precio inválido");
                            }
                        } while (flag == false);

                        do {
                            System.out.println("Ingrese subcategoría (Fruta o Verdura)");
                            subcategoria = teclado.next();
                            flag = valida.validarSubcategoria(subcategoria);
                            if (flag == false) {
                                System.out.println("Subcategoria inválida");
                            }
                        } while (flag == false);

                        System.out.println("Ingrese descripción");
                        descripcion = teclado.next();

                        System.out.println("Ingrese medida (U:unidad o G:gramos)");
                        medida = teclado.next().toUpperCase().charAt(0);

                        if (medida == 'U') {
                            System.out.println("Ingrese unidades");
                        } else {
                            System.out.println("Ingrese gramos");
                        }
                        cantidad = teclado.nextInt();

                        //guardar los datos válidos en producto
                        prod.setCodigo(codigo);
                        prod.setPrecio(precio);
                        prod.setSubcategoria(subcategoria);
                        prod.setDescripcion(descripcion);
                        prod.setMedida(medida);
                        prod.setCantidad(cantidad);

                        sol.agregarProductos(prod);
                        System.out.println("----------------------------------------º");
                    }

                    break;
                case 3:
                    
                    System.out.println("Ingrese porcentaje 1-100%");
                    porcentaje = teclado.nextInt();
                    descuento = sol.descontar(porcentaje);
                    System.out.println("Total: $" + sol.getTotal());
                    System.out.println("Descuento: $" + descuento);
                    System.out.println("------------------------");
                    System.out.println("A Pagar: $" + (sol.getTotal() - descuento));
                    break;
                case 4:
                    System.out.println("");
                    System.out.println("Solicitud terminada");
                    sol.verSolicitud();
                    break;

                default:
                    System.out.println("Opción Inválida");
            }
        } while (opcion != 4);
    }

}
