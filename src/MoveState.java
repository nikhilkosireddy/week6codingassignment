
public class MoveState implements State {

    Rocket rocket;
	
	
	public MoveState(Rocket rocket) {
		this.rocket = rocket;
	}

	public void rocketstateOn() {
		System.out.println("Rocket Move State On");
	}

	public void rocketstateOff() {
		System.out.println("Rocket Move State Off");

	}

}