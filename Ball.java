public class Ball {
    float x;

    float y;

    int radius;

    float xDelta;

    float yDelta;

    Ball(float x, float y, int radius, float XDelta, float YDelta){

        this.x=x;

        this.y=y;

        this.radius=radius;

        this.xDelta=XDelta;

        this.yDelta=YDelta;

    }

    float getX(){

        return x;

    }

    void setX(float x){

        this.x=x;

    }

    float getY(){

        return y;

    }

    void setY(float y){

        this.y=y;

    }

    int getRadius(){

        return radius;

    }

    void setRadius(int radius){

        this.radius=radius;

    }

    float getXDelta(){

        return xDelta;

    }

    void setXDelta(float xDelta){

        this.xDelta=xDelta;

    }

    float getYDelta(){

        return yDelta;

    }

    void setYDelta(float yDelta){

        this.yDelta=yDelta;

    }

    void move() {

        x += xDelta;

        y += yDelta;

    }

    void reflectHorizontal() {

        xDelta = -xDelta;

    }

    void reflectVertical() {

        yDelta = -yDelta;

    }

    public String toString(){

        return "Ball[("+x+","+y+"),speed="+xDelta+","+yDelta+")]";



    }

}
