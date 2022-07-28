import java.util.Scanner;

class QuickFind{

    private int[] arr;

    public QuickFind(int N)
    {

        this.arr=new int[N];
        for(int i=0;i<N;i++)
            arr[i]=i;
    }
    public void connectElements(int p,int q)
    {
        int pid = arr[p];
        int qid = arr[q];
        for(int i=0;i<arr.length;i++)
        {

                if(arr[i] == pid)
                    arr[i]= qid;

        }
    }

    public boolean findConnectivity(int p,int q)
    {
        return (arr[p] == arr[q]);


    }

    public void printConnectedElements()
    {
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");

        }

    }

}


class QuickFindMain {
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       QuickFind quickFind = new QuickFind(10);
       quickFind.connectElements(4,3);
       quickFind.connectElements(3,8);
       quickFind.connectElements(3,9);
       quickFind.connectElements(2,7);
       quickFind.connectElements(1,6);
       quickFind.connectElements(1,2);
       quickFind.connectElements(0,5);
       quickFind.connectElements(5,6);

        System.out.println(quickFind.findConnectivity(0,1));

        quickFind.printConnectedElements();
    }

}