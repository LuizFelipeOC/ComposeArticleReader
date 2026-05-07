# ComposeArticleReader

An Android application built with Jetpack Compose that presents educational articles about Jetpack libraries and modern Android development concepts.

## Description

ComposeArticleReader is an educational Android app designed to help developers learn about Jetpack libraries and best practices in modern Android development. The app leverages Jetpack Compose for building a modern, responsive user interface.

## Prerequisites

- **Java Development Kit (JDK)**: Version 11 or higher
- **Android Studio**: Latest version recommended
- **Android SDK**: API level 21 or higher
- **Gradle**: Included via Gradle Wrapper

## Setup

1. **Clone the repository**
   ```bash
   git clone <repository-url>
   cd ComposeArticleReader
   ```

2. **Configure Android SDK** (if not already set up)
   - Open Android Studio
   - Go to Preferences/Settings → Appearance & Behavior → System Settings → Android SDK
   - Install the required SDK platforms and build tools

3. **Create local.properties** (if not already present)
   ```bash
   echo "sdk.dir=$(echo $ANDROID_HOME)" > local.properties
   ```

## Build

### Debug Build

```bash
./gradlew assembleDebug
```

### Release Build

```bash
./gradlew assembleRelease
```

### Run on Device or Emulator

```bash
./gradlew installDebug
./gradlew runDebug
```

### Run Tests

```bash
./gradlew test
./gradlew connectedAndroidTest
```

## Project Structure

```
app/
├── src/
│   ├── main/          # Main application source code
│   ├── test/          # Unit tests
│   └── androidTest/   # Instrumented tests
└── build.gradle.kts   # App-level Gradle configuration
```

## Technologies Used

- **Kotlin** - Programming language
- **Jetpack Compose** - Modern UI toolkit
- **Gradle** - Build automation tool
