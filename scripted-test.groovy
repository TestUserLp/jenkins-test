node('examples') {
  stage('First stage') {
    sh 'uname -a'
  }
  stage('Second stage') {
    echo 'Hello'
  }
}