package fr.diginamic.appliBank;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Id;

public class AssuranceVie extends Compte{

	@Id
	@Column(name="ID")
	private int id;
	
	
	@Column(name = "DATEFIN", length = 12, nullable = false, unique = true)
	private LocalDate datefin;
	
	@Column(name = "TAUX", length = 5, nullable = false, unique = true)
	private double taux;
	
	public AssuranceVie () {
		super();
		}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getDateFin() {
		return datefin;
	}

	public void setDateFin(LocalDate datefin) {
		this.datefin = datefin;
	}

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	};
		
}
