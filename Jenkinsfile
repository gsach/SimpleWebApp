node {
   stage('Preparation') {
      git 'https://github.com/gsach/SimpleWebApp.git'
   }
   stage('Build') {
      sh "./gradlew clean test"
   }
}