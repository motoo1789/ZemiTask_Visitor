package AddVisitor;

import java.util.Iterator;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import database.DataSearch;

public class SearchListVisitor extends SearchVisitor{
	private String where = " WHERE ";
	private String date = "";

	@Override
	public void visit(VisitorTextField compo) {
		// TODO 自動生成されたメソッド・スタブ
		JTextField text = compo.addtext;
		//where += " and (text = '" + (String) text.getText() + "')";

		System.out.println("JTextField" + (String) text.getText());

	}
	@Override
	public void visit(VisitorComboYear compo) {
		// TODO 自動生成されたメソッド・スタブ
		JComboBox<String> combo = compo.addcombo;
		date += "'" + combo.getSelectedItem();

		System.out.println("Yearを対処" +String.valueOf(combo.getSelectedItem()));

	}
	@Override
	public void visit(VisitorComboMonth compo) {
		// TODO 自動生成されたメソッド・スタブ
		JComboBox<String> combo = compo.addcombo;
		date += "-" + combo.getSelectedItem();

		System.out.println("monthコンボボックスを対処" + String.valueOf(combo.getSelectedItem()));

	}
	@Override
	public void visit(VisitorComboDay compo) {
		// TODO 自動生成されたメソッド・スタブ
		JComboBox<String> combo = compo.addcombo;
		where +=  "(combo_date <= " + date + "-" +combo.getSelectedItem() + "')";
		System.out.println("dayコンボボックスを対処" + String.valueOf(combo.getSelectedItem()));
	}

	@Override
	public void visit(VisitorComboCate compo) {
		// TODO 自動生成されたメソッド・スタブ
		JComboBox<String> combo = compo.addcombo;
		if((String) combo.getSelectedItem() != "なし") {
			where += " and (combo_cate = '" + (String) combo.getSelectedItem() + "')";
		}

		System.out.println("カテゴリーを対処" + (String) combo.getSelectedItem());

	}

	@Override
	public void visit(VisitorCheckBox compo) {
		// TODO 自動生成されたメソッド・スタブ
		JCheckBox check = compo.addcheck;
		where += " and (important = '" + check.isSelected() + "');";

		System.out.println("チェックボックスを対処"+check.isSelected());
	}

	public void visit(VisitorSearchButton compo) {
		Iterator it = compo.iterator();
		System.out.println(it);
		while(it.hasNext()) {
			Entry entry = (Entry)it.next();
			entry.accept(this);
		}

		DataSearch search  = new DataSearch();
		try {
			search.Search(where);
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		System.out.println(where);
	}



}
