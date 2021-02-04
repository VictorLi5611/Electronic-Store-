import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ElectronicStore {

    public ElectronicStore(String s) {
        name = s;
    }


    String name;

    //Initialize store stock objects
    Desktop desktopA = new Desktop(3.5, 8, 500, false);
    Desktop desktopB = new Desktop(3.0, 16, 250, true);
    Desktop desktopC = new Desktop(4.3, 32, 500, true);

    Laptop laptopA = new Laptop(15, 3.1, 32, 500, true);
    Laptop laptopB = new Laptop(13, 2.5, 8, 250, false);
    Laptop laptopC = new Laptop(15, 3.0, 16, 250, true);

    Fridge fridgeA = new Fridge(16.5, true, "Black");
    Fridge fridgeB = new Fridge(12.0, false, "White");
    Fridge fridgeC = new Fridge(23.0, true, "Stainless Steel");

    Desktop desktop[] = {desktopA, desktopB, desktopC};
    Laptop laptop[] = {laptopA, laptopB, laptopC};
    Fridge fridge[] = {fridgeA, fridgeB, fridgeC};

    void printStock() {
        for (Object item : desktop) {
            String a = item.toString();
            System.out.println(a);
        }
        for (Object item : laptop) {
            String a = item.toString();
            System.out.println(a);
        }
        for (Object item : fridge) {
            String a = item.toString();
            System.out.println(a);
        }

    }


    boolean searchStock(String i) {
        CharSequence search = i.toUpperCase();

        for (Object item : desktop) {
            String a = item.toString().toUpperCase();
            boolean check = a.contains(search);
            if (check){
                return true;

            }
        }
        for (Object item : laptop) {
            String a = item.toString().toUpperCase();
            boolean check = a.contains(search);
            if (check){
                return true;
            }
        }
        for (Object item : fridge) {
            String a = item.toString().toUpperCase();
            boolean check = a.contains(search);
            if (check){
                return true;
            }
        }
        return false;

    }
}
