package app;

import obj.Client;
import obj.Loan;

import java.util.Arrays;
import java.util.List;

public class LoanApp {

    private static final String VERSION = "0.1";

    private List<Client> clients;
    private List<Loan> loans;
    private int numClients = 0;
    private int numTotalLoans = 0;
    private int totalOutstandingBalance = 0;
    // TODO more such instance vars
    // profit YTD
    // current avg. income for next 4 weeks

    public LoanApp() {

    }

    private void init() {
        // TODO for each client entry in file, add to clients
        // TODO for each loan entry in file, add to loans
    }


    /**
     * Main application processing and logic
     */
    private void run(String[] args) {
        System.out.println(Arrays.toString(args));
        if(args[0].equals("list")) {
            if (args[1].equals("loans")) {
                Loan.printLoans(loans);
            }
        }
    }

    public static void main(String[] args) {
        System.out.printf("---NebznetFintech Manager %s by Fonzie---\n",VERSION);
        LoanApp app = new LoanApp();
        app.init();
        app.run(args);
    }
}