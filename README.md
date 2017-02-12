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
    compile 'com.github.Rogiry:CLog:0.0.7'
}
```


-------------------


Usage
-------------------

CLog Class must have Context

```
CLog logger = new CLog(getApplicationContext());
logger.d("My Log Message !");
```


or Application Package Name

```
CLog logger = new CLog("{Application Package Name}");
logger.d("My Log Message !");
```