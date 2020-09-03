public class Cilindru extends Cerc {
    double h;
    
    // suprascriere sau overriding
    
    @Override // optional, adnotarea o folosim pt a ne asigura ca avem intradevar o suprascriere
    public double getArie(){
        return 2*super.getArie()+super.getLungime()*this.h;
        //"super" este instanta unui cerc iar "this" este instanta unui cilindru
    }
    
}