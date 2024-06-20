package table;

import ex.LoanAppException;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.util.List;

abstract class AbstractRecordFile {
    private File file;

    AbstractRecordFile(URI uri) {
        setUri(uri);
    }

    private void setUri(URI uri) {
        file = new File(uri.getPath());
    }

    public void writeRecord(TableRecord record) throws LoanAppException {
        boolean writeHeaders = false;

        if (!file.exists()) {
            writeHeaders = true;
        }

        try {
            CSVPrinter printer = new CSVPrinter(new FileWriter(file, true), CSVFormat.DEFAULT);

            if (writeHeaders) {
                printer.printRecord(getHeaders());
            }

            printer.printRecord(record.getValues());
            printer.close();

        } catch (IOException e) {
            throw new LoanAppException("Failed to write record to file",e);
        }
    }

    abstract List<String> getHeaders();
}
