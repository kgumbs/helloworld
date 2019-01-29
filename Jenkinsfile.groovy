#!/usr/bin/env groovy

node (env.JENKINS_WORKER){
  stage('checkout') {
    chekout scm
  }
  stage('SonarQube analysis') {
    // requires SonarQube Scanner 2.8+
    //def scannerHome = tool 'SonarQube Scanner 2.8';
    //withSonarQubeEnv('sonar') {
      sh '''
      /apps/sonar-scanner-2.7/bin/sonar-scanner -X
      '''
    //}
  }

  stage('Run Shell Script')
   sh '''
    echo "hello world!"

   '''

}
