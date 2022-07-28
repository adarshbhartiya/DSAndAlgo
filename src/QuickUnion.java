import java.util.Scanner;

public class QuickUnion {

    private int[] arr;
    public QuickUnion(int N)
    {
        this.arr = new int[N];
        for(int i=0;i<N;i++)
        {
         arr[i] = i;
        }
    }

    public int findRoot(int i)
    {
        while(i!= arr[i])
            i = arr[i];
        return i;
    }

    public boolean findConnectivity(int p,int q)
    {
        return (findRoot(p) == findRoot(q));
    }
    public void quickUnion(int p, int q)
    {
        int i = findRoot(p);
        int j = findRoot(q);
        arr[i] = j;
    }
    public void printConnectedElements()
    {
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");

        }

    }

}

class QuickUnionMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuickUnion quickUnion = new QuickUnion(10);
        quickUnion.quickUnion(4, 3);
        quickUnion.quickUnion(3, 8);
        quickUnion.quickUnion(3, 9);
        quickUnion.quickUnion(2, 7);
        quickUnion.quickUnion(1, 6);
        quickUnion.quickUnion(1, 2);
        quickUnion.quickUnion(0, 5);
        quickUnion.quickUnion(5, 6);

        System.out.println(quickUnion.findConnectivity(0, 1));

        quickUnion.printConnectedElements();
    }
}
