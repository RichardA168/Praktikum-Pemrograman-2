package praktikum5.soal1;

public class Cylinder extends Shape{
    private double radius, height;
    
    //----- Constructor: Sets up the Cylinder -----
    
    public Cylinder(double r, double h){
        super("Cylinder");
        radius = r;
        height = h;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public void setRadius(double r){
        radius = r;
    }
    
    public double getHeight(){
        return height;
    }
    
    public void setHeight(double h){
        height = h;
    }
    
    //----- Returns the surface area of the cylinder -----
    
    public double area(){
        return Math.PI*radius*radius*height;
    }
    
    //----- Returns the sphere as a String -----
    
    public String toString(){
        return super.toString()+" of radius "+radius+" and height "+height;
    }
    
}