package lombok.experimentalfeatures.utility;

import lombok.experimental.UtilityClass;

@UtilityClass
public class UtilityExample {
	private static final Boolean SKIP_MEC_RULES_FLAG = null;
	
	public int handleErrors() {
		if (SKIP_MEC_RULES_FLAG.booleanValue() == true) {
			return 0;
		}
		return 1;
	}
}	
