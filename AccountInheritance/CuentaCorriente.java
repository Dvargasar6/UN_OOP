public class CuentaCorriente extends Cuenta{

    private float sobregiro;

    public CuentaCorriente(float saldo, float tasa_anual){
        super(saldo,tasa_anual);
        sobregiro = 0;
    }

    public void consignar(float valor){
        if(sobregiro == 0){
            super.consignar(valor);
        }else{
            saldo += (valor - sobregiro);
        }
    }

    public void retirar(float valor){
        if(saldo >= valor){
            super.retirar(valor);
        }else{
            sobregiro -= (saldo - valor);
            saldo = 0;
        }
    }

    public void extracto(){
        super.extracto();
    }

    public void imprimir(){
        System.out.println("El saldo es: $ " + saldo);
        System.out.println("Se han realizado " + (no_retiros+no_consignaciones) + " transacciones.");
        System.out.println("El extracto mensual es: $ " + comision_mensual);
        System.out.println("El valor del sobregiro es: $ "+sobregiro);
    }

}