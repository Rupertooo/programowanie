
package zadanie1;

public class Czas {
    private int godziny, minuty;
    
    public Czas(int godziny, int minuty){
        this.godziny = godziny;
        this.minuty = minuty;
    }
    public Czas(String czas){
        String godzinyString = czas.substring(0,2);
        this.godziny = Integer.parseInt(godzinyString);
        String minutyString = czas.substring(3,5);
        this.minuty = Integer.parseInt(minutyString);
    }
        
    public String ToString(){
        return(godziny+"h"+minuty+"min");
    }
    public Czas Dodaj(Czas t){
        int godzinyTmp = this.godziny+t.godziny;
        int minutyTmp = this.minuty+t.minuty;
        Czas tmp = new Czas(godzinyTmp, minutyTmp);
        return(tmp);
    }
        public Czas Odejmnij(Czas t){
        int godzinyTmp = this.godziny-t.godziny;
        int minutyTmp = this.minuty-t.minuty;
        Czas tmp = new Czas(godzinyTmp, minutyTmp);
        return(tmp);
    }
}
