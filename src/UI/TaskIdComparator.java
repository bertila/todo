package UI;

import java.util.Comparator;
import models.Task;

public class TaskIdComparator implements Comparator<Task>{

	@Override
	public int compare(Task o1, Task o2) {
		return o1.getId() - o2.getId();
	}
}
