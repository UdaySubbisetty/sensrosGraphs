
package flamingsoft.com.sensorsgraph.chart;

import android.view.MotionEvent;

import flamingsoft.com.sensorsgraph.chart.tools.PanListener;
import flamingsoft.com.sensorsgraph.chart.tools.ZoomListener;

/**
 * The interface to be implemented by the touch handlers.
 */
public interface ITouchHandler {
  /**
   * Handles the touch event.
   * 
   * @param event the touch event
   * @return true if the event was handled
   */
  boolean handleTouch(MotionEvent event);

  /**
   * Adds a new zoom listener.
   * 
   * @param listener zoom listener
   */
  void addZoomListener(ZoomListener listener);

  /**
   * Removes a zoom listener.
   * 
   * @param listener zoom listener
   */
  void removeZoomListener(ZoomListener listener);

  /**
   * Adds a new pan listener.
   * 
   * @param listener pan listener
   */
  void addPanListener(PanListener listener);

  /**
   * Removes a pan listener.
   * 
   * @param listener pan listener
   */
  void removePanListener(PanListener listener);

}