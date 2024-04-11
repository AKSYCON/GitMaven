pipeline {
    agent any
tools{
    maven 'MAVEN_HOME'
}

    stages {
        stage("Build and SonarQube") {
            steps {
                withSonarQubeEnv('sonarServer'){
                    bat 'mvn clean package sonar:sonar'
                }
            }
        }
    }
}
