package program;

public class TextButtonexpr extends widget {
  public   OnPressedexpr onPressedexpr ;
  public   Childexpr childexpr;

    public TextButtonexpr(OnPressedexpr onPressedexpr, Childexpr childexpr) {
        this.onPressedexpr = onPressedexpr;
        this.childexpr = childexpr;
    }

    @Override
    public String toString() {
        return "\nTextButtonexpr{" +
                "\nonPressedexpr=" + onPressedexpr +
                ", \nchildexpr=" + childexpr +
                "\n}";
    }
}
