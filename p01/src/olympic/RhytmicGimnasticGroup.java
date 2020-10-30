package olympic;

public class RhytmicGimnasticGroup extends Athlete {
    String apparatus;
    public RhytmicGimnasticGroup(){
        this("RhytmicGimnasticGroup", new String[] {});
    }
    public RhytmicGimnasticGroup(String athleteName, String[] achievements){
        super(athleteName, achievements);
        this.apparatus = apparatus;

    }

}
