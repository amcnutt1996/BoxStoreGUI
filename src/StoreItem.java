public abstract class StoreItem {
    private int skuNumber;
    private double price;
    private String itemName;
    private String itemType;
    //constructor
    public StoreItem(int skuNumber, double price, String itemName, String itemType){
        this.skuNumber  = skuNumber;
        this.price = price;
        this.itemName = itemName;
        this.itemType = itemType;
    }

    public int getSkuNumber(){
        return this.skuNumber;
    }

    public void setSkuNumber(int skuNumber){
        this.skuNumber = skuNumber;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String getItemName(){
        return this.itemName;
    }

    public void setItemName(String itemName){
        this.itemName = itemName;
    }

    public String getItemType() {
        return itemType;
    }

    public void getItemType(String itemType){
        this.itemType = itemType;
    }

    @Override
    public String toString(){
        return "Name: " + this.getItemName() + " Price: " + this.getPrice() + " Sku Number: " + this.getSkuNumber();
    }

}
