package beans;

public class Cryptid {
	public Cryptid(int id, String name, String diet, int avgWeight, String category) {
		super();
		this.id = id;
		this.name = name;
		this.diet = diet;
		this.avgWeight = avgWeight;
		this.category = category;
	}

	private int id;
	private String name;
	private String diet;
	private int avgWeight;
	private String category;

	public Cryptid() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Cryptid [name=" + name + ", diet=" + diet + ", avgWeight=" + avgWeight + ", category=" + category
				+ ", id=" + id + "]";
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

}
