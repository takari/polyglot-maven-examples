project {
  modelVersion '4.0.0'    
  groupId 'io.takari.polyglot'
  artifactId 'groovy-project'
  version '0.0.1-SNAPSHOT'
  //
  // Possibly a more preferrable way to generate the groupId,
  // artifactId, and version elements:
  //
  // $artifact('io.takari.polyglot:groovy-project:0.0.1-SNAPSHOT')
  //
  name 'Groovy Maven Love'
      
  build {
    //
    // Arbitrary Groovy code can be executed in any phase in the form of a dynamic plugin
    //
    $execute(id: 'hello', phase: 'validate') {
      println ""
      println "Hello! I am Groovy inside Maven. What? What am I doing here?? I'm confused. I guess we are friends now. Maybe."
      println ""
    }           
  }
}