package Warehouse;

public class Items{
	protected int Stock;
	protected int ProductId;
	protected String ProductName;
	protected String Category;
	protected String Description;
	protected int Price;
	protected String Location;
	protected String StoredAt;
	
	public Items(String PName, String Category, String Description, int Price, String Location, int Stock, int ProductId, String StoredAt) {
		this.Stock = 0;
		this.ProductId = ProductId;
		this.Category = Category;
		this.Description = Description;
		this.Price = Price;
		this.Location = Location;
		this.StoredAt = StoredAt;
	}

}
