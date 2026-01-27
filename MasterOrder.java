public class MasterOrder{

  /** The list of all cookie order */
  public List<CookieOrder> orders;

  /** Constructs a new MasterOrder object */
  public MasterOrder()
  { orders = new ArrayList<CookieOrder>(); }

  /** Adds theOrder to the master order
  * @param theOrder  the cookie order to add to the master order
  */
  public void addOrder(CookieOrder theOrder)
  { orders.add(theOrder); }

  /** @return the sum of the number of boxes of all the cookie orders */
  public int getTotalBoxes()
  {
    /* Part A answer goes here */
    
  }

  /** Removes all cookie orders from the master order that have the same variety of
  * cookie as cookieVar and returns the total number of boxes that were remove.
  * @param cookieVar  the variety of cookies to remove from the master order
  * @return  the total number of boxes of cookieVar in the cookie orders removed
  */
  public int removeVariety(String cookieVar)
  {
    /* Part B answer goes here */
    
  }

  //There may be instance variables, constructors, and methods that are not shown.
}
