package org.cloudera.entities;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class TestDirectory {
    private Directory root;

    @Before
    public void before() {
        root = new Directory("root");
    }

    @Test
    public void testAddDirectory() {

        Directory src = new Directory("src");
        root.addDirectory(src);

        Assert.assertEquals(root.getItems().size(), 1);
        Assert.assertEquals(root.getItems().get(0), src);
    }

    @Test
    public void testAddFile() {
        byte[] javaContents = "Some java code.".getBytes(StandardCharsets.UTF_8);
        File javaFile = new File("Main.java", javaContents);
        root.addFile(javaFile);

        List<AbstractEntity> directoryList = root.getItems();
        Assert.assertEquals(directoryList.size(), 1);
        Assert.assertEquals(directoryList.get(0), javaFile);
        Assert.assertEquals(((File) directoryList.get(0)).getContents(), javaContents);
    }
}
