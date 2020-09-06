package lombok.experimentalfeatures.fieldDefaults;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.experimental.NonFinal;
import lombok.experimental.PackagePrivate;

@FieldDefaults(makeFinal=true, level=AccessLevel.PRIVATE)
public class FieldDefaultsWithLombok {
  public final String name;
  int id = 0;
  @NonFinal int rollNumber;
  @PackagePrivate int score;
  
  FieldDefaultsWithLombok() {
	name = "";
	score = 0;
  }
}
