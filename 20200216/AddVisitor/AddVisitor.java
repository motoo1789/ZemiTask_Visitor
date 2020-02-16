package AddVisitor;

public abstract class AddVisitor {
	public abstract void visit(VisitorTextField compo);
	public abstract void visit(VisitorComboDay compo);
	public abstract void visit(VisitorComboMonth compo);
	public abstract void visit(VisitorComboCate compo);
	public abstract void visit(VisitorComboYear compo);
	public abstract void visit(VisitorCheckBox compo);
	public abstract void visit(VisitorPanel compo);
	public abstract void visit(VisitorAddButton compo);
}
