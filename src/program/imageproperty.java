package program;

public class imageproperty extends imageproperties{
public String url;

    public imageproperty(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "imageproperty{" +
                "url= " + url +
                '}';
    }
}
