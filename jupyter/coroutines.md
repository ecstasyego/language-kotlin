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
    }
}
```
