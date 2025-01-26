# Scala Val Immutability Example

This repository demonstrates a common error in Scala related to the immutability of `val` variables.

## The Bug
The `bug.scala` file contains a simple class `MyClass` with a `val` member `x`.  The `main` function attempts to (incorrectly) modify the `val` after initialization. This will result in a compilation error.

## The Solution
The `bugSolution.scala` file demonstrates the correct approach, which involves creating a new instance or using a `var` if mutability is actually needed (though this is less common and generally discouraged in idiomatic Scala).