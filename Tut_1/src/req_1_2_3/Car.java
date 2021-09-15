package req_1_2_3;

public class Car {
    private String name;
    private int speed;
    private double regularPrice;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalePrice() {
        if (this.color.equals("Black")) {
            return this.regularPrice * 1.5;

        } else {
            return regularPrice*1.2;
        }
    }

    public Car(String name,int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
        this.name = name;
    }
    public Car(){}
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {

       Car  FordMondeo= new Car("Ford",80,5000,"red");
       Car ToyotaCamry= new Car("Toyota",80,6000,"Black");
       PrintCarInformation(FordMondeo);
       PrintCarInformation(ToyotaCamry);




    }
    public static void PrintCarInformation(Car car){

        System.out.println(car.getName()+" car whose speed is "+ car.getSpeed()+", color "+car.getColor()+" with regular price = "+(int) car.getRegularPrice()+" and sale price = "+(int) car.getSalePrice());
    }
}
