pipeline {
    agent {
        label 'principal' // Ajusta según tu agente Jenkins
    }
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Get IP') {
            steps {
                bat 'nslookup myip.opendns.com resolver1.opendns.com'
            }
        }
        stage('Build') {
            steps {
                dir('Multiempresa') {
                    bat './gradlew clean build -x test'
                }
            }
        }
stage('Test') {
    steps {
        dir('Multiempresa') {
            script {
                // Configura las variables de entorno para que Gradle las lea
                bat 'set URL=https://dcsas-backoffice.konexinnovation.com/'
                bat 'set USUARIO=14321990'
                bat 'set CONTRASENNA=M4n1z4l3s$'
                bat 'set TIPO_DOCUMENTO="Cédula de ciudadanía"'

                // Ejecuta el comando Gradle con las variables de entorno configuradas
                bat '''
                gradlew clean test --tests "co.com.konex.certification.login.backoffice.runners.gestiodistribuidor.FiltrosGestDistRunner"
                '''
            }
        }
    }
            post {
                always {
                    junit 'Multiempresa/build/test-results/test/*.xml'
                }
            }
        }
        stage('Copy Files') {
            steps {
                script {
                    def targetFolder = "${env.WORKSPACE}/artifact"
                    bat "mkdir ${targetFolder}"
                    bat "xcopy /E /I /Y Multiempresa ${targetFolder}"
                }
            }
        }
        stage('Publish Artifact') {
            steps {
                archiveArtifacts artifacts: 'artifact/**', fingerprint: true
            }
        }
    }
}
