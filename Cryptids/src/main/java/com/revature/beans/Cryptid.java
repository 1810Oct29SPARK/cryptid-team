package com.revature.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@NamedQueries({ @NamedQuery(name = "getAllCryptids", query = "from Cryptid"),
		@NamedQuery(name = "getCryptidsByBiome", query = "from Cryptid where biomeid= :typevar") })

@Entity
@Table(name = "CRYPTID_CRYPTIDS")
public class Cryptid {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cryptidSequence")
	@SequenceGenerator(allocationSize = 50, name = "cryptidSequence", sequenceName = "SQ_CRYPTID_PK")
	@Column(name = "CRYPTIDID")
	private int id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "DIET")
	private String diet;

	@Column(name = "AVG_1WEIGHT")
	private int avgWeight;

	@Column(name = "CLASS")
	private String category;

	// unidirectional relationship with cryptid, biome (child entity) manages
	@ManyToOne(fetch = FetchType.EAGER, cascade = { CascadeType.ALL, CascadeType.REMOVE })
	@JoinColumn(name = "BIOMEID", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
	private Biome biome;

	public Cryptid(String name, String diet, int avgWeight, String category, Biome biome) {
		super();
		this.name = name;
		this.diet = diet;
		this.avgWeight = avgWeight;
		this.category = category;
		this.biome = biome;
	}

	public Cryptid() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Cryptid [name=" + name + ", diet=" + diet + ", avgWeight=" + avgWeight + ", category="
				+ category + ", biome=" + biome + "]";
	}

	public String getDiet() {
		return diet;
	}

	public void setDiet(String diet) {
		this.diet = diet;
	}

	public int getAvgWeight() {
		return avgWeight;
	}

	public void setAvgWeight(int avgWeight) {
		this.avgWeight = avgWeight;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Biome getBiome() {
		return biome;
	}

	public void setBiome(Biome biome) {
		this.biome = biome;
	}

}
