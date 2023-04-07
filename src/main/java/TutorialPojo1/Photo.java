package TutorialPojo1;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class Photo {

	private String filename;

	private int filesize;

	private String filetype;

	private String base64;

	
	
	
}
