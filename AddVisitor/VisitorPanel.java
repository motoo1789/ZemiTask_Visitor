package AddVisitor;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JPanel;

public class VisitorPanel extends Entry{
	JPanel panel;

	public VisitorPanel(){
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(240,240,240));
	}

	@Override
	public void accept(Visitor v) {
		// TODO 自動生成されたメソッド・スタブ
		v.visit(this);
	}


	@Override
	public JPanel getPanel() {
		// TODO 自動生成されたメソッド・スタブ
		return this.panel;
	}

	@Override
	public ArrayList getList() {
		// TODO 自動生成されたメソッド・スタブ
		return new ArrayList();
	}
}
