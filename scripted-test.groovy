node('ubuntu') {
  stage('First stage') {
    sh 'uname -a'
  }
  stage('Dependency check') {
    sh 'apt-get update'
    sh 'apt-cache show httpd'
  }
  stage('Last stage') {
    echo 'Hello'
  }
}