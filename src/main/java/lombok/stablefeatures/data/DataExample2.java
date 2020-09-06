package lombok.stablefeatures.data;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.ToString;

public class DataExample2 {
	private final String name = "";
	@Setter(AccessLevel.PROTECTED) int rollNumber;
	private double score;

	@ToString(includeFieldNames=true)
	@Data(staticConstructor="of")
	public static class Exercise<T> {
		private final T value = null;
	}
}
