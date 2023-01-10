package program;

public class column extends widget{
    columnProperties columnProperties;

    public column(program.columnProperties columnProperties) {
        this.columnProperties = columnProperties;
    }

    public column() {
    }

    @Override
    public String toString() {
        return "\ncolumn{" +
                "\ncolumnProperties=" + columnProperties +
                "\n}";
    }
}
