package AddVisitor;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JPanel;

import database.Dataadd;

public class VisitorButton extends Component implements ActionListener{
	JButton addbutton;
	public VisitorButton(Entry ent ,String str, int x, int y, int width, int height) {
		super(ent);
		// TODO 自動生成されたコンストラクター・スタブ
		addbutton = new JButton(str);
		Bounds(x,y,width,height);
		super.panel.add(addbutton);
	}

	@Override
	public void accept(Visitor v) {
		// TODO 自動生成されたメソッド・スタブ
		v.visit(this);
	}

	@Override
	public void Bounds(int x, int y, int width, int height) {
		// TODO 自動生成されたメソッド・スタブ
		addbutton.setBounds(x, y, width, height);
		addbutton.setFont(new Font("",Font.PLAIN,24));
		addbutton.addActionListener(this);
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

	public Iterator iterator() {
		return super.list.iterator();
	}

	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("ゴーストヒバナ");
		this.accept(new ListVisitor());
		try {
			Dataadd dataadd = new Dataadd();
			dataadd.add();
		} catch (Exception e1) {
			// TODO 自動生成された catch ブロック
			e1.printStackTrace();
		}
	}

}
