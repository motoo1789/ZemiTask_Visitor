package AddVisitor;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class VisitorComboYear extends Component{
	JComboBox<String> addcombo;
	private final int DATANUM = 50;
	private final int YEAR = 2020;

	public VisitorComboYear(Entry ent,int x, int y, int width, int height) {
		super(ent);
		// TODO 自動生成されたコンストラクター・スタブ
		String[] data = new String[DATANUM];
		for(int i = 0; i < data.length; i++) {
			Integer oi = new Integer(i + YEAR);
			data[i] = oi.toString();
		}

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
		addcombo.setSelectedIndex(2);
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
}
