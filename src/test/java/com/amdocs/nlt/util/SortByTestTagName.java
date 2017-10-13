package com.amdocs.nlt.util;

import com.amdocs.nlt.listeners.CustomTestMethodResult;

import java.util.Comparator;
import java.util.List;

public class SortByTestTagName implements Comparator<CustomTestMethodResult>{

    @Override
    public int compare(CustomTestMethodResult o1, CustomTestMethodResult o2) {
        return o1.getTestName().compareTo(o2.getTestName());
    }
}
