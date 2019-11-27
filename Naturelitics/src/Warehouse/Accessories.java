package Warehouse;

public class Accessories extends Items implements ModifyItems {
	private int weight;
	private String gender; 
	
	public Accessories(String PName, String Category, String Description, int Price, String Location, int Stock,
			int ProductId, String StoredAt, int weight, String gender) {
		
		super(PName, Category, Description, Price, Location, Stock, ProductId, StoredAt);
		this.weight = weight;
		this.gender = gender;
		
	}

	@Override
	public int getStock() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setStock(int stock) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getProductId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setProductId(int productId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getProductName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setProductName(String productName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getCategory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCategory(String category) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDescription(String description) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setPrice(int price) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setLocation(String location) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getStoredAt() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setStoredAt(String storedAt) {
		// TODO Auto-generated method stub
		
	}
	

}
