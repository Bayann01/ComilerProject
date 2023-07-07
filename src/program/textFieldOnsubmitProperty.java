package program;

public class textFieldOnsubmitProperty extends textFieldProperties{
  public   String value;
  public assignment assignment;

    public textFieldOnsubmitProperty(String value, program.assignment assignment) {
        this.value = value;
        this.assignment = assignment;
    }

    @Override
    public String toString() {
        return "\ntextFieldOnsubmitProperty{" +
                "\nvalue='" + value + '\'' +
                ", \nassignment=" + assignment +
                "\n}";
    }
}
