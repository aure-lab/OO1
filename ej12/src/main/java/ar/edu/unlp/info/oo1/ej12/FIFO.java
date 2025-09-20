package ar.edu.unlp.info.oo1.ej12;

import java.util.List;

public class FIFO implements Strategy {
	
	public JobDescription selectNext(List <JobDescription> jobs) {
		return jobs.get(0);
	}
}
