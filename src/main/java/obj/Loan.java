package obj;

import java.nio.file.Path;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class Loan extends AbstractLoanAppObject {

    public enum LoanStatus {
        COMPLETED,
        ACTIVE,
        LATE,
        DEFAULTING
    }
    public enum InterestType {
        FIXED_SUM,
        RATE
    }
    private Client borrower;
    private  UUID borrowerId;
    private LoanStatus status;
    private  Double principal;
    private  InterestType interestType;
    private Double interestRate;
    private Date borrowDate;
    private int termDays;

    private Double balance;


    public Loan(Client borrower, Double principal) {
        this.borrower = borrower;
        this.principal = principal;
        this.balance = principal;
        this.borrowerId = borrower.getUuid();
        this.termDays = Integer.valueOf(requestInfo("Length of loan term"));
    }

    @Override
    String requestInfo(String reqData) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(reqData+": ");
        String response = scanner.nextLine();
        return response.isEmpty() ? "-" : response;
    }

    public Client getBorrower() {return borrower;}
    public LoanStatus getStatus() {return status;}
    public Double getPrincipal() {
        return principal;
    }
    public Double getInterestRate() {
        return interestRate;
    }
    public Date getBorrowDate() {
        return borrowDate;
    }
    public int getTermDays() {
        return termDays;
    }
    public Double getBalance() {
        return balance;
    }

    public static void writeToFile(Path path) {

    }

    public static void printLoans(List<Loan> loans){
        int counter = 1;
        for(Loan loan : loans) {
            System.out.printf("%d %s [%s] $%.2f to %s",
                    counter,
                    loan.getBorrowDate().toString(),
                    loan.getStatus(),
                    loan.getPrincipal(),
                    loan.getBorrower().toString());
        }
    }
}
