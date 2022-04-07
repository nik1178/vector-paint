public class vaje{

public static void main(String[] args) {
    int vsota=0;
    int povp=0;
    for(int i=0;i<100;i++){
        int stevilo = (int)(Math.random()*51) - 25;
        System.out.println(stevilo);
        vsota = vsota + stevilo;
    }
    System.out.println("vsota je= "+vsota);
    povp=vsota/100;
    System.out.println("povprecje je= "+povp);
}
}