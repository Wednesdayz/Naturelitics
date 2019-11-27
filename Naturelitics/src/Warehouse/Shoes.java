package Warehouse;

public class Shoes extends Items implements ModifyItems {
	private int EUSize;
	private int weight;
	private String gender;
	
	public Shoes(String PName, String Category, String Description, int Price, String Location, int Stock, int ProductId, String StoredAt,int size, int weight, String gender) {
		super(PName, Category, Description, Price, Location, Stock, ProductId, StoredAt);
		this.EUSize = size;
		this.weight = weight;
		this.gender = gender;
	}
	
	public int getStock() {
		return Stock;
	}

	public void setStock(int stock) {
		Stock = stock;
	}

	public int getProductId() {
		return ProductId;
	}

	public void setProductId(int productId) {
		ProductId = productId;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public String getStoredAt() {
		return StoredAt;
	}

	public void setStoredAt(String storedAt) {
		StoredAt = storedAt;
	}

	public int getEUSize() {
		return EUSize;
	}

	public void setEUSize(int eUSize) {
		EUSize = eUSize;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
