public class Sfera extends Forma3D{
    int r;
    
    public double getArie(){
        return 4*3.14*r*r;
    }
    
    public double getVolum(){
        return 4*3.14*r*r*r/3;
    }
}