package obj;

import java.util.HashMap;
import java.util.Scanner;

public class Client {

    final private String firstName;
    private String lastName;
    private String phone;
    private String redditHandle;
    private String paypalHandle;
    private String email;

    private HashMap<String, String> userFields = new HashMap<>();

    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        this.redditHandle = requestInfo("Reddit Handle");
        this.phone = requestInfo("Phone Number");
        this.paypalHandle = requestInfo("Paypal Handle");
        this.email = requestInfo("Email");
    }

    @Override
    public String toString() {
        return String.format("%s, %s",lastName, firstName);
    }

    private String requestInfo(String inputType) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("User %s: ", inputType);
        String fieldInput = scanner.nextLine();
        while (fieldInput.isEmpty()) {
            System.out.println("Please provide valid input.");
            System.out.printf("User %s: ", inputType);
            fieldInput = scanner.nextLine();
        }
        System.out.printf("Field %s set to %s",inputType, fieldInput);
        return fieldInput;
    }
}
