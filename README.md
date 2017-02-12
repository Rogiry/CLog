Welcome to CLog!
===================

This is Simple Logger for Android.
----------

Project:gradle

```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```


App:gradle

```
dependencies {
    ...
    compile 'com.github.Rogiry:CLog:0.0.6'
}
```



Usage
-------------------

```
CLog logger = new CLog(getApplicationContext());
logger.d("My Log Message !");
```

