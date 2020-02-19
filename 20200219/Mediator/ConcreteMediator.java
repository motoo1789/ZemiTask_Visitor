package Mediator;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ConcreteMediator implements Mediator{
	//MultiValuedMap<String, Colleague> Muluticolleagues = new ArrayListValuedHashMap<String, Colleague>();
	//Map<String, List<Colleague>>colleagues = new HashMap<String, List<Colleague>>();

	//Map<String, Colleague>colleagues = new HashMap<String, Colleague>();
	Map<String, Colleague>colleaguesRadio = new HashMap<String, Colleague>();
	ArrayList<Map> colleaguesMapList = new ArrayList<Map>();

	@Override
	public void addColleague(String name, Colleague colleague) {
		// TODO 自動生成されたメソッド・スタブ
		colleague.setMediator(this);

		Map<String, Colleague>colleagues = new HashMap<String, Colleague>();
		colleagues.put(name, colleague);
		colleaguesMapList.add(colleagues);

	}
	@Override
	public void addColleagueRadio(String name, Colleague colleague) {
		// TODO 自動生成されたメソッド・スタブ
		colleague.setMediator(this);
		colleaguesRadio.put(name, colleague);
	}

	@Override
	public void createClleagues() {
		// TODO 自動生成されたメソッド・スタブ
		//たぶんいらない＞＞＞＞＞＞＞＞＞＞＞＞＞＞＞＞＞
	}

	@Override
	public void ColleagueChanged(Colleague colleague, boolean state) {
		// TODO 自動生成されたメソッド・スタブ

		Iterator<Map> it = colleaguesMapList.iterator();
		
		while(it.hasNext()) {
			Map<String, Colleague> MapTmp = (Map) it.next();

			if(MapTmp.containsKey(colleague.getName())) {

				if(colleague.getName().equals(((Colleague)(MapTmp.get(colleague.getName()))).getName())) {
					MapTmp.get(colleague.getName()).setColleagueEnabled(state);
					System.out.println("CooleagueChanged");
				}

			}
		}
		
	}


//	public void ColleagueChanged(Colleague colleague) {
//		// TODO 自動生成されたメソッド・スタブ
//
//		System.out.println(colleaguesMapList);
//
//		Iterator<Map> it = colleaguesMapList.iterator();
//
//		while(it.hasNext()) {
//			Map MapTmp = (Map) it.next();
//
//			System.out.println(MapTmp);
//			System.out.println("while");
//
//			if(colleague.getName().equals(MapTmp,Key(0))) {
//				colleagueTmp.setColleagueEnabled(false);
//				System.out.println("CooleagueChanged");
//			}
//		}
//
//	}



//	VisitorComboCate 	combocate;
//	VisitorComboYear 	comboyear;
//	VisitorComboMonth 	combomonth;
//	VisitorComboDay 	comboday;
//	VisitorCheckBox 	checkbox;
//	VisitorRadioButton radio;
//	ArrayList<VisitorRadioButton> radio = new ArrayList();

//	public void Set(VisitorComboCate 		tmp) 	{combocate 	= tmp;};
//	public void Set(VisitorComboYear 		tmp) 	{comboyear 	= tmp;};
//	public void Set(VisitorComboMonth 		tmp) 	{combomonth = tmp;};
//	public void Set(VisitorComboDay 		tmp) 	{comboday 	= tmp;};
//	public void Set(VisitorCheckBox 		tmp) 	{checkbox 	= tmp;};
//	public void Set(VisitorRadioButton 	tmp) 	{radio.add(tmp);};

//	@Override
//	public void createClleagues() {
//		// TODO 自動生成されたメソッド・スタブ
//		combocate.setMediator	(this);
//		comboyear.setMediator	(this);
//		combomonth.setMediator	(this);
//		comboday.setMediator	(this);
//		checkbox.setMediator	(this);
//		for(int i = 0; i < radio.size(); i++)
//			radio.get(i).setMediator(this);
//	}
//
//	@Override
//	public void ColleagueChanged() {
//		// TODO 自動生成されたメソッド・スタブ
//		if(radio.get(0).radio.isSelected())	{
//			combocate.setColleagueEnabled(false);
//		}
//		else {
//			combocate.setColleagueEnabled(true);
//		}
//
//		if(radio.get(1).radio.isSelected()) {
//			comboyear.setColleagueEnabled(false);
//			combomonth.setColleagueEnabled(false);
//			comboday.setColleagueEnabled(false);
//		}
//		else {
//			comboyear.setColleagueEnabled(true);
//			combomonth.setColleagueEnabled(true);
//			comboday.setColleagueEnabled(true);
//		}
//
//		if(radio.get(2).radio.isSelected()) {
//			checkbox.setColleagueEnabled(false);
//		}
//		else {
//			checkbox.setColleagueEnabled(true);
//		}
//	}




}
