public class Colis { 
    private String description;
    private int poidsColis; 

    public Colis(String desciption, int poidsColis){
        this.description = desciption;
        this.poidsColis = poidsColis;
    }

    public String getDescription(){
        return this.description;
    }

    public int getPoidsColis(){
        return this.poidsColis;
    }
}
