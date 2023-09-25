class Player {
    
    private int money;
    // You can define other player-related attributes here
    inventory = new Item[100];
    private int inventorySize;

    public Player() {
        money = 0;
        inventory = new Item[100]; // Fixed size of 100 items
        inventorySize = 0;
    }

   

    public int getMoney() {
        return money;
    }

    public Item[] getInventory() {
        return inventory;
    }

    public void addItemToInventory(Item item) {
        if (inventorySize < inventory.length) {
            inventory[inventorySize] = item;
            inventorySize++;
        }
    }

   
}