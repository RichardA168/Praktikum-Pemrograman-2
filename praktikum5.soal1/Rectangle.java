package praktikum5.soal1;

public class Rectangle extends Shape{
    private double length, width;
    
    //----- Constructor: Sets up the rectangle -----
    
    public Rectangle (double l, double w){
        super("Rectangle");
        length = l;
        width = w;
    }
    
    public double getWidth(){
        return width;
    }
    
    public void setWidth(double w){
        width = w;
    }
    
    public double getLength(){
        return length;
    }
    
    public void setLength(double l){
        length = l;
    }
    
    //----- Returns the surface area of the rectangle -----
    
    public double area(){
        return length*width;
    }
    
    //----- Returns the rectangle as a String -----
    
    public String toString(){
        return super.toString() + " of length "+length+" and width "+width;
    }
            
}