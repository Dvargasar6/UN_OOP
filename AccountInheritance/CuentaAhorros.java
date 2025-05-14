public class CuentaAhorros extends Cuenta{

    private boolean activa = true;

    public CuentaAhorros(float saldo, float tasa_anual){
        super(saldo,tasa_anual);

        if(saldo < 10000){
            activa = false;
        }
    }

    public void consignar(float valor){
        if(activa){
            super.consignar(valor);
        }
    }

    public void retirar(float valor){
        if(activa){
            super.retirar(valor);
        }
    }

    public void extracto(){
        if(no_retiros > 4){
            comision_mensual += (no_retiros - 4)*1000;
        }
        super.extracto();

        if(saldo < 10000){
            activa = false;
        }
    }

    public void imprimir(){
        System.out.println("El saldo es: $ " + saldo);
        System.out.println("Se han realizado " + (no_retiros+no_consignaciones) + " transacciones.");
        System.out.println("El extracto mensual es: $ " + comision_mensual);
        System.out.println("Cuenta activa: "+ activa);
    }

}