package Model;

public class BubbleSorter extends AbstractSorter{
    @Override
    public void sort(int[] sir) {
        int n = sir.length;
        for(int i=0;i<n-1;i++){
            for(int j = 0;j<n-i-1;j++){
                if(sir[j]> sir[j+1]){
                    int aux = sir[j];
                    sir[j] = sir[j+1];
                    sir[j+1]=aux;
                }
            }
        }
    }
}
