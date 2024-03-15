package com.spring.core.DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;

class A{
    private B b;

    public void setB(B b) {                 // Class A is dependent on B
        this.b = b;
    }
}

class B{

    private A a;

    public void setA(A a) {                 // Class B is dependent on A
        this.a = a;
    }
}

class C{

}


public class ConstructorVsSetterBasedDIInjection {

    private A a;
    private B b;
    private C c;

    // if all 3 classes are mandatory, then use constructor based DI
    @Autowired
    public ConstructorVsSetterBasedDIInjection(A a, B b, C c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // if only class B is Optional, then go for setter based DI


    public void setA(A a) {
        this.a = a;
    }

    public void setC(C c) {
        this.c = c;
    }
}
