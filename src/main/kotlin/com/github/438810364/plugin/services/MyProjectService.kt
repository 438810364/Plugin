package com.github.438810364.plugin.services

import com.intellij.openapi.project.Project
import com.github.438810364.plugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
