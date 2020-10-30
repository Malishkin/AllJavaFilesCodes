package olympic;

public class OlimpicMain {
    public static void main(String[] args) {
        Judoka yarden = new Judoka();
        yarden.athletName = "Yerden Gerbi";
        String [] yardenAchievements = {"Rio Olympic 2017, Bronze",
                                        "Paris Grand Slam 2015, Bronze",
                                         "Judo World Championship 2014, Silver"};
        yarden.achievements = yardenAchievements;
        System.out.println(yarden.toString());
        //new Judoka();
        new Judoka("Yarden Gerbi",yardenAchievements,63);
    }
    RhytmicGimnasticGroup rythm = new RhytmicGimnasticGroup();
}
