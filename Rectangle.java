public class Rectangle {
    private double height;
    private double width;
    Rectangle(){
        this.height = 1.0;
        this.width = 1.0;
    }
    Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }
    public double getArea (){
        return width*height;
    }
    public double getPerimeter(){
        return 2*(height+width);
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }


    public static void main(String[] args) {
        Rectangle r  = new Rectangle();
        System.out.println();
        System.out.println("Default rectangle");
        System.out.println("The area of rectangle is :" + r.getArea());
        System.out.println("The perimeter of rectangle is :" + r.getPerimeter());
        System.out.println("The width of rectangle is :" + r.getWidth());
        System.out.println("The height of rectangle is :" + r.getHeight());

        System.out.println();
        System.out.println("Second Rectangle");
        Rectangle r1 = new Rectangle(40.0,4.0);
        System.out.println("The area of rectangle is :" + r1.getArea());
        System.out.println("The perimeter of rectangle is :" + r1.getPerimeter());
        System.out.println("The width of rectangle is :" + r1.getWidth());
        System.out.println("The height of rectangle is :" + r1.getHeight());

        System.out.println();
        System.out.println("Third Rectangle");
        Rectangle r2 = new Rectangle(35.9,3.5);
        System.out.println("The area of rectangle is :" + r2.getArea());
        System.out.println("The perimeter of rectangle is :" + r2.getPerimeter());
        System.out.println("The width of rectangle is :" + r2.getWidth());
        System.out.println("The height of rectangle is :" + r2.getHeight());



    }
}
