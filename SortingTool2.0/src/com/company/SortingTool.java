package com.company;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * This tool sorts string lists by natural order or reverse order
 */
public class SortingTool {

    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(-1);
        }

        List<String> rows = new ArrayList<>();
        while (scanner.hasNextLine()) {
            rows.add(scanner.nextLine());
        }

        JFrame frame = new JFrame();
        var options = new Object[]{
                "ascending",
                "descending"
        };

        int n = JOptionPane.showOptionDialog(frame,
                "How do you want to sort the list?",
                "sorting",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[1]
        );
        if (n == 0) {
            sortAscending(rows);
        } else {
            sortDescending(rows);
        }
        printList(rows);
        scanner.close();
    }

    /**
     * This method sorts a list by natural orders
     *
     * @param list the list to sort
     */
    public static void sortAscending(List<String> list) {
        list.sort(Comparator.naturalOrder());
    }

    /**
     * This method sorts a list by reverse orders
     *
     * @param list the list to sort
     */
    public static void sortDescending(List<String> list) {
        list.sort(Comparator.reverseOrder());

    }

    private static void printList(List<String> list) {
        for (String row : list) {
            System.out.println(row);
        }
    }
}

