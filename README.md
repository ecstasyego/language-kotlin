# language-kotlin
- https://kotlinlang.org/api/core/
- https://kotlinlang.org/docs/

## Installation
```bash
$ curl -s "https://get.sdkman.io" | bash
$ source ~/.sdkman/bin/sdkman-init.sh
$ sdk install kotlin
```

## Compiler: kotlinc
```bash
$ kotlinc hello.kt -include-runtime -d hello.jar
$ java -jar hello.jar
```

## Interactive Shell
```bash
$ kotlinc-jvm
```

## Kotlin Notebook
```bash
$ pip install jupyterlab
$ pip install kotlin-jupyter-kernel
```

```
:help

Kotlin Jupyter kernel.
Kernel version: 0.12.0.322
Kotlin version: 1.9.23
JVM version: 13

Commands:
    :help - Displays help information with details of the notebook version, line magics, and supported libraries.
    :classpath - Displays the current classpath of your notebook environment, showing a list of locations where the notebook searches for libraries and resources.
    :vars - Displays information about the declared variables and their values.

Magics:
    %use - Imports supported libraries and injects code from these libraries(artifact resolution, default imports, initialization code, and type renderers).
        Usage: %use klaxon(5.5), lets-plot
    %trackClasspath - Logs any changes of the current classpath. This command is useful for debugging artifact resolution failures.
        Usage: %trackClasspath [on/off]
    %trackExecution - Logs pieces of code to be executed. This command is useful for debugging libraries support.
        Usage: %trackExecution [all/generated/off]
    %useLatestDescriptors - Sets the latest versions of available library descriptors instead of bundled descriptors (used by default). Note that bundled descriptors are preferred because the current kernel version might not support the latest descriptors. For better notebook stability, use bundled descriptors.
        Usage: %useLatestDescriptors [on/off]
    %output - Configures the output capturing settings.
        Usage: %output --max-cell-size=1000 --no-stdout --max-time=100 --max-buffer=400
    %logLevel - Sets logging level.
        Usage: %logLevel [off/error/warn/info/debug]

Supported libraries:
    lib-ext (https://github.com/Kotlin/kotlin-jupyter) - Extended functionality for Jupyter kernel
    deeplearning4j (https://github.com/eclipse/deeplearning4j) - Deep learning library for the JVM
    klaxon (https://github.com/cbeust/klaxon) - JSON parser for Kotlin
    khttp (https://github.com/jkcclemens/khttp) - HTTP networking library
    roboquant (https://roboquant.org) - Algorithmic trading platform written in Kotlin
    develocity-api-kotlin (https://github.com/gabrielfeo/develocity-api-kotlin) - A library to use the Develocity API in Kotlin scripts or projects
    kotlin-dl (https://github.com/Kotlin/kotlindl) - KotlinDL library which provides Keras-like API for deep learning
    ksl (https://github.com/rossetti/KSL) - KSL - Kotlin Simulation Library for Monte Carlo and Discrete-Event Simulation
    ktor-client (https://github.com/Kotlin/kotlin-jupyter-http-util) - Asynchronous HTTP client
    default - Default imports: dataframe and Kandy libraries
    biokotlin (https://github.com/maize-genetics/BioKotlin) - BioKotlin aims to be a high-performance bioinformatics library that brings the power and speed of compiled programming languages to scripting and big data environments.
    deeplearning4j-cuda (https://github.com/eclipse/deeplearning4j) - Deep learning library for the JVM (CUDA support)
    gral (https://github.com/eseifert/gral) - Java library for displaying plots
    openai (https://openai.com/blog/chatgpt) - OpenAI API for Jupyter Notebooks
    kmath (https://github.com/mipt-npm/kmath) - Experimental Kotlin algebra-based mathematical library
    rdkit (https://www.rdkit.org/) - Open-Source Cheminformatics Software
    kandy-echarts (https://github.com/Kotlin/kandy) - Kotlin plotting DSL for Apache ECharts
    lets-plot-gt (https://github.com/JetBrains/lets-plot-kotlin) - Lets-Plot visualisation for GeoTools toolkit
    exposed (https://github.com/JetBrains/Exposed) - Kotlin SQL framework
    gradle-enterprise-api-kotlin (https://github.com/gabrielfeo/gradle-enterprise-api-kotlin) - [Deprecated: use develocity-api-kotlin] A library to use the Gradle Enterprise API in Kotlin scripts or projects
    reflection (https://kotlinlang.org/docs/reflection.html) - Imports for Kotlin Reflection
    intellij-sdk (https://plugins.jetbrains.com/docs/intellij/welcome.html) - IntelliJ SDK that could be used in embedded mode of Kotlin Notebook
    londogard-nlp-toolkit (https://github.com/londogard/londogard-nlp-toolkit) - A Natural Language Processing (NLP) toolkit for Kotlin on the JVM
    mysql (https://github.com/mysql/mysql-connector-j) - MySql JDBC Connector
    kt-math (https://github.com/gciatto/kt-math) - Kotlin multi-platform port of java.math.*
    2p-kt (https://github.com/tuProlog/2p-kt) - Kotlin Multi-Platform ecosystem for symbolic AI
    webtau (https://github.com/testingisdocumenting/webtau) - WebTau end-to-end testing across layers
    kraphviz (https://github.com/nidi3/graphviz-java) - Graphviz wrapper for JVM
    plotly (https://github.com/mipt-npm/plotly.kt) - [beta] Plotly.kt jupyter integration for static plots.
    plotly-server (https://github.com/mipt-npm/plotly.kt) - [beta] Plotly.kt jupyter integration for dynamic plots.
    fuel (https://github.com/kittinunf/fuel) - HTTP networking library
    multik (https://github.com/Kotlin/multik) - Multidimensional array library for Kotlin
    combinatoricskt (https://github.com/shiguruikai/combinatoricskt) - A combinatorics library for Kotlin
    jdsp (https://github.com/psambit9791/jDSP) - Java library for signal processing
    spark (https://github.com/JetBrains/kotlin-spark-api) - Kotlin API for Apache Spark: unified analytics engine for large-scale data processing
    smile (https://github.com/haifengl/smile) - Statistical Machine Intelligence and Learning Engine
    datetime (https://github.com/Kotlin/kotlinx-datetime) - Kotlin date/time library
    coroutines (https://github.com/Kotlin/kotlinx.coroutines) - Asynchronous programming and reactive streams support
    jupyter-js (https://github.com/yidafu/kotlin-jupyter-js) - Experimental `%javascript`/`%typescript`/`%jsx` line magic support
    kaliningraph (https://github.com/breandan/kaliningraph) - Graph library with a DSL for constructing graphs and visualizing the behavior of graph algorithms
    kandy (https://github.com/Kotlin/kandy) - Kotlin plotting DSL for Lets-Plot
    dataframe (https://github.com/Kotlin/dataframe) - Kotlin framework for structured data processing
    kalasim (https://www.kalasim.org) - Discrete event simulator
    kravis (https://github.com/holgerbrandl/kravis) - Kotlin grammar for data visualization
    spark-streaming (https://github.com/JetBrains/kotlin-spark-api) - Kotlin API for Apache Spark Streaming: scalable, high-throughput, fault-tolerant stream processing of live data streams
    serialization (https://github.com/Kotlin/kotlin-jupyter-http-util) - Deserialize JSON content using kotlinx.serialization and automatically generate classes for it
    lets-plot (https://github.com/JetBrains/lets-plot-kotlin) - Kotlin API for Lets-Plot: multiplatform plotting library based on Grammar of Graphics
```

