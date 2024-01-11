package org.cloudera.entities;

/**
 * AbstractEntity that represents the
 */
public abstract class AbstractEntity {
    protected String name;

    public AbstractEntity(String name) {
        this.name = name;
    }
}
