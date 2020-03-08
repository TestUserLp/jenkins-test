node('ubuntu') {
  stage('First stage') {
    sh 'uname -a'
  }
  stage('Dependency check') {
    sh 'apt list --installed'
    sh 'apt-cache policy wget'
    sh 'apt-cache show wget'
  }
  stage('Last stage') {
    echo 'Hello'
  }
}