
package flamingsoft.com.sensorsgraph.chart;

import android.graphics.RectF;

public class ClickableArea {
  private RectF rect;
  private double x;
  private double y;

  public ClickableArea(RectF rect, double x, double y) {
    super();
    this.rect = rect;
    this.x = x;
    this.y = y;
  }

  public RectF getRect() {
    return rect;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

}
