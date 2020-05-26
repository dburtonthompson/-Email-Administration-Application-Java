import java.util.Scanner;

public class Email {
    private String firstName, lastName, password, department, alternateEmail, email, companySuffix = "aeycompany.com";
    private int mailboxCapacity = 500, defaultPasswordLenght = 10;

    // Constructor to receive the first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        // System.out.println("Email created: " + this.firstName + " " + this.lastName);

        // Call a method asking for the department and return the department
        this.department = setDepartment();
        // System.out.println("Department: " + this.department);

        // Call a method that returns a random password
        this.password = randomPassward(defaultPasswordLenght);
        System.out.println("Your password is: " + this.password);

        // Combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;

    }

    // Ask for the department
    private String setDepartment() {
        System.out.print(
                "Department Codes\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None\nEnter Department Code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {
            return "sales";
        } else if (depChoice == 2) {
            return "dev";
        } else if (depChoice == 3) {
            return "acct";
        } else {
            return "";
        }
    }

    // Call a method that returns a ramdom password
    private String randomPassward(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    // Set the mailbox capacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    // set alt email
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    // change password
    public void changePassowrd(String password) {
        this.password = password;
    }

    // getters
    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }

    public String showInfo() {
        return "DISPLAY NAME: " + firstName + " " + lastName + "\nCOMPANY EMAIL: " + email + "\nMAILBOX CAPACITY: "
                + mailboxCapacity + "mb";
    }
}