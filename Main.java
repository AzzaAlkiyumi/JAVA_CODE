import java.util.Scanner;

import static java.lang.Math.PI;


public class Main {
    public static void main(String[] args) {
        System.out.println(" Rectangle Area & Parameter:");
        Scanner read = new Scanner(System.in);
        System.out.println("Enter rectangle high :");
        double length = read.nextDouble();
        System.out.println("Enter rectangle width :");
        double width = read.nextDouble();
        shapes rectangle=new Rectangle(length, width);
        rectangle.PrintArea();
        rectangle.PrintParameter();

        System.out.println("\n");
        System.out.println(" Circle Area & Parameter:");
        System.out.println("Enter Circle radius :");
        double radius = read.nextDouble();
        shapes circle=new Circle(radius);
        circle.PrintArea();
        circle.PrintParameter();

        System.out.println("\n");
        System.out.println(" Triangle Area & Parameter:");
        System.out.println("Enter 3 Triangle length :");
        double length1=read.nextDouble();
        double length2=read.nextDouble();
        double length3=read.nextDouble();
        System.out.println("Enter base_length &  high  of Triangle:");
        double high=read.nextDouble();
        double base_length=read.nextDouble();
        shapes  triangle= new Triangle(length1,length2,length3,high,base_length);
        triangle.PrintArea();
        triangle.PrintParameter();
    }

}
    interface shapes {

     void PrintArea();
     void PrintParameter();

    }

    class Rectangle implements shapes {
        double length, width;

        public Rectangle(double len, double wid) {
            length = len;
            width = wid;
        }


        public void PrintArea() {

            System.out.println("rectangle Area=" + length * width);

        }


        public void PrintParameter() {

            System.out.println("rectangle Perimeter = " + (length + width) * 2);

        }
    }

    class Circle implements shapes {
     double radius ;

     public  Circle (double r){
         radius =r;
     }
     public void PrintArea(){
         System.out.println("circle Area= " + (PI * Math.pow(radius, 2)));
     }
        public void PrintParameter() {
            System.out.println("circle Perimeter=" + 2 * PI * radius);
        }
    }

    class Triangle  implements shapes{
    double length1 ,length2, length3,high,base_length;

    public Triangle(double l1 ,double l2 , double l3 ,double h ,double bl){
        length1=l1;
        length2=l2;
        length3=l3;

        base_length=bl;
        high =h;


    }
        public void PrintArea(){
            System.out.println("Triangle Area=" + (0.5*high*base_length));
        }

        public void PrintParameter() {
            System.out.println("Triangle Perimeter=" + (length1+length2+length3));
        }


    }
