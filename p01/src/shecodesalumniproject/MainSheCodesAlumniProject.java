package shecodesalumniproject;

public class MainSheCodesAlumniProject {
    public static void main(String[] args) {
        RegisterNewGrad registerNewGrad = new RegisterNewGrad();
        registerNewGrad.setFirstName("Sveta");
        registerNewGrad.setLastName("Lantsman");
        System.out.println(registerNewGrad.generateOTP());
        registerNewGrad.sheCodesLogin();
        MyCourses myCourses = new MyCourses();
        myCourses.setMyCourses(new String[]{"Java Basics","Git","Web", "Basic Python", "MySQL", "JavaScript", "HTML", "CSS"});
        myCourses.printCourses(myCourses.getMyCourses());
        JobSearchStatus jobSearchStatus = JobSearchStatus.LOOKING_FOR_A_NEW_CHALLENGE;
        System.out.println("My job search status is: "+jobSearchStatus);
        ShouldOfferJob shouldOfferJob = new ShouldOfferJob();
        shouldOfferJob.setJobRequriments(new String[] {"Web","Java Basics","Git"});
        shouldOfferJob.printRequriments(shouldOfferJob.getJobRequriments());
        CoursesAndJobStatic.ifYouCanMatchTheJob(shouldOfferJob.getJobRequriments(),myCourses.getMyCourses());
        CanMentor canMentor = new CanMentor();
        canMentor.setMentorCourses(new String[]{"Java basics","Git","Web"});
        CoursesAndJobStatic.printCoursesforAll(canMentor.getMentorCourses());
        SheCodesCourses sheCodesCourses = new SheCodesCourses();
        CoursesAndJobStatic.ifYouCanTeach(canMentor.getMentorCourses(),sheCodesCourses.allCourses);
        Allies allies = new Allies();
        allies.setAlliesCourses(new String[]{"Java basics","Git"});
        CoursesAndJobStatic.printCoursesforAll(allies.getAlliesCourses());
        CoursesAndJobStatic.ifYouCanTeach(allies.getAlliesCourses(),sheCodesCourses.allCourses);

    }
}
