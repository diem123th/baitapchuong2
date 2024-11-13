public class Circle2 {
    double radius;
    String color;
    Circle2(){
        radius=1.0;
        color="red";
    }
    Circle2(double r){
        radius=r;
        color="red";
    }
    double getRadius(){
        return  radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    double getArea(){
        return radius*radius*Math.PI;
    }
    double getCircumference(){
        return 2*Math.PI*radius;
    }
    public String toString() {
        return "Circle[radius="+ radius+",color="+color+"]";
    }
}
