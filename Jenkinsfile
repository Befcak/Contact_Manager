pipeline {
  agent any
  stages {
    stage('Temp') {
      steps {
        sh './mvnw package'
      }
    }

    stage('Deploy') {
      steps {
        sshCommand(command: 'cd /home/pi/Workspace/', remote: 'pi@192.168.37.30')

      }
    }

  }
}