package fr.diginamic.appliBank;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name="COMPTE")
@Inheritance(strategy = InheritanceType.JOINED)
public class Compte {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@ManyToMany
	@JoinTable (name= "CLI_COM",
	joinColumns= @JoinColumn(name = "ID_COM", referencedColumnName= "ID"),
	inverseJoinColumns= @JoinColumn(name = "ID_CLI", referencedColumnName= "ID")
	)
	private Set<MyClient> myclient;
	
	@OneToMany(mappedBy="compte")
	private Set<Operation> operation;
	
	@Column(name = "NUMERO", length = 30, nullable = false, unique = true)
	private Integer numero;
	
	@Column(name = "SOLDE", length = 11, nullable = false, unique = false)
	private Integer solde;
	
	public Compte(){}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer getSolde() {
		return solde;
	}

	public void setSolde(Integer solde) {
		this.solde = solde;
	}
	
	
}
