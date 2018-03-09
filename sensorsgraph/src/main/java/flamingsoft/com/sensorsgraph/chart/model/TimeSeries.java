
package flamingsoft.com.sensorsgraph.chart.model;

import java.util.Date;

/**
 * A series for the date / time charts.
 */
public class TimeSeries extends XYSeries {

  /**
   * Builds a new date / time series.
   * 
   * @param title the series title
   */
  public TimeSeries(String title) {
    super(title);
  }

  /**
   * Adds a new value to the series.
   * 
   * @param x the date / time value for the X axis
   * @param y the value for the Y axis
   */
  public synchronized void add(Date x, double y) {
    super.add(x.getTime(), y);
  }
  
  protected double getPadding() {
    return 1;
  }
}
