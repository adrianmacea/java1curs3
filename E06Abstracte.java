public class E06Abstracte{
    public static void main (String [] args){
        Dreptunghi d = new Dreptunghi();
        
        Forma2D f1;
        f1 = new Dreptunghi();
        
        f1.getArie(); //apelam comportamentul suprascris al instantei Dreptunghi din interiorul zonei de memorie de tipul Forma2D
        
        Forma2D [] v = new Forma2D[10]; // nu am creat nici o instanta, ci doar un array de zone de memorie de acelasi tip
        
        v[0] = new Dreptunghi();
    }
}