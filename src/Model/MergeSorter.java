package Model;

public class MergeSorter extends AbstractSorter {

    @Override
    public void sort(int[] sir) {
        sortMerge(sir,0,sir.length-1);
    }

    private void sortMerge(int[] sir,int l,int r) {
        if(l<r){
            int m = l+(r-l)/2;
            sortMerge(sir,l,m);
            sortMerge(sir,m+1,r);
            merge(sir,l,m,r);
        }
    }
    private void merge(int[] sir,int l,int m,int r){
        int n1 = m-l+1;
        int n2 = r-m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for(int i=0;i<n1;i++){
            L[i]=sir[l+i];
        }
        for(int i=0;i<n2;i++){
            R[i]=sir[m+1+i];
        }
        int i=0,j=0;
        int k=l;
        while(i<n1 && j<n2){
            if(L[i]<R[j]){
                sir[k] = L[i];
                i++;
            }
            else{
                sir[k]=R[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            sir[k]=L[i];
            i++;
            k++;
        }
        while(j<n2){
            sir[k]=R[j];
            j++;
            k++;
        }

    }
}
