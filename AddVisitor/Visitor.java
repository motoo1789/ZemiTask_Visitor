package AddVisitor;

public abstract class Visitor {
	public abstract void visit(VisitorTextField compo);
	public abstract void visit(VisitorCombo compo);
	public abstract void visit(VisitorComboCate compo);
	public abstract void visit(VisitorComboYear compo);
	public abstract void visit(VisitorCheckBox compo);
	public abstract void visit(VisitorPanel compo);
	public abstract void visit(VisitorButton compo);
}
