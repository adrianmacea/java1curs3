public class E04Polimorfism{
    public static void main(String [] args){
        Punct p1 = new Punct(10,10);
        
        Punct p2 = new Cerc();
        Punct p3 = new Cilindru();
        Cerc c1 = new Cilindru();
        
        p2.x = 10;
        p2.y = 10;
        
        Cerc c2 = (Cerc) p2;
        c2.r = 10;
        c2.getArie();
        
    }
}