package table;

import java.net.URI;
import java.util.List;

public class ClientRecordFile extends AbstractRecordFile {
    public static final String CLIENT_ID = "Client ID";
    public static final String LAST_NAME = "Last Name";
    public static final String FIRST_NAME = "First Name";
    public static final String REDDIT_HANDLE = "Reddit Handle";
    public static final String PAYPAL_HANDLE = "Paypal Handle";
    public static final String EMAIL = "Email Address";

    public ClientRecordFile(URI uri) {
        super(uri);
    }
    @Override
    List<String> getHeaders() {
        return List.of();

    }
}
