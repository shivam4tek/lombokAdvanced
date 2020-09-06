package lombok.stablefeatures.notnull;

import lombok.Data;

@Data
public class Parent {
	public Parent(int id) {
		this.id = id;
	}
	@SuppressWarnings("unused")
	private int id;
}
