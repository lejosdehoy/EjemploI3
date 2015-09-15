import java.io.Serializable;
import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class DataListBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<Car> cars;

	@PostConstruct
	public void init() {
		cars = new ArrayList<>();
		cars.add(new Car("VW", "Gol"));
		cars.add(new Car("Renault", "Clio"));
		cars.add(new Car("Citroen", "AX"));
		cars.add(new Car("Citroen", "ZX"));
		cars.add(new Car("FIAT", "Uno"));

	}

	public ArrayList<Car> getCars() {
		return cars;
	}

	public void setCars(ArrayList<Car> cars) {
		this.cars = cars;
	}

}
