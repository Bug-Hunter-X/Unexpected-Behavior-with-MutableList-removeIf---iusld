# Kotlin MutableList removeIf() Unexpected Behavior

This repository demonstrates an uncommon but potential error when using the `removeIf` function on a `MutableList` in Kotlin.  The issue arises from the in-place modification of the list. Concurrent modification can occur if the list is being iterated during the removal process.

The `bug.kt` file shows a simple example leading to the unexpected behavior.  The `bugSolution.kt` file provides a solution to mitigate this issue, illustrating safer list manipulation techniques.

## How to Reproduce

1. Clone the repository.
2. Compile and run the `bug.kt` file.
3. Observe the unexpected output due to the direct modification of the list while iterating.
4. Then run `bugSolution.kt` to see a safer alternative.
