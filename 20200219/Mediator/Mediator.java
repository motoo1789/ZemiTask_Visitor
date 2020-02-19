package Mediator;

public interface Mediator {
	public abstract void createClleagues();
	public abstract void ColleagueChanged(Colleague colleague, boolean state);
	public abstract void addColleague(String name, Colleague colleague);
	public abstract void addColleagueRadio(String name, Colleague colleague);

}
