public class FoodItem extends StoreItem {
    private boolean shelfStable;
    public FoodItem(int skuNumber, double price, String itemName, String itemType, boolean shelfStable) {
        super(skuNumber, price, itemName, itemType);
        this.shelfStable = shelfStable;
    }

    public void setShelfStable(boolean shelfStable){
        this.shelfStable = shelfStable;
    }

    public boolean getShelfStable(){
        return this.shelfStable;
    }
}
