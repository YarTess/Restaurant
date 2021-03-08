public class Dishes {
    private int id;
    private String dishname;
    private int realprice;
    private int price;

    public Dishes() {

    }
    public  Dishes(int id, String fullname, int realprice, int price){
        this.id = id;
        this.dishname = dishname;
        this.realprice = realprice;
        this.price = price;
    }
    public String toString(){
        return "Waiters:["+id +"\t"+dishname;
    }
}