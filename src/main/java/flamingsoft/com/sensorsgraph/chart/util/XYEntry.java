
package flamingsoft.com.sensorsgraph.chart.util;

import java.util.Map.Entry;

/**
 * A map entry value encapsulating an XY point.
 */
public class XYEntry<K, V> implements Entry<K, V> {
  private final K key;
  
  private V value;

  public XYEntry(K key, V value) {
    this.key = key;
    this.value = value;
  }

  public K getKey() {
    return key;
  }

  public V getValue() {
    return value;
  }

  public V setValue(V object) {
    this.value = object;
    return this.value;
  }
}