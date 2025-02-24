package Baitap_Interface;

public class Test {
	 public static void main(String[] args) {
	        // a. Kiểm tra các phép toán của MayTinhBoTui
	        MayTinhBoTui cafx500 = new MayTinhCasioFX500();
	        MayTinhBoTui vncal500 = new MayTinhVinaCal500MS();

	        System.out.println("Casio FX500: 5 + 3 = " + (int) cafx500.cong(5, 3));
	        System.out.println("Casio FX500: 5 - 3 = " + (int) cafx500.tru(5, 3));
	        System.out.println("Casio FX500: 5 * 3 = " + (int) cafx500.nhan(5, 3));
	        System.out.println("Casio FX500: 5 / 3 = " + (int) cafx500.chia(5, 3));

	        System.out.println("VinaCal 500MS: 8 + 4 = " + (int) vncal500.cong(8, 4));
	        System.out.println("VinaCal 500MS: 8 - 4 = " + (int) vncal500.tru(8, 4));
	        System.out.println("VinaCal 500MS: 8 * 4 = " + (int) vncal500.nhan(8, 4));
	        System.out.println("VinaCal 500MS: 8 / 4 = " + (int) vncal500.chia(8, 4));

	        // b. Kiểm tra sắp xếp
	        double[] arr1 = {1, 8, 9, 2, 5, 4, 3};
	        double[] arr2 = {3, 9, 7, 2, 4, 8, 1};

	        SapXep sxchen = new SapXepChen();
	        SapXep sxchon = new SapXepChon();

	        sxchen.sapXepTang(arr1);
	        System.out.print("Mảng arr1 sau khi sắp xếp chèn tăng: ");
	        for (double num : arr1) System.out.printf("%.0f ", num);
	        System.out.println();

	        sxchon.sapXepGiam(arr2);
	        System.out.print("Mảng arr2 sau khi sắp xếp chọn giảm: ");
	        for (double num : arr2) System.out.printf("%.0f ", num);
	        System.out.println();

	        // c. Kiểm tra PhanMemMayTinhBoTui
	        double[] arr3 = {0, 6, 9, 2, 5, 4, 3};
	        PhanMemMayTinhBoTui pmmt = new PhanMemMayTinhBoTui();

	        pmmt.sapXepTang(arr3);		
	        System.out.print("Mảng arr3 sau khi sắp xếp tăng bằng PhanMemMayTinhBoTui: ");
	        for (double num : arr3) System.out.printf("%.0f ", num);
	        System.out.println();
	    }
}
