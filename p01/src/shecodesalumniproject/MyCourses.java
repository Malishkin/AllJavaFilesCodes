package shecodesalumniproject;

import java.util.Arrays;

enum JobSearchStatus {
    LOOKING_FOR_A_NEW_CHALLENGE,  NOT_LOOKING_BUT_OPEN_FOR_SUGGESTIONS, NOT_LOOKING_FOR_A_CHANGE
}

public class MyCourses extends SheCodesCourses{
    private String linkedInPage;
    private String[] myCourses = {"Java basics", "Git", "Web"};
    public String[] getMyCourses() {
        return myCourses;
    }

    public void setMyCourses(String[] myCourses) {
        this.myCourses = myCourses;
    }

    @Override
    public void printCourses(String [] myCourses) {
        Arrays.sort(myCourses);
        System.out.println("The courses I finished are:");
        for(int i = 0; i<myCourses.length;i++){
            System.out.println(myCourses[i]);
        }
    }

}
