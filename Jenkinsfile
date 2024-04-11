pipeline {
    agent none

    stages {
        stage('Build and SonarQube') {
            agent any
            steps {
                withSonarQubeEnvy('SonarQube Scanner'){
                    sh 'mvn clean package sonar:sonar'
                }
            }
        }
    }
}
