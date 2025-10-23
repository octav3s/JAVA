class InventoryChecker {
    public static void main(String[] args) {
        int[] stock = { 20, 15, 30, 0, 25 };
        int total = 0;

        for (int i = 0; i < stock.length; i++) {
            if (stock[i] == 0) {
                System.out.println("Item " + (i + 1) + " is Out of stock!");
            break;
            }
            total += stock[i];
        }

        if (!outOfStock) {
            System.out.println("Total Stock Quantity: " + total);

            if (total < 50)
                System.out.println("Stock Status: Low Stock");
            else if (total <= 100)
                System.out.println("Stock Status: Moderate Stock");
            else
                System.out.println("Stock Status: Good Stock");
        }
    }
}
