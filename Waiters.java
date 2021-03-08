public class Waiters {
    private int id;
    private String fullname;

public Waiters() {

}
public  Waiters(int id, String fullname){
    this.id = id;
    this.fullname = fullname;
}
public String toString(){
    return "Waiters:["+id +"\t"+fullname;
}
}