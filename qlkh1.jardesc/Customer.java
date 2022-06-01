import java.util.ArrayList;
import java.util.List;
public class Customer {
	private int id;
	private String name;
	private String phone;
	private int point;
	private static List<Customer> customers = new ArrayList<>();
	
	public Customer(int id, String name, String phone, int point) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.point = point;
		customers.add(this);
	}
	public static List<Customer> getListCustomers() {
		return customers;
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
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	//Hiển thị
	
	public void Display() {
		System.out.println( "Tên khách hàng: " + name);
		System.out.println( "ID Khách hàng: " + id);
		System.out.println( "SĐT: " + phone);
		System.out.println( "Điểm tích lũy: " + point);

	}
	//
	public static Customer searchCustomer(String phone) {
        boolean test = false;        
        for (Customer i : Customer.getListCustomers()) {
            if (i.getPhone().equals(phone)) {
                test = true;
                return i;
            }
        }
        return null;
        
    }

	private static Customer[] getListCustomer() {
		// TODO Auto-generated method stub
		return null;
	}


	
	
}
