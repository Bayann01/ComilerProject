package program;

public class columnProperty extends columnProperties {
    columnMainAxis mainAxisCol;
    columnCrossAxis crossAxisCol;

    public columnProperty(columnMainAxis mainAxisCol, columnCrossAxis crossAxisCol) {

        this.mainAxisCol = mainAxisCol;
        this.crossAxisCol = crossAxisCol;
    }

    public columnProperty(columnMainAxis mainAxisCol) {
        this.mainAxisCol = mainAxisCol;
    }

    public columnProperty(columnCrossAxis crossAxisCol) {
        this.crossAxisCol = crossAxisCol;
    }

    public columnProperty() {
    }

    @Override
    public String toString() {
        return "columnProperty{" +
                "mainAxisCol=" + mainAxisCol +
                ", crossAxisCol=" + crossAxisCol +
                '}';
    }
}
