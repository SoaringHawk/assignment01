import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        Item item1 = new Item("Cocaine",50);
        Item item2 = new Item("Weed",80);
        Item item3 = new Item("Coke",5);
        Item item4 = new Item("Meth",70);
        Item item5 = new Item("Candy",2);

        City city1 = new City("Montreal",80,40);
        city1.buyPrice(item1);
        city1.buyPrice(item2);
        city1.sellPrice(item1);
        city1.sellPrice(item2);

        City city2 = new City("Brossard",100,70);
        city2.buyPrice(item3);
        city2.buyPrice(item4);
        city2.sellPrice(item3);
        city2.sellPrice(item4);

        City city3 = new City("Laval",120,80);
        city3.buyPrice(item1);
        city3.buyPrice(item5);
        city3.sellPrice(item1);
        city3.sellPrice(item5);
        
        bool exit = false;
        while (exit = false) {
            System.out.println("===== Menu =====");
            System.out.println("1. View Inventory");
            System.out.println("2. View Money");
            System.out.println("3. View Current City");
            System.out.println("4. Sell Wares");
            System.out.println("5. Buy Wares");
            System.out.println("6. Travel to a New City");
            System.out.println("7. Quit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            if (choice == 1){
                //View inventory
            }
            if (choice == 2){
                System.out.println("Money: $" + player.getMoney());
            }
            if (choice == 3){
                System.out.println("Current City: " + currentCity.getCityName());
            }
            if (choice == 4){
                //Sell Ware
            }
            if (choice == 5){
                //buy ware
            }
            if (choice == 6){
                //Travel to new city
            }
            if (choice == 7){
                System.out.println("Goodbye!");
                scanner.close();
            }
            
        }
    }
}