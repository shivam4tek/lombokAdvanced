package lombok.stablefeatures.notnull;

import lombok.Data;
import lombok.NonNull;

@Data
public class NotNullWithLombok extends Parent{
	String name;

	public NotNullWithLombok(@NonNull SamplePojo var) {
		super(123);
		this.name = var.getName(); 
	}

}