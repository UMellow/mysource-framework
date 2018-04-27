package mysource.jcore.annotation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<String> useCases = new ArrayList<String>();
		Collections.addAll(useCases, "UC200-1", "UC200-2", "UC100-1", "UC100-2");
		
		UseCaseTracker.trackerUseCases(useCases, PasswordUtils.class);
	}
}
