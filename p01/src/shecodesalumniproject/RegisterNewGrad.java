package shecodesalumniproject;



import java.util.Random;
import java.util.Scanner;

public class RegisterNewGrad {
    private static Object Password;
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        System.out.println("Your first name is " + firstName);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        System.out.println("Your last name is " + lastName);

    }

    public char[] generateOTP() {
        System.out.println("Your temporary password is: ");
        final int lenght = 8;
        String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "1234567890";
        String combinedChars = capitalCaseLetters + numbers;
        Random random = new Random();
        char[] otp = new char[lenght];
        otp[0] = numbers.charAt(random.nextInt(numbers.length()));
        otp[1] = numbers.charAt(random.nextInt(numbers.length()));
        for (int i = 2; i < otp.length; i++) {
            otp[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
        }
        return otp;
    }

    private static String getPassword() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please generate your permanent password from 6 to 10 characters: ");
        String password = input.nextLine();

        while (password.length() < 6 || password.length() > 10) {
            System.out.println("You must enter 6 to 10 characters");
            password = input.nextLine();
        }
        System.out.println("Your password is saved");
        return password;
    }
    protected void sheCodesLogin() {
        String firstName = getFirstName();
        String lastName = getLastName();
        String password = RegisterNewGrad.getPassword();
        Scanner inputfirst = new Scanner(System.in);


        while (true){
            System.out.println("Please, enter your first name:");
            String first = inputfirst.next();
            Scanner inputlast = new Scanner(System.in);
            System.out.println("Please, enter your last name:");
            String last = inputlast.next();
            Scanner inputpass = new Scanner(System.in);
            System.out.println("Please, enter your password:");
            String pass = inputpass.next();
            if (first.equals(firstName) && last.equals(lastName) && pass.equals(password)) {
                System.out.println("Access Granted! Welcome, "+firstName+"!");
                return;
            } else {
                System.out.println("One or more parameteres are invalid");
            }
        }

    }
}
























