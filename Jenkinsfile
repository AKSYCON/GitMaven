pipeline {
    agent { 
    label 'linux'
}
tools{
    maven 'MAVEN_HOME'
}

    stages {
        stage("Build and SonarQube") {
            steps {
                withSonarQubeEnv('sonarServer'){
                    sh 'mvn clean package sonar:sonar'
                }
            }
        }
    }
}
