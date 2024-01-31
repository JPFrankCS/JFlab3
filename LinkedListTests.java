import java.util.NoSuchElementException;
import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTests {
    
    
    @Test
    public void testLinkedListLength(){
        LinkedList list = new LinkedList();
        list.append(5);
        list.append(6);
        list.append(8);
        assertEquals(3,list.length());
        assertEquals(5,list.first());
        assertEquals(8,list.last());
    }
    @Test
    public void testLinkedListPrepend(){
        LinkedList list = new LinkedList();
        list.prepend(5);
        list.prepend(6);
        list.prepend(8);
        assertEquals(3,list.length());
        assertEquals(8,list.first());
        assertEquals(5,list.last());
    }
    
}
