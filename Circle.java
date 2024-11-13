public class Circle {
    public  double radius;
    public String color;
    Circle (){
        radius=1.0;
        color="red";
    }
    Circle (double radius){
        this.radius=radius;
    }
    double getRadius(){
        return radius;
    }
    double getArea(){
        return radius*radius*Math.PI;
    }

}
