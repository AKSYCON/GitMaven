pipeline {
    agent none

    stages {
        stage("Build and SonarQube") {
            agent any
            steps {
                withSonarQubeEnv('sonarServer'){
                    sh 'mvn clean package sonar:sonar'
                }
            }
        }
    }
}
