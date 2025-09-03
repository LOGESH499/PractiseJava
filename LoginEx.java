package OOPSpractise;

class Login {
    // private variables
    private String username;
    private String password;

    // setter for username
    public void setUsername(String username) {
        this.username = username;
    }

    // getter for username
    public String getUsername() {
        return username;
    }

    // setter for password (no getter for security)
    public void setPassword(String password) {
        this.password = password;
    }

    // method to check password (separate method, not inside setter)
    public boolean checkPassword(String inputPassword) {
        return this.password.equals(inputPassword);
    }
}

public class LoginEx {
    public static void main(String[] args) {
        Login l1 = new Login();

        // set username & password
        l1.setUsername("Logesh");
        l1.setPassword("Mysecurity123");

        // display username
        System.out.println("Username: " + l1.getUsername());

        // try checking password
        //try wrong password
        if (l1.checkPassword("wrongpass")) {
            System.out.println("Login Successfully!");
        } else {
            System.out.println("Invalid password!");
        }
//try correct password
        if (l1.checkPassword("Mysecurity123")) {
            System.out.println("Login Successfully!");
        } else {
            System.out.println("Invalid password!");
        }
    }
}