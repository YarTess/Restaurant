public class Drinks {
    private int id;
    private String drinkname;
    private int realprice;
    private int price;

    public Drinks() {

    }
    public  Drinks(int id, String fullname, int realprice, int price){
        this.id = id;
        this.drinkname = drinkname;
        this.realprice = realprice;
        this.price = price;
    }
    public String toString(){
        return "Waiters:["+id +"\t"+drinkname;
    }
}