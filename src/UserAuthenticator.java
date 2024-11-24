public class UserAuthenticator {

    // Predefined valid usernames and the same password for all users
    public static boolean authenticate(String username, String password) {
        // Hardcoded usernames and password
        String[] validUsernames = {"MarwahWaheed", "YasaminNargis", "HooriaMashal", "ZubiaAmir"};
        String validPassword = "OOP@2025";

        // Check if the entered username matches any valid username and the password is correct
        for (String validUsername : validUsernames) {
            if (validUsername.equals(username) && validPassword.equals(password)) {
                return true; // Authentication successful
            }
        }
        return false;
    }
}
