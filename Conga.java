import java.util.Scanner;

public class Conga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("So ga trong trang trai: ");
        int soGa = input.nextInt();
        
        int gioiTinh;
        int gaCon;
        float canNang;
        int tuoi;
        int gaMai = 0;
        int gaTrong = 0;
        int tongCanNangCuaGaTrong = 0;
        int tongTuoiCuaGaMai = 0;

        for(int i = 0; i < soGa; i++) {
            System.out.print("Gioi tinh (0: Ga trong, 1: Ga mai): ");
            gioiTinh = input.nextInt();
            
            System.out.print("Ga con: ");
            gaCon = input.nextInt();
            
            System.out.print("Can nang: ");
         canNang = input.nextFloat();
            
            System.out.print("Tuoi: ");
            tuoi = input.nextInt();
            
            if(gioiTinh == 0) {
                gaTrong++;
                tongCanNangCuaGaTrong += canNang;
            } else if(gioiTinh == 1) {
                gaMai++;
                tongTuoiCuaGaMai += tuoi;
            }
        }
        
        float trungBinhCanNangCuaGaTrong = (float) tongCanNangCuaGaTrong / gaTrong;
        float trungBinhTuoiCuaGaMai = (float) tongTuoiCuaGaMai / gaMai;
        
        if(gaTrong / gaMai % 4 == 0 || gaMai / gaTrong % 4 == 0) {
            System.out.println("Co ti le dep");
        } else {
            System.out.println("Khong co ti le dep");
        }
        
        System.out.println("Can nang trung binh cua ga trong la: " + trungBinhCanNangCuaGaTrong);
        System.out.println("Tuoi trung binh cua ga mai la: " + trungBinhTuoiCuaGaMai);
        
        float tongTien = (130 * tongTuoiCuaGaMai) + (140 * tongCanNangCuaGaTrong);
        System.out.println("Tong so tien thu duoc tu viec ban ga: " + tongTien);
        
        System.out.print("So ga can mua dat tiec: ");
        int soGacanmua = input.nextInt();
        
    }
}
