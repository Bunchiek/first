import java.util.Objects;

public class Test {
    private String name;
    private int id;
    static int hashCount;
    static int equalsCount;

    public Test(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        equalsCount++;
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test test = (Test) o;
        return Objects.equals(name, test.name) && Objects.equals(id, test.id);
    }

    @Override
    public int hashCode() {
        hashCount++;
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
