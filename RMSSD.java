import java.util.Scanner;

public class RMSSD {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap vao so tuoi cua nguoi: ");
        int tuoi = input.nextInt();
        
        System.out.print("Nhap so khoang cach giua 2 lan: ");
        int numRR = input.nextInt();
        int[] arr = new int[numRR];
        int maxTotal = 0;

        for (int i = 0; i < numRR; i++) {
            System.out.printf("Nhap vao RR thu %d : ", i + 1);
            int num = input.nextInt();
            arr[i] = num;
        }
        
        int[] arrTotal = new int[numRR - 1];
        
        for (int i = 0; i < numRR - 1; i++) {
            int Totalbetween2lan = (arr[i + 1] - arr[i]) * (arr[i + 1] - arr[i]);
            arrTotal[i] = Totalbetween2lan;
        }
        
        for (int i = 0; i < arrTotal.length; i++) {
            maxTotal += arrTotal[i];
        }
        
        double RMSSD = Math.sqrt(maxTotal / (double)(numRR - 1));
        
        if (0.1 * 104 <= RMSSD) {
            System.out.printf("Stress");
        } else {
            System.out.printf("Normal");
        }
    }
}
