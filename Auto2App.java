package auto2;

public class Auto2App {

    public static void main(String[] args) {

        Auto2 ferrari = new Auto2("ferrari", new Colour("Red"), new Engine(15, 60), new Person("Ahmet", 45));
        Auto2 peugeot = new Auto2("peugeot", new Colour("Very light green"), new Engine(15, 40), new Person("Jack", 20));
        System.out.println(ferrari);
        System.out.println(peugeot);

        Auto2 car = new Auto2("Ferrari", new Colour("Light red"));
        System.out.println(car);

        ferrari.accelerate(40);
        ferrari.getEngine().reFuel(30);
        ferrari.accelerate(20);


        Auto2 passat = new Auto2("Passat", new Colour("Yellow"));
        passat.setSeats(new Person[10]);

        Auto2 rodePeugeot = new Auto2("peugeot", new Colour("Red"));
        rodePeugeot.setSeats(new Person[4]);

        rodePeugeot.add(new Person("Kim", 18));
        rodePeugeot.add(new Person("Michael", 41));
        rodePeugeot.add(new Person("Nicole", 23));
        rodePeugeot.add(new Person("Jeak", 32));


        Person[] passengers = rodePeugeot.getSeats();


        for (Person person : passengers) {
            System.out.println(person);


        }
    }
}