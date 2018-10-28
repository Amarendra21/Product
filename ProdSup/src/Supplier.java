import java.util.Scanner;
public class Supplier {
String SupplierId;
String SupplierName;
String SupplierAddress;
int SupplierFeedback;
public Boolean addSupplier()
{
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter the Supplier Id: ");
	SupplierId= s1.nextLine();
	System.out.println("Enter the Supplier Name: ");
	SupplierName=s1.nextLine();
	System.out.println("ENter the Supplier Address: ");
	SupplierAddress=s1.nextLine();
	System.out.println("Supplier Feedback");
	SupplierFeedback=s1.nextInt();
	s1.close();
	return true;
}
public String getSupplierId() {
	return SupplierId;
}

public void setSupplierId(String supplierId) {
	SupplierId = supplierId;
}

public String getSupplierName() {
	return SupplierName;
}

public void setSupplierName(String supplierName) {
	SupplierName = supplierName;
}

public String getSupplierAddress() {
	return SupplierAddress;
}

public void setSupplierAddress(String supplierAddress) {
	SupplierAddress = supplierAddress;
}

public int getSupplierFeedback() {
	return SupplierFeedback;
}

public void setSupplierFeedback(int supplierFeedback) {
	SupplierFeedback = supplierFeedback;
}

public Supplier(String supplierId, String supplierName, String supplierAddress, int supplierFeedback) {
	SupplierId = supplierId;
	SupplierName = supplierName;
	SupplierAddress = supplierAddress;
	SupplierFeedback = supplierFeedback;
}

public Supplier() {
	this.SupplierId="";
	this.SupplierName="";
	this.SupplierAddress="";
	this.SupplierFeedback=0;
}

}
