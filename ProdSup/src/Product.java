
public class Product {
String ProductId;
String ProductName;
String ProductDescription;
float ProductPrice;
public String getProductId() {
	return ProductId;
}
public void setProductId(String productId) {
	ProductId = productId;
}
public String getProductName() {
	return ProductName;
}
public void setProductName(String productName) {
	ProductName = productName;
}
public String getProductDescription() {
	return ProductDescription;
}
public void setProductDescription(String productDescription) {
	ProductDescription = productDescription;
}
public float getProductPrice() {
	return ProductPrice;
}
public void setProductPrice(float productPrice) {
	ProductPrice = productPrice;
}

public Product(String productId, String productName, String productDescription, float productPrice) {
	super();
	ProductId = productId;
	ProductName = productName;
	ProductDescription = productDescription;
	ProductPrice = productPrice;
}

public Product()
{
	super();
	ProductId = "";
	ProductName = "";
	ProductDescription = "";
	ProductPrice = 0.0f;
}


}
