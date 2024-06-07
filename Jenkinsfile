pipeline {
    agent {
        label 'principal'
    }
    environment {
        URL = 'https://dcsas-backoffice.konexinnovation.com/'
        USUARIO = '14321990'
        CONTRASENNA = 'M4n1z4l3s$'
        TIPO_DOCUMENTO = 'Cédula de ciudadanía'
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
                    bat 'gradlew.bat clean build -x test'
                }
            }
        }
        stage('Test') {
            steps {
                dir('Multiempresa') {
                    bat """
                    set URL=${env.URL}
                    set USUARIO=${env.USUARIO}
                    set CONTRASENNA=${env.CONTRASENNA}
                    set TIPO_DOCUMENTO=${env.TIPO_DOCUMENTO}

                    gradlew.bat clean test --tests "co.com.konex.certification.login.backoffice.runners.gestiodistribuidor.FiltrosGestDistRunner"
                    """
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
