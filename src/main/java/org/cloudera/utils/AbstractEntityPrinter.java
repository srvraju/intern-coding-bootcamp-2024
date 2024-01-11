package org.cloudera.utils;

import org.cloudera.entities.AbstractEntity;
import org.cloudera.entities.Directory;

/**
 * Utility class to print an abstract entity.
 */
public class AbstractEntityPrinter {

    /**
     * Prints the contents of an abstract entity only if its a directory.
     *
     * @param entity Entity to print.
     */
    public void print(AbstractEntity entity) {
        if (entity instanceof Directory) {
            Directory directory = (Directory) entity;
            for (AbstractEntity childEntity : directory.getItems()) {
                System.out.println(childEntity);
            }
        }
    }
}
