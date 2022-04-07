import java.util.Scanner;
public class trimestna_naravna_st {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("najdi št. deliteljev s katero številko");
        int a = s.nextInt();
        int c=0;
        
        for(int i=100; i<1000;i++){
            if(i%a==7){
                System.out.println(i);
            }
        }
        
        System.out.println();
        
    }
}
