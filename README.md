#### Table Of Contents

- [Introduction](#Introduction)
- [Getting Started](#Getting-Started)
- [License](#License)

<a id="Introduction"></a>

## Introduction

[SBB Design System Mobile][mds-mobile] in Android Jetpack Compose.

This framework contains SBB (Swiss Federal Railways) UI elements for Android Jetpack Compose Apps. It allows an easy integration of SBB theming to your app.

*Note:* This plugin is still under development and some APIs might change. Feedback and Pull Requests are most welcome!

Please read [CONTRIBUTING][contributing], [CODING_STANDARDS][coding_standards] and [CODE_OF_CONDUCT][code_of_conduct] if you want to contribute.
Changes can be found in the [CHANGELOG][changelog].

<a id="Getting-Started"></a>

## Getting-Started

To import the Design System Mobile, please add the [JitPack][jitpack] repository to your root `settings.gradle.kts` or `build.gradle.kts` at the end of repositories:

``` kotlin                     
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

Add the Design SBB System Mobile dependency to your `app/build.gradle.kts`:

``` kotlin                     
dependencies {
    implementation 'com.github.SchweizerischeBundesbahnen:mds-android-compose:{latest-release}'
}
```

To use the Components in code, make sure to wrap the the App with a `SBBTheme` and `Scaffold` or `Surface`.
```
SBBTheme {
    Scaffold {
        MainPage(navController = rememberNavController())
    }
}
```

To use the Components with the SBB Typography, please find the SBB Font, save it as resources and initialize the `SBBTheme`
```
val fontFamily = FontFamily(
    Font(R.font.sbb_web_italic, FontWeight.Normal, FontStyle.Italic),
    Font(R.font.sbb_web_bold, FontWeight.Bold),
    Font(R.font.sbb_web_light, FontWeight.Light),
    Font(R.font.sbb_web_roman, FontWeight.Normal),
    Font(R.font.sbb_web_thin, FontWeight.Thin),
    Font(R.font.sbb_web_ultra_light, FontWeight.ExtraLight)
)
SBBTheme(fontFamily = fontFamily) {
    ...
}
```

<a id="License"></a>


## License

This project is licensed under [MIT](LICENSE.md).

[mds-mobile]: https://digital.sbb.ch/en/design-system/mobile/overview/
[jitpack]: https://jitpack.io/
[contributing]: CONTRIBUTING.md
[coding_standards]: CODING_STANDARDS.md
[code_of_conduct]: CODE_OF_CONDUCT.md
[changelog]: CHANGELOG.md
