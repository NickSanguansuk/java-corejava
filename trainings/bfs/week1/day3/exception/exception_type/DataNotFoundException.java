package trainings.bfs.week1.day3.exception.exception_type;

public class DataNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public DataNotFoundException() {
		super("data not found!");
	}
	
}
