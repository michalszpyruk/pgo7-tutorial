public class Car implements Comparable<Car> {
    String model;
    int year;

    Car(String name, int year) {
        this.model = name;
        this.year = year;
    }

    @Override
    public int compareTo(Car c) {
        return Integer.compare(year, c.year);
    }
}
