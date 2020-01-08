package fr.diginamic.appliBank;

import javax.persistence.Column;
import javax.persistence.Id;

public class LivretA extends Compte{
	
	@Id
	@Column(name="ID")
	private int id;
	
	@Column(name = "TAUX", length = 5, nullable = false, unique = true)
	private double taux;
	
	public LivretA () {
		super();
		}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}
}
