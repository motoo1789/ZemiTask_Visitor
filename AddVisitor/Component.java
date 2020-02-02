package AddVisitor;

import java.util.ArrayList;

import javax.swing.JPanel;

public abstract class Component extends Entry{
	protected Entry entry;
	protected JPanel panel;
	protected ArrayList list = new ArrayList();
	public abstract void Bounds(int x, int y, int width, int height);


	protected Component(Entry ent) {
		this.entry = ent;
		panel = ent.getPanel();
		list = ent.getList();
	}

}
