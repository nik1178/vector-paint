public class vaja17 {
    public static void posodobiCelice(int tab [][]){
        for(int i=0;i<tab[i].length;i++){
            for(int j=0;j<tab[j].length;j++){
                if(j>0)
                tab[i][j] = tab[i][j] - tab[i][j-1];
                if(j<tab[i].length-1)
                tab[i][j] = tab[i][j] - tab[i][j+1];
            }
        }
    }
    public static void main(String[] args) {
        posodobiCelice(tab);
    }
}
 
