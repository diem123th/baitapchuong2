public class Customer2 {
    int id;
    String name;
    char gender;
    int discount;
    Customer2(int id,String name,int discount){
        this.id=id;
        this.name=name;
        this.discount=discount;
    }
     public int getId(){
        return this.id;
    }
    String getName(){
        return this.name;
    }
    char getGender(){
        return this.gender;
    }
    public String toString() {
        return String.format("%s(%d)",name,id);
    }
}
