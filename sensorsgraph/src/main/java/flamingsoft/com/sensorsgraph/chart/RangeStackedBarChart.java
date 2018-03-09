
package flamingsoft.com.sensorsgraph.chart;

public class RangeStackedBarChart extends RangeBarChart {
  /** The chart type. */
  public static final String TYPE = "RangeStackedBar";

  RangeStackedBarChart() {
    super(Type.STACKED);
  }

  public String getChartType() {
    return TYPE;
  }
}