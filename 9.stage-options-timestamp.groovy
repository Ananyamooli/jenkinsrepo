pipeline {
    agent any
    stages {
        stage ('build') {
            options {
                timestamps ()
            }
             steps {
                echo 'helloworld!!!!!!!!!!'
             }
        }
    }
}