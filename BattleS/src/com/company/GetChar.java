package com.company;

import java.util.Scanner;

class GetChar {
    static char Char(){
        Scanner sc = new Scanner(System.in).useDelimiter("\\s*");
        return sc.next().charAt(0);
    }
}
