public class Comanda{
    Pizza pizza[] = new Pizza[10];
    int nrPizza;
    
    public void adaugaPizza(Pizza p){
        if(nrPizza < pizza.length){
            this.pizza[nrPizza] = p;
            nrPizza++;
        }else{
            System.out.println("Numrul maxim de pizza pentru aceasta comanda a fost atins");
        }
    }
    
    public void afisarePizza(){
        for(Pizza p:pizza){
            if(p instanceof ProsciutoPizza){
                System.out.println("Prosciuto Pizza pret: "+p.getPretPizza());
            }
            if(p instanceof FunghiPizza){
                System.out.println("Funghi Pizza pret: "+p.getPretPizza());
            }
            if(p instanceof QuatroStagioni){
                System.out.println("Quatro Stagioni pret: "+p.getPretPizza());
            }
        }
    }
    
    public double getPretTotal(){
        double pretTotal = 0;
        for(int i=0;i<nrPizza;i++){
            pretTotal+=pizza[i].getPretPizza();
        }
        return pretTotal;
    }
}