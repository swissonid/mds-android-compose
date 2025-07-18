# Snapshot Testing for Jetpack Compose in SBB Design System: Roborazzi vs. Paparazzi

## Disclaimer ⚠️

It's important to note that our evaluation involved minimal direct testing of all features for each 
library. Our assessment of Paparazzi primarily relies on experience from past projects, while our 
understanding of Roborazzi is based on initial real-world testing and a thorough review of its 
official documentation. Similarly, our conclusions regarding Jetpack Compose UI Testing are drawn 
from its documentation and general best practices. This comparison is therefore largely based on 
documented capabilities and our informed expectations rather than exhaustive, feature-by-feature 
hands-on verification across all scenarios.

## Overview

In building the SBB `mds-android-compose` design system, reliable golden (snapshot) testing is 
essential to prevent visual regressions across downstream apps, validate accessibility (a18n/i18n) 
requirements, and maintain visual consistency at scale. After a deep evaluation of options, two 
libraries emerged as top contenders: **Roborazzi**, **Paparazzi** and **Jetpack Compose UI Testing**

Below is a detailed comparison table and analysis based on CI needs, flexibility, and test coverage. 
The testing strategy is tailored for GitHub Actions (JVM-based), with a preference for fast feedback 
and minimal CI maintenance overhead.

---

## Conclusion

**Roborazzi** is the best fit for the SBB `mds-android-compose` component library.

It delivers:

* Full i18n/a18n coverage via Robolectric qualifiers 
* Support for dynamic interaction-based screenshots
* Robust CI integration with GitHub Actions
* Maintainability at scale

While **Paparazzi** remains a valid alternative for static-only use cases, its lack of interaction 
support and limited configurability make it less scalable for SBB's requirements.

> **Recommendation**: Standardize on **Roborazzi** for golden testing across the SBB design system. Reevaluate Paparazzi only if layout fidelity issues emerge in rare cases.

---

## Feature Comparison: Roborazzi vs. Paparazzi vs. Jetpack Compose UI Testing

| Feature                         | **Roborazzi**                                                  | **Paparazzi**                                 | **Jetpack Compose UI Testing**                           |
|---------------------------------|----------------------------------------------------------------|-----------------------------------------------|----------------------------------------------------------|
| **Execution Environment**       | JVM with Robolectric Native Graphics                           | JVM with Android Studio LayoutLib             | Emulator / Device or Robolectric                         |
| **CI Setup**                    | No emulator needed; GitHub Actions-friendly                    | No emulator needed; GitHub Actions-friendly   | Requires emulator or Robolectric config                  |
| **Interaction (post-event)**    | ✅ Yes                                                          | ❌ No                                          | ✅ Yes                                                    |
| **HTML Diff Reports**           | ✅ Built-in, grouped by preview name                            | ❌ No                                          | ⚠️ Possible via custom screenshot logic                  |
| **i18n/a18n Test Support**      | ✅ Full locale, fontScale, dark mode via Robolectric qualifiers | ✅ Partial (manual helpers)                    | ✅ Supported but setup-heavy                              |
| **Cross-OS Snapshot Stability** | ✅ Stable across Linux/macOS via Robolectric                    | ✅ Mostly stable; small drift on macOS/Windows | ❌ Emulator/device may introduce more variance            |
| **Snapshot Update CLI**         | `recordRoborazziDebug`, `verifyRoborazziDebug`                 | `recordPaparazzi` via Gradle plugin           | Manual or custom tooling needed                          |
| **Maintenance Maturity**        | Active (v1.44.0), weekly releases                              | Stable (v1.3.2), widely adopted               | Official, but not focused on component snapshot testing  |
| **Long-term Fit for CI**        | ✅ Excellent for dynamic and static UI                          | ✅ Great for static UI                         | ⚠️ Complex, slower, better suited for app-level UI flows |

---

## Analysis

### Roborazzi

Roborazzi provides a modern, all-in-one solution for screenshot testing in Compose, especially 
suited for large-scale design systems. The Robolectric-based environment supports a full range of 
locale, font scale, and RTL testing. This is crucial for SBB’s accessibility and multilingual 
mandates.

Its ability to simulate UI interactions before screenshots opens doors to future dynamic UI testing. 
CI performance is excellent, with snapshot diffing and artifact upload workflows fitting seamlessly 
into GitHub Actions.

### Paparazzi

Paparazzi offers ultra-fast, emulator-free golden testing. It is battle-tested in many production
workflows and integrates well with static UI libraries. While it excels in raw speed and simplicity, 
it lacks support for dynamic UI flows and requires more manual handling for comprehensive 
configuration testing. While a great choice for smaller projects or static demos, it imposes more 
maintenance for a library like SBB’s with 100s of components and varied configuration requirements.

### Why Not Jetpack Compose UI Testing (Instrumented or Robolectric)

While Jetpack Compose UI testing with `composeTestRule` and screenshot extensions offers official
support and integration with assertions, it was not selected for the following reasons:

* ❌ **Requires Emulator or Device for Full Coverage**: Instrumented tests or even Robolectric setups need more overhead than JVM-only tools like Roborazzi or Paparazzi.
* ❌ **Slower Execution in CI**: Emulator-based tests significantly slow down GitHub Actions pipelines.
* ❌ **More Setup Complexity**: Managing device configurations, screenshots, and image baselines is more error-prone.
* ✅ **Great for Full-Screen UI and Flow Assertions**, but not optimized for high-volume component-level golden testing typical of a design system.

Jetpack Compose UI tests remain ideal for app-level flows but are not suited for fast, scalable snapshot testing in component libraries.

---

## References

* [Roborazzi GitHub](https://github.com/takahirom/roborazzi)
* [Paparazzi GitHub](https://github.com/cashapp/paparazzi)
* [Jetpack Compose UI Testing Docs](https://developer.android.com/develop/ui/compose/testing)

