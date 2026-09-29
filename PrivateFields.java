public class PrivateFields {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        PrivateFields student = new PrivateFields();
        student.setName("Ava");
        System.out.println(student.getName());
    }
}
