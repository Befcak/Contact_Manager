pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'ls && ./mvnw package'
      }
    }

    stage('Delete workspace') {
      steps {
        deleteDir()
      }
    }

  }
}