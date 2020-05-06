package de.elnarion.sample.domain2;

import de.elnarion.sample.domain.BaseDomainClass;
import de.elnarion.sample.domain.ChildA;

public class TestProject2 {
    public BaseDomainClass baseDomainClassField;
    private ChildA childA;

    public ChildA getChildA() {
        return childA;
    }

    public void setChildA(ChildA childA) {
        this.childA = childA;
    }
}