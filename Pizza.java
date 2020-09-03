/**
 * Pizza - pret blat + ingrediente,
 * ProsciutoPizza - 5 ingrediente
 * FunghiPizza - 7 ingrediente
 * QuatroStagioni - 10 ingrediente
 * 
 * Ingredient - nume, pret
 * 
 * Comanda - mai multe Pizza
 * 
 * Functionalitati: 
 * adaugare ingrediente, calculare pret total (blat + fiecare ingredient)
 * adaugare pizza pe comanda, afisare ingrediente si pret total
 */

public abstract class Pizza{
    double pret;
    Ingredient[] ingrediente;
    int nrIngrediente;
    
    public Pizza(double pret){
        this.pret = pret;
    }
    
    public void adaugaIngredient(Ingredient i){
        if(nrIngrediente<ingrediente.length){
            this.ingrediente[nrIngrediente] = i;
            nrIngrediente++;
        }else{
            System.out.println("Numarul maxim de ingrediente a fost atins.\nNu mai pot fi adaugate alte ingrediente pe aceasta pizza.");
        }
    }
    
    public double getPretPizza(){
        double pretIngrediente = 0;
        for (int i=0;i<nrIngrediente;i++){ // parcurg ingredientele
            // adun pretul fiecarui ingredient
            pretIngrediente+=this.ingrediente[i].pret;
        }
        //adun pretul total al ingredientelor la pretul blatului
        double pretTotalPizza = this.pret + pretIngrediente;
        
        return pretTotalPizza;
    }
}