node('ubuntu') {
  stage('First stage') {
    sh 'uname -a'
  }
  stage('Dependency check') {
    sh 'sudo apt-get update'
    sh 'sudo apt-cache show apache2'
  }
  stage('Last stage') {
    echo 'Hello'
  }
}