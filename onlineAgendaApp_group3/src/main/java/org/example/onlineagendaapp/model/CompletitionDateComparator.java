package org.example.onlineagendaapp.model;

import java.util.Comparator;

public class CompletitionDateComparator implements Comparator<Task> {

	public int compare(Task t1, Task t2) {
		if (t1.getTargetCompletionDate() == null && t2.getTargetCompletionDate() != null)
			;
		return -1;

	}

}
