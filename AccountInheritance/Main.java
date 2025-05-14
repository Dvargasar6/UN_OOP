import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Cuenta de ahorros: \n");

        System.out.println("Ingrese el saldo inicial:");
        float saldo_inicial_ahorros = entrada.nextFloat();
        System.out.println("Ingrese la tasa de interes:");
        float tasa_ahorros = entrada.nextFloat();

        CuentaAhorros cuenta_ahorros = new CuentaAhorros(saldo_inicial_ahorros, tasa_ahorros);


        System.out.println("Ingrese cantidad que va a depositar:");
        float deposito = entrada.nextFloat();
        cuenta_ahorros.consignar(deposito);

        System.out.println("Ingrese cantidad que va a retirar:");
        float retiro = entrada.nextFloat();
        cuenta_ahorros.retirar(retiro);
        cuenta_ahorros.extracto();
        cuenta_ahorros.imprimir();


        System.out.println("\nCuenta corriente: \n");

        System.out.println("Ingrese el saldo inicial:");
        float saldo_inicial_corriente = entrada.nextFloat();
        System.out.println("Ingrese la tasa de interes:");
        float tasa_corriente = entrada.nextFloat();

        CuentaCorriente cuenta_corriente = new CuentaCorriente(saldo_inicial_corriente, tasa_corriente);

        System.out.println("Ingrese cantidad que va a depositar:");
        float deposito2 = entrada.nextFloat();
        cuenta_corriente.consignar(deposito2);

        System.out.println("Ingrese cantidad que va a retirar:");
        float retiro2 = entrada.nextFloat();
        cuenta_corriente.retirar(retiro2);
        cuenta_corriente.extracto();
        cuenta_corriente.imprimir();




    }
}
