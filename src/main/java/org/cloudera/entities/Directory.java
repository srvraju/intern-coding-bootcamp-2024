package org.cloudera.entities;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a directory in a file system.
 */
public class Directory extends AbstractEntity {
    private final List<AbstractEntity> items;

    public Directory(String name) {
        super(name);
        items = new ArrayList<>();
    }

    /**
     * Adds a file to the current directory
     *
     * @param file File to add
     */
    public void addFile(File file) {
        addItem(file);
    }

    /**
     * Adds a directory to the current directory
     *
     * @param directory Directory to add
     */
    public void addDirectory(Directory directory) {
        addItem(directory);
    }

    private void addItem(AbstractEntity item) {
        items.add(item);
    }

    /**
     * Lists the contents of a directory, contents can be a directory, file or symbolic link
     *
     * @return list of subdirectories, files or symbolic link
     */
    public List<AbstractEntity> getItems() {
        return this.items;
    }

    public String toString() {
        return name;
    }
}
