package ar.edu.unlp.info.oo1.ej12;

import java.util.ArrayList;
import java.util.List;

public class JobScheduler {
    protected List<JobDescription> jobs;
    protected Strategy strategy;

    public JobScheduler (Strategy strategia) {
        this.jobs = new ArrayList<>();
        this.strategy = strategia;
    }
    
    public JobScheduler () {
    	this.jobs = new ArrayList<>();
    	this.strategy = new FIFO ();
    }

    public void schedule(JobDescription job) {
        this.jobs.add(job);
    }

    public void unschedule(JobDescription job) {
        if (job != null) {
            this.jobs.remove(job);
        }
    }

    public Strategy getStrategy() {
        return this.strategy; 
    }

    public List<JobDescription> getJobs(){
        return jobs;
    }

    public JobDescription next() {
    	if (!this.getJobs().isEmpty()) {
    		JobDescription nextJob = this.strategy.selectNext(jobs);
    		this.unschedule(nextJob);
    		return nextJob;
        }
    	return null;
    }

}
