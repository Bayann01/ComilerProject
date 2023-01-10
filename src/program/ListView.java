package program;

import java.util.ArrayList;

public class ListView extends widget{
    ListViewProperties listViewProperties ;

    public ListView(ListViewProperties listProperties) {
        listViewProperties =listProperties;
    }

    public ListView() {
    }

    @Override
    public String toString() {
        return "\nListView{" +
                "\nlistViewProperties=" + listViewProperties +
                "\n}";
    }
}
