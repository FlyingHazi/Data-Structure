package com.gmtsui.hazi;

public class QuickSort {

	public static <T extends Comparable<? super T>> void quickSort(T a[]) {
		quickSort(a, 0, a.length - 1);
	}

	private static <T extends Comparable<? super T>> void quickSort(T a[],
			int left, int right) {
		if (left >= right) {
			return;
		}
		int mid = quickExchange(a, left, right);
		quickSort(a, left, mid - 1);
		quickSort(a, mid + 1, right);
	}

	private static <T extends Comparable<? super T>> T median3(T a[], int l,
			int r) {
		int m = (l + r) / 2;
		if (a[m].compareTo(a[l]) < 0) {
			swapReferences(a, m, l);
		}
		if (a[r].compareTo(a[l]) < 0) {
			swapReferences(a, l, r);
		}
		if (a[r].compareTo(a[m]) < 0) {
			swapReferences(a, m, r);
		}
		swapReferences(a, m, l);
		return a[l];
	}

	private static <T extends Comparable<? super T>> void swapReferences(T a[],
			int x, int y) {
		T temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}

	private static <T extends Comparable<? super T>> int quickExchange(T a[],
			int l, int r) {
		int b = l;
		T pivot = median3(a, l, r);
		for (;;) {
			while (l < r && a[r].compareTo(pivot) >= 0) {
				r--;
			}
			while (l < r && a[l].compareTo(pivot) <= 0) {
				l++;
			}
			if (l < r) {
				swapReferences(a, l, r);
			} else {
				break;
			}
		}
		swapReferences(a, b, r);//Fix me
		return l;
	}
}
