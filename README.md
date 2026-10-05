# ByteBites — Quick Pull Request Review Demo

A tiny single-file Java application for a CMRIT PTR classroom demonstration.

## Business requirement

CMRIT students receive a **10% discount when the order amount is ₹500 or more**.

The application also calculates the amount per person when an order is shared.

## Intended classroom exercise

Review the feature change and look for:

- Boundary/logic correctness
- Hardcoded business values
- Meaningful variable names
- Boundary/error handling

The feature version intentionally contains review findings for the classroom exercise.

## Run

```bash
javac ByteBites.java
java ByteBites
```

The normal demonstration uses two people, so the normal execution completes successfully.
