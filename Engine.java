package auto2;

public class Engine {

    public Engine(int fuel, int capacity) {
        this.fuel = fuel;
        this.capacity = capacity;
    }

    private int fuel;
    private int capacity;

    public void burnFuel(int amount){
        this.fuel-=amount;

    }
    public void reFuel(int amount){
        if(this.fuel+amount<=capacity){
            this.fuel+=amount;
        }else{
            this.fuel=capacity;
        }

    }
    public int getFuel(){
        return fuel;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "fuel=" + fuel +
                ", capacity=" + capacity +
                '}';
    }
}
