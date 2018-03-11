# Chart and Graph Library for Android

## What is GraphView

GraphView is a library for Android to programmatically create
flexible and nice-looking diagrams.
It is **easy** to understand, to integrate and to customize.




<img src="https://github.com/sUdayBhaksar/sensrosGraphs/blob/master/sample%202.jpeg" alt="screenshot" title="screenshot" width="270" height="486" />
<img src="https://github.com/sUdayBhaksar/sensrosGraphs/blob/master/sample%201.jpeg" alt="screenshot" title="screenshot" width="270" height="486" />  



Gradle:

```groovy

allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

```groovy

dependencies {
	        compile 'com.github.sUdayBhaksar:sensrosGraphs:1.1'
	}


```



Import  :

```groovy

import flamingsoft.com.sensorsgraph.chart.ChartFactory;
import flamingsoft.com.sensorsgraph.chart.GraphicalView;
import flamingsoft.com.sensorsgraph.chart.model.XYMultipleSeriesDataset;
import flamingsoft.com.sensorsgraph.chart.model.XYSeries;
import flamingsoft.com.sensorsgraph.chart.renderer.XYMultipleSeriesRenderer;
import flamingsoft.com.sensorsgraph.chart.renderer.XYSeriesRenderer;

```

