/**
 * Encapsulation:
 * folosim modificatorii private si public
 * in corelatie cu metodele de tip getter si setter
 */
public class Pisica{
    private String nume;
    private int varsta;
    private boolean dead;
    
    public String getNume(){ // nu primeste parametrii, scopul lui este doar de a returna o valoare
        return this.nume; // intoarce valoarea nume a acestei instante care se comporta cu comportamentul getNume
    }
    
    public void setNume(String nume){ //pentru ca nu intoarce nici o valoare il facem sa fie void
        if (nume.length() == 3){ // constrangerea se scrie inainte de atribuirea valorii
            this.nume = nume;
        }else{
            System.out.println("Pisica poate sa aiba un nume de maximum 3 litere.\nMai incearca!"); // else arunca o exceptie
        }
        
    }
    
    public int getVarsta(){
        return this.varsta; // intoarce varsta instantei care isi efectueaza comportamentul getVarsta
    }
    
    public void setVarsta(int varsta){ //primeste ca parametru valoarea varstei cu care va fi modificat atributul
        this.varsta = varsta;
    }
    
    public boolean isDead(){
        return this.dead;
    }
    
    public void setDead(boolean dead){
        this.dead = dead;
    }
}