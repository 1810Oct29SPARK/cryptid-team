package beans;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

public class Cryptid {

	public Cryptid(int id, String name, String diet, int avgWeight, String category, Biome biome) {
		super();
		this.id = id;
		this.name = name;
		this.diet = diet;
		this.avgWeight = avgWeight;
		this.category = category;
		this.biome = biome;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="cryptidSequence")
	@SequenceGenerator(name="cryptidSequence", sequenceName="SQ_CRYPTID_PK")
	@Column(name="CRYPTIDID")
	private int id;
	@Column(name="NAME")
	private String name;
	@Column(name="DIET")
	private String diet;
	@Column(name="AVG_1WEIGHT")
	private int avgWeight;
	@Column(name="CLASS")
	private String category;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="BIOMEID")
	private Biome biome;

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
		return "Cryptid [id=" + id + ", name=" + name + ", diet=" + diet + ", avgWeight=" + avgWeight + ", category="
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
