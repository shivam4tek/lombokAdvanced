package lombok.experimentalfeatures.fieldDefaults;

public class FieldDefaultsWithoutLombok {
	public final String name;
	int id;
	private int rollNumber;
	final int score;

	FieldDefaultsWithoutLombok() {
		name = "";
		score = 0;
	}
}
