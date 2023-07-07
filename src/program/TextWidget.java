package program;

public class TextWidget extends  widget{
    public String text;
    public String textAlign;
    public TextStyle textStyle;


//    public TextWidget(String text , String textAlign){
//        this.text = text;
//        this.textAlign = textAlign;
//    }
    public TextWidget(String text , String textAlign , TextStyle textStyle){
        this.text = text;
        this.textAlign = textAlign;
        this.textStyle = textStyle;
    }

//    public TextWidget(String text , TextStyle textStyle){
//        this.text = text;
//        this.textStyle = textStyle;
//    }

//    public TextWidget(String text){
//        this.text = text;
//    }

    @Override
    public String toString() {
        return "\nText{" +
                "\ntext=" + text +
                ", \ntextAlign='" + textAlign + '\'' +
                ", \ntextStyle=" + textStyle +
                "\n}";
    }
}



