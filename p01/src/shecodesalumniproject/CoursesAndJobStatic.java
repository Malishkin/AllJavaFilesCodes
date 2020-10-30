package shecodesalumniproject;

import java.util.Arrays;

public class CoursesAndJobStatic {
     protected static void printCoursesforAll(String[] anyCourses){
            Arrays.sort(anyCourses);
            System.out.println("The courses I graduated and can teach:");
            for (int i = 0; i < anyCourses.length; i++) {
                System.out.println(anyCourses[i]);
            }

        }
     protected static boolean ifYouCanMatchTheJob(String[]jobRequrimentsCourses , String [] myCourses ){
        Arrays.sort(jobRequrimentsCourses);
        Arrays.sort(myCourses);
        int counter = 0;
         System.out.println("The system has checked your skills:");
        for (int i = 0; i < jobRequrimentsCourses.length; i++){
            for (int j = 0; j<myCourses.length; j++){
                if(jobRequrimentsCourses[i] == myCourses[j]){
                    counter++;
                }
            }
        }
        if(counter>=jobRequrimentsCourses.length){
            System.out.println("You're completely match the job, congratulations!");
            return true;
        }
        else {
            System.out.println("You're not skilled enought for this job, sorry...");
            return false;
        }

    }
    protected static boolean ifYouCanTeach(String[] myCourses, String[] allCourses){
         int counter = 0;
         Arrays.sort(myCourses);
         Arrays.sort(allCourses);
        System.out.println("The system has checked up your skills:");
        for (int i = 0; i<myCourses.length; i++){
            for (int j = 0; j<allCourses.length; j++){
                if(myCourses[i]==allCourses[j]){
                    counter++;
                }
            }

            }
        if(counter>0){
            System.out.println("You are match to teach "+counter+" courses");
            return true;
        }
        else {
            System.out.println("We are sorry, you are not match for teaching any course...");
            return false;
        }
    }



    }

