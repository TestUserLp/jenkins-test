pipeline {
  agent {
    node {
      label 'examples'
    }
  }
  stages {
    stage('First stage') {
      steps {
        sh 'uname -a'
      }
    }
    stage('Second stage') {
      when {
        environment name: 'ENVIRONMENT', value: 'prod'
      }
      steps {
        echo 'Hello'
      }
    }
    stage('scripted stage') {
      steps {
        script {
          sh 'uname -a'
        }
      }
    }
    stage('Only on dev branch') {
      when {
        branch 'develop'
      }
      steps {
        echo 'Hello'
      }
    }
  }
}