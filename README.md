# Usha Rewards - AEM Project

AEM project for Usha Rewards built using the AEM Project Archetype.

## Modules

- **all**: Combined package containing all sub-packages
- **core**: Java bundle containing models, servlets, and OSGi services
- **ui.apps**: `/apps` content — components, templates, clientlibs
- **ui.apps.structure**: Repository structure package for ui.apps
- **ui.config**: OSGi configurations
- **ui.content**: Sample content and configurations
- **ui.frontend**: Frontend build (webpack/npm)
- **it.tests**: Integration tests
- **ui.tests**: UI tests

## Build

```bash
# Build all modules
mvn clean install

# Build and deploy to local AEM (author)
mvn clean install -PautoInstallPackage

# Build and deploy to local AEM (publish)
mvn clean install -PautoInstallPackagePublish

# Build only the bundle
mvn clean install -PautoInstallBundle
```

## Requirements

- Java 8 or higher
- Maven 3.3.9 or higher
- AEM 6.5 / AEM as a Cloud Service

## Repository

[https://github.com/gurukrishna10/develop/tree/develop](https://github.com/gurukrishna10/develop/tree/develop)
