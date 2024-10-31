public class Triangle {
    //instance variables
    double smallSide;
    double medSide;
    double largeSide;
    //constructors
    //no parameter constructor
    public Triangle()
    {
        smallSide=3;
        medSide=4;
        largeSide=5;
    }
    //constructor with parameters
    // takes parameters of the side lengths of the triangle, assigns them to the proper variable
    //according to length
    public Triangle(double a, double b, double c)
    {
        if (a>b && a>c)
        {
            largeSide=a;
            if(b>c)
            {
                medSide=b;
                smallSide=c;
            }
            else
            {
                medSide=c;
                smallSide=b;
            }
        }
        else if(b>a && b>c)
        {
            largeSide=b;
            if(a>c)
            {
                medSide=a;
                smallSide=c;
            }
            else
            {
                medSide=c;
                smallSide=a;
            }
        }
        else
        {
            largeSide=c;
            if(a>b)
            {
                medSide=a;
                smallSide=b;
            }
            else
            {
                medSide=b;
                smallSide=a;
            }
        }}
    //methods
//returns the perimeter of the triangle
    public double perimeter()
    {
        return largeSide+smallSide+medSide;
    }
    //returns whether the triangle is a triangle (if a+b>c it returns true)
    public boolean isTriangle()
    {
        if(smallSide+medSide>largeSide)
            return true;
        else
            return false;
    }


    //displays the sides of the triangle and their length
    public void displayTriangle()
    {
        System.out.println("Smallest Side: "+smallSide);
        System.out.println("Medium Side: "+ medSide);
        System.out.println("Largest Side: "+largeSide);
    }
    //returns the area of the triangle
    public double area()
    {
        double p= perimeter()/2;
        return  Math.sqrt((p*(p-smallSide))*(p-medSide)*(p-largeSide));
    }
    // returns true if triangle is a right triangle
    public boolean isRightTriangle()
    {
        if(((largeSide*largeSide)-((smallSide*smallSide)+(medSide*medSide)))>.1)
            return false;
        else
            return true;
    }

    //accessors and mutators
    public double getLargeSide() {//returns length of largest side of triangle
        return largeSide;
    }
    public double getMedSide(){//returns length of med side of triangle
        return medSide;
    }
    public double getSmallSide(){//returns length of smallest side of triangle
        return smallSide;
    }
    public void setLargeSide(double newLargeSide){//sets large side
        largeSide=newLargeSide;
    }
    public void setMedSide(double newMedSide){//sets medium side
        medSide=newMedSide;
    }
    public void setSmallSide(double newSmallSide){//sets small side
        smallSide=newSmallSide;
    }
}
