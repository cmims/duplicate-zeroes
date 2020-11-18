package com.slethron.duplicateZeroes;

import java.util.ArrayList;
import java.util.List;

public class DuplicateZeroes {
    public List<Integer> duplicateZeroes(List<Integer> items) {
        List<Integer> withDuplicates = new ArrayList<>();
        for (Integer item : items) {
            if (item != 0) {
                withDuplicates.add(item);
            } else {
                withDuplicates.add(item);
                withDuplicates.add(0);
            }
        }

        return withDuplicates;
    }

    public List<Integer> duplicateZeroesInPlace(List<Integer> items) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i) == 0) {
                for (int j = items.size() - 1; j > i; j--) {
                    items.set(j, items.get(j - 1));
                }
                i++;
            }
        }

        return items;
    }
}
