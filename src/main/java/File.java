public class File implements FileSystemComponent{
    private String name;

    public File(String name) {
        this.name = name;
    }

    public String display() {
        return this.name;
    }
}
