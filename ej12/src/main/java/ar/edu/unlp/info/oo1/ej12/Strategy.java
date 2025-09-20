package ar.edu.unlp.info.oo1.ej12;
import java.util.*;

public interface Strategy {
	
	public abstract JobDescription selectNext(List <JobDescription> jobs);
}
