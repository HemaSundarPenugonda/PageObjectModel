package com.amdocs.nlt.oders;

public class TestEnum {
    public static void main(String[] args) {
        Enum[] values = AppEnums.coLocationService_powerRequirementDc.values();
        System.out.println(values);
        System.out.println(values[2].name());
//        System.out.println(values[2].getValue());
        System.out.println(values[2].toString());


    }
}
