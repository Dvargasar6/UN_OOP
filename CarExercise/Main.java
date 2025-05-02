public class Main{

    public static void main(String[] args){

        Car car1 = new Car("Renault",2005,1500,4,5,150,100,combustible.GAS_NATURAL,type.SUV,color.ROJO,box.MANUAL);

        System.out.println("Velocidad inicial: "+car1.getCurrentVel()+"km/h \n");
        System.out.println("Velocidad maxima: "+car1.getMaxVel()+"km/h \n");

        car1.acelerate(20);
        System.out.println("El vehiculo acelero.\n");
        System.out.println("Velocidad actual: "+car1.getCurrentVel()+"km/h \n");

        car1.decelerate(50);
        System.out.println("El vehiculo desacelero.\n");
        System.out.println("Velocidad actual: "+car1.getCurrentVel()+"km/h \n");

        car1.stop();
        System.out.println("El vehiculo freno.\n");
        System.out.println("Velocidad actual: "+car1.getCurrentVel()+"km/h \n");

        car1.acelerate(150);
        System.out.println("El vehiculo acelero.\n");
        System.out.println("Velocidad actual: "+car1.getCurrentVel()+"km/h \n");

        car1.decelerate(100);
        System.out.println("El vehiculo desacelero.\n");
        System.out.println("Velocidad actual: "+car1.getCurrentVel()+"km/h \n");

        car1.acelerate(150);
        System.out.println("El vehiculo acelero.\n");
        System.out.println("Velocidad actual: "+car1.getCurrentVel()+"km/h \n");
        

        car1.checkFines();
        car1.printFines();

    }
}