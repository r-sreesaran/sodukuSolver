  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sodukusolver;

import static java.lang.reflect.Array.set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author sree
 */
public class SodukuSolver {

    int soduku[][];
    int maximiumRangeSoduku = 0;
    int maximiumRangeGrid = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        SodukuSolver solver = null;
        String option;
        Boolean solve = true;

        printMessage();

        Scanner in = new Scanner(System.in);
        option = in.next();

        if (Character.isDigit(option.charAt(0))) {
            solver = new SodukuSolver(Integer.parseInt(option));

        } else if (option.equalsIgnoreCase("predefined")) {

            solver = new SodukuSolver();

        } else {
            solve = false;
            System.out.println("enter a valid option");
        }
        if (solve) {
            solver.solveSoduku();
        }
        // TODO code application logic here
    }

    public void solveSoduku() {
        if (solveSoduku(soduku, 0, 0)) {
            System.out.println("soduku solved");
            printSoduku();
        } else {
            printSoduku();
        }

    }

    public SodukuSolver() {

        maximiumRangeGrid = 3;
        maximiumRangeSoduku = 3 * 3;
        assignSodukuValues();
    }

    public SodukuSolver(int maximiumRangeGrid) {
        this.maximiumRangeGrid = maximiumRangeGrid;
        maximiumRangeSoduku = maximiumRangeGrid * 3;
        soduku = new int[maximiumRangeSoduku][maximiumRangeSoduku];
        assignSodukuValues(maximiumRangeSoduku);
    }

    private void assignSodukuValues(int maximiumRangeSoduku) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < maximiumRangeSoduku; i++) {
            for (int j = 0; j < maximiumRangeSoduku; j++) {
                soduku[i][j] = in.nextInt();
            }
        }

    }

    private void assignSodukuValues() {
        soduku = new int[][]{
            {0, 0, 0, 0, 0, 0, 6, 8, 0},
            {0, 0, 0, 0, 7, 3, 0, 0, 9},
            {3, 0, 9, 0, 0, 0, 0, 4, 5},
            {4, 9, 0, 0, 0, 0, 0, 0, 0},
            {8, 0, 3, 0, 5, 0, 9, 0, 2},
            {0, 0, 0, 0, 0, 0, 0, 3, 6},
            {9, 6, 0, 0, 0, 0, 3, 0, 8},
            {7, 0, 0, 6, 8, 0, 0, 0, 0},
            {0, 2, 8, 0, 0, 0, 0, 0, 0}};
    }

    /**
     * This the game logic that
     *
     * @param soduku
     * @param row
     * @param column
     * @return
     */
    private Boolean solveSoduku(int soduku[][], int row, int column) {

        if (hasTheSodukuBeensolved(soduku)) {
            return true;
        }
        //Intial condition where the soduku might have unfilled block
        if (soduku[row][column] == 0) {
            List possibleValues = valuesInTheRowAndTheColumn(soduku, row, column);
            for (int i = 0; i < possibleValues.size(); i++) {
                soduku[row][column] = (int) possibleValues.get(i);
                if (column < maximiumRangeSoduku - 1) {
                    if (solveSoduku(soduku, row, column + 1)) {
                        return true;
                    }
                } else {
                    if (solveSoduku(soduku, row + 1, 0)) {
                        return true;
                    }
                }

                soduku[row][column] = 0;
            }
            return false;
        } else {
            if (column < maximiumRangeSoduku - 1) {
                if (solveSoduku(soduku, row, column + 1)) {
                    return true;
                }
            } else {
                if (solveSoduku(soduku, row + 1, 0)) {
                    return true;
                }
            }

        }
        //    System.out.println("row\t" + row + "\t" + "col" + column);
        return false;
    }

    /**
     * check whether the soduku has been solved or not
     *
     * @param soduku
     * @return
     */
    private Boolean hasTheSodukuBeensolved(int soduku[][]) {
        for (int i = 0; i < maximiumRangeSoduku; i++) {
            for (int j = 0; j < maximiumRangeSoduku; j++) {
                if (soduku[i][j] == 0) {
                    return false;
                }
            }

        }
        return true;
    }

    /**
     * This method will filter the numbers that are not present in the current
     * row and current column and the current grid in which number has to be
     * filled in
     *
     * @param soduku
     * @param row
     * @param column
     * @return
     */
    private ArrayList valuesInTheRowAndTheColumn(int soduku[][], int row, int column) {
        Set<Integer> values = new HashSet<Integer>();
        for (int i = 1; i <= maximiumRangeSoduku; i++) {
            values.add(i);
        }

        for (int i = 0; i < maximiumRangeSoduku - 1; i++) {
            values.remove(soduku[row][i]);
            values.remove(soduku[i][column]);
        }
        for (int i = row - (row % maximiumRangeGrid); i < row - (row % maximiumRangeGrid) + maximiumRangeGrid; i++) {
            for (int j = column - (column % maximiumRangeGrid); j < column - (column % maximiumRangeGrid) + maximiumRangeGrid; j++) {
                int temp = soduku[i][j];
                values.remove(soduku[i][j]);
            }
        }
        return new ArrayList(values);
    }

    /**
     * This method would print the soduku
     */
    private void printSoduku() {
        for (int i = 0; i < maximiumRangeSoduku; i++) {
            for (int j = 0; j < maximiumRangeSoduku; j++) {
                System.out.print(soduku[i][j] + "");
            }
            System.out.println("");
        }
    }
    /**
     * prints the intial message
     */
    public static void printMessage() {
        System.out.println("The soduku puzzle Solver");
        System.out.println("--------------------------");
        System.out.println("please select a choice for a particular dimension");
        System.out.println("for 1*1 soduku enter 1 ");
        System.out.println("for 2*2 soduku enter 2 ");
        System.out.println("for 3*3 soduku enter 3 ");
        System.out.println("for n*n soduku enter the range");
        System.out.println("---------------------------");
        System.out.println("---------------------------");
        System.out.println("To use the predined Value for testing press predefined");
        System.out.println("Enter predefined");

    }
}
