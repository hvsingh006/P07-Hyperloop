/**
 * This class models a LoopStation, which manages three tracks:
 * 
 * waitingFirst - newly created first-class Pods are added here, ordered from most  
 * recently-created to least recently-created
 * 
 * waitingEconomy - newly created economy-class Pods are added here, ordered from least 
 * recently-created to most recently-created
 * 
 * launched - both first- and economy-class Pods which have been launched into the Hyperloop
 * 
 * Launching a Pod is done in order of creation, with first-class Pods launching before 
 * economy-class Pods.
 */
public class LoopStation {
  /**
   * A track containing all launched Pods.
   */
  protected Track launched;
  
  /**
   * A track containing all newly-created, unlaunched economy-class Pods.
   */
  protected Track waitingEconomy;
  
  /**
   * A track containing all newly-created, unlaunched first-class Pods.
   */
  protected Track waitingFirst;
  
  /**
   * Creates a new LoopStation with empty tracks
   */
  public LoopStation() {
    
  }
  
  /**
   * Creates a new Pod of the appropriate class and loads it onto the correct waiting track. This 
   * method also returns a reference to this newly-created Pod so that passengers may board
   * 
   * @param capacity the capacity of the new Pod to create
   * @param isFirstClass whether the new Pod is a first class Pod
   * @return a reference to the newly-created Pod
   */
  public Pod createPod(int capacity, boolean isFirstClass) {
    
  }
  
  /**
   * Launches the highest-priority, least-recently-created Pod that is currently waiting:
   * 
   * FIRST class Pods are launched first
   * Then ECONOMY class Pods are launched
   * 
   * Remember that new FIRST class Pods are added to the beginning of the FIRST class, 
   * while new ECONOMY class Pods are added to the end. The least-recently created Pod of the 
   * correct class should always be launched first.
   * 
   * If a Pod to be launched is nonfunctional, it should still be removed from its waiting Track.
   * 
   * @throws NoSuchElementException if no Pods are waiting to launch
   */
  public void launchPod() {
    
  }
  
  /**
   * Finds and removes any malfunctioning Pods from the launched track
   * 
   * @return the total number of pods which were removed
   */
  public int clearMalfunctioning() {
    
  }
  
  /**
   * Reports the total number of first and economy class Pods which are waiting to be launched
   * 
   * @return the total number of Pods on the launched track
   */
  public int getNumWaiting() {
    
  }
  
  /**
   * Reports the total number of Pods, functional or non-functional, which are currently running on 
   * the launched track
   * 
   * @return the total number of Pods on the launched track
   */
  public int getNumLaunched() {
    
  }
  
  /**
   * Reports the total number of passengers in functional Pods across all tracks, waiting and 
   * launched
   * 
   * @return the total number of passengers in functional Pods currently being served by this 
   * LoopStation
   */
  public int getNumPassengers() {
    
  }
}
