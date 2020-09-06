package lombok.stablefeatures.notnull;

import lombok.Data;

@Data
public class NotNullWithoutLombok extends Parent{
	String name;

	public NotNullWithoutLombok(SamplePojo var) {
		super(123);
		if (var == null) {
			throw new NullPointerException("person is null");
		}
		this.name = var.getName(); 
	}

}
