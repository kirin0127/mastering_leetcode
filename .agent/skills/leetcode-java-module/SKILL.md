---
name: leetcode-java-module
description: Create one IDE-ready Java problem package from a specific LeetCode URL in this project's PlayGround, including starter code and local example tests. Use for scaffolding an explicitly requested problem, not for batch-generating the study schedule.
---

# LeetCode Java Module

Create a package-style problem module that matches the examples already under
`PlayGround/src/main/java`.

## Scope

- Process only the problem URL or problem number the user explicitly requests.
- Do not generate other problems from `schedule.md` unless the user explicitly
  asks for those problems too.
- Preserve existing solutions, tests, records, and project configuration.

## Gather the problem

Read the requested LeetCode page and capture:

- problem number, title, and difficulty;
- the exact Java starter method signature from LeetCode's Java editor;
- the description, official examples, constraints, and follow-up questions.

Paraphrase the prose description instead of copying it at length. Preserve
inputs, outputs, constraints, and method signatures accurately.

## Create the package

Inspect the current `PlayGround` structure before editing. Unless the existing
convention has changed, create:

```text
PlayGround/src/main/java/leetcode<number>_<IdentifierSafeTitle>/
├── Solution.java
└── Test.java
```

Use the same package declaration in both files. Remove spaces and punctuation
from the title so the package name is a valid Java identifier.

### Solution.java

- Add a short class comment containing the URL, a paraphrased description,
  official examples, and constraints.
- Use LeetCode's exact `class Solution` method signature.
- Leave the algorithm for the user to implement.
- Keep the starter compilable with:

```java
throw new UnsupportedOperationException("Not implemented yet");
```

### Test.java

- Use a plain `public class Test` with a `main` method, following the existing
  project style and requiring no new dependencies.
- Add one method for each official example.
- Print a concise passed or failed message with expected and actual values.
- Match the problem's comparison semantics. If array output may be in any
  order, compare sorted copies so duplicates remain significant. Use an
  order-sensitive comparison when the problem requires a particular order.
- Handle a `null` result with a useful failure message.

## Verify

Compile only the new problem's Java files into a temporary directory with
`javac`. Compiling the entire playground may fail while another problem is
intentionally unfinished. Do not implement the solution merely to make the
example tests pass.

Report the created `Solution.java` and `Test.java` paths and whether compilation
succeeded.
