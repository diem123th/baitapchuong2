public class Customer {
    private int id;
    String name;
    int discount;

    Customer(int id, String name, int discount) {
        this.id = id;
        this.discount = discount;
        this.name = name;
    }

    int getId() {
        return id;
    }
    String getName(){
        return  name;
    }
    int getDiscount(){
        return discount;
    }
    void setDiscount(int discount){
        this.discount=discount;
    }
    public String toString() {
        return String.format("%s(%d)(%d%%",name,id,discount);
    }
}


