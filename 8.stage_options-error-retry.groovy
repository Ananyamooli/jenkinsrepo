pipeline {
    agent any
    stages {
        stage ('build') {
            options {
                retry (3)
            }
            steps {
                echo 'Before setting current build to failure'
                script {
                    current build.result = 'failure'
                }
                echo 'after setting current build to failure'
            }
        }
    }
}