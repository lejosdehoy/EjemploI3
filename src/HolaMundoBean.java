import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="holaMundoBean")
@SessionScoped
public class HolaMundoBean {
	private String holaMundo = "Hola Mundo!";

	public String getHolaMundo() {
		return holaMundo;
	}

	public void setHolaMundo(String holaMundo) {
		this.holaMundo = holaMundo;
	}
	
	
	

}
