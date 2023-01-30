pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh './mvnw package'
      }
    }

    stage('Deploy') {
      steps {
        sshCommand(command: 'cd /home/pi/Workspace/', remote: '192.168.37.30')
      }
    }

  }
}