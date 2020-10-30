package olympic;

public class Judoka extends Athlete {
    int weight;
    Judoka(){
        System.out.println("Creating Judoka");
    }
    public  Judoka(String athleteName, String []achievements, int weight ) {
        //this.athletName = athleteName;
        //this.achievements = achievements;
        super(athleteName,achievements);
        this.weight = weight;
    }
}
