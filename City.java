public class City {
    private String name;
    private double sellingPrice;
    private double buyingPrice;

    public City(String name, double sellingPrice, double buyingPrice){
        this.name = name;
        this.sellingPrice = sellingPrice;
        this.buyingPrice = buyingPrice;
    }

    public String cityName(){
        return name;
    }

    public  double sellPrice(Item item){
        return sellingPrice;
    }

    public double buyPrice(Item item){
        return buyingPrice;
    }
}
