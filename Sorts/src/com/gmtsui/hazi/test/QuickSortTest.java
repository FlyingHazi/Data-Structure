package com.gmtsui.hazi.test;


import java.util.Arrays;

import junit.framework.Assert;

import org.junit.Test;

public class QuickSortTest {

	@Test
	public void test() {
		String a[] = {"a","b","f","e","c","d"};
		String right[] = {"a","b","c","d","e","f"};
		com.gmtsui.hazi.QuickSort.quickSort(a);
		Assert.assertTrue(Arrays.equals(a, right));
		com.gmtsui.hazi.QuickSort.quickSort(a);
		Assert.assertTrue(Arrays.equals(right, right));
	}

}
