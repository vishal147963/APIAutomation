package TutorialPojo2;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder(toBuilder = true)
public class Data {

	private String activity_id;

	private String name;

	private String projectId;

	private boolean preset;

	private int is_deleted;

	private Type type;

}

