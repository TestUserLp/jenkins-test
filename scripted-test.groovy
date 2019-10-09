node('ubuntu') {
  stage('First stage') {
    sh 'uname -a'
  }
  stage('Dependency check') {
    sh 'sudo apt-get update'
    sh 'sudo apt-cache policy apache2'
    sh 'sudo apt-cache show apache2'
    sh 'sudo apt-mark hold apache2'
    sh 'sudo apt-mark showhold'
  }
  stage('Last stage') {
    echo 'Hello'
  }
}