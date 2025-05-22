```kts
USE {
    repositories {
        mavenCentral()
    }
    dependencies {
        implementation("com.squareup.retrofit2:retrofit:2.9.0")
        implementation("com.squareup.retrofit2:converter-gson:2.9.0")
        implementation("com.google.code.gson:gson:2.10.1")
        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
    }
}
```

```kts
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import kotlinx.coroutines.runBlocking
import com.google.gson.annotations.SerializedName

data class Table(
    @SerializedName("A") val col00: Double?,
    @SerializedName("B") val col01: Double?,
    @SerializedName("C") val col02: Double?,
    @SerializedName("D") val col03: Double?,
    @SerializedName("E") val col04: Double?
)

interface ApiService {
    @GET("/test")
    suspend fun getTables(): List<Table>
}

val retrofit = Retrofit.Builder()
    .baseUrl("---.---.---.---")
    .addConverterFactory(GsonConverterFactory.create())
    .build()

val api = retrofit.create(ApiService::class.java)

runBlocking {
    val result = api.getTables()
    println(result)
}
```
