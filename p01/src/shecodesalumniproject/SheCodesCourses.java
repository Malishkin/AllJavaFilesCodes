package shecodesalumniproject;

import java.util.Arrays;

public class SheCodesCourses {
    public String[]allCourses = {"Java basics", "Android", "Basic Python",
                        "Data Analysis", "Python for Programmers",
                         "Web", "React","Git"};
     protected void printCourses(String[]allCourses){
         Arrays.sort(allCourses);
         System.out.println("The courses of She_Codes are: ");
         for(int i = 0; i<allCourses.length; i++){
             System.out.println(allCourses[i]);
         }
     }
}

