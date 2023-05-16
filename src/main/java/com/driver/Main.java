package com.driver;
class A{
    public String meth(){
        return "Invoking method from class A";
    }
}
class B extends A{

}
public class Main {
    public static void main(String[] args){
        B ans = new B();
        String s= ans.meth();

    }

}