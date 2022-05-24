package postfix.interpreter;

public class UnresolvedVariableError extends RuntimeException{
    private static final long serialVersionUID = 1L;

	public UnresolvedVariableError(String msg) {
		super(msg);
	}
}
