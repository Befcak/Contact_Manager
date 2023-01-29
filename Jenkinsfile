pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'ls && ./mvnw package'
        cleanWs(cleanWhenSuccess: true, cleanWhenNotBuilt: true, cleanWhenFailure: true, cleanWhenAborted: true, cleanWhenUnstable: true, cleanupMatrixParent: true, deleteDirs: true)
      }
    }

  }
}