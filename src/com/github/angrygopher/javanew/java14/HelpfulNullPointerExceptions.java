package com.github.angrygopher.javanew.java14;

public class HelpfulNullPointerExceptions {
    //java -XX:+ShowCodeDetailsInExceptionMessages HelpfulNullPointerExceptions.java

    public static void main(String[] args) {
        var a = new A(new B());
        a.b.c.d = new D();
    }

   static class A {

       public A(B b) {
           this.b = b;
       }

       public B b;
    }

   static class B {
        public C c;
    }

    static class C {
        public D d;
    }

    static class D {
    }
}
