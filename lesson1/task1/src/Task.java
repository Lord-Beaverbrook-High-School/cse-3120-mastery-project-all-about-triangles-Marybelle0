public class Task {
    public static void main(String[] args) {
    // testing
    Triangle tri= new Triangle();
    Triangle tri2= new Triangle(27,12,13.5);
    Triangle tri3= new Triangle(9, 7.5, 3.1);
    Triangle tri4= new Triangle(8.54, 3, 8);
    Triangle tri5= new Triangle (4,7.25, 4);

    tri.displayTriangle();//output should be 3, 4, 5
    System.out.println(tri.isTriangle());//output should be true
    tri2.displayTriangle(); //should be 12, 13.5, 27
    System.out.println(tri2.isTriangle());//output should be false
    tri2.setLargeSide(2+tri2.getMedSide());//large side set
    System.out.println("Tri #3 Perimeter: "+ tri3.perimeter());//perimeter should be 19.6
    System.out.println("Tri #3 Area: "+ tri3.area());// area; 10.99156...
    System.out.println(tri4.isRightTriangle());// output should be true

    tri5.displayTriangle();// make sure having duplicate 4s doesn't cause errors
    tri.setLargeSide(6);// should set the largest side to 6
    tri.displayTriangle();//large side should be 6
    System.out.println(tri.isRightTriangle());//should be false














    }//put your task here
}



