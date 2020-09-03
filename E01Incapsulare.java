public class E01Incapsulare{
    public static void main(String [] args){
        Pisica p1 = new Pisica();
        
        p1.setNume ("Tom"); // Pisicii p1 seteaza-i numele Tom. 
        // Desi nume este un atribut private al obiectului pisica, am putut sa modific valoarea acestuia 
        // apeland comportamentul setNume care este public.
        
        p1.setVarsta (3);
        
        p1.setDead (true);
        
        System.out.println(p1.getNume()); // similar si pentru citirea valorii
        System.out.println(p1.getVarsta());
        System.out.println(p1.isDead());
    }
}