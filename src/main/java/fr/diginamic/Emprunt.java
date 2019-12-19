package fr.diginamic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "EMPRUNT")

public class Emprunt {

	
	@ManyToOne
	@JoinColumn(name="ID_CLIENT")
	private Client client; 

	@ManyToMany
	@JoinTable(name = "COMPO",
	joinColumns = @JoinColumn(name = "ID_EMP", referencedColumnName = "ID"),
	inverseJoinColumns = @JoinColumn(name = "ID_LIV", referencedColumnName = "ID"))

	private Set<Livre> livre;
	
	@Id
	@Column(name="ID")
	private int id;

	

	@Column(name = "DATE_DEBUT", length = 20, nullable = false, unique = true)
	private LocalDateTime datedebut;

	@Column(name = "DATE_FIN", length = 20, nullable = false, unique = true)
	private LocalDateTime datefin;

	@Column(name = "DELAI", length = 2, nullable = false, unique = true)
	private int delai;
	
	public Emprunt() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDateTime getDatedebut() {
		return datedebut;
	}

	public void setDatedebut(LocalDateTime datedebut) {
		this.datedebut = datedebut;
	}

	public LocalDateTime getDatefin() {
		return datefin;
	}

	public void setDatefin(LocalDateTime datefin) {
		this.datefin = datefin;
	}

	public int getDelai() {
		return delai;
	}

	public void setDelai(int delai) {
		this.delai = delai;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Set<Livre> getLivre() {
		return livre;
	}

	public void setLivre(Set<Livre> livre) {
		this.livre = livre;
	}

	@Override
	public String toString() {
		return "Emprunt [id=" + id + ", livre=" + livre + ", datedebut=" + datedebut
				+ ", datefin=" + datefin + ", delai=" + delai + " jours]";
	}

}
