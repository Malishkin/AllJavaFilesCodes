package alumniSystem;


import java.util.Random;
import java.util.Scanner;

public class Register {
    private int id = 309308286;
    private String firstName = "Sveta";
    private String lastName = "Lantsman";


    public char[] generateOTP() {
        //System.out.println("Generating OTP using random() : ");
        System.out.print("You OTP is : ");
        final int length = 8;

        // Using numeric values
        String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "1234567890";
        String combinedChars = capitalCaseLetters + numbers;

        // Using random method
        Random random_method = new Random();

        char[] otp = new char[length];
        otp[0]=numbers.charAt(random_method.nextInt(numbers.length()));
        otp[1]=numbers.charAt(random_method.nextInt(numbers.length()));


        for(int i = 2; i<length;i++){
            otp[i]=combinedChars.charAt(random_method.nextInt(combinedChars.length()));
        }

        return otp;
    }


    public String getLastName() {
        return "Your last name is "+lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        System.out.println("Your last name is "+lastName);
    }

    public String getFirstName() {
        return "Your first name is "+firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        System.out.println("Your first name is "+firstName);
    }

    public String getId() {
        return "Your id is "+id;
    }

    public void setId(int id) {
        this.id = id;
        System.out.println("Your id is "+id);
    }

    static class Password {
        String password;
        public Password(){
            Scanner input=new Scanner(System.in);
            System.out.println("Please generate your permanent password from 6 to 10 characters: ");
            password = input.nextLine();
            while(password.length()<6||password.length()>10){
                System.out.println("You must enter 6 to 10 characters");
                password = input.nextLine();
            }
            System.out.print("Your password is: ");

        }
        public String toString(){
            for (int i = 0; i<password.length();i++){
                System.out.print("*");
            }
            return " ";
        }

    }

}
