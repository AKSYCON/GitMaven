pipeline {
    agent none

    stages {
        stage('Build and SonarQube') {
            agent any
            steps {
                withSonarQubeEnvy('sonarServer'){
                    sh 'mvn clean package sonar:sonar'
                }
            }
        }
    }
}
