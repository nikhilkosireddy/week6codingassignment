
public class DonotMoveState implements State {

    Rocket rocket;
	
	
	public DonotMoveState(Rocket rocket) {
		this.rocket = rocket;
	}

	@Override
	public void rocketstateOn() {
		System.out.println("Rocket Do not Move");
	}

	@Override
	public void rocketstateOff() {
		System.out.println("Rocket Move");

	}
}