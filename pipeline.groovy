pipeline {
    agent { docker 'maven:3.9.3-eclipse-temurin-17' }
    stages {
        stage('Example Build') {
            steps {
                sh 'mvn -B clean verify'
            }
        }
    }
}
