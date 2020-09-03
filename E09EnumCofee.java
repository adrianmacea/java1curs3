public class E09EnumCofee{
    public static void main (String [] args){
        Cofee.LARGE.afisareCantitate(); //250
        Cofee.LARGE.setCantitate(150);
        Cofee.LARGE.afisareCantitate(); //150
    }
}