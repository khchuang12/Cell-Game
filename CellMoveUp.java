/**
 * This file is a CellMoveUp.java file that stores extends to the parent
 * Cell class. The goal of this is to apply
 * inheritance to defining the relationship among different types of cells.
 * This file is used to help simulate the Conway's Game of Life which is a
 * cellular automaton that is simple to understand but has interesting
 * properties.
*/
import java.util.*;
/**
* In each class there will be two constructors (one taking the three int
* parameters in the order specified here and one being a copy constructor
* for the current class), override the toString() method, and override the
* checkApoptosis() method. It adjusts the method parameter
* types (specifically for the constructors) appropriately for each class.
* this class takes in CellMoveUp objects and uses their attributes to
* describe a situation in the game where the cell moves up
*/
public class CellMoveUp extends Cell {
  /**
   * This is the constructor for the CellMoveUp subclass.
   * it Invokes the parent class's constructor to initialize all instance
   * variables with the values passed in as arguments.
   * @param currRow stores the current row as an integer
   * @param currCol store the current column as an integer
   * @param mass stores the mass of the cell as an integer
   * @return no return statement in constructor
  */
  public CellMoveUp(int currRow, int currCol, int mass){
    super(currRow, currCol, mass);
  }
  /**
   * This is the copy constructor for the CellMoveUp subclass.
   * it can be assumed that the argument is non- null
   * it will Invoke the parent class's copy constructor to initialize all
   * instance variables with the instance variables of
   * the otherCellMoveUp object passed in as an argument.
   * @param otherCellMoveUp CellMoveUp object that is being copied
   * @return no return statement in constructor
  */
  public CellMoveUp(CellMoveUp otherCellMoveUp){
    super(otherCellMoveUp);
  }
  /**
  * the String representation of the current object. Each class will have a
  * different representation, but each representation will be a single
  * character.
  * @return returns "^" as the string representation of CellMoveUp
  */
  public String toString(){
    return "^";
  }
  /**
  * Return true or false based on neighbors depending on the conditions for
  * apoptosis. This method does NOT call apoptosis() . This method is only
  * for checking whether apoptosis() should be called later.
  * Checks for whether this cell does not have 4 neighbors
  * @param notNeighborNum condition of number of neighbors
  * @param neighbors list of neighbors around the cell
  * @return boolean based on neighbors depending on the conditions for
  * apoptosis
  */
  public boolean checkApoptosis(List<Cell> neighbors){
    int notNeighborNum = 4;
    if(neighbors.size()!=notNeighborNum){
      return true;
    }
    return false;
  }
}
