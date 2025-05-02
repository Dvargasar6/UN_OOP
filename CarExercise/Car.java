public class Car{

    private String brand;
    private int model;
    private int motor;
    private int doorsNumber;
    private int seatsNumber;
    private double maxVel;
    private double currentVel;
    private int fine;
    private combustible combType;
    private type carType;
    private color carColor;
    private box boxType;

    public Car(String brand, int model, int motor,
    int doorsNumber, int seatsNumber, double maxVel, 
    double currentVel, combustible combType,
    type carType, color carColor, box boxType)
    {
        this.brand = brand;
        this.model = model;
        this.motor = motor;
        this.doorsNumber = doorsNumber;
        this.seatsNumber = seatsNumber;
        this.maxVel = maxVel;
        this.currentVel = currentVel;
        this.fine = 0;
        this.combType = combType;
        this.carType = carType;
        this.carColor = carColor;
        this.boxType = boxType;
    }

    String getBrand(){
        return brand;
    }

    int getModel(){
        return model;
    }

    int getMotor(){
        return motor;
    }

    int getDoorsNumber(){
        return doorsNumber;
    }

    int getSeatsNumber(){
        return seatsNumber;
    }

    double getMaxVel(){
        return maxVel;
    }

    double getCurrentVel(){
        return currentVel;
    }

    int getFine(){
        return fine;
    }

    combustible getCombType(){
        return combType;
    }

    type getCarType(){
        return carType;
    }

    color getCarColor(){
        return carColor;
    }

    box getBoxType(){
        return boxType;
    }





    void setBrand(String brand){
        this.brand = brand;
    }

    void setModel(int model){
        this.model = model;
    }

    void setMotor(int motor){
        this.motor = motor;
    }

    void setDoorsNumber(int doorsNumber){
        this.doorsNumber = doorsNumber;
    }

    void setSeatsNumber(int seatsNumber){
        this.seatsNumber = seatsNumber;
    }

    void setMaxVel(double maxVel){
        this.maxVel = maxVel;
    }

    void setCurrentVel(double currentVel ){
        this.currentVel = currentVel;
    }

    void setFine(int fine){
        this.fine = fine;
    }

    void setCombType(combustible combType){
        this.combType = combType;
    }

    void setCarType(type carType){
        this.carType = carType;
    }

    void setCarColor(color carColor){
        this.carColor = carColor;
    }

    void setBoxType(box boxType){
        this.boxType = boxType;
    }



    void acelerate(double addVel){
        currentVel += addVel;
        if(currentVel + addVel > maxVel){
            fine += 300000;
            System.out.println("Sobrepaso la velocidad maxima, obtuvo una multa. \n");
        }
    }

    void decelerate(double addVel){
        if(currentVel - addVel > 0){
            currentVel -= addVel;
        }else{
            System.out.println("El auto ya esta quieto. \n");
        }
    }

    void stop(){
        currentVel = 0;
    }

    double arrivalTime(int distance){
        return distance/currentVel;
    }

    void printAttributes(){
        System.out.println("Marca: "+brand);
        System.out.println("Modelo: "+model);
        System.out.println("Motor: "+motor+" L");
        System.out.println("Numero de puertas: "+doorsNumber);
        System.out.println("Numero de asientos: "+seatsNumber);
        System.out.println("Velocidad maxima: "+maxVel+" km/h");
        System.out.println("Velocidad actual:"+currentVel+" km/h");
        System.out.println("Multas: $ "+fine);
        System.out.println("Combustible:"+combType);
        System.out.println("Tipo de automovil:"+carType);
        System.out.println("Color:"+carColor);
        System.out.println("Caja:"+boxType+"\n");
    }

    void checkFines(){
        if(fine > 0){
            System.out.println("El vehiculo tiene multas.\n");
        }else{
            System.out.println("El vehiculo no tiene multas.\n");
        }
    }


    void printFines(){
        System.out.println("El vehiculo tiene multas por: $ "+fine);
    }


}