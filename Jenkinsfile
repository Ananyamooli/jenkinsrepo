pipeline{
    agent {
        label 'java-slave'
    }
    stages{
        stage ("build"){
            steps{
                echo 'helloworld!!!'
            }
        }
        stage ('Docker') {
            agent 'docker-slave'
            steps{
                echo 'running on docker slave'
                sh 'docker build -t siva:v1 .'
            }
        }
    }
}