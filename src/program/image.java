package program;

import java.util.ArrayList;
import java.util.List;

public class image extends widget{
    List<imageproperties>ip;

    public image() {
        ip=new ArrayList<>();
    }
public void  addimageproperty(imageproperties i){
        ip.add(i);
}

    @Override
    public String toString() {
        return "image{" +
                "imageprpoperty=" + ip +
                '}';
    }
}
