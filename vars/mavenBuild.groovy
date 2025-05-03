def call(Map config = [:]) {
    def mvnCmd = config.get('mavenCmd', 'mvn clean install')

    pipeline {
        agent any
        stages {
            stage('Build') {
                steps {
                    echo "Running Maven Command: ${mvnCmd}"
                    sh mvnCmd
                }
            }
        }
    }
}
