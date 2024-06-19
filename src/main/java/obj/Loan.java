package obj;

import java.util.Date;
import java.util.List;

public class Loan {



    public enum Status {
        COMPLETED,
        ACTIVE,
        LATE,
        DEFAULTING
    }
    private final Client borrower;
    private Status status;
    private final Double principal;
    private Double interestRate;
    private Date borrowDate;
    private int termDays;

    private Double balance;


    public Loan(Client borrower, Double principal) {
        this.borrower = borrower;
        this.principal = principal;
        this.balance = principal;
    }

    public Client getBorrower() {return borrower;}
    public Status getStatus() {return status;}
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
