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
    
    //Running Total
    //For each Loop
    int sum = 0;

    //CookieOrder is the primitive we are using
    //.getNumBoxes() is called because it uses an int, which we want,
    //and it accumulates the number of boxes ordered.
    for(CookieOrder co: orders)
      sum += co.getNumBoxes();

    return sum;

    
  }

  /** Removes all cookie orders from the master order that have the same variety of
  * cookie as cookieVar and returns the total number of boxes that were remove.
  * @param cookieVar  the variety of cookies to remove from the master order
  * @return  the total number of boxes of cookieVar in the cookie orders removed
  */
  public int removeVariety(String cookieVar)
  {
    /* Part B answer goes here */

    //We are removing, so position matters. No For Each Loop!
    int boxes = 0;

    //Removing, going backwards from the last position to the front.
    for(int i = orders.size()-1; i >= 0; i--)
        //Within the ArrayList (orders), at position i (.get(i))
        //If that position is the same as the parameter cookieVar (.euals(cookieVar))
        //Then remove the object within the ArrayList called, CookieOrder (.remove(CookieOrder)).
        if(orders.get(i).equals(cookieVar).remove(CookieOrder))
          boxes++;
      
    return boxes;
  }

  //There may be instance variables, constructors, and methods that are not shown.
}
