package com.projecty.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 *
 * @author Stone
 * @date 2023/12/19
 */
public class ObjectStructure {
    private List<Element> elements = new ArrayList<>();

    public void accept(Visitor visitor) {
        Iterator<Element> iterator = elements.iterator();
        while(iterator.hasNext()) {
            iterator.next().accept(visitor);
        }

    }
    public void add(Element element) {
        elements.add(element);
    }
    public void remove(Element element){
        elements.remove(element);
    }
}
