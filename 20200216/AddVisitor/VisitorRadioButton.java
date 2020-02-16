package AddVisitor;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class VisitorRadioButton  extends Component{
	JRadioButton radio;
	protected VisitorRadioButton(Entry ent, String str, int x, int y, int width, int height) {
		super(ent);
		// TODO 自動生成されたコンストラクター・スタブ
		radio = new JRadioButton(str);
		Bounds(x,y,width,height);
		panel.add(radio);
	}

	@Override
	public void accept(AddVisitor v) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void accept(SearchVisitor v) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void Bounds(int x, int y, int width, int height) {
		// TODO 自動生成されたメソッド・スタブ
		radio.setBounds(x,y,width,height);
		radio.setFont(new Font("",Font.PLAIN,24));
	}

	@Override
	public JPanel getPanel() {
		// TODO 自動生成されたメソッド・スタブ
		return super.panel;
	}

	@Override
	public ArrayList getList() {
		// TODO 自動生成されたメソッド・スタブ
		return super.list;
	}

}
