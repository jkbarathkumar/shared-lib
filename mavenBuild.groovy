def call(String goals = 'clean install') {
    pipeline {
        agent any
        stages {
            stage('Maven Build') {
                steps {
                    sh "mvn ${goals}"
                }
            }
        }
    }
}
