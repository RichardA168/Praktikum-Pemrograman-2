package praktikum5.soal1;

public abstract class Shape {
    protected String shapeName;
    
    public Shape(String nama){
        shapeName = nama;
    }
    
    protected abstract double area();
    
    public String toString (){
        return shapeName;
    }
    
}