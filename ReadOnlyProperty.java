public class ReadOnlyProperty {
    private final String schoolName = "Green School";

    public String getSchoolName() {
        return schoolName;
    }

    public static void main(String[] args) {
        ReadOnlyProperty school = new ReadOnlyProperty();
        System.out.println(school.getSchoolName());
    }
}
