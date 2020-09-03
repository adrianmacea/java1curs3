public enum Cofee{
    SMALL, MEDIUM(100), LARGE(250);
    
    private double cantitate;
    
    Cofee(){
    }
    
    Cofee(double cantitate){
        this.cantitate = cantitate;
    }
    
    public void setCantitate(double cantitate){
        this.cantitate = cantitate;
    }
    
    public void afisareCantitate(){
        System.out.println(cantitate);
    }
    
    
}