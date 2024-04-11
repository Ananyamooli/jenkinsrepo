pipeline {
    agent any
    stages {
        stage ('Build') {
            steps {
                retry(3) {
                    echo "welcome to jenkins pipeline"
                    error "Test this for retry block"
                }
                echo "after 3 retrys"
            }
        }
    }
}