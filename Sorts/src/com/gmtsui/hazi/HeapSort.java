package com.gmtsui.hazi;

public class HeapSort {
    public static <T extends Comparable<? super T>> void heapSort(T a[])
    {
        for(int i=a.length/2;i>=0;i--)
        {
            swapDown(a,i,a.length);
        }
        for(int i=a.length-1;i>0;i--)
        {
            swapReference(a,0,i);
            swapDown(a,0,i);
        }
    }
    private static <T extends Comparable<? super T>> void swapReference(T a[],int x,int y)
    {
        T temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    private static <T extends Comparable<? super T>> void swapDown(T a[],int i,int n)
    {
        int child=leftChild(i);
        for(;child<n;i=child,child=leftChild(child))
        {
            if(child!=n-1&&a[child].compareTo(a[child+1])<0)
            {
                child++;
            }
            if(a[i].compareTo(a[child])<0)
            {
                swapReference(a,i,child);
            }
        }
    }

    private static <T extends Comparable<? super T>> int leftChild(int i)
    {
        return 2*i+1;
    }

}
