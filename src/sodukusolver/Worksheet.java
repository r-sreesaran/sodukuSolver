/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sodukusolver;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author sree
 */
public class Worksheet {
    
//    if(soduku[row][column] != 0) {
//        if (column  < n) {
//                if (solveSoduku(soduku, row, column + 1)) {
//                    return true;
//                }
//            } else {
//                if (solveSoduku(soduku, row + 1, 0)) {
//                    return true;
//                }
//            }
//        }
//        else {
//        
//        for (int number = 1; number < n; number++) {
//             Boolean value = noConflicts(row, column, soduku, number);
//            if (noConflicts(row, column, soduku, number)) {
//                soduku[row][column] = number;
//            }
//        }
//            if (column  < n) {
//                if (solveSoduku(soduku, row, column + 1)) {
//                    return true;
//                }
//            } else if (column  > n ) {
//                if (solveSoduku(soduku, row + 1, 0)) {
//                    return true;
//                }
//            } else {
//                if (hasTheSodukuBeensolved(soduku)) {
//
//                    System.out.println("solved");
//                }
//            }
//            soduku[row][column] = 0;
//        
//        }
//        return false;
    
    
    
    
//    private Boolean noConflicts(int row, int column, int soduku[][], int number) {
//        for (int i = 0; i < n; i++) {
//            if (soduku[row][i] == number) {
//                return false;
//            }
//        }
//        for (int j = 0; j < n; j++) {
//            if (soduku[j][column] == number) {
//                return false;
//            }
//        }
//        for (int i = row - (row % n / 3); i < row - (row % n / 3) + n / 3; i++) {
//            for (int j = column - (column % n / 3); j < column - (column % n / 3) + n / 3; j++) {
//                if (soduku[i][j] != number) {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
    
//    1	7	2	5	4	9	6	8	3
//	6	4	5	8	7	3	2	1	9
//	3	8	9	2	6	1	7	4	5
//	4	9	6	3	2	7	8	5	1
//	8	1	3	4	5	6	9	7	2
//	2	5	7	1	9	8	4	3	6
//	9	6	4	7	1	5	3	2	8
//	7	3	1	6	8	2	5	9	4
//	5	2	8	9	3	4	1	6	7

    
    
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package sodukusolver;
//
//import static java.lang.reflect.Array.set;
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Scanner;
//import java.util.Set;
//
///**
// *
// * @author sree
// */
//public class SodukuSolver {
//
//    int soduku[][];
//    int maximiumRangeSoduku = 0;
//    int maximiumRangeGrid = 0;
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//
//        SodukuSolver solver = null;
//        String option;
//
//        System.out.println("The soduku puzzle Solver");
//        System.out.println("--------------------------");
//        System.out.println("please select a choice for a particular dimension");
//        System.out.println("for 1*1 soduku enter 1 ");
//        System.out.println("for 2*2 soduku enter 2 ");
//        System.out.println("for 3*3 soduku enter 3 ");
//        System.out.println("for n*n soduku enter the range");
//        System.out.println("---------------------------");
//        System.out.println("---------------------------");
//        System.out.println("To use the predined Value for testing press predefined");
//        System.out.println("Enter predefined");
//
//        Scanner in = new Scanner(System.in);
//        option = in.next();
//
//        if (Character.isDigit(option.charAt(0))) {
//            solver = new SodukuSolver(Integer.parseInt(option));
//
//        } else if (option.equalsIgnoreCase("predefined")) {
//
//            solver = new SodukuSolver();
//
//        }
//
//        solver.gameProcedure();
//        // TODO code application logic here
//    }
//
//    public void gameProcedure() {
//        if (solveSoduku(soduku, 0, 0)) {
//            System.out.println("soduku solved");
//            printSoduku();
//        } else {
//            printSoduku();
//        }
//
//    }
//
//    public SodukuSolver() {
//
//        maximiumRangeGrid = 3;
//        maximiumRangeSoduku = 3 * 3;
//        assignSodukuValues();
//    }
//
//    public SodukuSolver(int maximiumRangeGrid) {
//        this.maximiumRangeGrid = maximiumRangeGrid;
//        maximiumRangeSoduku = maximiumRangeGrid * 3;
//        soduku = new int[maximiumRangeSoduku][maximiumRangeSoduku];
//        assignSodukuValues(maximiumRangeSoduku);
//    }
//
//    private void assignSodukuValues(int maximiumRangeSoduku) {
//        Scanner in = new Scanner(System.in);
//        for (int i = 0; i < maximiumRangeSoduku; i++) {
//            for (int j = 0; j < maximiumRangeSoduku; j++) {
//                soduku[i][j] = in.nextInt();
//            }
//        }
//
//    }
//
//    private void assignSodukuValues() {
//        soduku = new int[][]{
//            {0, 0, 0, 0, 0, 0, 6, 8, 0},
//            {0, 0, 0, 0, 7, 3, 0, 0, 9},
//            {3, 0, 9, 0, 0, 0, 0, 4, 5},
//            {4, 9, 0, 0, 0, 0, 0, 0, 0},
//            {8, 0, 3, 0, 5, 0, 9, 0, 2},
//            {0, 0, 0, 0, 0, 0, 0, 3, 6},
//            {9, 6, 0, 0, 0, 0, 3, 0, 8},
//            {7, 0, 0, 6, 8, 0, 0, 0, 0},
//            {0, 2, 8, 0, 0, 0, 0, 0, 0}};
//    }
//
//    /**
//     *
//     * @param soduku
//     * @param row
//     * @param column
//     * @return
//     */
//    private Boolean solveSoduku(int soduku[][], int row, int column) {
//
//        if (hasTheSodukuBeensolved(soduku)) {
//            return true;
//        }
//        //Intial condition where the soduku might have unfilled block
//        if (soduku[row][column] == 0) {
//            List possibleValues = valuesInTheRowAndTheColumn(soduku, row, column);
//            for (int i = 0; i < possibleValues.size(); i++) {
//                if (noConflicts(row, column, soduku, (int) possibleValues.get(i))) {
//                    soduku[row][column] = (int) possibleValues.get(i);
//                    navigate(row, column);
//                }
//                soduku[row][column] = 0;
//            }
//            return false;
//        } else {
//            navigate(row, column);
//        }
//        System.out.println("row\t"+row+"\t"+"col"+column);
//        return false;
//    }
//
//    /**
//     *
//     * @param soduku
//     * @return
//     */
//    private Boolean hasTheSodukuBeensolved(int soduku[][]) {
//        for (int i = 0; i < maximiumRangeSoduku; i++) {
//            for (int j = 0; j < maximiumRangeSoduku; j++) {
//                if (soduku[i][j] == 0) {
//                    return false;
//                }
//            }
//
//        }
//        return true;
//    }
//
//    /**
//     * This method will filter the numbers that are not present in the current
//     * row and current column and the current grid in which number has to be
//     * filled in
//     *
//     * @param soduku
//     * @param row
//     * @param column
//     * @return
//     */
//    private ArrayList valuesInTheRowAndTheColumn(int soduku[][], int row, int column) {
//        Set<Integer> values = new HashSet<Integer>();
//        for (int i = 1; i <= maximiumRangeSoduku; i++) {
//            values.add(i);
//        }
//
//        for (int i = 0; i < maximiumRangeSoduku-1; i++) {
//            values.remove(soduku[row][i]);
//            values.remove(soduku[i][column]);
//        }
//        for (int i = row - (row % maximiumRangeGrid); i < row - (row % maximiumRangeGrid) + maximiumRangeGrid; i++) {
//            for (int j = column - (column % maximiumRangeGrid); j < column - (column % maximiumRangeGrid) + maximiumRangeGrid; j++) {
//                int temp = soduku[i][j];
//                values.remove(soduku[i][j]);
//            }
//        }
//        return new ArrayList(values);
//    }
//
//    /**
//     * This method would print the soduku
//     */
//    private void printSoduku() {
//        for (int i = 0; i < maximiumRangeSoduku; i++) {
//            for (int j = 0; j < maximiumRangeSoduku; j++) {
//                System.out.print(soduku[i][j] + "");
//            }
//            System.out.println("");
//        }
//    }
//
//    /**
//     *
//     * @param row
//     * @param column
//     * @param soduku
//     * @param number
//     * @return
//     */
//    private Boolean noConflicts(int row, int column, int soduku[][], int currentPositionValue) {
//
//        for (int i = 0; i < maximiumRangeSoduku; i++) {
//            if (soduku[row][i] == currentPositionValue) {
//                return false;
//            }
//        }
//        for (int j = 0; j < maximiumRangeSoduku; j++) {
//            if (soduku[j][column] == currentPositionValue) {
//                return false;
//            }
//        }
//
//        for (int i = row - (row % maximiumRangeGrid); i < row - (row % maximiumRangeGrid) + maximiumRangeGrid; i++) {
//            for (int j = column - (column % maximiumRangeGrid); j < column - (column % maximiumRangeGrid) + maximiumRangeGrid; j++) {
//                if (soduku[i][j] == currentPositionValue) {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
//
//    /**
//     *
//     * @param row
//     * @param column
//     * @return
//     */
//    private Boolean navigate(int row, int column) {
//        if (column < maximiumRangeSoduku - 1) {
//            if (solveSoduku(soduku, row, column + 1)) {
//                return true;
//            }
//        } else {
//            if (solveSoduku(soduku, row + 1, 0)) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//}
//	 	 	 	 	 	 

    
    
    
    
    
    
    
    
    
    
    
//    /*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package sodukusolver;
//
//import static java.lang.reflect.Array.set;
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Scanner;
//import java.util.Set;

/**
 *
 * @author sree
 */
//public class SodukuSolver {
//
//    int soduku[][];
//            int n;
//    int s;
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        System.out.println("The soduku puzzle Solver");
//        System.out.println("please select a choice for a particular dimension");
//        System.out.println("for 1*1 soduku enter 1 ");
//        System.out.println("for 2*2 soduku enter 2 ");
//        System.out.println("for 3*3 soduku enter 3 ");
//        System.out.println("for n*n soduku enter the range");
//        Scanner in = new Scanner(System.in);
//        int number = 3*3;
//        SodukuSolver solver = new SodukuSolver(number, number);
//        solver.s=number/3;
//        solver.n=9;
//        //solver.assignSoduku(number, number, solver.soduku);
//       
////        solver.soduku = new int[][]{
////        { 1, 0, 3, 4, 0, 0, 7, 0, 9},
////        {0 ,5, 6, 0, 8, 9, 0, 2, 3},
////        {0, 8, 9, 1, 0, 3, 4, 0, 6},
////        {2, 1, 4, 0, 6, 5, 0, 9, 7,},
////        {3, 0, 0, 8, 0, 7, 0, 1, 4},
////        {8, 0, 7, 0, 1, 4, 0, 6, 5},
////        {0, 3, 1, 0, 4, 0, 9, 7, 8},
////        {6, 4, 0, 9, 7, 0, 5, 3, 1},
////        {0, 7, 8, 0, 0, 1, 0, 4, 2}};
//    
//
//        solver.soduku = new int[][]{{0, 0, 0, 0, 0,0, 6, 8, 0},
//        {0, 0, 0, 0, 7, 3, 0, 0, 9},
//        {3, 0, 9, 0, 0, 0, 0, 4, 5},
//        {4, 9, 0, 0, 0, 0, 0, 0, 0},
//        {8, 0, 3, 0, 5, 0, 9, 0, 2},
//        {0, 0, 0, 0, 0, 0, 0, 3, 6},
//        {9,6,0,0,0,0,3,0,8},
//        {7,0,0,6,8,0,0,0,0},
//        {0,2,8,0,0,0,0,0,0}};
////      
//        if (solver.solveSoduku(solver.soduku, 0, 0)) {
//            System.out.println("solved");
//            solver.printSoduku();
//        } 
//        else {
//            solver.printSoduku();
//        
//        }
//
//        // TODO code application logic here
//    }
//
//    public void gameProcedure() {
//        assignSoduku(n, n, soduku);
//        if (solveSoduku(soduku, n, n)) {
//            System.out.println("soduku solved");
//
//        }
//    }
//
//    public SodukuSolver(int row, int column) {
//        intializeSoduku(row, column);
//    }
//
//    private void intializeSoduku(int row, int column) {
//        soduku = new int[row][column];
//        n = row;
//    }
//
//    private void assignSoduku(int row, int column, int soduku[][]) {
//        Scanner in = new Scanner(System.in);
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < column; j++) {
//                soduku[i][j] = in.nextInt();
//            }
//        }
//    }
//
//    /**
//     * 
//     * @param soduku
//     * @param row
//     * @param column
//     * @return 
//     */
//    private Boolean solveSoduku(int soduku[][], int row, int column) {
//
//        if (hasTheSodukuBeensolved(soduku)) {
//            return true;
//        }
//        if(row>9 || column >9) return false;
//       //Intial condition where the soduku might have unfilled block
//        if(soduku[row][column]==0){
//         List possibleValues =  valuesInTheRowAndTheColumn(soduku,row,column);
//         for(int i =0 ; i< possibleValues.size();i++) {
//              if(noConflicts(row, column, soduku, (int)possibleValues.get(i))){
//             soduku[row][column] = (int)possibleValues.get(i);
//             
//             
//             if (column  < n-1) {
//                if (solveSoduku(soduku, row, column + 1)) {
//                    return true;
//                }
//            } else   {
//                if (solveSoduku(soduku, row + 1, 0)) {
//                    return true;
//                }
//            }
//         }
//              soduku[row][column]=0;
//         }
//         return false;
//        }
//        else
//        {
//        if (column  < n-1) {
//                if (solveSoduku(soduku, row, column + 1)) {
//                    return true;
//                }
//            } else   {
//                if (solveSoduku(soduku, row + 1, 0)) {
//                    return true;
//                }
//        }
//        } 
//        return false; 
//    }
//    /**
//     * 
//     * @param soduku
//     * @return 
//     */
//    private Boolean hasTheSodukuBeensolved(int soduku[][]) {
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (soduku[i][j] == 0) {
//                    return false;
//                }
//            }
//
//        }
//        return true;
//    }
//
//    
////    public void navigate(int row ,int column) {
////     if(column<n-1)
////        solveSudoku(row,column+1);
////    else
////       solveSudoku(row+1,0);
////    }
//    
//    
//    /**
//     * This method will filter the numbers that are not present
//     * in the current row and current column and the current grid 
//     * in which number has to be filled in 
//     * 
//     * @param soduku 
//     * @param row
//     * @param column
//     * @return 
//     */
//    private ArrayList valuesInTheRowAndTheColumn(int soduku[][],int row,int column) {
//       Set<Integer> values = new HashSet<Integer>();
//        for(int i=1;i<=n;i++) {
//         values.add(i);
//         }
//    
//       for(int i =0 ;i<n;i++) {
//          values.remove(soduku[row][i]);
//          values.remove(soduku[i][column]);
//       }
//       for (int i = row - (row %s); i < row - (row % s) + s; i++) {
//            for (int j = column - (column % s); j < column - (column % s) + s; j++) {
//            int temp = soduku[i][j];
//                values.remove(soduku[i][j]) ;   
//            }
//        }
//       return new ArrayList(values);
//    }
//    
//    
//    
//    /**
//     * 
//     */
//    private void printSoduku() {
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(soduku[i][j]);
//            }
//            System.out.println("\n");
//        }
//    }
//    
//    /**
//     * 
//     * @param row
//     * @param column
//     * @param soduku
//     * @param number
//     * @return 
//     */
//    private Boolean noConflicts(int row, int column, int soduku[][], int number) {
//        for (int i = 0; i < n; i++) {
//            if (soduku[row][i] == number) {
//                return false;
//            }
//        }
//        for (int j = 0; j < n; j++) {
//            if (soduku[j][column] == number) {
//                return false;
//            }
//        }
//        for (int i = row - (row % s); i < row - (row % s) + s; i++) {
//            for (int j = column - (column % s); j < column - (column % s) + s; j++) {
//                if (soduku[i][j] == number) {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
//}

}
