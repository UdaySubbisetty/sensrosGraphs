
package flamingsoft.com.sensorsgraph.chart;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

/**
 * An activity that encapsulates a graphical view of the chart.
 */
public class GraphicalActivity extends Activity {
  /** The encapsulated graphical view. */
  private GraphicalView mView;
  /** The chart to be drawn. */
  private AbstractChart mChart;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    Bundle extras = getIntent().getExtras();
    mChart = (AbstractChart) extras.getSerializable(ChartFactory.CHART);
    mView = new GraphicalView(this, mChart);
    String title = extras.getString(ChartFactory.TITLE);
    if (title == null) {
      requestWindowFeature(Window.FEATURE_NO_TITLE);
    } else if (title.length() > 0) {
      setTitle(title);
    }
    setContentView(mView);
  }

}