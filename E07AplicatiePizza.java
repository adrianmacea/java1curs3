public class E07AplicatiePizza{
    public static void main(String [] args){
        Comanda c = new Comanda();
        
        Pizza p1 = new ProsciutoPizza(20);
        p1.adaugaIngredient(new Ingredient("I1", 5));
        p1.adaugaIngredient(new Ingredient("I2", 3));
        p1.adaugaIngredient(new Ingredient("I3", 7));
        
        Pizza p2 = new FunghiPizza(30);
        p2.adaugaIngredient(new Ingredient("I1", 4));
        p2.adaugaIngredient(new Ingredient("I2", 7));
        p2.adaugaIngredient(new Ingredient("I3", 3));
        p2.adaugaIngredient(new Ingredient("I4", 2));
        
        Pizza p3 = new QuatroStagioni(30);
        p3.adaugaIngredient(new Ingredient("I1", 7));
        p3.adaugaIngredient(new Ingredient("I2", 8));
        
        c.adaugaPizza(p1);
        c.adaugaPizza(p2);
        c.adaugaPizza(p3);
        
        System.out.println("PRET TOTAL: "+c.getPretTotal());
        c.afisarePizza();
    }
}