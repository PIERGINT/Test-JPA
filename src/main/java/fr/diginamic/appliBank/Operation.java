package fr.diginamic.appliBank;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="OPERATION")
@Inheritance(strategy = InheritanceType.JOINED)
public class Operation {

	
	@Id
	@GeneratedValue
	private int id;
	
	@ManyToOne
	@JoinColumn(name="COM_ID")
	private Compte compte;
	
	@Column(name = "DATE", length = 12, nullable = false, unique = false)
	private LocalDateTime date;
	
	@Column(name = "MONTANT", length = 11, nullable = false, unique = false)
	private double montant;
	 
	@Column(name = "MOTIF", length = 50, nullable = true, unique = false)
	private String motif;
	
	public Operation (){}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public String getMotif() {
		return motif;
	}

	public void setMotif(String motif) {
		this.motif = motif;
	}
	
}
