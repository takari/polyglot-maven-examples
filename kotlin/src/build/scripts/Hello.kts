val project = bindings["project"] as org.apache.maven.project.MavenProject
val session = bindings["session"] as org.apache.maven.execution.MavenSession
val log     = bindings["log"]     as org.apache.maven.plugin.logging.Log
val basedir = bindings["basedir"] as java.io.File
val script  = bindings["script"]  as java.io.File

"""
    ------------------------------------------------------------------------

    Hello from ${project.name}

    Basedir:  ${basedir}
    Script:   ${script.path.substringAfter("${basedir.path}/")}
    Bindings: ${bindings.keys}

    ------------------------------------------------------------------------
""".trimIndent().lines().forEach { log.info(it) }
