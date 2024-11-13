public class MyPoint {
    int x;
    int y;
    MyPoint(){
        x=0;
        y=0;
    }
   MyPoint(int x,int y){
this.x=x;
this.y=y;
}
public int getX(){
        return this.x;
}
void setX(int x){
        this.x=x;
}
int getY(){
        return this.y;
}
void setY(int y){
        this.y=y;
}
public int[] getXY(){
        return new int[]{this.x,this.y};
}
public  void  setXY(int x,int y){
        this.x=x;
        this.y=y;
}
    public String toString() {
        return String.format("%s(%d)",this.x,this.y);
    }
    public double distance(int x,int y){
       return Math.sqrt((this.x=x)*(this.y=y));
    }
    public double distance(MyPoint another){
        return Math.sqrt((this.y-another.getY())+(this.x-another.getX()));
    }
    public  double distance(){
        return Math.sqrt((this.y)-(this.x));
    }
}


