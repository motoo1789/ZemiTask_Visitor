
package AddVisitor;

import java.util.Iterator;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import CoR.SingletonData;

public class ListVisitor extends Visitor{

	@Override
	public void visit(VisitorTextField compo) {
		// TODO 自動生成されたメソッド・スタブ
		JTextField text = compo.addtext;
		System.out.println("JTextField" + (String) text.getText());
		SingletonData.setText((String) text.getText());
	}

	@Override
	public void visit(VisitorCombo compo) {
		// TODO 自動生成されたメソッド・スタブ
		JComboBox<String> combo = compo.addcombo;
		System.out.println("コンボボックスを対処" + (String) combo.getSelectedItem());
		SingletonData.setStr((String) combo.getItemAt(combo.getSelectedIndex()));
	}

	@Override
	public void visit(VisitorComboCate compo) {
		// TODO 自動生成されたメソッド・スタブ
		JComboBox<String> combo = compo.addcombo;
		System.out.println("カテゴリーを対処" + (String) combo.getSelectedItem());
		SingletonData.setStr((String) combo.getItemAt(combo.getSelectedIndex()));
	}

	@Override
	public void visit(VisitorComboYear compo) {
		// TODO 自動生成されたメソッド・スタブ
		JComboBox<String> combo = compo.addcombo;
		System.out.println("Yearを対処" + (String) combo.getSelectedItem());
		SingletonData.setStr((String) combo.getItemAt(combo.getSelectedIndex()));
	}

	@Override
	public void visit(VisitorCheckBox compo) {
		// TODO 自動生成されたメソッド・スタブ
		JCheckBox check = compo.addcheck;
		SingletonData.setCheckBox(check.isSelected());
		System.out.println("チェックボックスを対処"+check.isSelected());
	}

	@Override
	public void visit(VisitorPanel compo) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("パネルは何もしない");
	}

	public void visit(VisitorButton compo) {
		Iterator it = compo.iterator();
		System.out.println(it);
		SingletonData.Clear();
		int tmp = 1;
		while(it.hasNext()) {
			System.out.println(tmp++);
			Entry entry = (Entry)it.next();
			entry.accept(this);
		}
	}



}


