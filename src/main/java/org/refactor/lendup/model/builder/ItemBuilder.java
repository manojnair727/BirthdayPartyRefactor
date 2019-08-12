package org.refactor.lendup.model.builder;

public abstract class ItemBuilder<T> {
    
    public abstract T build();
    
    protected void checkNull(Object o, String type) {
        if (o == null) {
            throw new IllegalArgumentException(type + " is null");
        }
    }

}
