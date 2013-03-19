uncompilable-on-windows
=======================

Contains code which compiles fine on Linux but doesn't compile on Windows

On Windows machines it will fail when compiling the single test class with the following error

    [INFO] -------------------------------------------------------------
    [ERROR] COMPILATION ERROR : 
    [INFO] -------------------------------------------------------------
    [ERROR] /C:/work/bad-code/src/test/java/com/code/bad/ExampleTest.java:[31,5] C:\work\bad-code\src\test\java\com\code\bad\ExampleTest.java:31: cannot find symbol
    symbol  : method assertThat(java.util.List<java.lang.String>,org.hamcrest.Matcher<java.lang.Iterable<? super java.lang.Object>>)
    location: class com.code.bad.ExampleTest
    [INFO] 1 error
    [INFO] -------------------------------------------------------------

