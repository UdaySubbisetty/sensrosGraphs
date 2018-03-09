
package flamingsoft.com.sensorsgraph.chart;

import android.content.Context;

import flamingsoft.com.sensorsgraph.chart.model.MultipleCategorySeries;
import flamingsoft.com.sensorsgraph.chart.model.XYMultipleSeriesDataset;
import flamingsoft.com.sensorsgraph.chart.renderer.XYMultipleSeriesRenderer;

/**
 * Utility methods for creating chart views or intents.
 */
public class ChartFactory {
  /** The key for the chart data. */
  public static final String CHART = "chart";

  /** The key for the chart graphical activity title. */
  public static final String TITLE = "title";

  private ChartFactory() {
    // empty
  }

  /**
   * Creates a line chart view.
   * 
   * @param context the context
   * @param dataset the multiple series dataset (cannot be null)
   * @param renderer the multiple series renderer (cannot be null)
   * @return a line chart graphical view
   * @throws IllegalArgumentException if dataset is null or renderer is null or
   *           if the dataset and the renderer don't include the same number of
   *           series
   */
  public static final GraphicalView getLineChartView(Context context,
      XYMultipleSeriesDataset dataset, XYMultipleSeriesRenderer renderer) {
    checkParameters(dataset, renderer);
    XYChart chart = new LineChart(dataset, renderer);
    return new GraphicalView(context, chart);
  }


  private static void checkParameters(XYMultipleSeriesDataset dataset,
      XYMultipleSeriesRenderer renderer) {
    if (dataset == null || renderer == null
        || dataset.getSeriesCount() != renderer.getSeriesRendererCount()) {
      throw new IllegalArgumentException(
          "Dataset and renderer should be not null and should have the same number of series");
    }
  }

  private static boolean checkMultipleSeriesItems(MultipleCategorySeries dataset, int value) {
    int count = dataset.getCategoriesCount();
    boolean equal = true;
    for (int k = 0; k < count && equal; k++) {
      equal = dataset.getValues(k).length == dataset.getTitles(k).length;
    }
    return equal;
  }

}
