package com.infosys.day4;
public class ExceptionTest {

    public static void defectedCode() throws Exception{

        throw new Error();
    } 

    public static void main(String args[]){

        try{
            defectedCode();
            System.out.println("A");

        }catch(Exception e){

            System.out.println("B");

        }finally{

            System.out.println("C");
        }
        
        System.out.print("D");
    }
}