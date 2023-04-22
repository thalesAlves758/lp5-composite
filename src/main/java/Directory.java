import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Directory implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> components = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void addComponent(FileSystemComponent component) {
        this.components.add(component);
    }

    public void removeComponent(FileSystemComponent component) {
        this.components.remove(component);
    }

    public String display() {
        String content = "Directory: " + this.name + "\n";

        for (FileSystemComponent component : this.components) {
            content += component.display();
        }

        return content;
    }

    public List<FileSystemComponent> getComponents() {
        return this.components;
    }
}
