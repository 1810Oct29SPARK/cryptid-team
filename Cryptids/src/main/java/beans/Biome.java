package beans;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "CRYPTID_BIOME")
public class Biome {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "biomeSequence")
	@SequenceGenerator(name = "biomeSequence", sequenceName = "SQ_BIOME_PK")
	@Column(name = "BIOMEID")
	private int id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "FOLIAGE")
	private String foliage;

	// bidirectional mapping, lazily fetched
	@OneToMany(mappedBy = "biome", fetch = FetchType.LAZY)
	private List<Cryptid> cryptids = new ArrayList<>();

	public void addCryptid(Cryptid cryptid) {
		cryptids.add(cryptid);
		cryptid.setBiome(this);
	}

	public void removeCryptid(Cryptid cryptid) {
		cryptids.remove(cryptid);
	}

	public List<Cryptid> getCryptids() {
		return cryptids;
	}

	public void setCryptids(List<Cryptid> crytpids) {
		this.cryptids = crytpids;
	}

	

	@Override
	public String toString() {
		return "Biome [id=" + id + ", name=" + name + ", foliage=" + foliage + "]";
	}

	public Biome(int id, String name, String foliage) {
		super();
		this.id = id;
		this.name = name;
		this.foliage = foliage;
	}

	public Biome() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String Name) {
		this.name = Name;
	}

	public String getFoliage() {
		return foliage;
	}

	public void setFoliage(String foliage) {
		this.foliage = foliage;
	}

}
