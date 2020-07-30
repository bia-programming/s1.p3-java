package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner myInput = new Scanner(System.in);
        final int nr = myInput.nextInt();
        System.out.println(numar_par(nr));
        numar_impar(nr);

    }

    static int numar_par(int nr){
        int mod,var=0,ord=1;
        while(nr!=0){
            mod=nr%10;
            if(mod%2==1){
                var=mod*ord+var;
                ord=ord*10;
            }
            nr=nr/10;
        }
        return var;
    }

    static void numar_impar(int nr){
        int mod,var=0,ord=1;
        while(nr!=0){
            mod=nr%10;
            if(mod%2==0){
                var=mod*ord+var;
                ord=ord*10;
            }
            nr=nr/10;
        }
        System.out.println(var);
    }
}
