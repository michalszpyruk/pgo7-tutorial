import java.util.*;

public class Main {
    public static void main(String[] args) throws NegativeNumberException {
        //Zad. 1
        //------------------------------------------------
        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car("Golf", 2002));
        cars.add(new Car("Octavia", 2001));
        cars.add(new Car("Corsa", 1992));
        cars.add(new Car("Camry", 1997));
        cars.add(new Car("Hilux", 2005));

        Collections.sort(cars);

        for(Car car : cars) {
            System.out.println(car.year);
        }

        //Zad. 2
        //------------------------------------------------
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(0, "Ball"));
        items.add(new Item(1, "Piano"));
        items.add(new Item(2, "Pen"));
        items.add(new Item(3, "Candy"));
        items.add(new Item(4, "Phone"));

        for (int i = 0; i < items.size(); i++) {
            items.get(i).show();
        }

        HashMap<Integer, String> itemsMap = new HashMap<>();
        for (Item item : items) {
            itemsMap.put(item.id, item.name);
        }

        for (Map.Entry<Integer, String> item : itemsMap.entrySet()) {
            System.out.println("ID: " + item.getKey() + ", Name: " + item.getValue());
        }

        //Zad. 3
        //------------------------------------------------
        items.add(new Item(5, "Car"));
        items.add(new Item(6, "Chocolate"));
        items.add(new Item(7, "Pencil"));
        items.add(new Item(8, "Calculator"));
        items.add(new Item(9, "Cable"));
        items.add(new Item(10, "Bottle"));
        items.add(new Item(11, "Phone"));
        items.add(new Item(12, "Laptop"));
        items.add(new Item(13, "Keyboard"));
        items.add(new Item(14, "Guitar"));


        HashSet<Item> itemsSet = new HashSet<>(items.subList(0, 4));

        for (Item item : itemsSet) {
            System.out.println("ID: " + item.id + ", Name: " + item.name);
        }

        //Zad. 4
        //------------------------------------------------
        NumberReader numberReader = new NumberReader();
        numberReader.fillArray();
    }
}