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
        sh '''ssh pi@192.168.37.30
cd /home/pi/Workspace
./buildAndDeploy.sh'''
        sshCommand(command: './home/pi/Workspace/buildAndDeploy.sh', remote: '192.168.37.30')
      }
    }

  }
}