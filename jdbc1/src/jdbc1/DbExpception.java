package jdbc1;

public class DbExpception  extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public DbExpception(String msg) {
		super(msg);
	}
		
}