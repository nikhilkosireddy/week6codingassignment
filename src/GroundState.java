
public class GroundState implements State {

	Rocket rocket;
	
	
	public GroundState(Rocket rocket) {
		this.rocket = rocket;
	}

	@Override
	public void rocketstateOn() {
		System.out.println("Rocket Ground State On");
	}

	@Override
	public void rocketstateOff() {
		System.out.println("Rocket Ground State Off");

	}

}
