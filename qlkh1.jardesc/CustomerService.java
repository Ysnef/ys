import java.util.ArrayList;

import java.util.List;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomerService {
//Tìm kiếm và hiển thị khách hàng thông qua SĐT
	public static void searchCustomer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap sdt  muon tim kiem: ");
        String p = sc.nextLine();
        try {
            Customer.searchCustomer(p).Display();
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println("Không tồn tại khách hàng");
        }
    }
	
//Thêm mới khách hàng
		public static void insert() {
		Scanner inputs = new Scanner(System.in);
		System.out.println ("Nhập SĐT khách hàng: ");
		String phone = inputs.nextLine();
		try {
				if (Customer.searchCustomer(phone)== null) {
				System.out.println("Nhập thông tin khách hàng tạo mới:");
				System.out.print("ID: ");
				int id = inputs.nextInt();	
				System.out.println("Tên KH: ");
				String name = inputs.next();
				System.out.println("Điểm tích lũy:");
				int point = inputs.nextInt();
				
				Customer a = new Customer(id, name, phone, point);
				System.out.print("Thêm mới khách hàng thành công");
				}
				else {
					System.out.println("Đã tồn tại khách hàng");
				}
				
				

			} catch (InputMismatchException ei) {
				System.out.println("Không hợp lệ");
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

//Tích điểm cho khách hàng
			public static void getPoint() {
		        Scanner sc = new Scanner(System.in);
		        System.out.println("SĐT KH được cộng điểm: ");
		        String a=sc.nextLine();
		        System.out.println("Số điểm được thêm: ");
		        int b=sc.nextInt();
		        Customer.searchCustomer(a).setPoint(b+Customer.searchCustomer(a).getPoint());
				System.out.println("Đã tích diểm thành công, số điểm hiện tại là: " + Customer.searchCustomer(a).getPoint());
		        
		}
}

