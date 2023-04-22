import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DirectoryTest {
    @Test
    void shouldAddComponent() {
        Directory directory = new Directory("test");
        File file = new File("file test.txt");

        directory.addComponent(file);

        assertEquals(1, directory.getComponents().size());
    }

    @Test
    void shouldRemoveComponent() {
        Directory directory = new Directory("test");
        File file = new File("file test.txt");
        File file2 = new File("second file test.txt");

        directory.addComponent(file);
        directory.addComponent(file2);
        directory.removeComponent(file);

        assertEquals(1, directory.getComponents().size());
    }

    @Test
    void shouldDisplayComponents() {
        Directory directory = new Directory("directory test");
        Directory secondDirectory = new Directory("second directory test");

        File file = new File("file test.txt");
        File secondFile = new File("second file test.txt");

        directory.addComponent(file);
        directory.addComponent(secondFile);

        secondDirectory.addComponent(file);
        secondDirectory.addComponent(directory);

        String expectedResult = "Directory: second directory test\n" +
                "File: file test.txt\n" +
                "Directory: directory test\n" +
                "File: file test.txt\n" +
                "File: second file test.txt\n";

        assertEquals(expectedResult, secondDirectory.display());
    }
}
