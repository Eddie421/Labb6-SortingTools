package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SortingToolTest {
    @Test
    public void sortAscending(){
        List <String> list = creatTestList();
        SortingTool.sortAscending(list);
        assertEquals("a", list.get(0));
        assertEquals("e", list.get(1));
        assertEquals("g", list.get(2));
        assertEquals("i", list.get(3));
        assertEquals("s", list.get(4));

    }
    @Test
    public void sortDescending(){
        List <String> list = creatTestList();
        SortingTool.sortDescending(list);
        assertEquals("s", list.get(0));
        assertEquals("i", list.get(1));
        assertEquals("g", list.get(2));
        assertEquals("e", list.get(3));
        assertEquals("a", list.get(4));
    }
    private List<String> creatTestList(){
        List<String> list = new ArrayList<>();
        list.add("i");
        list.add("a");
        list.add("g");
        list.add("e");
        list.add("s");

        return list;
    }
}
