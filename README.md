# jitpacktogit

Gradle plugin that displays jitpack.io dependencies as their git URLs

[![Build Status](https://travis-ci.org/Commit451/jitpacktogit.svg?branch=master)](https://travis-ci.org/Commit451/jitpacktogit) [![](https://jitpack.io/v/Commit451/jitpacktogit.svg)](https://jitpack.io/#Commit451/jitpacktogit)

# Gradle Dependency
This plugin is available via JitPack. Go figure!

```groovy
apply plugin: 'com.commit451.jitpacktogit'

buildscript {
  repositories {
    jcenter()
    maven { url "https://jitpack.io" }
  }

  dependencies {
    classpath 'com.github.Commit451:jitpacktogit:latest.version.here'
  }
}
```

# Usage
```shell
./gradlew jitpacktogit
```

Output looks like:
```
com.github.Commit451:jitpacktogit:1.0.0 -> https://github.com/Commit451/jitpacktogit
com.github.Commit451.Reptar:reptar:2.2.1 -> https://github.com/Commit451/Reptar
com.github.Commit451:bypasses:1.0.4 -> https://github.com/Commit451/bypasses
com.github.Commit451:ElasticDragDismissLayout:1.0.4 -> https://github.com/Commit451/ElasticDragDismissLayout
com.github.Commit451.AdapterLayout:adapterlayout:1.1.0 -> https://github.com/Commit451/AdapterLayout
com.github.Commit451.Easel:easel:2.1.1 -> https://github.com/Commit451/Easel
```

# Note
This will only work for JitPack dependencies that follow the normal `com.github.{user}` structure. If the dependency is using a custom domain within JitPack, the URL will not be resolved.

# Thanks
Thanks to Ben Manes for his [versions plugin](https://github.com/ben-manes/gradle-versions-plugin) and Square for [SQLDelight](https://github.com/square/sqldelight) which were both great references for creating a Gradle plugin. The [docs](https://docs.gradle.org/current/userguide/custom_plugins.html#sec:custom_plugins_standalone_project) also helped out immensely.

License
--------

    Copyright 2017 Commit 451

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
