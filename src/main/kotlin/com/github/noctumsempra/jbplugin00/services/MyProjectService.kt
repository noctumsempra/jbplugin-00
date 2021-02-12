package com.github.noctumsempra.jbplugin00.services

import com.github.noctumsempra.jbplugin00.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
