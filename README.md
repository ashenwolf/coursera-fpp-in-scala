# Installing dependencies for MacOS

Install `brew` if  ot installed before.

Install `coursier` ([more info](https://get-coursier.io/docs/cli-installation.html#macos-brew-based-installation))

```
$ brew install coursier/formulas/coursier
$ cs setup
```

Istall `sbt` and other course-dependent Scala dependencies.

```
cs setup --jvm adopt:11
```

Install [Metals](https://scalameta.org/metals/) extension for VSCode