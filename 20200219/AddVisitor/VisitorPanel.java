package AddVisitor;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JPanel;

import Mediator.ConcreteMediator;
import Mediator.Mediator;

public class VisitorPanel extends Entry{
	JPanel panel;

	public VisitorPanel(){
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(240,240,240));
	}

	@Override
	public void accept(AddVisitor v) {
		// TODO 自動生成されたメソッド・スタブ

	}
	@Override
	public void accept(SearchVisitor v) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("panelはvisitしない");
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

	@Override
	public Mediator getMediator() {
		// TODO 自動生成されたメソッド・スタブ
		return new ConcreteMediator();
	}
}
