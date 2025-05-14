public class Cuenta{
    protected float saldo;
    protected int no_consignaciones = 0;
    protected int no_retiros = 0;
    protected float tasa_anual;
    protected float comision_mensual = 0;

    public Cuenta(float saldo, float tasa_anual){
        this.saldo = saldo;
        this.tasa_anual = tasa_anual;
    }

    public void consignar(float valor){
        saldo = saldo + valor;
        no_consignaciones += 1;
    }

    public void retirar(float valor){
        if(saldo >= valor){
            saldo -= valor;
            no_retiros += 1;
        }
        else{
            System.out.println("No hay suficiente saldo.");
        }
    }

    public void interes(){
        float tasa_mensual = tasa_anual/(12*100);
        float interes_mensual = saldo*tasa_mensual;
        saldo += interes_mensual;
    }

    public void extracto(){
        saldo -= comision_mensual;
        interes();
    }

    public void imprimir(){
        System.out.println("El saldo es: $ " + saldo);
        System.out.println("Se han realizado " + no_consignaciones + " consignaciones.");
        System.out.println("Se han realizado " + no_retiros + " retiros.");
        System.out.println("La tasa anual es: " + tasa_anual + "%");
        System.out.println("El extracto mensual es: $ " + comision_mensual);
    }
}