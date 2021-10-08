import java.util.List;

public class Rocket {

	
	State launchstate;
	State groundstate;
	State movestate;
	State stopstate;

	State state;
	String name;
	List<String> item;
	public Rocket() {

		 launchstate = new LaunchState(this);
		 groundstate = new GroundState(this);
		 movestate = new MoveState(this);
		 stopstate = new DonotMoveState(this);
		 
		
    }
	void addItems(List<String> item) {
		this.item = item;
	}
 
	public void setName(String name) {
		this.name = name;
	}
	
	void startrace() {
		System.out.println( name + ".......");
		for (String race : item) {
			System.out.println("   " + race);
		}
	}
	public void rocketstateOn() {
		state.rocketstateOn();
	}
	
	public void rocketstateOff() {
		state.rocketstateOff();
	}
	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	public State getLaunchstate() {
		return launchstate;
	}
	public State getGroundstate() {
		return groundstate;
	}
	public State getMovestate() {
		return movestate;
	}
	public State getStopstate() {
		return stopstate;
	}
}

