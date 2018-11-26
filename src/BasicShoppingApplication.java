//Derek is checking his fridge thinking about what to buy at the grocery store. He decides to write down a shopping list.
//   Create the BasicShoppingApplication class and write the following instructions in its main method:
//       . Create an empty groceries list and display it.
//       . Create three Strings that represent three different groceries.
//       . Add them to the groceries list and display it.
//       . Remove one of them by providing its name as an argument and display the list.
//       . Add one of the existing groceries twice and display the list.
//       . Remove the third element of the list by providing its position and display it.
//       . Display its size.
import java.util.ArrayList;
import java.util.List;
public class BasicShoppingApplication {
    public static void main(String[] args) {
        List<String> groceries   = new ArrayList<>();
        System.out.println(groceries);
        String milk = "milk";
        String choclate = "choclate";
        String wallnuts = "wallnuts";
        groceries.add(milk);
        groceries.add(choclate);
        groceries.add(wallnuts);
        System.out.println(groceries);
        groceries.remove(choclate);
        System.out.println(groceries);
        groceries.add(wallnuts);
        groceries.add(wallnuts);
        System.out.println(groceries);
        groceries.remove(3);
        System.out.println(groceries);
        System.out.println("Groceries size: " + groceries.size());
    }
}