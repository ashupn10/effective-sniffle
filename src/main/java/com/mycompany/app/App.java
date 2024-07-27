/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package com.mycompany.app;

public class App {
    public static void main(String[] args) {
        
        System.out.println("Hello Remote World!");
        Calculator calc = new Calculator();
        int result = calc.add(5,6);
        System.out.println(result);
    }
};

class Calculator{
    public int add(int a, int b){
        System.out.println("in add");
        return a+b;
    }
};
