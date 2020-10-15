package builds.default

import addTestSettings
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script

class DefaultCiGroup(val ciGroup: Int = 0, init: BuildType.() -> Unit = {}) : BuildType({
  id("DefaultCiGroup_$ciGroup")
  name = "CI Group $ciGroup"
  paused = true

  params {
    param("env.KBN_NP_PLUGINS_BUILT", "true")
  }

  steps {
    script {
      name = "Default CI Group $ciGroup"
      scriptContent =
        """
                #!/bin/bash
                ./.ci/teamcity/default/ci_group.sh $ciGroup
        """.trimIndent()
    }
  }

  dependencies {
    defaultBuildWithPlugins()
  }

  addTestSettings()

  init()
})
