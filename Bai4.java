// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
import java.lang.Math;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hocvien;
        int somonhoc;
        float diemmonhoc;
        int hocsinhcodiemmax = 0;
        float diemmax = 0;
        float tongmonhoc = 0;
        float diemtrungbinhmonhoc = 0;
        float diemtrungbinhotatcacacmon = 0;
        System.out.printf("Nhap voa so hoc vien: ");
        hocvien = input.nextInt();
        System.out.printf("Nhap voa so mon hoc: ");
        somonhoc = input.nextInt();
        for(int i = 1; i<=hocvien; i++){
            for(int j = 1; j <= somonhoc; j++){
    System.out.printf("Nhap voa diem mon hoc thu %d cua hoc sinh %d: ",j, i);
                diemmonhoc = input.nextFloat();
                tongmonhoc += diemmonhoc;
                if(diemmonhoc > diemmax ){
                    hocsinhcodiemmax = i;
                    diemmax = diemmonhoc;
                }
            }
            diemtrungbinhmonhoc = tongmonhoc/somonhoc;
           
    System.out.printf("Diem trung binh cua hoc sinh %d la %.2f\n ", i,diemtrungbinhmonhoc);
        }
        System.out.printf("Diem cao nhat cua hoc sinh %d la %.2f\n ", hocsinhcodiemmax,diemmax);
    

        
        
    }

}