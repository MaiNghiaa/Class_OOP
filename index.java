import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Nhap vao so luong can ho cho thue:");
        int n = input.nextInt();
        
        System.out.println("----");
        int maxMonth = 0; 
        int maxmoney = 0;
        int minMoney = 0;
        int canLainhat = 0;
        int Lainhat = 0;
        int caiLonhat = 0;
        for(int i = 1; i <= n; i++) {
            System.out.println("Can " + i);
            System.out.printf("Nhap vao so thang thue:");
            int thang = input.nextInt();
            if (thang > maxMonth) { 
                maxMonth = thang; 
            }
            System.out.println("So tien thue chu cu: ");
            int Thue = input.nextInt();
            System.out.println("So tien cho thue:");
            int ChoThue = input.nextInt();
            
            int totalIncome = 0;
            
            for(int j = 1; j <= thang; j++) {
                int SoTienThuDuoc = (ChoThue - Thue);
                System.out.printf("Thang thu: %d, so tien thu duoc: %d\n", j, SoTienThuDuoc);
                totalIncome += SoTienThuDuoc;
            }
            
            if(totalIncome > maxmoney) {
                maxmoney = totalIncome;
                canLainhat = i;
                Lainhat = totalIncome;
            }
            if(totalIncome < minMoney) {
                minMoney = totalIncome;
                caiLonhat = i+1;
                Lainhat = totalIncome;
            }
            
            System.out.println("---");
        }
        
        System.out.println("So thang thue max la : " + maxMonth);
        System.out.println("So Tien lai la : " + maxmoney);
        System.out.println("can lai nhat la : " + canLainhat);
                System.out.println("can lai nhat la : " + caiLonhat);
        System.out.println("lai nhat la : " + Lainhat);
    }
}
