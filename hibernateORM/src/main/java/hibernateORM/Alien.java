package hibernateORM;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Table;

//POJO Class
@Entity(name="Alien_Table")
@Table(appliesTo="Alien_Table")
public class Alien {

	@Override
	public String toString() {
		return "Alien [alienId=" + alienId + ", aName=" + aName + ", color=" + color + "]";
	}

	@Id
	private int alienId;
	private String aName;
	private String color;

	public int getAlienId() {
		return alienId;
	}

	public void setAlienId(int alienId) {
		this.alienId = alienId;
	}

	public String getaName() {
		return aName;
	}

	public void setaName(String aName) {
		this.aName = aName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
