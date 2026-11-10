package App.cl.llanquihuetours.app;
import App.cl.llanquihuetours.model.InfoPersona;
import App.cl.llanquihuetours.model.ContactoPersona;
import App.cl.llanquihuetours.model.PerfilCliente;
import App.cl.llanquihuetours.model.PerfilEmpleado;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List <InfoPersona> listaPersonas = new ArrayList();
        boolean continuar = true;

        System.out.println("==SISTEMA DE PERSONAS LLANQUIHUE TOURS==");
        while (continuar) {
            System.out.println("¿Qué tipo de persona que desea ingresar?");
            System.out.println("SELECCIONE UNA OPCION (1-3)");
            System.out.println("1- Empleado");
            System.out.println("2- Cliente");
            System.out.println("3- Salir y mostrar registros");

            int opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 3) {
                continuar = false;
                break;
            }

            System.out.println("Ingrese el nombre completo de la persona");
            String nombrePersona = sc.nextLine();
            System.out.println("Ingrese el RUT");
            String rutPersona = sc.nextLine();
            System.out.println("Ingrese el correo electronico");
            String correoElectronico = sc.nextLine();
            System.out.println("Ingrese el número de telefono");
            String telefono = sc.nextLine();
            System.out.println("-DIRECCIÓN");
            System.out.println("Ingrese el nombre de la calle/avenida");
            String calle = sc.nextLine();
            System.out.println("Ingrese el número del domicilio");
            int numero = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese la ciudad");
            String ciudad = sc.nextLine();
            System.out.println("Ingrese la region");
            String region = sc.nextLine();

            ContactoPersona direccionEjemplo = new ContactoPersona(calle, numero, ciudad, region);

            System.out.println("-ROL PERSONA-");

            if (opcion == 1) {
                System.out.println("Ingrese el cargo del empleado");
                String cargoEmpleado = sc.nextLine();
                System.out.println("Ingrese el tipo de contrato");
                String tipoDeContrato = sc.nextLine();
                System.out.println("Ingrese el año de ingreso");
                int añoDeIngreso = sc.nextInt();
                sc.nextLine();
                System.out.println("Ingrese locación de trabajo");
                String locacion = sc.nextLine();

                PerfilEmpleado nuevoEmpleado = new PerfilEmpleado(nombrePersona, rutPersona, correoElectronico, telefono, direccionEjemplo, cargoEmpleado, tipoDeContrato, añoDeIngreso, locacion);
                listaPersonas.add(nuevoEmpleado);
                System.out.println("-> ¡Empleado guardado exitosamente!");

            }else if (opcion == 2) {
                System.out.println("Ingrese el ID del cliente");
                int idCliente = sc.nextInt();
                PerfilCliente nuevoCliente = new PerfilCliente(nombrePersona, rutPersona, correoElectronico, telefono, direccionEjemplo, idCliente);
                listaPersonas.add(nuevoCliente);
                System.out.println("-> ¡Cliente guardado exitosamente!");

            }else{
                System.out.println("Ingrese una opcion valida");
            }

            System.out.println("\n==================================================");
            System.out.println("         RESUMEN DE REGISTROS EN EL SISTEMA       ");
            System.out.println("==================================================");

            if (listaPersonas.isEmpty()) {
                System.out.println("No se registraron personas.");
            } else {
                for (InfoPersona p : listaPersonas) {
                    if (p.esEmpleado()) {
                        System.out.println("[TIPO: EMPLEADO]");
                    } else if (p.esCliente()) {
                        System.out.println("[TIPO: CLIENTE]");
                    }

                    System.out.println(p.toString());
                    System.out.println("--------------------------------------------------");
                }
            }

            sc.close();
        }
    }
        }


