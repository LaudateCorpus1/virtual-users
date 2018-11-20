# Changelog
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](http://keepachangelog.com/en/1.0.0/)
and this project adheres to [Semantic Versioning](http://semver.org/spec/v2.0.0.html).

## API
The API consists of all public Java types from `com.atlassian.performance.tools.virtualusers.api` and its subpackages:

  * [source compatibility]
  * [binary compatibility]
  * [behavioral compatibility] with behavioral contracts expressed via Javadoc

[source compatibility]: http://cr.openjdk.java.net/~darcy/OpenJdkDevGuide/OpenJdkDevelopersGuide.v0.777.html#source_compatibility
[binary compatibility]: http://cr.openjdk.java.net/~darcy/OpenJdkDevGuide/OpenJdkDevelopersGuide.v0.777.html#binary_compatibility
[behavioral compatibility]: http://cr.openjdk.java.net/~darcy/OpenJdkDevGuide/OpenJdkDevelopersGuide.v0.777.html#behavioral_compatibility

### POM
Changing the license is breaking a contract.
Adding a requirement of a major version of a dependency is breaking a contract.
Dropping a requirement of a major version of a dependency is a new contract.

## [Unreleased]
[Unreleased]: https://bitbucket.org/atlassian/virtual-users/branches/compare/master%0Drelease-3.1.1

## [3.1.1] - 2018-11-20
[3.1.1]: https://bitbucket.org/atlassian/virtual-users/branches/compare/release-3.1.1%0Drelease-3.1.0

### Fixed
- Do not shutdown JVM in `EntryPoint`. Resolve [JPERF-259].

[JPERF-259]: https://ecosystem.atlassian.net/browse/JPERF-259

## [3.1.0] - 2018-11-14
[3.1.0]: https://bitbucket.org/atlassian/virtual-users/branches/compare/release-3.1.0%0Drelease-3.0.0

### Added
- Allow custom logIn and setup actions. Resolves [JPERF-127] and [JPERF-150].

[JPERF-127]: https://ecosystem.atlassian.net/browse/JPERF-127
[JPERF-150]: https://ecosystem.atlassian.net/browse/JPERF-150

## [3.0.0] - 2018-11-06
[3.0.0]: https://bitbucket.org/atlassian/virtual-users/branches/compare/release-3.0.0%0Drelease-2.2.0

### Removed
- Remove Kotlin data-class generated methods from API.
- Remove all deprecated API.

## [2.2.0] - 2018-10-31
[2.2.0]: https://bitbucket.org/atlassian/virtual-users/branches/compare/release-2.2.0%0Drelease-2.1.5

### INCOMPATIBILITY BUG
Break binary compatibility for `com.atlassian.performance.tools.virtualusers.api.VirtualUserOptions`. See [JPERF-253].
Roll back to `2.1.5` to restore this compatibility.

[JPERF-253]: https://ecosystem.atlassian.net/browse/JPERF-253

### Added
- Allow insecure connections. Resolve [JPERF-196].

### Fixed
- Print relative paths for dumps in WebDriverDiagnostics as a workaround for [JPERF-158].
- Fix serialization of the `help` CLI argument.
- Remove custom page load timeout. Decreases [JPERF-249] occurrence.

[JPERF-249]: https://ecosystem.atlassian.net/browse/JPERF-249

### Deprecated
- Deprecate the Kotlin-defaults-ridden `VirtualUserOptions` constructor.

[JPERF-196]: https://ecosystem.atlassian.net/browse/JPERF-196
[JPERF-158]: https://ecosystem.atlassian.net/browse/JPERF-158

## [2.1.5] - 2018-10-25
[2.1.5]: https://bitbucket.org/atlassian/virtual-users/branches/compare/release-2.1.5%0Drelease-2.1.4

### Fixed
- Hold virtual users before running the setup. Fix [JPERF-230]

[JPERF-230]: https://ecosystem.atlassian.net/browse/JPERF-230

## [2.1.4] - 2018-10-23
[2.1.4]: https://bitbucket.org/atlassian/virtual-users/branches/compare/release-2.1.4%0Drelease-2.1.3

### Fixed
- Validate Jira URI. Fix [JPERF-206].

[JPERF-206]: https://ecosystem.atlassian.net/browse/JPERF-206

## [2.1.3] - 2018-10-22
[2.1.3]: https://bitbucket.org/atlassian/virtual-users/branches/compare/release-2.1.3%0Drelease-2.1.2

### Fixed
- Support for Chrome v69-71. Fix [JPERF-224].

[JPERF-224]: https://ecosystem.atlassian.net/browse/JPERF-224

### [2.1.2] - 2018-10-18
[2.1.2]: https://bitbucket.org/atlassian/virtual-users/branches/compare/release-2.1.2%0Drelease-2.1.1

### Fixed
- Terminate the virtual user when it fails to log in or set up in the `setUp` phase. Fix [JPERF-217].

[JPERF-217]: https://ecosystem.atlassian.net/browse/JPERF-217

### [2.1.1] - 2018-10-16
[2.1.1]: https://bitbucket.org/atlassian/virtual-users/branches/compare/release-2.1.1%0Drelease-2.1.0

### Fixed
- Take screenshots after failed login or setup. Fix [JPERF-179].

[JPERF-179]: https://ecosystem.atlassian.net/browse/JPERF-179

### [2.1.0] - 2018-09-12
[2.1.0]: https://bitbucket.org/atlassian/virtual-users/branches/compare/release-2.1.0%0Drelease-2.0.0

### Added
- Expose virtual user error diagnostics.

## [2.0.0] - 2018-09-06
[2.0.0]: https://bitbucket.org/atlassian/virtual-users/branches/compare/release-2.0.0%0Drelease-1.0.2

### Changed
- Change the type of `VirtualUserOptions.scenario`.

## [1.0.2] - 2018-09-06
[1.0.2]: https://bitbucket.org/atlassian/virtual-users/branches/compare/release-1.0.2%0Drelease-1.0.1

### Fixed
- Restore `VirtualUserOptions` source and binary compatibility with `1.0.0`.

## [1.0.1] - 2018-09-05
[1.0.1]: https://bitbucket.org/atlassian/virtual-users/branches/compare/release-1.0.1%0Drelease-1.0.0

### INCOMPATIBILITY BUG
Break source and binary compatibility for `com.atlassian.performance.tools.virtualusers.api.VirtualUserOptions`.
Switch to `1.0.2` or newer to restore this compatibility or roll forward with `2.0.0`.

## [1.0.0] - 2018-09-04
[1.0.0]: https://bitbucket.org/atlassian/virtual-users/branches/compare/release-1.0.0%0Drelease-0.0.4

### Changed 
- Define public API for the module

### Added
- API for virtual users JAR command line arguments.

### Fixed
- Strict dependency resolution.

## [0.0.4] - 2018-08-28
[0.0.4]: https://bitbucket.org/atlassian/virtual-users/branches/compare/release-0.0.4%0Drelease-0.0.3

### Removed
- Remove plain text report.

### Added
- Add diagnosticsLimit parameter.

## [0.0.3] - 2018-08-07
[0.0.3]: https://bitbucket.org/atlassian/virtual-users/branches/compare/release-0.0.3%0Drelease-0.0.2

### Fixed
- Restore main log. See #2.

## [0.0.2] - 2018-08-03
[0.0.2]: https://bitbucket.org/atlassian/virtual-users/branches/compare/release-0.0.2%0Drelease-0.0.1

### Fixed
- Gradle plugin to compile Kotlin source.

## [0.0.1] - 2018-08-03
[0.0.1]: https://bitbucket.org/atlassian/virtual-users/branches/compare/release-0.0.1%0Dinitial-commit

### Added
- Generic Virtual Users mechanisms migrated from [JPT submodule].
- [README.md](README.md).
- Bitbucket Pipelines.

[JPT submodule]: https://stash.atlassian.com/projects/JIRASERVER/repos/jira-performance-tests/browse/virtual-users?at=ce7ab255e955891a927ac1c19b9b6178b56d1e4f
