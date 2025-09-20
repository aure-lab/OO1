package ar.edu.unlp.info.oo1.ej12;

import java.util.List;

public class LIFO implements Strategy{
	
	public JobDescription selectNext(List <JobDescription> jobs) {
		return jobs.get(jobs.size()-1);
	}

}
