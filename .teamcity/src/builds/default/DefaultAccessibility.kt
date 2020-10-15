package builds.default

import addTestSettings
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script

object DefaultAccessibility : BuildType({
  id("DefaultAccessibility")
  name = "Accessibility"
  paused = true

  steps {
    script {
      name = "Build OSS Plugins"
      scriptContent =
        """
                #!/bin/bash
                ./.ci/teamcity/oss/build_plugins.sh
        """.trimIndent()
    }

    // TODO is there a way to re-use what was built in the DefaultBuild job?
    script {
      name = "Build Default Plugins"
      scriptContent =
        """
                #!/bin/bash
                ./.ci/teamcity/default/build_plugins.sh
        """.trimIndent()
    }

    script {
      name = "Default Accessibility"
      scriptContent =
        """
                #!/bin/bash
                ./.ci/teamcity/default/accessibility.sh
        """.trimIndent()
    }
  }

  dependencies {
    defaultBuild()
  }

  addTestSettings()
})
