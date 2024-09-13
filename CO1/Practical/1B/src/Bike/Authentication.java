package Bike;

public class Authentication {
	private static Authentication instance;
    private boolean isAuthenticated = false;
    private Authentication() {
    }
    public static synchronized Authentication getInstance() {
        if (instance == null) {
            instance = new Authentication();
        }
        return instance;
    }
    public void login(String username, String password) {
        System.out.println("User " + username + " authenticated.");
        isAuthenticated = true;
    }
    public void logout() {
        System.out.println("User logged out.");
        isAuthenticated = false;
    }
    public boolean isAuthenticated() {
        return isAuthenticated;
    }
}
