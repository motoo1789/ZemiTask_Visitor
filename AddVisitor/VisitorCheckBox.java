package AddVisitor;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class VisitorCheckBox extends Component{
	JCheckBox addcheck;
	public VisitorCheckBox(Entry ent,String str,int x, int y, int width, int height) {
		super(ent);
		// TODO 自動生成されたコンストラクター・スタブ
		addcheck = new JCheckBox(str);
		Bounds(x,y,width,height);
		super.panel.add(addcheck);
		add(this);
	}

	@Override
	public void accept(Visitor v) {
		// TODO 自動生成されたメソッド・スタブ
		v.visit(this);
	}

	public Entry add(Entry entry) {
		super.list.add(entry);
		return this;
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

	@Override
	public void Bounds(int x, int y, int width, int height) {
		// TODO 自動生成されたメソッド・スタブ
		addcheck.setBounds(x,y,width,height);
		addcheck.setFont(new Font("",Font.PLAIN,24));
		addcheck.setSelected(true);
	}

}
