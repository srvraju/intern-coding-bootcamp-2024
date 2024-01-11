package org.cloudera.entities;

/**
 * Represents a file in a filesystem.
 */
public class File extends AbstractEntity {

    private final byte[] contents;

    public File(String name, byte[] contents) {
        super(name);
        this.contents = contents;
    }

    /**
     * Returns the contents of a file.
     * @return contents of the file as a byte array.
     */
    public byte[] getContents() {
        return this.contents;
    }

    public String toString() {
        return name;
    }
}
