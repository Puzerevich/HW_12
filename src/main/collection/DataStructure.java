package collection;

public class DataStructure {
    private final String name;
    private final int occurrence;

    public DataStructure(String name, int occurrence) {
        this.name = name;
        this.occurrence = occurrence;
    }

    @Override
    public String toString() {
        return "{" +
                "name = \"" + name + '\"' +
                ", occurrence = " + occurrence +
                '}' + "\n";
    }
}
