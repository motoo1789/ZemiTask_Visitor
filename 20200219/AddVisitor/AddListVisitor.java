
package AddVisitor;

import java.util.Iterator;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import CoR.SingletonAddData;

public class AddListVisitor extends AddVisitor{

	@Override
	public void visit(VisitorTextField compo) {
		// TODO 自動生成されたメソッド・スタブ
		JTextField text = compo.addtext;
		System.out.println("JTextField" + (String) text.getText());
		SingletonAddData.setText((String) text.getText());
	}

	@Override
	public void visit(VisitorComboDay compo) {
		// TODO 自動生成されたメソッド・スタブ
		JComboBox<String> combo = compo.addcombo;
		System.out.println("コンボボックスDayを対処" + (String) combo.getItemAt(combo.getSelectedIndex()));
		SingletonAddData.setStr((String) combo.getItemAt(combo.getSelectedIndex()));
		//SingletonAddData.setNum(Integer.parseInt(combo.getItemAt(combo.getSelectedIndex())));
	}

	@Override
	public void visit(VisitorComboMonth compo) {
		// TODO 自動生成されたメソッド・スタブ
		JComboBox<String> combo = compo.addcombo;
		System.out.println("コンボボックスMonthを対処" + (String) combo.getItemAt(combo.getSelectedIndex()));
		SingletonAddData.setStr((String) combo.getItemAt(combo.getSelectedIndex()));
		//SingletonAddData.setNum(Integer.parseInt(combo.getItemAt(combo.getSelectedIndex())));
	}

	@Override
	public void visit(VisitorComboYear compo) {
		// TODO 自動生成されたメソッド・スタブ
		JComboBox<String> combo = compo.addcombo;
		System.out.println("Yearを対処" + (String) combo.getItemAt(combo.getSelectedIndex()));
		SingletonAddData.setStr((String) combo.getItemAt(combo.getSelectedIndex()));
		//SingletonAddData.setNum(Integer.parseInt(combo.getItemAt(combo.getSelectedIndex())));
	}

	@Override
	public void visit(VisitorComboCate compo) {
		// TODO 自動生成されたメソッド・スタブ
		JComboBox<String> combo = compo.addcombo;
		System.out.println("カテゴリーを対処" + (String) combo.getSelectedItem());
		SingletonAddData.setStr((String) combo.getItemAt(combo.getSelectedIndex()));
	}

	@Override
	public void visit(VisitorCheckBox compo) {
		// TODO 自動生成されたメソッド・スタブ
		JCheckBox check = compo.addcheck;
		SingletonAddData.setCheckBox(check.isSelected());
		System.out.println("チェックボックスを対処"+check.isSelected());
	}


	public void visit(VisitorAddButton compo) {
		Iterator it = compo.iterator();
		System.out.println(it);
		SingletonAddData.Clear();

		while(it.hasNext()) {
			Entry entry = (Entry)it.next();
			entry.accept(this);
		}
	}





}


