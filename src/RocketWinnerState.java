import java.util.ArrayList;
import java.util.List;

public abstract class RocketWinnerState {

	String name;
	List<String> state = new ArrayList<String>();

	public abstract RocketWinnerState award();
	public abstract RocketWinnerState notaward();


	public Rocket build() {
		Rocket r = new Rocket();
		r.setName(this.name);
		r.addItems(state);
		return r;
	}
	
}
