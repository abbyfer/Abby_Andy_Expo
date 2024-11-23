/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cajeroautomatico;

/**
 *
 * @author afern
 */
import java.util.Scanner;
public class CajeroAutomatico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        CuentaBanco Cuenta = new CuentaBanco("987654321", 700.0, "Ahorros", 1000.0);
        Usuario usuario = new Usuario("Andy", "Jafet", "12A45B78C", "1234", Cuenta);

        System.out.println("Bienvenid@ al Cajero Automatico, " + usuario.getNombre() + "!");
        System.out.println();
        System.out.print("Ingresa tu Pin: ");
        String pinIngresado = entrada.nextLine();
        System.out.println();

        if (!usuario.ValidarPin(pinIngresado)) {
            System.out.println("Pin incorrecto, intenta otra vez");
            return;
        }

        int opcion;
        
        do {
            System.out.println("---Menu---");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Retiro de Dinero");
            System.out.println("3. Deposito de Dinero");
            System.out.println("4. Salida");
            System.out.print("Ingresa una opcion: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Saldo actual: " + usuario.consultarSaldo());
                    System.out.println("Tipo de cuenta: " + usuario.getCuenta().getTipoCuenta());
                    System.out.println();
                    break;
                    
                case 2:
                    System.out.print("Ingrese el monto a retirar: ");
                    double retiro = entrada.nextDouble();
                    Cuenta.Retiro(retiro);
                    System.out.println();
                    break;
                    
                case 3:
                    System.out.print("Ingrese el monto a depositar: ");
                    double deposito = entrada.nextDouble();
                    Cuenta.Deposito(deposito);
                    System.out.println();
                    break;
                    
                case 4:
                    System.out.println("Gracias por usar nuestro Cajero Automatico :D");
                    System.out.println();
                    break;
                    
                default:
                    System.out.println("Opcion incorrecta, intenta de nuevo");
            }
        } while (opcion != 4);

        entrada.close();
    }  
}
