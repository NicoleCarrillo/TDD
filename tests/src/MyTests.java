import org.junit.Test;

import java.rmi.UnexpectedException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MyTests {

    // Unit testing to get the size of the list 1
    @Test
    public void getSizeOfList1() {
        // Init
        System.out.println("A1) SIZE -> BEGIN TEST, CREATING LIST, ADDING 2 ELEMENTS");
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        // test
        System.out.println("SHOULD BE 2");
        assertEquals(2, list.size());
    }

    // Unit testing to get the size of the list 2
    @Test
    public void getSizeOfList2() {
        // Init
        System.out.println("A2) SIZE -> BEGIN TEST, CREATING LIST");
        List<Integer> list = new ArrayList<>();

        // test
        System.out.println("SHOULD BE 0");
        assertEquals(0, list.size());
    }

    // Unit testing to get the size of the list 3
    @Test
    public void getSizeOfList3() {
        // Init
        System.out.println("A3) SIZE -> BEGIN TEST, CREATING LIST, ADDING 10 ELEMENTS");
        List<Integer> list = new ArrayList<>();
        for(int x = 0;x <= 10;x++){
            list.add(x);
        }

        System.out.println("ERASING ELEMENT");
        list.remove(0);

        // test
        System.out.println("SHOULD BE 10");
        assertEquals(10, list.size());
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////

    // Unit testing to clear the list 1
    @Test
    public void clearList1() {
        // Init
        System.out.println("B1) CLEAR -> BEGIN TEST, CREATING LIST");
        List<Integer> list = new ArrayList<>();

        System.out.println("APPLYING CLEAR FUNCTION");
        list.clear();

        // test
        System.out.println("SHOULD BE TRUE");
        assertTrue(list.isEmpty());
    }

    // Unit testing to clear the list 2
    @Test
    public void clearList2() {
        // Init
        System.out.println("B2) CLEAR -> BEGIN TEST, CREATING LIST, ADDING 2 ELEMENTS");
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        System.out.println("APPLYING CLEAR FUNCTION");
        list.clear();

        // test
        System.out.println("SHOULD BE TRUE");
        assertTrue(list.isEmpty());
    }

    // Unit testing to clear the list 3
    @Test
    public void clearList3() {
        // Init
        System.out.println("B3) CLEAR -> BEGIN TEST, CREATING LIST, ADDING 100 ELEMENTS");
        List<Integer> list = new ArrayList<>();
        for(int x = 0;x <= 100; x++){
            list.add(x);
        }

        System.out.println("APPLYING CLEAR FUNCTION");
        list.clear();

        // test
        System.out.println("SHOULD BE TRUE");
        assertTrue(list.isEmpty());
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////

    // Unit testing to add items to list 1
    @Test(expected = NullPointerException.class)
    public void addItemsToList1(){
        // Init
        System.out.println("C1) ADD -> BEGIN TEST, CREATING NULL LIST, ADDING 1 ELEMENT");
        List<Integer> list = null;

        // test
        System.out.println("SHOULD BE NULL POINTER EXCEPTION");
        list.add(1);
    }

    // Unit testing to add items to list 2
    @Test
    public void addItemsToList2(){
        // Init
        System.out.println("C2) ADD -> BEGIN TEST, CREATING LIST, ADDING 10 ELEMENT");
        List<Integer> list = new ArrayList<>();

        for(int x = 0; x< 10; x++){
            list.add(x);
        }
        // test
        System.out.println("SHOULD BE TRUE");
        assertEquals("[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]",list.toString());
    }

    // Unit testing to add items to list 3
    @Test
    public void addItemsToList3(){
        // Init
        System.out.println("C3) ADD -> BEGIN TEST, CREATING LIST, ADDING 3 ELEMENT, REMOVING 2");
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        list.remove(0);
        list.remove(0);
        // test
        System.out.println("SHOULD BE TRUE");
        assertEquals("[3]",list.toString());
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////

    // Unit testing to contain items to list 1
    @Test
    public void containsItemList1() {
        // Init
        System.out.println("D1) CONTAINS -> BEGIN TEST, CREATING LIST, ADDING 1 ELEMENT");
        List<Integer> list = new ArrayList<>();
        list.add(1);

        // test
        System.out.println("SHOULD BE TRUE");
        assertTrue(list.contains(1));
    }

    // Unit testing to contain items to list 2
    @Test
    public void containsItemList2() {
        // Init
        System.out.println("D2) CONTAINS -> BEGIN TEST, CREATING LIST, ADDING 1 ELEMENT, REMOVING");
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.remove(0);

        // test
        System.out.println("SHOULD BE FALSE");
        assertFalse(list.contains(1));
    }

    // Unit testing to contain items to list 3
    @Test
    public void containsItemList3() {
        // Init
        System.out.println("D3) CONTAINS -> BEGIN TEST, CREATING LIST NULL");
        List<Integer> list = null;

        // test
        System.out.println("SHOULD BE TRUE");
        assertTrue(list == null);

        list = new ArrayList<>();
        list.add(0);
        list.add(0);

        System.out.println("SHOULD BE TRUE");
        assertTrue(list.contains(0));
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////

    // Unit testing to get items to list 1
    @Test
    public void getItemsList1() {
        // Init
        System.out.println("E1) GET -> BEGIN TEST, CREATING LIST, ADDING 1 ELEMENT");
        List<Integer> list = new ArrayList<>();
        list.add(1);

        // test
        System.out.println("SHOULD BE 1");
        assertEquals(1, list.get(0));
    }

    // Unit testing to get items to list 2
    @Test
    public void getItemsList2() {
        // Init
        System.out.println("E2) GET -> BEGIN TEST, CREATING LIST, ADDING 2 ELEMENT, REMOVING 1 ELEMENT");
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.remove(0);

        // test
        System.out.println("SHOULD BE 2");
        assertEquals(2, list.get(0));
    }

    // Unit testing to add items to list 3
    @Test
    public void getItemsList3() {
        // Init
        System.out.println("E3) GET -> BEGIN TEST, CREATING LIST, ADDING 10 ELEMENT");
        List<Integer> list = new ArrayList<>();
        for(int x = 0; x <= 10; x++){
            list.add(x);
        }

        // test
        System.out.println("SHOULD BE TRUE");
        assertEquals(1, list.get(1));
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////

    // Unit testing to search index of items to list 1
    @Test(expected = NullPointerException.class)
    public void getIndexList1() {
        // Init
        System.out.println("F1) SEARCH -> BEGIN TEST, CREATING LIST, GET INDEX");
        List<Integer> list = null;

        // test
        System.out.println("SHOULD BE NULL POINTER EXCEPTION");
        list.indexOf("0");
    }

    // Unit testing to search index of items to list 2
    @Test
    public void getIndexList2() {
        // Init
        System.out.println("F2) SEARCH -> BEGIN TEST, CREATING LIST, ADDING 3, GET INDEX OF SECOND ELEMENT");
        List<Integer> list =  new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        // test
        System.out.println("SHOULD BE TRUE");
        assertEquals(1, list.indexOf(2));
    }

    // Unit testing to search index of items to list 3
    @Test
    public void getIndexList3() {
        // Init
        System.out.println("F3) SEARCH -> BEGIN TEST, CREATING EMPTY LIST");
        List<Integer> list =  new ArrayList<>();

        // test
        System.out.println("SHOULD BE TRUE");
        assertEquals(-1, list.indexOf(1));
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////

    // Unit testing to remove an item by index to list 1
    @Test(expected = IndexOutOfBoundsException.class)
    public void removeByIndexList1() {
        // Init
        System.out.println("G1) REMOVE -> BEGIN TEST, CREATING EMPTY LIST");
        List<Integer> list =  new ArrayList<>();

        // test
        System.out.println("SHOULD BE INDEX OUT OF BOUNDS EXCEPTION");
        list.remove(0);
    }

    // Unit testing to remove an item by index to list 2
    @Test
    public void removeByIndexList2() {
        // Init
        System.out.println("G2) REMOVE -> BEGIN TEST, CREATING LIST, ADD ELEMENTS AND REMOVE THEM");
        List<Integer> list =  new ArrayList<>();
        list.add(1);
        list.add(2);

        // test
        list.remove(1);
        System.out.println("SHOULD BE FALSE");
        assertFalse(list.contains(2));
    }

    // Unit testing to remove an item by index to list 3
    @Test
    public void removeByIndexList3() {
        // Init
        System.out.println("G3) REMOVE -> BEGIN TEST, CREATING LIST, ADD ELEMENTS AND REMOVE THEM");
        List<Integer> list =  new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // test
        list.remove(0);
        list.remove(0);
        list.remove(0);

        System.out.println("SHOULD BE TURE");
        assertEquals(0,list.size());
    }
}