# Java CI Experiment

A small Maven calculator project that demonstrates continuous integration with GitHub Actions.

Every push and pull request runs the following checks:

1. Builds the project with Java 17.
2. Runs Checkstyle code-quality checks.
3. Runs the JUnit unit tests.
4. Uploads the Surefire test report as a workflow artifact.

## Run locally

```bash
mvn verify
```

The workflow is defined in [`.github/workflows/ci.yml`](.github/workflows/ci.yml).
