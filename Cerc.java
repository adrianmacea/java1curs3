public class Cerc extends Punct{ // interactiune de tip isA.  Cercul is A Punct.
    double r; // la care am adaugat un atribut 
    String x; // hiding fields - ascunderea campurilor, a 3-a solutie de particularizare: modificarea unui tribut mostenit
    
    public Cerc(){
        super(10,10); // "super" cu paranteze trebuie sa fie prima instructiune din constructor la fel ca "this" cu paranteze
        super.x = 10;
        this.x = "Hello";
        
        // daca avem un constructor in superclasa, trebuie sa dam valoare acelor parametrii aici, in cnstructorul subclasei
    }
    
    // la care am adaugat si un comportament
    public double getArie(){
        return 3.14*this.r*this.r;
    }
    
    public double getLungime(){
        return 2*3.14*this.r;
    }
}