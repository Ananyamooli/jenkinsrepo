pipeline {
    agent any
    environment { 
        course = 'docker and k8s'
        name ='siva'
    }
    stages {
        stage ('build') {
            environment {
                cloud ='gcp'
            }
            steps {
                echo "welcome ${name}"
                echo "you are enrolled for ${course}"
                echo "you are certified in ${cloud} cloud"
            }
        }
        }
    }
