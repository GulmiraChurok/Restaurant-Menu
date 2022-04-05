package retaurant;

import java.util.ArrayList;

public class Menu {

    private static ArrayList<MenuItem> arrayListOfMenuItems = new ArrayList<>();
    public String lastUpdated;
    public static void main(String[] args){
        MenuItem crabCake = new MenuItem ("Crab Cake", 4.50, "Apetizer", false);
        arrayListOfMenuItems.add(crabCake);
        MenuItem salad = new MenuItem("Salad", 3.00, "Apetizer", false);
        arrayListOfMenuItems.add(salad);
        MenuItem chickenSandwich = new MenuItem("Chicken Sandwich", 10.00, "Main dish", false);
        arrayListOfMenuItems.add(chickenSandwich);
        MenuItem vegetableStew = new MenuItem("Vegetable Stew", 15.50, "Main dish", false);
        arrayListOfMenuItems.add(vegetableStew);
        MenuItem lemonCake = new MenuItem("Lemon Cake", 5.60, "dessert", false);
        arrayListOfMenuItems.add(lemonCake);
        MenuItem teramisu = new MenuItem("Teramisu", 7.00, "dessert", true);
        arrayListOfMenuItems.add(teramisu);

        //System.out.println(arrayListOfMenuItems.size());
        for (int i = 0; i < arrayListOfMenuItems.size(); i++) {
            if(arrayListOfMenuItems.get(i).getCategory() == "Apetizer"){
                System.out.println(arrayListOfMenuItems.toString());
//                System.out.println("Our Apetizers are: ");
//                for (int b = 0; b < arrayListOfMenuItems.size(); b++) {
//                    System.out.println(arrayListOfMenuItems.get(b) + " ");
//                }

            }
        }

    }
}
