package prob5;

public class MyStackException extends Exception {
	private static final long serialVersionUID = 1L;

	public MyStackException() {
		super( "MyStackException Occurs" );
	}
	
	public MyStackException( String message ){
		super( message );
	}
}
