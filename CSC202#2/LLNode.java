//----------------------------------------------------------------------------
// LLNode.java            by Dale/Joyce/Weems                  Chapter 3
//
// Implements <T> nodes for a Linked List.
//----------------------------------------------------------------------------


public class LLNode<T>
{
  private LLNode<T> link, previous;
  private T info;
  public int x, y, hasBeenCounter;
  public boolean startNode;

  public LLNode(T info)
  {
    this.info = info;
    link = null;
  }
  
  public LLNode(T info, int x, int y)
  {
    this.info = info;
    this.x = x;
    this.y = y;
    link = null;
    startNode = false;
  }
 
  public void setInfo(T info)
  // Sets info of this LLNode.
  {
    this.info = info;
  }

  public T getInfo()
  // Returns info of this LLONode.
  {
    return info;
  }
 
  public void setLink(LLNode<T> link)
  // Sets link of this LLNode.
  {
    this.link = link;
  }

  public void setPrevious(LLNode<T> previous) 
  // Sets previous link of this LLNode.
  {
    this.previous = previous;
  }

  public LLNode<T> getLink()
  // Returns link of this LLNode.
  {
    return link;
  }
  public LLNode<T> getPrevious()
  // Returns link of this LLNode.
  {
    return previous;
  }
  public T getPreviousInfo()
  {
    return previous.info;
  }
  public String toString() {
    return "(" + (x - 1) + ", " + (y - 1) +  "); ";
  }
} 
 
 