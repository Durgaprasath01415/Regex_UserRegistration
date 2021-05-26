public class UserRegistration {
        public static void main(String[] args) {
            System.out.println("Welcome to User Registration Regex pattern");
                UserFile userFile = new UserFile();
                System.out.println(userFile.checkFirstName("Durga"));
                System.out.println(userFile.checkLastName("Prasath"));
                System.out.println(userFile.checkEmail("abc.xyz@bl.co.in"));
                System.out.println(userFile.checkPhoneNumber("91 9919819801"));
                System.out.println(userFile.checkPassword("aA1234#!"));
        }
    }
