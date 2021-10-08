public class HobbyRocket extends RocketWinnerState {

	public HobbyRocket()
	{
		this.name = "Hobby Rocket";

	}
	@Override
	public RocketWinnerState award() {
		this.state.add(name + " wins");
		return this;
	}                                      
	@Override
	public RocketWinnerState notaward() {
		this.state.add("Professional rocket loss");
		return this;
	}

	
}
