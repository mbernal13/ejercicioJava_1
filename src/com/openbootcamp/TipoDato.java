package com.openbootcamp;

public class TipoDato {
    public static void main(String[] args){
        System.out.println("Tipos de datos");
        //1. numércios
        //1.1. enteros
        byte var1 = 1;
        System.out.println("byte: "+var1);
        short var2 = 10;
        System.out.println("short: "+var2);
        int var3 = 999;
        System.out.println("int: "+var3);
        long var4 = 9999;
        System.out.println("long: "+var4);

        //1.1. decimales
        float var5 = 22.2f;
        System.out.println("float: "+var5);
        double var6 = 15.2d;
        System.out.println("double: "+var6);

        //2. booleano
        boolean var7 = true;
        System.out.println("boolean: "+var7);
        boolean var8 = false;
        System.out.println("boolean: "+var8);

        //3. texto
        char var9 = 'a';
        System.out.println("char: "+var9);
        String var10 = "Repaso Java básico";
        System.out.println("String: "+var10);
    }
}
