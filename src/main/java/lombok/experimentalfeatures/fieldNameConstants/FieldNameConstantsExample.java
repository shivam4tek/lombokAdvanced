package lombok.experimentalfeatures.fieldNameConstants;

import lombok.experimental.FieldNameConstants;

@FieldNameConstants
public class FieldNameConstantsExample {
  private final String fieldOne = "Hello";
  @FieldNameConstants.Exclude private final int fieldTwo = 0;
}
