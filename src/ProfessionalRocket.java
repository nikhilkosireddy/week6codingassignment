
public class ProfessionalRocket  extends RocketWinnerState {

	public ProfessionalRocket()
	{
		this.name = "Professional Rocket";

	}
	@Override
	public RocketWinnerState award() {
		this.state.add(name + " wins");
		return this;
	}

	@Override
	public RocketWinnerState notaward() {
		this.state.add("Hobby rocket loss");
		return this;
	}

	
}
