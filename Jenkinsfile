pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh './mvnw package'
      }
    }

    stage('Push to Master') {
      steps {
        git(url: 'https://github.com/Befcak/Contact_Manager', branch: 'master', credentialsId: 'contact_maanger_credential')
      }
    }

  }
}