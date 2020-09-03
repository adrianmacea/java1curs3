public class E08EnumAnotimp{
    public static void main (String [] args){
        Anotimp a1 = Anotimp.VARA;
        
        switch(a1){
            case PRIMAVARA:
                System.out.println("Ghiocei");
                break;
            case TOAMNA:
                System.out.println("Recolta");
                break;
            case VARA:
                System.out.println("Soare");
                break;
            case IARNA:
                System.out.println("Zapada");
                break;
        }
        
        for(Anotimp x: Anotimp.values()){ // parcurgem valorile enumerarii Anotimp, pe care le vom afisa
            System.out.println(x);
        }
    }
}