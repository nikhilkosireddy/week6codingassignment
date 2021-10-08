
public class LaunchState implements State {

    Rocket rocket;
	
	
	public LaunchState(Rocket rocket) {
		this.rocket = rocket;
	}

	@Override
	public void rocketstateOn() {
		System.out.println("Rocket Launch State On");
	}

	@Override
	public void rocketstateOff() {
		System.out.println("Rocket Launch State Off");

	}

}
