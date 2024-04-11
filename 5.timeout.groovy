pipeline {
    agent any
    stages {
        stage ('Build') {
            steps {
                timeout (time: 5, unit: 'SECONDS')
                {
                    echo "sleeping for 60 seconds"
                    sleep 30
                }
            }
        }
    }
}