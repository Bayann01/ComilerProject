package program;

public class imageproperty extends imageproperties{
String url;

    public imageproperty(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "imageproperty{" +
                "url='" + url + '\'' +
                '}';
    }
}
