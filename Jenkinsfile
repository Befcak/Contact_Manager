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
        sshCommand(command: './home/pi/Workspace/buildAndDeploy.sh', remote: '192.168.37.30')
      }
    }

  }
}