
pipeline {
    agent any

    tools {
        jdk 'JDK17'
        maven 'Maven3'
    }

    stages {

        stage('Checkout') {
            steps {
                echo 'Checking out source code...'
                checkout scm
            }
        }

        stage('Build') {
            steps {
                echo 'Building the Spring Boot application...'
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                echo 'Application packaged successfully.'
                sh 'ls -lh target/'
            }
        }
    }

    post {
        success {
            echo '======================================'
            echo ' Jenkins Pipeline Completed Successfully'
            echo '======================================'
        }

        failure {
            echo '======================================'
            echo ' Jenkins Pipeline Failed'
            echo 'Check the console output for the error.'
            echo '======================================'
        }

        always {
            echo 'Pipeline execution finished.'
        }
    }
}

