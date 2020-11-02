package shecodesalumniproject;

import java.util.Arrays;


public class ShouldOfferJob {
    private String[] jobRequriments;

    public String[] getJobRequriments() {
        return jobRequriments;
    }

    public void setJobRequriments(String[] jobRequriments) {
        this.jobRequriments = jobRequriments;
    }
    protected void printRequriments(String[]jobRequriments){
        Arrays.sort(jobRequriments);
        System.out.println("There is the new job, the job requriments are:");
        for (int i = 0; i<jobRequriments.length;i++){
            System.out.println(jobRequriments[i]);
        }
    }

}
