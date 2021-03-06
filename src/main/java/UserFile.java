public class UserFile {
    //This method is used to validate the First Name
    public boolean checkFirstName(String firstName) {

        return (firstName.matches("[A-Z][a-z]{3,}"));
    }

    //This method is used to validate the Last Name
    public boolean checkLastName(String lastName) {

        return (lastName.matches("^[A-Z][a-z]{3,}"));
    }

    //  This method is used to validate email Id
    public boolean checkEmail(String email) {
        return (email.matches("^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*[@][0-9A-Za-z]+([.][a-zA-Z]{2,4})*$"));
    }

    //  This method is used to validate phone Number
    public boolean checkPhoneNumber(String phoneNumber) {
        return (phoneNumber.matches("^[91]{2}+[ ]+[0-9]{10}$"));
    }

    //  This method is used to validate password
    public boolean checkPassword(String password) {
        return (password.matches("^(?=.*[A-Z])(?=.*[*.!@#$%^&(){}:'<>,.>/~`_+=|].)(?=.*[a-z])(?=.*[0-9]).{8,}$"));
    }
}