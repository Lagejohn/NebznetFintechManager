package table;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class TableRecord {
    private Map<String, String> data;

    public TableRecord(List<String> headers) {
        data = new LinkedHashMap<>();

        for (String header : headers) {
            data.put(header, "-");
        }
    }

    public Collection<String> getValues() {
        return data.values();
    }

    public String getValue(String key) {
        return data.get(key);
    }

    public void setValues(Map<String, String> entries) {
        for (Map.Entry<String, String> entry : entries.entrySet()) {
            setValue(entry.getKey(), entry.getValue());
        }
    }

    public void setValueOrEmpty(String key, String value) {
        if (value == null || value.isEmpty() || value.equals("NaN") || value.equals("-2147483648")) {
            value = "-";
        }
        data.put(key, value);
    }

    public void setValue(String key, Supplier<String> supplier) {
        if (this.data.containsKey(key)) {
            setValueOrEmpty(key, supplier.get());
        }
    }

    public void setValue(String key, String value) {
        if (this.data.containsKey(key)) {
            setValueOrEmpty(key, value);
        }
    }
}
