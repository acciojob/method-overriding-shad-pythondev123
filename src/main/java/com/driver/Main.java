package com.driver;

public class Main {
    public static void main(String[] args){

     B b= new B();
     b.meth();
//     trying to do the git stuff
//        final commit
//        agdf
    }
    public static class A {
        public A() {

        }

        public String meth(){
            return "Invoking method from class A";
        }
    }
    public static class B extends A {
        public B() {
        }

        public String meth() {
            return "Method is overridden in Extendend class B";
        }
    }

    }