pipeline {
    agent any
    stages {
        stage ('Build') {
            steps {
                echo "hello world!!"
                sh 'hostname -i'
            }
        }
        stage ('groovystage') {
            steps {
                script{
                     def course ="k8s"
                     if (course == "k8s")
                     println ('Thanks for enrolling to ${course}')
                      else
                      println ('Do learn k8s')
                }
            }
        }
    }
}