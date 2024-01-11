package org.cloudera.entities;

/**
 * Represents the symbolic link in a file system. Symbolic link can point a file or a directory.
 */
public class SymbolicLink extends AbstractEntity {
    private final AbstractEntity linkedEntity;

    public SymbolicLink(String name, AbstractEntity linkedEntity) {
        super(name);
        this.linkedEntity = linkedEntity;
    }

    /**
     * Fetches the entity the symbolic link points to.
     *
     * @return the abstract entity the link points.
     */
    public AbstractEntity getLinkedEntity() {
        return this.linkedEntity;
    }

    public String toString() {
        return this.name;
    }
}
