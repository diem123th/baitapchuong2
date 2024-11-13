import java.lang.reflect.Array;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        // Invoke public methods on instance c1, via dot operator.
        System.out.println("The circle has radius of "
                + c1.getRadius() + " and area of " + c1.getArea());
        //The circle has radius of 1.0 and area of 3.141592653589793

        // Declare an instance of class circle called c2.
        // Construct the instance c2 by invoking the second constructor
        // with the given radius and default color.
        Circle c2 = new Circle(2.0);
        // Invoke public methods on instance c2, via dot operator.
        System.out.println("The circle has radius of "
                + c2.getRadius() + " and area of " + c2.getArea());
        Circle c3 = new Circle(1.1);
        System.out.println(c1);   // toString()
        Circle c4 = new Circle(); // default constructor
        System.out.println(c2);

        // Test setter and getter
        System.out.println(c1);      // toString()
        System.out.println("radius is: " + c1.getRadius());

        // Test getArea() and getCircumference()
        System.out.printf("area is: %.2f%n", c1.getArea());
        System.out.printf("circumference is: %.2f%n", c1.getRadius());

        Ball ball = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        System.out.println(ball);  // toString()

        // Test Setters and Getters
        ball.setX(80.0f);
        ball.setY(35.0f);
        ball.setRadius(5);
        ball.setXDelta(4.0f);
        ball.setYDelta(6.0f);
        System.out.println(ball);  // toString()
        System.out.println("x is: " + ball.getX());
        System.out.println("y is: " + ball.getY());
        System.out.println("radius is: " + ball.getRadius());
        System.out.println("xDelta is: " + ball.getXDelta());
        System.out.println("yDelta is: " + ball.getYDelta());

        // Bounce the ball within the boundary
        float xMin = 0.0f;
        float xMax = 100.0f;
        float yMin = 0.0f;
        float yMax = 50.0f;
        for (int i = 0; i < 15; i++) {
            ball.move();
            System.out.println(ball);
            float xNew = ball.getX();
            float yNew = ball.getY();
            int radius = ball.getRadius();
            // Check boundary value to bounce back
            if ((xNew + radius) > xMax || (xNew - radius) < xMin) {
                ball.reflectHorizontal();
            }
            if ((yNew + radius) > yMax || (yNew - radius) < yMin) {
                ball.reflectVertical();
            }
            //TestCustomer
            Customer c5 = new Customer(88, "tan ah teck", 10);
            System.out.println(c5);
            c5.setDiscount(8);
            System.out.println(c5);
            System.out.println("id is : " + c5.getId());
            System.out.println("name is: " + c5.getName());
            System.out.println("discount is: " + c5.getDiscount());
            //TesInvoice
            Invoice inv1 = new Invoice(101, c5, 888.8);
            System.out.println(inv1);
            inv1.setAmount(999.9);
            System.out.println(inv1);
            System.out.println("id is: " + inv1.getCustomer());
            System.out.println("customer is: " + inv1.getCustomer());
            System.out.println("amount is:" + inv1.getAmount());
            System.out.println("customer's id is: " + inv1.getCustomerId());
            System.out.println("customer's name is: " + inv1.getCustomerName());
            System.out.println("customer's discount is: " + inv1.getCustomerDiscount());
            System.out.println("amount after discount is: %.2f%n" + inv1.getAmountAfterDiscount());
        }
        Customer2 a1 = new Customer2(34, "bich tuyen", 13);
        System.out.println(a1);
        System.out.println("customer's id is : " + a1.getId());
        System.out.println("customer's name is: " + a1.getName());
        System.out.println("customer's gender is: " + a1.getGender());
        Account b1 = new Account(12, a1, 1325);
        System.out.println(b1);
        System.out.println("customer's account id is: " + b1.getId());
        System.out.println("account's customer is: " + b1.getCustomer2());
        System.out.println("customer's account balance is: " + b1.getBalance());
        b1.setBalance(9999.9);
        System.out.println("customer's account balance is: " + b1.getBalance());
        System.out.println("customer's name is: " + b1.getCustomer2Name());
        b1.deposit(0.01);
        System.out.println("customer's account balance is: " + b1.getBalance());
        b1.withdraw(1441525);
        b1.withdraw(972656);
        System.out.println("customer's account balance is: " + b1.getBalance());


        MyPoint p1 = new MyPoint();  // Test constructor
        System.out.println(p1);      // Test toString()
        p1.setX(8);   // Test setters
        p1.setY(6);
        System.out.println("x is: " + p1.getX());  // Test getters
        System.out.println("y is: " + p1.getY());
        p1.setXY(3, 0);   // Test setXY()
        System.out.println(p1.getXY()[0]);  // Test getXY()
        System.out.println(p1.getXY()[1]);
        System.out.println(p1);

        MyPoint p2 = new MyPoint(0, 4);  // Test another constructor
        System.out.println(p2);
// Testing the overloaded methods distance()
        System.out.println(p1.distance(p2));    // which version?
        System.out.println(p2.distance(p1));    // which version?
        System.out.println(p1.distance(5, 6));  // which version?
        System.out.println(p1.distance());      // which version?


    }
}