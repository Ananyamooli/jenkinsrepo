pipeline {
    agent {
        label 'java-slave'
    }
    tools {
        maven 'Maven-3.8.8'
    }
    stages{
        stage ('Maven') {
            steps {
            echo 'hello welcome to tool section'
            sh 'mvn --version'
            }
        }
        stage ('cart-maven') {
            tools {
                jdk 'JDK-17'
            }
            steps {
                echo 'Hello welcome to cart maven section'
                sh 'mvn --version'
            }
        }
    }
}