import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapCustomerId {

    public static void main(String[] arg){
        String[][] data = {
                {"c1", "order1", "item1,item2,item3"},
                {"c2", "order1", "item1,item2"},
                {"c1", "order2", "item1,item2"},
                {"c3", "order1", "item1,item3"},
                {"c1", "order3", "item4"}
        };

        Map<String, Set<String>> customerIdMap = new HashMap<>();

        for(String[] row : data){

        }

    }
}
