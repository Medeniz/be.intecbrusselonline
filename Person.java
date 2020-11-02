package auto2;

public class Person {

    private String Driver;
    private int ageOfDriver;

    public Person(String nameOfDriver, int ageOfDriver) {
        this.Driver=nameOfDriver;
        this.ageOfDriver=ageOfDriver;
    }



    public void Driver(String nameOfDriver) {
        this.Driver = nameOfDriver;
    }
    public void setAgeOfDriver(int ageOfDriver) {
        this.ageOfDriver = ageOfDriver;
    }
    public String Driver() {
        return Driver;
    }
    public int getAgeOfDriver() {
        return ageOfDriver;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nameOfDriver='" + Driver + '\'' +
                ", ageOfDriver=" + ageOfDriver +
                '}';
    }

    public String getDriver() {
        return Driver;
    }

    public void setDriver(String driver) {
        Driver = driver;
    }
}
