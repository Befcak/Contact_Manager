pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh './Contact_Manager/mvnw package'
        cleanWs(cleanWhenSuccess: true, cleanWhenNotBuilt: true, cleanWhenFailure: true, cleanWhenAborted: true, cleanWhenUnstable: true, cleanupMatrixParent: true, deleteDirs: true)
      }
    }

  }
}