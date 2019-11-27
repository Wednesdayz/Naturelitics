package Warehouse;

public interface ModifyItems {
	public int getStock();

	public void setStock(int stock);

	public int getProductId();

	public void setProductId(int productId);

	public String getProductName();

	public void setProductName(String productName);

	public String getCategory();

	public void setCategory(String category);

	public String getDescription();

	public void setDescription(String description);

	public int getPrice();

	public void setPrice(int price);

	public String getLocation();

	public void setLocation(String location);

	public String getStoredAt();

	public void setStoredAt(String storedAt);
}
