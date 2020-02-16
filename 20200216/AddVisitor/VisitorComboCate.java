package AddVisitor;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JPanel;

import Mediator.Colleague;
import Mediator.Mediator;

public class VisitorComboCate extends Component implements Colleague {
	private  Mediator mediator;
	JComboBox<String> addcombo;
	public VisitorComboCate(Entry ent,int x, int y, int width, int height) {
		super(ent);
		// TODO 自動生成されたコンストラクター・スタブ
		// TODO 自動生成されたコンストラクター・スタブ
		String[] data = {"なし","ゼミ","授業","私用"};

		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>(data);
		addcombo = new JComboBox<String>(model);
		Bounds(x,y,width,height);
		panel.add(addcombo);
		add(this);
	}

	@Override
	public void accept(AddVisitor v) {
		// TODO 自動生成されたメソッド・スタブ
		v.visit(this);
	}
	@Override
	public void accept(SearchVisitor v) {
		// TODO 自動生成されたメソッド・スタブ
		v.visit(this);
	}

	public Entry add(Entry entry) {
		list.add(entry);
		return this;
	}

	@Override
	public void Bounds(int x, int y, int width, int height) {
		// TODO 自動生成されたメソッド・スタブ
		addcombo.setBounds(x,y,width,height);
		addcombo.setFont(new Font("",Font.PLAIN,24));
	}

	@Override
	public JPanel getPanel() {
		// TODO 自動生成されたメソッド・スタブ
		return super.panel;
	}
	public ArrayList getList() {
		// TODO 自動生成されたメソッド・スタブ
		return super.list;
	}

	//Mediator
	@Override
	public void setMediator(Mediator mediator) {
		// TODO 自動生成されたメソッド・スタブ
		this.mediator = mediator;
	}

	@Override
	public void setColleagueEnabled(boolean enabled) {
		// TODO 自動生成されたメソッド・スタブ
		setEnabled(enabled);
	}
}
