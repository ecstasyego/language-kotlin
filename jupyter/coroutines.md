```kts
USE {
    repositories {
        mavenCentral()
    }
    dependencies {
        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
    }
}
```

```kts
import kotlinx.coroutines.*

runBlocking{
    launch {
        println("Sub Coroutine1 Start")
        delay(500)
        println("Sub Coroutine1 End")
    }

    launch {
        println("Sub Coroutine2 Start")
        delay(500)
        println("Sub Coroutine2 End")
    }

    println("Main Coroutine Start")
    delay(500)
    println("Main Coroutine End")
}
```
