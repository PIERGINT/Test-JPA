package fr.diginamic.appliBank;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import fr.diginamic.appliBank.Compte;



@Entity
@Table(name="MYCLIENT")
public class MyClient {

	@Embedded
	private Adresse adresse; 
	
	@Id
	@Column(name="ID")
	private int id;
	
	@ManyToMany
	@JoinTable (name= "CLI_COM",
	joinColumns= @JoinColumn(name = "ID_CLI", referencedColumnName= "ID"),
	inverseJoinColumns= @JoinColumn(name = "ID_COM", referencedColumnName= "ID")
	)
	private Set<Compte> compte;
	
	@ManyToOne
	@JoinColumn(name="BAN_ID")
	private Banque banque;
	
	@Column(name = "NOM", length = 25, nullable = false, unique = false)
	private String nom;
	 
	@Column(name = "PRENOM", length = 25, nullable = false, unique = false)
	private String prenom;
	
	@Column(name = "DATE_NAISSANCE", length = 12, nullable = false, unique = false)
	private LocalDate dateNaissance;
	
	

	
	public MyClient(){}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
}
