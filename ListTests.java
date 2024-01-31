import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ListTests {
    @Test
    public void mergeEqual(){
        List<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        List<String> list2 = new ArrayList<>();
        list2.add("a");
        list2.add("b");
        list2.add("c");
        
        assertEquals(new ArrayList<String>(Arrays.asList("a","a","b","b","c","c")),ListExamples.merge(list1,list2));
    }
    @Test
    public void mergeEquals(){
        List<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        List<String> list2 = new ArrayList<>();
        list2.add("a");
        list2.add("b");
        list2.add("c");
        
        assertEquals(new ArrayList<String>(Arrays.asList("a","a","b","b","c","c")),ListExamples.merge(list1,list2));
    }
    @Test
    public void mergeOpposite(){
        List<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        List<String> list2 = new ArrayList<>();
        list2.add("x");
        list2.add("y");
        list2.add("z");
        
        assertEquals(new ArrayList<String>(Arrays.asList("a","b","c","x","y","z")),ListExamples.merge(list1,list2));
    }
}
