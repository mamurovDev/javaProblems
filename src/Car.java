public class Car {
    int doors;
    String name;
    String model;

    Car(int doors, String name, String model) {
        this.doors = doors;
        this.name = name;
        this.model = model;
    }

    public void copy(Car x) {
        this.doors = x.doors;
        this.name = x.name;
        this.model = x.model;
    }
}
