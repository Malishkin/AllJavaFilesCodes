package olympic;
import java.util.Arrays;

public class Athlete {
    String athletName;
    String[] achievements;
    public Athlete(){
        System.out.println("Creating Athlete");//constructor
    }
    public Athlete(String athletName,String[]achievements){
        super();
        this.athletName=athletName;
        this.achievements=achievements;
    }
    @Override
    public String toString() {
        return "Athlete [athleteName = "+athletName+", achievements = "+Arrays.toString(achievements)+"]";
    }

}
