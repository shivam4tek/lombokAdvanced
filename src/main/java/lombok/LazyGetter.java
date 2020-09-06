package lombok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.UnsupportedCharsetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LazyGetter {
	
	public final String DELIMETER = ",";
	
	@Getter(lazy = true)
    private final Map<String, Long> transactions = getTransactions();
 
    private Map<String, Long> getTransactions() {
 
        final Map<String, Long> cache = new HashMap<>();
        List<String> txnRows = readFromFile();
 
        txnRows.forEach(s -> {
            String[] txnIdValueTuple = s.split(DELIMETER);
            cache.put(txnIdValueTuple[0], Long.parseLong(txnIdValueTuple[1]));
        });
 
        return cache;
    }

	private List<String> readFromFile() {
		try (InputStream is = this.getClass().getResourceAsStream("sure_in_my_jar.txt")) {
	        BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
	        return br.lines().collect(Collectors.toList());
	    } catch (IOException | UnsupportedCharsetException ex) {
	        throw new RuntimeException(ex);
	    }
	}
}
