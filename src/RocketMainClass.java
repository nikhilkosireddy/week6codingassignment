
public class RocketMainClass {
	public static void main(String[] args) {

		RocketWinnerState hobby = new HobbyRocket();
		Rocket r = hobby.award().notaward().build();
		r.setState(new MoveState(r));
		r.rocketstateOn();
		r.rocketstateOff();
		
		RocketWinnerState hobby1 = new HobbyRocket();
		Rocket r1 = hobby1.award().notaward().build();
		r1.setState(new DonotMoveState(r1));
		r1.rocketstateOn();
		r1.rocketstateOff();
		r1.startrace();
		
		RocketWinnerState professional = new ProfessionalRocket();
		Rocket rp = professional.award().notaward().build();
		rp.setState(new GroundState(rp));
		rp.rocketstateOn();
		rp.rocketstateOff();
		
		RocketWinnerState professional1 = new ProfessionalRocket();
		Rocket rp1 = professional1.award().notaward().build();
		rp1.setState(new LaunchState(rp1));
		rp1.rocketstateOn();
		rp1.rocketstateOff();
		rp1.startrace();
		
		

	}
}
