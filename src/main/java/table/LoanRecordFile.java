package table;

import java.net.URI;
import java.util.Arrays;
import java.util.List;

public class LoanRecordFile extends AbstractRecordFile {
    public static final String BORROWER_ID = "Borrower UUID";
    public static final String CLIENT_NAME = "Client Name";
    public static final String STATUS = "Status";
    public static final String PRINCIPAL = "Loan Principal";
    public static final String INTEREST_TYPE = "Interest Type";
    public static final String INTEREST_RATE = "Interest Rate";
    public static final String BORROW_DATE = "Original Borrow Date";
    public static final String TERM_DAYS = "Loan Term (days)";
    public static final String BALANCE = "Remaining Balance";


    public LoanRecordFile(URI uri){
        super(uri);
    }

    @Override
    List<String> getHeaders() {
        return Arrays.asList(
                BORROWER_ID,
                CLIENT_NAME,
                STATUS,
                PRINCIPAL,
                INTEREST_TYPE,
                INTEREST_RATE,
                BORROW_DATE,
                TERM_DAYS,
                BALANCE
        );
    }
}
