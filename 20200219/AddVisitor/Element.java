package AddVisitor;

public interface Element {
	public abstract void accept(AddVisitor v);
	public abstract void accept(SearchVisitor v);
}
