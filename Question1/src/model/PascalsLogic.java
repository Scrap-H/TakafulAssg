package model;

import java.util.ArrayList;
import java.util.List;

public class PascalsLogic {

    public List<List<Integer>> generate(int inRow) {

        List<List<Integer>> triangle = new ArrayList<>();

        for (int row = 0; row < inRow; row++) {

            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);

            for (int col = 1; col < row; col++) {

                currentRow.add(triangle.get(row - 1).get(col - 1) + triangle.get(row - 1).get(col));

            }

            if (row > 0) {
                currentRow.add(1);
            }

            triangle.add(currentRow);

        }

        return triangle;

    }

}
