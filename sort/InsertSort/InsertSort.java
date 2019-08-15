public class InsertSort {
    public static void main(String[] args){
        int[] A = {-1,2,4,1,5,3};
        System.out.println("before sort:");
        for(int i=1;i<=5;i++){
            System.out.println("a[" + i + "]="+A[i] + "  ");
        }

        InsertSort.insertSort(A,5);
        System.out.println("after sort:" );
        for(int i=1;i<=5;i++){
            System.out.println("a[" + i + "]="+A[i] + "  ");
        }
    }
    private static void insertSort(int[] A,int n){
        int i, j;
        for(i=2; i<= n;i++){ //待比较的无序数列，从第二个元素开始
            if(A[i] < A[i-1]){//如果当前比较的无序数列中的元素小于有序数列的最大元素，表示需要插入
                A[0] = A[i];  //因为之前A[0]未使用，可以用来暂时存放待插入的元素
                for(j = i-1;A[0] < A[j];--j){//在有序数列中从后往前查找插入额位置。
                    A[j+1] = A[j]; //如果待插入元素小于当前比较元素，则把当前元素向后移
                }
                A[j+1] = A[0]; //找到插入位置，把待插入元素从暂存位置插入。
            }
        }
    }


}
