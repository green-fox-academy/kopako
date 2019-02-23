pipeline {
    agent any

    stages {
        stage("First") {
            echo $env.BRANCH_NAME
        }
        stage("Second") {
            sh 'who'
        }
    }
}