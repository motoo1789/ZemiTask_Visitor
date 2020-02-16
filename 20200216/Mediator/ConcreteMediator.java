package Mediator;

import AddVisitor.VisitorCheckBox;
import AddVisitor.VisitorComboCate;
import AddVisitor.VisitorComboDay;
import AddVisitor.VisitorComboMonth;
import AddVisitor.VisitorComboYear;
import AddVisitor.VisitorRadioButton;

public class ConcreteMediator implements Mediator{
	VisitorComboCate combocate;
	VisitorComboYear comboyear;
	VisitorComboMonth combomonth;
	VisitorComboDay comboday;
	VisitorCheckBox checkbox;
	VisitorRadioButton radio;

	public void Set(VisitorComboCate 	tmp) 	{combocate 	= tmp;};
	public void Set(VisitorComboYear 	tmp) 	{comboyear 	= tmp;};
	public void Set(VisitorComboMonth 	tmp) 	{combomonth = tmp;};
	public void Set(VisitorComboDay 	tmp) 	{comboday 	= tmp;};
	public void Set(VisitorCheckBox 	tmp) 	{checkbox 	= tmp;};
	public void Set(VisitorRadioButton tmp) 	{radio 		= tmp;};

	@Override
	public void createClleagues() {
		// TODO 自動生成されたメソッド・スタブ
		combocate.setMediator(this);
		comboyear.setMediator(this);
		combomonth.setMediator(this);
		comboday.setMediator(this);
		checkbox.setMediator(this);
		radio.setMediator(this);
	}

	@Override
	public void ColleagueChanged() {
		// TODO 自動生成されたメソッド・スタブ

	}
}
