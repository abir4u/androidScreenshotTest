# Useful Tasks for screenshot testing:

- recordPaparazzi - Record golden images for all variants
- recordPaparazziDebug - Record golden images for variant 'debug'
- recordPaparazziRelease - Record golden images for variant 'release'
- test - Run unit tests for all variants.
- testDebugUnitTest - Run unit tests for the debug build.
- testReleaseUnitTest - Run unit tests for the release build.
- updateLintBaseline - Updates the lint baseline using the default variant.
- verifyPaparazzi - Run screenshot tests for all variants
- verifyPaparazziDebug - Run screenshot tests for variant 'debug'
- verifyPaparazziRelease - Run screenshot tests for variant 'release'

### Example of how to use:
On Terminal, go to root folder and run any task in the following way:
`./gradlew recordPaparazziDebug`
