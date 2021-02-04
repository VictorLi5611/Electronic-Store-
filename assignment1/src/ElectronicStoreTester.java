import java.util.*;
public class ElectronicStoreTester{
    public static void main(String[] args){
        String user;
        boolean keepGoing = true;
        Scanner input = new Scanner(System.in);
        ElectronicStore store = new ElectronicStore("Best Buy");
        System.out.println("The Store Stock includes:");
        store.printStock();
        System.out.println("\n");

        while(keepGoing){
            System.out.print("Enter the term to search for:  ");
            user = input.nextLine().toUpperCase();
            if (user.equals("QUIT")){
                keepGoing = false;
            } else{
                boolean found = store.searchStock(user);
                if (found){
                    System.out.println("A matching item is contained in the store's stock.");
                }else{
                    System.out.println("No items in the store stock match that term");
                }
            }

        }
    }
}
