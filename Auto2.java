package auto2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Auto2 {
    private String brandName;
    private int speed;
    private Colour colour;
    private Engine engine;
    private Person person;
    private Person[] seats;
    Random random = new Random();

    {
        engine = new Engine(60, 60);
    }

    public int speed() {
        speed = random.nextInt(300);
        return speed;
    }

    public Auto2(String brandName, Colour colour, Engine engine, Person person) {
        this.brandName = brandName;
        this.speed = random.nextInt(300);
        this.colour = colour;
        this.engine = engine;
        this.person = person;
    }

    public Auto2(int numberOfSeats) {
        this.seats = new Person[numberOfSeats];
    }

    public Auto2(String brandName, Colour colour) {
        this.brandName = brandName;
        this.speed = random.nextInt(300);
        this.colour = colour;
        this.engine = engine;
    }

    public void pasengers(Person person) {
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == null) {
                seats[i] = person;
                break;

            }

        }
    }

    public void setSeats(Person[] seats) {
        this.seats = seats;
    }


    // adds Person instance if the car has empty seat
    public void add(Person person) {
        if (this.seats[this.seats.length - 1] != null) {
            System.out.println("This car not available");
            return;
        }
        for (int i = 0; i < this.seats.length; i++) {
            if (this.seats[i] == null) {
                this.seats[i] = person;
                return;
            }
        }
    }





    public void accelerate(int amount) {
        if (this.person == null) {
            this.speed = 0;
            System.out.println("You need a driver");
            return;
        }

        if (this.engine.getFuel() == 0) {
            this.speed = 0;
            System.out.println("You need some fuel");
            return;
        }
        if (this.engine.getFuel() >= amount) {
            this.speed += amount;
            engine.burnFuel(amount);
            System.out.println("Go");
        } else {
            System.out.println("You need more fuel");

        }

    }

    private int costRepaint(int[] rgb) {
        int cost = 0;
        for (int col : rgb) {
            cost += col;
        }
        return cost;
    }

    public void rePaint(Colour colour) {
        costRepaint(colour.getRgb());
        this.colour = colour;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }


    public Colour getColour() {
        return colour;
    }


    public int getSpeed() {
        return speed;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson() {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Auto2{" +
                "brandName='" + brandName + '\'' +
                ", speed=" + speed +
                ", colour=" + colour +
                ", engine=" + engine +
                ", person=" + person +
                ", random=" + random +
                '}';
    }

    public String getBrandName() {
        return brandName;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Person[] getSeats() {
        return seats;
    }
}
