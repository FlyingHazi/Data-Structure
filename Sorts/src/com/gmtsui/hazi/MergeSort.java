package com.gmtsui.hazi;

public class MergeSort {
    public static <T extends Comparable<? super T>> void mergeSort(T a[])
    {
        T t[] = (T[])new Comparable[a.length];
        mergeSort(a,t,0,a.length-1);
    }

    private static <T extends Comparable<? super T>> void mergeSort(T a[],T t[],int l,int r)
    {
        if(l >= r)
        {
            return;
        }
        int m = (l+r)/2;
        mergeSort(a,t,l,m);
        mergeSort(a,t,m+1,r);
        merge(a,t,l,m,r);
    }

    private static <T extends Comparable<? super T>> void merge(T a[],T t[],int l,int m,int r)
    {
        int i = l;
        int j = m+1;
        int k = l;
        while(i<=m&&j<=r)
        {
            if(a[i].compareTo(a[j])<0)
            {
                t[k++] = a[i++];
            }else
            {
                t[k++] = a[j++];
            }
        }
        while(i<=m)
        {
            t[k++] = a[i++];
        }
        while(j<=r)
        {
            t[k++] = a[j++];
        }
        System.arraycopy(t,l,a,l,r-l+1);
    }

}
