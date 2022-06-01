import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class App {
		
		public static void ChucNang() {
   	 	System.out.println("                           ");
   	 	System.out.println("NHẬP 1: Tìm kiếm và hiển thị thông tin khách hàng  ");
        System.out.println("NHẬP 2: Thêm mới khách hàng ");
        System.out.println("NHẬP 3: Tích điểm cho khách hàng ");
        System.out.println("NHẬP 4: Thoát khỏi chương trình");
        System.out.println("                                  ");
        }


	public static void main(String[] args) {
		Customer cus1 = new Customer (1,"Y","0357808432",0);
		Customer cus2 = new Customer (2,"H","200",4);
		Customer cus3 = new Customer (3,"T","300",7);
		int test=10;
		System.out.println("---------CHỨC NĂNG---------");
		do
		{
			ChucNang();
		System.out.println("Chọn chức năng: ");
       	Scanner inputs = new Scanner(System.in);
       	int line = inputs.nextInt();
       	switch (line) {
         case 1 : {
        	 CustomerService.searchCustomer();
        	 break;
         }
         case 2 : {
        	 CustomerService.insert();
        	 break;
         }
         case 3 : {
        	 CustomerService.getPoint();
        	 break;
         }
         case 4: {
        	 test=0;
        	 break;
         }
         default:
             System.out.println("Không tồn tại chức năng, Nhập lại");
             break;
             
         }
		} while (test!=0);
		
         }
  
}



 
