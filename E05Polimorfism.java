public class E05Polimorfism{
    public static void main (String [] args){
        Cerc c1 = new Cilindru();
        c1.r = 10;
        
        Cerc c2 = new Cerc();
        c2.r = 10;
        
        System.out.println("C1: "+c1.getArie()); // este aria cercului sau aria cilindrului? R: este aria cilindrului
        //cand apelam dintr-o forma un comportament suprascris, nu se apeleaza comportamentul formei, 
        //ci se apeleaza comportamentul suprascris de instanta care a mostenit forma
        System.out.println("C2: "+c2.getArie());
    }
}