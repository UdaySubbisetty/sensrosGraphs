
package flamingsoft.com.sensorsgraph.chart;

import java.io.Serializable;

/**
 * Holds An PieChart Segment
 */
public class PieSegment implements Serializable {
  private float mStartAngle;

  private float mEndAngle;

  private int mDataIndex;

  private float mValue;

  public PieSegment(int dataIndex, float value, float startAngle, float angle) {
    mStartAngle = startAngle;
    mEndAngle = angle + startAngle;
    mDataIndex = dataIndex;
    mValue = value;
  }

  /**
   * Checks if angle falls in segment.
   * 
   * @param angle
   * @return true if in segment, false otherwise.
   */
  public boolean isInSegment(double angle) {
    if (angle >= mStartAngle && angle <= mEndAngle) {
      return true;
    }
    double cAngle = angle % 360;
    double startAngle = mStartAngle;
    double stopAngle = mEndAngle;
    while (stopAngle > 360) {
      startAngle -= 360;
      stopAngle -= 360;
    }
    return cAngle >= startAngle && cAngle <= stopAngle;
  }

  protected float getStartAngle() {
    return mStartAngle;
  }

  protected float getEndAngle() {
    return mEndAngle;
  }

  protected int getDataIndex() {
    return mDataIndex;
  }

  protected float getValue() {
    return mValue;
  }

  public String toString() {
    return "mDataIndex=" + mDataIndex + ",mValue=" + mValue + ",mStartAngle=" + mStartAngle
        + ",mEndAngle=" + mEndAngle;
  }

}
