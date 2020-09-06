package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.UnsupportedCharsetException;
import java.util.List;
import java.util.stream.Collectors;

public class Utility {

	public List<String> readFromFile() {
		try (InputStream is = this.getClass().getResourceAsStream("sure_in_my_jar.txt")) {
	        BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
	        return br.lines().collect(Collectors.toList());
	    } catch (IOException | UnsupportedCharsetException ex) {
	        throw new RuntimeException(ex);
	    }
	}
}
