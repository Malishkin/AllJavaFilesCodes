package alumniSystem;

public class MainAlumni {
    public static void main(String[] args) {
        Register registerNewGrad = new Register();
        System.out.println(registerNewGrad.getId());
        System.out.println(registerNewGrad.getFirstName());
        System.out.println(registerNewGrad.getLastName());
        System.out.println(registerNewGrad.generateOTP());
        Register.Password password = new Register.Password();
        System.out.println(password);


    }


}
