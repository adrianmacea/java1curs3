public class E03Overriding{
    public static void main (String [] args){
        Cilindru cil = new Cilindru();
        
        cil.r = 10;
        cil.h = 10;
        
        System.out.println(cil.getArie());
        
    }
}