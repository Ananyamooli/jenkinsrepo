pipeline {
    agent any
    stages {
        stage ('Build') {
        steps {
            echo 'Build Pipeline'
        }
        }
        stage ('Scan') {
        steps {
            echo 'Scanning Pipelines'
        }
        } 
        stage ('Docker build') {
        steps {
            echo 'Docker Pipelines'
        }
        }
        stage ('Dev Deploy') {
        steps {
            echo 'Dev pipelines'
        }
        }
    }
}